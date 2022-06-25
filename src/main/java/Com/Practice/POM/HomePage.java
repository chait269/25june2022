package Com.Practice.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    private WebDriver driver;

    @FindBy(xpath="//a[text()='Shop']")
    private WebElement shop;
    
    @FindBy(xpath="(//a[normalize-space()='Home'])[1]")
    private WebElement home;
    
    @FindBy(xpath="(//img[@class='n2-ow'])[2]")
    private WebElement arrow;
    
    @FindBy(xpath="(//img[@alt='JavaScript'])[1]")
    private WebElement java;
    
    public HomePage(WebDriver driver) 
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
  
    public void clickshopbutton()
    {
    	shop.click();
    }
    public void clickhomebutton()
    {
    	home.click();
    	
    }
    public void Clickarrow()
    {
    	
    		arrow.click();
    		
    	
    }
    
    public String GetArrowText()
    {
    	String slider=java.getText();
    	return  slider;
    }

}
