package com.med.kirana.forms;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ProductForm {

	private String name;
	
	private String description;
	
	private List<Integer> categories;
	
	private MultipartFile[] images;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public List<Integer> getCategories() {
		return categories;
	}

	public void setCategories(List<Integer> categories) {
		this.categories = categories;
	}

	public MultipartFile[] getImages() {
		return images;
	}

	public void setImages(MultipartFile[] images) {
		this.images = images;
	}
	
}
