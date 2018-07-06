package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWeb {    
	public static void main(String[] args) {        
 	  WebDriver driver = new FirefoxDriver();
 	  String baseUrl = "http://mail.google.com";       
 	  String expectedTagName = “input";       
 	   String tagName = "";
 	    driver.get(baseUrl);     
 	  	  tagName = driver.findElement(By.id("email")).getTagName(); 
 	  	    if (tagName.contentEquals(expectedTagName)){  s           
 	  	     System.out.println("Test Passed!");       
 	  	      } else {          
 	  	        System.out.println("Test Failed");       
 	  	         }      
 	  	          driver.close();   }}