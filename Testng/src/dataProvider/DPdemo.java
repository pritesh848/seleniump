package dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPdemo {
	@Test(dataProvider = "booksinfo")

	public void m1(String bookname, String author) {

		System.out.println("Book name :" + bookname + "Author name: " + author);
	}
	@DataProvider(name="booksinfo")
	public Object[][] booksDataProvider(){
		Object[][] booksinfo = {{"c++","kanetkar"},{"java","shield"},{"c","ramakant"}};
		return booksinfo;
	}
	@Test(dataProvider="papersinfo",dataProviderClass=DPdemo2.class)
	public void m2(String papername, String author) {

		System.out.println("Book name :" + papername + "Author name: " + author);
	}
}
