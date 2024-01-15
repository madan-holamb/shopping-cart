package com.osc.cache.serializer;

import java.io.IOException;
import java.math.BigDecimal;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.StreamSerializer;
import com.osc.cache.payload.Category;
import com.osc.cache.payload.ProductDto;

public class ProductDtoSerializer implements StreamSerializer<ProductDto> {

	@Override
	public int getTypeId() {
		return 123; // Unique type ID for your serializer
	}

	@Override
	public void write(ObjectDataOutput out, ProductDto productDto) throws IOException {
		out.writeUTF(productDto.getProductId());
		out.writeUTF(productDto.getProductName());
		out.writeUTF(productDto.getProductDescription());
		out.writeUTF(productDto.getUserId());
		out.writeUTF(productDto.getProductPrice().toString()); // Convert BigDecimal to String for serialization
		out.writeInt(productDto.getViewCount());
		out.writeUTF(productDto.getTotalProducts());
		out.writeUTF(productDto.getImagePath());
		out.writeObject(productDto.getCategory());
	}

	@Override
	public ProductDto read(ObjectDataInput in) throws IOException {
		String productId = in.readUTF();
		String productName = in.readUTF();
		String productDescription = in.readUTF();
		String userId = in.readUTF();
		String productPrice = in.readUTF();
		int viewCount = in.readInt();
		String totalProducts = in.readUTF();
		String imagePath = in.readUTF();
		Category category = in.readObject();

		return new ProductDto(productId, productName, 
							  productPrice, productDescription, 
							  viewCount, totalProducts, 
							  userId, imagePath, 
							  category,null,null);
	}
}