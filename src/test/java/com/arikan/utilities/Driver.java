package com.arikan.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    static WebDriver driver;

   public static WebDriver getDriver(){
       if(driver==null){

           //properties dosyasinin icerisindeki "browser" anahtarinin degerini getirecek--->Chrome

           String browser=ConfigurationReader.getProperty("browser");

           switch (browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case "firefox" :
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               case "ie" :
                   WebDriverManager.iedriver().setup();
                   driver=new InternetExplorerDriver();
                   break;
               case "safari" :
                   WebDriverManager.safaridriver().setup();
                   driver=new SafariDriver();
                   break;
               case "edge" :
                   WebDriverManager.edgedriver().setup();
                   driver=new EdgeDriver();
                   break;
           }
       }
       return driver;
    }
    public static void closeDriver(){
       if (driver !=null){
           driver.quit();
           driver=null;
       }
    }
}
