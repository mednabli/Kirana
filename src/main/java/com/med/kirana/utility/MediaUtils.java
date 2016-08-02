package com.med.kirana.utility;

import java.io.File;

import com.med.kirana.configurations.Configurations;

public abstract class MediaUtils {


	private static final String PRODUCTS_MEDIA_FOLDER="resources"+File.separator+"productsmedia";
	
	public static String getProductsMediaFolder(){
		
		String path = new File(Configurations.class.getResource("/").getFile()).getParent();
		String projectPath = new File(path).getParent();
		return projectPath + File.separator + PRODUCTS_MEDIA_FOLDER;
	}
	
	public static String getExtention(String fileName){
		int indexOfLasPoint=fileName.lastIndexOf('.');
		String result = fileName.substring(indexOfLasPoint, fileName.length()-1);
		return result; 
	}
}
