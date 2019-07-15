package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPdemo2 {
	

	
	@DataProvider(name="papersinfo")
	public Object[][] booksDataProvider(){
		Object[][] papersinfo = {{"p1","karan"},{"p2","sham"},{"p3","ram"}};
		return papersinfo;
	}
}
