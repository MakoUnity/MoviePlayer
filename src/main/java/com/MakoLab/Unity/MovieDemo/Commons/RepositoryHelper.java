package com.MakoLab.Unity.MovieDemo.Commons;

public enum RepositoryHelper {
	MONGO_SEARCH_ID("com.MakoLab.Unity.MoviePlayer");
	
	private String value;
	
	private RepositoryHelper(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
