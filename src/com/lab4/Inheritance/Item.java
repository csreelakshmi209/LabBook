package com.lab4.Inheritance;

abstract class Item {
	private int uniqueNum;
	private String title;
	private int numOfCopies;
	
	abstract void library();
	abstract void book();
	abstract void author();
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUniqueNum() {
		return uniqueNum;
	}

	public void setUniqueNum(int uniqueNum) {
		this.uniqueNum = uniqueNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	@Override
	public String toString() {
		return "Item [uniqueNum=" + uniqueNum + ", title=" + title + ", numOfCopies=" + numOfCopies + "]";
	}

	
	
}
