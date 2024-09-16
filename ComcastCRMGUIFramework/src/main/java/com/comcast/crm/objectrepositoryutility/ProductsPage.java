package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	
	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement createProductBtn;
	
	
	
	@FindBy(name = "searchBtn")
	private WebElement element2;                                //sam added
	
	@FindBy(name = "searchbtn")
	private WebElement element3;       //steve added


	@FindBy(name = "searchBtn1")
	private WebElement element4;                     //sam added ___ new branch CRM-6.0.0
}
