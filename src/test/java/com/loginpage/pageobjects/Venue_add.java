package com.loginpage.pageobjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Venue_add {

	public static WebElement username(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='userName']"));
		
	}
	
	public static WebElement password(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='password']"));
		
	}
	
	public static WebElement login_btn(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//button[@class='btn btn-primary mb-4']"));
		
	}
	
	public static WebElement Master(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//*[@id=\"nav-ps-elite\"]/div/div[1]/div/ul/app-nav-group[1]/app-nav-collapse[4]/li/a"));
		
	}
	
	public static WebElement Venue(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//*[@id=\"nav-ps-elite\"]/div/div[1]/div/ul/app-nav-group[1]/app-nav-collapse[4]/li/ul/app-nav-item[2]/li/a"));
		
	}
	public static WebElement create_venue(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venue/div/app-card/div/div[2]/div/a/button"));
		
	}
	
	public static WebElement venue_name(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='venue_name']"));
		
	}
	
	public static WebElement Venue_click(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[1]"));
	}
	
	public static WebElement venue_type1(WebDriver driverd)
	{
		WebElement a = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper']//following::div/following-sibling::div/div/span[contains(text(),'Single sport')])[1]"));
		return a;
		
	}
	
	/*public static WebElement venue_type3(WebDriver driverd)
	{
		WebElement a = driverd.findElement(By.cssSelector("#a7bc67a5d657-0 > span"));
	return a;
		
	}
	/*public static Select venue_type2(WebDriver driverd)
	{
		WebElement single = driverd.findElement(By.id("a7bc67a5d657-0"));
		Select vlist = new Select(single);
		return vlist;
	}*/
	
	
	public static WebElement Spector_seating(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='seating_no']"));
		
	}
	public static WebElement player_changing(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='Changing_room']"));
		
	}
	public static WebElement Addres1(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='address']"));
		
	}
	public static WebElement Address2(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='address1']"));
		
	}
	public static WebElement country(WebDriver driverd)
	{
		WebElement india = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[2]"));
		return india;
	}
	public static WebElement ind(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper']//following::div[4])[2]"));
		
	}
		
	
	/*public static Select country1(WebDriver driverd)
	{
		WebElement india1 = driverd.findElement(By.xpath("//ng-select[@name='country']"));
		Select clist = new Select(india1);
		///
		return clist;
	}*/
	
	public static WebElement state(WebDriver driverd)
	{
		WebElement state=driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[3]"));
		return state;
		
	}
	public static WebElement state1(WebDriver driverd)
	{
		WebElement tn = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper']/following::div/following::div[2]/descendant::div/parent::div/following::div/following::div/div/span[text()='Tamil Nadu'])"));
		return tn;
	}
	
	public static WebElement city(WebDriver driverd)
	{
		WebElement cbe = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[4]"));
		return cbe;
		
	}
	public static WebElement city1(WebDriver driverd)
	{
		WebElement cbe1 = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper']/following::div/following::div[2]/descendant::div/parent::div/preceding-sibling::div[4]/ng-select/ng-dropdown-panel/div/div/div/span[contains(text(),'Chennai')])"));
		return cbe1;
	}
	public static WebElement lattitude(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='latitude']"));
		
	}
	
	public static WebElement longitude(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='longitude']"));
		
	}
	public static WebElement zipcode(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='zipcode']"));
		
	}
	/*public static WebElement V_images(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='venueimage']"));
		
	}*/
	
	
	public static WebElement twowheeler(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='twowheeler']"));
		
	}
	public static WebElement fourwheeler(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='fourwheeler']"));
		
	}
	public static WebElement gens_toilet(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='gentstoilet']"));
		
	}
	public static WebElement ladies_toilet(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='ladiestoilet']"));
		
	}
	
	public static void Description (WebDriver driverd)
	{
		//new WebDriverWait(driverd,90).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='tiny-cqfy66y4kz8_ifr']")));
		//WebElement frame1 = driverd.findElement(By.xpath("//app-tinymce/div//div//div[@id='mceu_115']/iframe"));
		//driverd.switchTo().frame(frame1);
		//WebElement deviceName = driverd.findElement(By.xpath("//body[@id='tinymce']"));
		//((JavascriptExecutor)driverd).executeScript("arguments[0].value='Test';", deviceName);
		//System.out.println("Test");
		
		//desc.click();
		//desc.sendKeys("WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more.  ChromeDriver is a standalone server that implements the W3C WebDriver standard. ChromeDriver is available for Chrome on Android and Chrome on Desktop (Mac, Linux, Windows and ChromeOS)");
		//driverd.switchTo().parentFrame();
		
		driverd.findElement(By.xpath("(//div[@role='menuitem']/button[@role='presentation'])[1]")).click();
		driverd.findElement(By.xpath("(//span[text()='New document'])[1]")).click();
		List<WebElement> listelements = driverd.findElements(By.xpath("(//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help'])[2]"));
		int size = listelements.size();
		System.out.println(size);
		//WebElement framePath = driverd.findElement(By.xpath("(//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help'])[2]"));
		//driverd.switchTo().parentFrame();
		if(size != 0) {
			//Actions action = new Actions(driverd);
			//action.moveToElement(listelements.get(size)).build().perform();
			WebElement framePath = driverd.findElement(By.xpath("(//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help'])[2]"));
			driverd.switchTo().frame(framePath);
		driverd.findElement(By.xpath("(//body[@id='tinymce'])[1]")).click();
		driverd.findElement(By.xpath("(//body[@id='tinymce'])[1]")).sendKeys("Test");
		driverd.switchTo().defaultContent();
		}
	}
	
	
	//Playarea
	
	public static WebElement addplayarea (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/div[1]/div/button"));
		
	}
	public static WebElement playarea (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[1]/div[1]/div[1]/input[2]"));
		
	}
	
	public static WebElement surfacetype (WebDriver driverd)
	{
		WebElement grass = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[8]"));
		return grass;
		
	}
	public static WebElement surafcetype1(WebDriver driverd)
	{
		WebElement grass1 = driverd.findElement(By.xpath("//ng-select[@name='surfacetype']/ng-dropdown-panel/div/div/div/span[contains(text(),'Plastic Tile')]"));
		return grass1;
	}
	
	public static WebElement sportname (WebDriver driverd)
	{
		WebElement golf = driverd.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[9]"));
		return golf;
		
	}
	public static WebElement sportname1(WebDriver driverd)
	{
		WebElement golf1 = driverd.findElement(By.xpath("//ng-select[@name='playsports']/ng-dropdown-panel/div/div/div/span[contains(text(),'Golf')]"));
		return golf1;
	}
	
	public static WebElement save_1 (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[2]/button[2]"));
	}
		
	//contact info
	public static WebElement add_info(WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[3]/div/div[2]/div/div[1]/div/button"));
	}
	
	public static WebElement name (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='Name']"));
	}
	
	public static WebElement Email_ID (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='emailID']"));
	}
	
	public static WebElement Mobile (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("//input[@name='mobileNo']"));
	}
	
	public static WebElement save_2 (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[3]/div/div[2]/div/app-card/div/div[2]/div/form/div[2]/button[2]"));

	}
	
	public static WebElement save_3 (WebDriver driverd)
	{
		return driverd.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[3]/div/div[2]/div/div[3]/button"));
	}
	
	public static WebElement ok(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-warning text-center']")).click();
		return null;
	}
	public static WebElement verifySave(WebDriver driverd) 
	{
		String ExpectedText = "Venue Added Successfully";
		WebElement getText = driverd.findElement(By.xpath("(//div[@class='swal2-content']/div)[1]"));
		String ActualText = getText.getText();
		if(ExpectedText.equals(ActualText)) {
			System.out.println("!!!Verified Successfully!!!");
		}
		else {
			System.out.println("!!!Verification Failed!!!");
		}
		return null;
	}
	
	public static WebElement verif_name(WebDriver driverd) {
		String ExpectedText = "chepak";
		WebElement name = driverd.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[2]/div"));
		String ActualText = name.getText();
		if(ExpectedText.equals(ActualText)) {
			System.out.println("!!!Verified Successfully!!!");
		}
		else {
			System.out.println("!!!Verification Failed!!!");
		}
		return null;
	}
	
	public static WebElement verif_city(WebDriver driverd) {
		String ExpectedText = "Chennai";
		WebElement city = driverd.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[5]"));
		String ActualText = city.getText();
		if(ExpectedText.equals(ActualText)) {
			System.out.println("!!!Verified Successfully!!!");
		}
		else {
			System.out.println("!!!Verification Failed!!!");
		}
		return null;
	}
	public static WebElement verif_state(WebDriver driverd) {
		String ExpectedText = "Tamil Nadu";
		WebElement state = driverd.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[6]"));
		String ActualText = state.getText();
		if(ExpectedText.equals(ActualText)) {
			System.out.println("!!!Verified Successfully!!!");
		}
		else {
			System.out.println("!!!Verification Failed!!!");
		}
		return null;
	}
	public static WebElement verif_country(WebDriver driverd) {
		String ExpectedText = "India";
		WebElement country = driverd.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[7]"));
		String ActualText = country.getText();
		if(ExpectedText.equals(ActualText)) {
			System.out.println("!!!Verified Successfully!!!");
		}
		else {
			System.out.println("!!!Verification Failed!!!");
		}
		return null;
	}
	
	
}
	
	
	
	
		

