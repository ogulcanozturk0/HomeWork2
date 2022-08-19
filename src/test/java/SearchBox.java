import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchBox {

    WebDriver driver;
    @Before
    public void setup(){
        //Browser'ı Launc eden blok
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();//Ekranı max hale getirir.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); /*driver'a sayfanın yüklenmesi ve kullanacağımız webelementlerin bulunması için
        bekleyeceği maximum süreyi belirtir.*/

    }
    @After
    public void tearDown() {driver.close();//Test bittikten sonra siteyi kapat.
        System.out.println("SearchBox Kontrol Edildi");} //Test bittikten sonra konsola  "SearchBox Kontrol Edildi" yaz.

    @Test
    public void test(){
        driver.get("https://demoqa.com/webtables");  //""https://demoqa.com/webtables"" adresine git.
        WebElement searchElement = driver.findElement(By.id("searchBox")); //site içinde id'si serachBox olan searchElement adında bir nesne.
        Assert.assertTrue(searchElement.isDisplayed()); //searchElement adındaki nesne, açılan site üstünde var mı yok mu diye kontrol eden komut.

    }



}
