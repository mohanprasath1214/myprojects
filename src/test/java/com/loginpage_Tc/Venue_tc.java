package com.loginpage_Tc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.loginpage.pageobjects.Venue_add;

public class Venue_tc {
	
	WebDriver driverd;
	@BeforeTest
public void launchbrowser1()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Mohan\\Venue\\Actvenue\\Drivers\\chromedriver.exe");
	driverd = new ChromeDriver();
	driverd.navigate().to("https://playactio.com/auth/login");
	driverd.manage().window().maximize();
}
	
	@Test
	public void login1()
	{
		String URL1 = driverd.getCurrentUrl();
		System.out.println(URL1);
		Venue_add.username(driverd).sendKeys("Admin");
		Venue_add.password(driverd).sendKeys("admins");
		driverd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Venue_add.login_btn(driverd).click();
		driverd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Venue_add.Master(driverd).click();
		//driverd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Venue_add.Venue(driverd).click();
		//driverd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Venue_add.create_venue(driverd).click();
		Venue_add.venue_name(driverd).sendKeys("chepak");
		Venue_add.Venue_click(driverd).click();
		Venue_add.venue_type1(driverd).click();
		//driverd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Venue_add.venue_type1(driverd).sendKeys("a6e784531ea5-1");
		//Venue_add.venue_type3(driverd).click();
		//driverd.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//Venue_add.venue_type1(driverd).sendKeys("Multisport");
		//Venue_add.venue_type1(driverd).sendKeys(Keys.DOWN);
		//Venue_add.venue_type2(driverd).selectByVisibleText("Multisport");
		//Venue_add.venue_type2(driverd).selectByIndex(1);
		
		//Venue_add.venue_type2(driverd).selectByValue("Single sport");
		Venue_add.Spector_seating(driverd).sendKeys("15");
		Venue_add.player_changing(driverd).sendKeys("212");
		Venue_add.Addres1(driverd).sendKeys("Mohan Business Park");
		Venue_add.Address2(driverd).sendKeys("Knila IT Solutions");
		
		Venue_add.country(driverd).click();
		//Venue_add.country(driverd).sendKeys("India");
		//Venue_add.country(driverd).findElements(By.xpath("//*[@class=\"ng-dropdown-panel-items scroll-host\"]/div/div[@class='ng-option ng-star-inserted']/span[contains(text(),'India')]"));
		
		Venue_add.ind(driverd).click();
		//driverd.findElement(By.xpath("//")).click();
		
		//driverd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Venue_add.state(driverd).click();
		Venue_add.state1(driverd).click();	
		//Venue_add.state1(driverd).selectByVisibleText("Tamil Nadu");
		Venue_add.city(driverd).click();
		
		Venue_add.city1(driverd).click();
		
		Venue_add.lattitude(driverd).sendKeys("14.120133");
		Venue_add.longitude(driverd).sendKeys("140.741254");
		Venue_add.zipcode(driverd).sendKeys("641047");
		//Venue_add.V_images(driverd).sendKeys("C:\\Users\\Knila\\Pictures\\busIcon.png");
		Venue_add.twowheeler(driverd).sendKeys("210");
		Venue_add.fourwheeler(driverd).sendKeys("50");
		Venue_add.gens_toilet(driverd).sendKeys("5");
		Venue_add.ladies_toilet(driverd).sendKeys("600");
		//Venue_add.Description(driverd);
		Venue_add.addplayarea(driverd).click();
		//playarea
		Venue_add.playarea(driverd).sendKeys("jaipur");
		Venue_add.surfacetype(driverd).click();
		Venue_add.surafcetype1(driverd).click();
		Venue_add.sportname(driverd).click();
		Venue_add.sportname1(driverd).click();
		Venue_add.save_1(driverd).click();
		
		//contact info
		Venue_add.add_info(driverd).click();
		Venue_add.name(driverd).sendKeys("Mohan");
		Venue_add.Email_ID(driverd).sendKeys("mohan@gmail.com");
		Venue_add.Mobile(driverd).sendKeys("9500602692");
		Venue_add.save_2(driverd).click();
		//Venue_add.Description(driverd);
		Venue_add.save_3(driverd).click();
		//Venue_add.verifySave(driverd);
		Venue_add.ok(driverd);
		Venue_add.verif_name(driverd);
		Venue_add.verif_city(driverd);
		Venue_add.verif_state(driverd);
		Venue_add.verif_country(driverd);
		
	
		
		
		
		
} 
@AfterTest
public void closebrowser()
{
driverd.close();	
}
}



