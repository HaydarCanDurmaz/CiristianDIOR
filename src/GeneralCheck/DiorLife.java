package GeneralCheck;

import Utilty.BaseDriver;
import Utilty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DiorLife extends BaseDriver {
    @Test
    public void Dior(){
        driver.get("https://tr.dior.com/en/collections/skincare?gad_source=1&gclid=CjwKCAiAvoqsBhB9EiwA9XTWGYaEWGoKYL6TiW5Adbq5e9_mXRkCcJYkU6Gtx_mJUd0PVKJWc-J9QRoCtUQQAvD_BwE");
        WebElement Search = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        WebElement NewMensColections = driver.findElement(By.cssSelector("div[class='search-form__input-wrapper']"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(Search).click().build();
        aksiyon.perform();
        MyFunc.Bekle(3);

        aksiyonlar.moveToElement(NewMensColections).sendKeys("New Mens Colections").keyDown(Keys.ENTER);
        aksiyon.perform();
        MyFunc.Bekle(3);




        BekleVeKapat();
    }
}
