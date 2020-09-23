package com.ilab.page.objects;

import org.openqa.selenium.By;

import static com.ilab.driver.DriverFactory.webdriver;

public class SearchResultsPage {

    public boolean isUrlDisplayed(String url){
        return webdriver.findElement(By.xpath("//cite[contains(text(), " + url +")]")).isDisplayed();
    }

}
