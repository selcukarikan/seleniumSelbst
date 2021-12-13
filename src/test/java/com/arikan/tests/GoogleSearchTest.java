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
        String title1= Driver.getDriver().getTitle();
        System.out.println(title1);

        //Navigate() methodu; sayfa uzerinden ileri veya geri gitme,refresh() sayfayi yeniler
        // back() bir onceki sayfaya getirir,forward() geri geldigimiz sayfaya getirir, to() istedigmiz sayfaya yonlendirir
        //navigate de gecmisiz ve cerezlerimiz vardir---get de ise ilk defa gittigimiz de kullanilir
        Driver.getDriver().navigate().to("https://www.amazon.com");
        String title2= Driver.getDriver().getTitle();
        System.out.println(title2);

        //Google a geri donelim
    //    Driver.getDriver().navigate().back();
        String title3= Driver.getDriver().getTitle();
        System.out.println(title3);



        //quit() acik olan tum pencereleri kapatir
        //close() sadece acik olan sayfayi kapatir
       // Driver.getDriver().close();
        // Driver.getDriver().quit();

    }


}
