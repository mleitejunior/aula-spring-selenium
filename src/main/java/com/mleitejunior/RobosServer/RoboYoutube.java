package com.mleitejunior.RobosServer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboYoutube {

    public void openMainPage(){
        System.setProperty("webdriver.chrome.driver", ".\\dependencies\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");

        driver.quit();
    }

    public void searchTerm(String term) {
        System.setProperty("webdriver.chrome.driver", ".\\dependencies\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/results?search_query=" + term);

        driver.quit();
    }
}
