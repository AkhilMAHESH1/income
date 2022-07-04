package com.mindtree.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openga.selenium.By;
public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.get("https://www.moneycontrol.com/personal-finance/");
		driver.get("https://www.moneycontrol.com/personal-finance/tools/income-tax-calculator");
		driver.findElement(By.xpath("//input[@class='cust_inp custradio active'"));
	}

}
