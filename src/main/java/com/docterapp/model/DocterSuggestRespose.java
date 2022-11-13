package com.docterapp.model;

import java.util.List;

import com.docterapp.model.docter.Docter;

public class DocterSuggestRespose {
	
	private String message;
	private List<Docter> docterList;
	public DocterSuggestRespose(String message, List<Docter> docterList) {
		super();
		this.message = message;
		this.docterList = docterList;
	}
	public DocterSuggestRespose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Docter> getDocterList() {
		return docterList;
	}
	public void setDocterList(List<Docter> docterList) {
		this.docterList = docterList;
	}
	@Override
	public String toString() {
		return "DocterSuggestRespose [message=" + message + ", docterList=" + docterList + "]";
	}
	
	

}
