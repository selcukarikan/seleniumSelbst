package com.arikan.tests;

import com.arikan.utilities.Driver;
import com.arikan.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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

      //  WebElement searchBox=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        // searchBox.sendKeys("kopfhörer kabellos");

        Driver.getDriver().navigate().to("https://www.amazon.com/dp/B07WC141LZ/ref=sspa_dk_detail_4?psc=1&pd_rd_i=B07WC141LZ&pd_rd_w=4SPjS&pf_rd_p=54ed5474-54a8-4c7f-a88a-45f748d18166&pd_rd_wg=BTvLE&pf_rd_r=JXHRPTESBFQBC6PYGZC2&pd_rd_r=21e9e5e6-21be-4e9b-841a-a278ccfc0ee1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyNkZUUzg5NFpGMFQ2JmVuY3J5cHRlZElkPUEwMzM0NzM1MUtETVc5TzJZUFRSWSZlbmNyeXB0ZWRBZElkPUEwMjU0MDYyMUdDWlRCTU9NQjVVTCZ3aWRnZXROYW1lPXNwX2RldGFpbF90aGVtYXRpYyZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
      WebElement title=Driver.getDriver().findElement(By.tagName("h1"));
        System.out.println(title.getText());


         WebElement beantwortFrage=Driver.getDriver().findElement(By.partialLinkText("95 beantwortete Fragen"));
        System.out.println(beantwortFrage.getText());

        List<WebElement> links=Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement element:links
             ) {
            System.out.println(element.getText());

        }

    }


}
