package com.lab4.Inheritance;

public class ItemTest {
	public static void main(String[] args) {
		//getting book details by upcasting
		WrittenItem writtenItem = new Book();
		writtenItem.setBookAuthor("chetan");
		writtenItem.setUniqueNum(1234);
		writtenItem.setTitle("ABCD");
		writtenItem.setNumOfCopies(10);
		writtenItem.BookDetails();

		//getting journal details by downcasting
		WrittenItem writtenItem1 = new JournalPaper();
		JournalPaper jp = (JournalPaper) writtenItem1;
		jp.setPublishedYear("2020 Dec");
		jp.journalPaper();

		//getting movie details by downcasting
		WrittenItem writtenItem2 = new Video();
		Video v = (Video) writtenItem2;
		v.setDirector("sk");
		v.setGenre(null);
		v.setReleasedYear(2021);
		v.mediaItem();

		//getting cd details by downcasting
		WrittenItem writtenItem3 = new CD();
		CD cd = (CD) writtenItem3;
		cd.setArtist("chay");
		cd.setGenre(null);
		cd.mediaItem();
	}
}
