package GeneralCheck;
import Utilty.MyFunc;
import org.junit.Test;
import Utilty.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class StartsSets extends BaseDriver {
    @Test
    public void DiorTest(){
        driver.get("https://tr.dior.com/en/collections/skincare?gad_source=1&gclid=CjwKCAiAvoqsBhB9EiwA9XTWGYaEWGoKYL6TiW5Adbq5e9_mXRkCcJYkU6Gtx_mJUd0PVKJWc-J9QRoCtUQQAvD_BwE");
        WebElement WOMENSFRAGRANCE = driver.findElement(By.xpath("(//a[@type='button'])[1]"));
        WebElement MissDior = driver.findElement(By.xpath("(//span[@class='site-nav__label'])[5]"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(WOMENSFRAGRANCE).build();
        aksiyon.perform();

        aksiyonlar.moveToElement(MissDior).click();
        aksiyon.perform();
        MyFunc.Bekle(3);




      //
        BekleVeKapat();
    }
}
