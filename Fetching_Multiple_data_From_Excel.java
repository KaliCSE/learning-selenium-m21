package TestNG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_Multiple_data_From_Excel {
	public String[][] loginDataProvider() throws Exception{
		FileInputStream fis = new FileInputStream("./src/test/resouce/testScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("LoginData");
		
		int rowNum = sheet.getPhysicalNumberOfRows();
		int cellNum = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowNum-1][cellNum];
		for(int i =1;i<rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	@TestNG(dataProvider = "loginDataProvider")
	public void LoginTest(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in").click());
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("password"))driver.sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
			

}
