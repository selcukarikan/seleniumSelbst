package com.arikan.tests;

import com.arikan.utilities.Driver;
import com.arikan.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void searchTest() throws InterruptedException {

        Driver.getDriver().get("https://www.google.com");

        //Reusable method sayesinde Thread sleep i cagirmis olduk-3 saniye bekletmis olduk
        ReusableMethods.sleep(3000);

        //title getirme
        String title= Driver.getDriver().getTitle();
        System.out.println(title);

        //quit() acik olan tum pencereleri kapatir
        //close() sadece acik olan sayfayi kapatir
        Driver.getDriver().close();
        Driver.getDriver().quit();

    }


}
