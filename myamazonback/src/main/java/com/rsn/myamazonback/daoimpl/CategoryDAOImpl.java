package com.rsn.myamazonback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.rsn.myamazonback.dao.CategoryDAO;
import com.rsn.myamazonback.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("Used for Talking Purpose");
		category.setImageUrl("CAT_1.png");
		category.setActive(true);
		Category category2 = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("Used for watching Purpose");
		category.setImageUrl("TELE_1.png");
		category.setActive(true);
		Category category3 = new Category();
		category.setId(3);
		category.setName("Washing Machine");
		category.setDescription("Used for washing Purpose");
		category.setImageUrl("WASH_1.png");
		category.setActive(true);
		Category category4 = new Category();
		category.setId(4);
		category.setName("Clothes");
		category.setDescription("Used for wearing Purpose");
		category.setImageUrl("CLOTH_1.png");
		category.setActive(true);
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
	}

	@Override
	public List<Category> list() {
		return categories;
	}

} 
