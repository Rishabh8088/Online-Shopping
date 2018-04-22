package com.rsn.myamazonback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rsn.myamazonback.dao.CategoryDAO;
import com.rsn.myamazonback.dto.Category;

@Repository("categoryDao")  
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
		category2.setId(2);
		category2.setName("Television");
		category2.setDescription("Used for watching Purpose");
		category2.setImageUrl("TELE_1.png");
		category2.setActive(true);
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Washing Machine");
		category3.setDescription("Used for washing Purpose");
		category3.setImageUrl("WASH_1.png");
		category3.setActive(true);
		Category category4 = new Category();
		category4.setId(4);
		category4.setName("Clothes");
		category4.setDescription("Used for wearing Purpose");
		category4.setImageUrl("CLOTH_1.png");
		category4.setActive(true);
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
