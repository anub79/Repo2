package com.test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	TestBase() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	}
}
