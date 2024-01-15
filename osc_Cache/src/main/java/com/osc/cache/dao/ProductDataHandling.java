package com.osc.cache.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.SerializerConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.osc.cache.payload.Category;
import com.osc.cache.payload.FeaturedProduct;
import com.osc.cache.payload.ProductDto;
import com.osc.cache.serializer.ProductDtoSerializer;
import com.osc.cache.service.ProductServiceHelper;

@Component
public class ProductDataHandling {

	public List<Category> findAllCategories(List<ProductDto> allProductList) {

		Map<String, Integer> viewCountMap = allProductList.stream()
				.collect(Collectors.groupingBy(product -> product.getCategory().getCategoryId(),
						Collectors.summingInt(product -> product.getViewCount())));


		List<Category> sortedCategories = viewCountMap.entrySet().stream()
				.sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
						.reversed()
						.thenComparing(Map.Entry::getKey))
				.map(entry -> getCategoryById(allProductList, entry.getKey()))
				.collect(Collectors.toList());


		return sortedCategories;

	}

	private static Category getCategoryById(List<ProductDto> allProductList, String categoryId) {
		return allProductList.stream()
				.filter(product -> categoryId.equals(product.getCategory().getCategoryId()))
				.findFirst()
				.map(ProductDto::getCategory)
				.orElse(null);
	}

	public List<FeaturedProduct> featureProductList(List<ProductDto> allProductList) {

		List<ProductDto> productList = allProductList.stream()
				.sorted(Comparator.comparingInt(product -> ((ProductDto) product).getViewCount())
						.reversed())
				.collect(Collectors.toList());

		return productList.stream().map(i->
		new FeaturedProduct(i.getProductId(), 
				i.getCategory().getCategoryId(), 
				i.getProductName(), 
				i.getProductPrice())
				).collect(Collectors.toList());

	}
	
	public Map<String, ProductDto> findSimilarProductsForRecentlyViewed(Map<String, ProductDto> recentlyViewedMap){

		Map<String, ProductDto> similarProductMap = new LinkedHashMap<>(6);

		int offset=0;
		
		List<ProductDto> sortedProductList = sortCategoriesByViewCount(ProductServiceHelper.getAllProducts());
		
		for (Map.Entry<String, ProductDto> entry : recentlyViewedMap.entrySet()) {

			ProductDto similarProducts = getSimilarProducts(entry.getValue(), recentlyViewedMap,similarProductMap,sortedProductList, offset);

			similarProductMap.put(similarProducts.getProductId(), similarProducts);
		}

		if(recentlyViewedMap.size()<6) {

			int size = 6 - recentlyViewedMap.size();

			for(int i = 1 ; i<=size; i++) {
				
				ProductDto productDto = similarProductMap.values().stream().findFirst().get();

				ProductDto similarProducts = getSimilarProducts(productDto, recentlyViewedMap,similarProductMap,sortedProductList, offset);

				similarProductMap.put(similarProducts.getProductId(), similarProducts);
			}

		}

		return similarProductMap;
	}
	
	private ProductDto getSimilarProducts(ProductDto product,Map<String, ProductDto> recentlyViewedMap,
			Map<String, ProductDto> similarProductMap,List<ProductDto> sortedList, int index) {
		
		
		List<ProductDto> productCategoryList = sortedList.stream()
					.filter(i -> i.getCategory().getCategoryId().equals(product.getCategory().getCategoryId()))
					.collect(Collectors.toList());

		ProductDto productDto = productCategoryList.get(index);
		
		if(recentlyViewedMap.containsKey(productDto.getProductId()) || similarProductMap.containsKey(productDto.getProductId())) {
			return getSimilarProducts(product, recentlyViewedMap, similarProductMap,sortedList, index+1);
		}

		return productDto;
	}
	
	private List<ProductDto> sortCategoriesByViewCount(List<ProductDto> allProductsList) {
		

        Map<String, List<ProductDto>> productsByCategoryId = allProductsList.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory().getCategoryId()));

        productsByCategoryId.forEach((categoryId, products) ->
                products.sort(Comparator.comparingInt(product -> ((ProductDto) product).getViewCount())
                        .reversed()));

        return productsByCategoryId.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

	}
	
	public List<ProductDto> findCartProductOfTheUser(String userId){

		ClientConfig config = new ClientConfig();

		config.setClusterName("dev");
		config.getSerializationConfig()
			.addSerializerConfig(new SerializerConfig()
			.setTypeClass(ProductDto.class)
			.setImplementation(new ProductDtoSerializer()));

		HazelcastInstance hazelcastInstanceClient = HazelcastClient.newHazelcastClient(config);

		IMap<String, Map<String, ProductDto>> map = hazelcastInstanceClient.getMap("cart");
		
		Map<String, ProductDto> productMap = map.get(userId);
		if(productMap != null)
			return new ArrayList<>(productMap.values());
		
		return null;

	}


}
