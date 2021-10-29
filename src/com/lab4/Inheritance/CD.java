package com.lab4.Inheritance;

//in this, inheriting properties from writtenItem and overiding mediaItem
public class CD extends WrittenItem {
	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	void mediaItem() {
		System.out.println();
		System.out.println("CD details");
		System.out.println("Artist name:" + getArtist());
		System.out.println("Genre name:" + getGenre());

	}
}
