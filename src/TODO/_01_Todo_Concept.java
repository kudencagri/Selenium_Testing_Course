package TODO;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

// brands menusune gidin çıkan harflerle baş harflerinin öylemi başlıyor kontrol et
// TODO : istiyenler aynı soru olarak ebay.com/n/all-brands bu sitedeb test edebilir.
public class _01_Todo_Concept extends BaseDriver {
    @Test
    public void Ebay(){
        driver.get("https://www.ebay.com/n/all-brands");

        List<WebElement> Data=driver.findElements(By.xpath("//div[@class='box'] /div //h2"));
        List<WebElement> veri=driver.findElements(By.xpath("//ul[@class='itemcols']/li"));




        for (int i = 0; i <Data.size() ; i++) {

            List<WebElement> verilist=veri.get(i).findElements(By.tagName("li"));

            for (WebElement durum: verilist){

                System.out.println(Data.get(i).getText()+" "+durum.getText().charAt(0)+" "+durum.getText() );
                Assert.assertEquals(Data.get(i).getText().charAt(0),durum.getText().charAt(0));
            }

        }












        BekleVeKapat();
    }
}
