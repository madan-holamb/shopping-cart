package com.osc.cache.serializer;

import java.io.IOException;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.StreamSerializer;
import com.osc.cache.payload.Category;

public class CategorySerializer implements StreamSerializer<Category> {

	@Override
	public int getTypeId() {
		// TODO Auto-generated method stub
		return 321;
	}

	@Override
	public void write(ObjectDataOutput out, Category category) throws IOException {
		out.writeUTF(category.getCategoryId());
		out.writeUTF(category.getCategoryName());
		out.writeUTF(category.getImagePath());
		
	}

	@Override
	public Category read(ObjectDataInput in) throws IOException {
		
		String categoryId = in.readUTF();
		String categoryName = in.readUTF();
		String imagePath = in.readUTF();
		
		
		return new Category(categoryId, categoryName, imagePath, null);
	}

}
