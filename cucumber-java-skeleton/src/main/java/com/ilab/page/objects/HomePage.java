package com.ilab.page.objects;

import org.openqa.selenium.By;

import static com.ilab.driver.DriverFactory.webdriver;

public class HomePage {

    private By searchInputBy = By.xpath("//input[@title='Pesquisar']");
    private By searchBtnBy = By.xpath("//input[@aria-label='Pesquisa Google']");
    private By logoBy = By.xpath("//img[@alt='Google']");

    public boolean isLogoDisplayed(){
        return webdriver.findElement(logoBy).isDisplayed();
    }

    public void fillSearchText(String searchText){
        webdriver.findElement(searchInputBy).sendKeys(searchText);
    }

    public void clickSearchBtn(){
        webdriver.findElement(searchBtnBy).click();
    }
}
