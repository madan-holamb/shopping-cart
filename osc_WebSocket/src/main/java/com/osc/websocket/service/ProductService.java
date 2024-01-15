package com.osc.websocket.service;

import java.util.List;
import java.util.Map;

import com.osc.websocket.payload.Category;
import com.osc.websocket.payload.ProductDto;
import com.osc.websocket.payload.Response;

public interface ProductService {
	
	public List<Category> findAllCategories();
	
	public Response findNoViewingHistoryRecord();
	
	public ProductDto findByProductId(String id);
	
	public List<ProductDto> findSimilarProductByCategoryId(char caegoryId);

	public Response findUserHadHistoryRecord(Map<String, ProductDto> recentlyViewedProductMap,String userId);
	
	public List<ProductDto> findByCategoryId(char caegoryId,String filter);
	
	public boolean findIsProductAlreadyAvailable(Map<String, String> jsonMap);
	
	public String storeCartInCache(ProductDto dto,String userId);

	public ProductDto findProductByProductId(String productId);

	public List<ProductDto> viewAllCart(String userId);
	
	public boolean storeProductInCache();
}
