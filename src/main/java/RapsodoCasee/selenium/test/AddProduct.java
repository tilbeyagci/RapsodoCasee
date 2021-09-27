package RapsodoCasee.selenium.test;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;

import java.util.concurrent.TimeUnit;

import static org.apache.commons.exec.util.StringUtils.split;

public class AddProduct   {

    WebDriver driver;
    WebDriverWait webDriverWait;


    //Chrome driverın çağrıldığı metot
    public AddProduct(WebDriver driver) {

        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 30, 150);
    }


    public void loginwithfavorite() {
        driver.get("https://www.rapsodo.com/");

        //accept
        WebElement AcceptButton = driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]"));
        AcceptButton.click();
        // WebDriverWait webDriverWait = new WebDriverWait(driver, 30,150);
        //click Navigationbar
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement Navbar = driver.findElement(By.xpath("//*[@id=\"content\"]/header/nav/div/div/div[4]/button"));
        Navbar.click();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-dropdown-529\"]"))).perform();
        driver.findElement(By.xpath("//*[@id=\"menu-item-6757\"]/a")).click();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();//causes page to
      /*  WebElement alert = driver.switchTo().activeElement();
        System.out.println( alert.getText());

        driver.switchTo().alert().accept();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //Diamond sport category url verification
        String baseUrl = "https://rapsodo.com/product-category/diamond-sports/?category=diamond-sports";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (baseUrl.equals(driver.getCurrentUrl())) {
            System.out.println("diamond sports category url verification is done");
        } else {
            System.out.println("URLS are not matching");
        }
        //0 items $0.00
        String stringB = driver.findElement(By.partialLinkText("items")).getText();
        String str = stringB;
        String delimiter = "-";
        String result[] = split(str, delimiter);
        for (String s : result)
            if("0 items ".equals(result[0].toString()) ){
                System.out.println(s);}
            else{
                System.out.println("values are not matching");
            }
        // String stringA = driver.findElement(By.xpath("//*[@id=\"content\"]/header/nav/div/div/div[7]/a/span")).getText();
        //System.out.println(stringA);
        /* JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //3
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement add = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[4]/a/h2"));
        add.click();
        //3.A
        String baseUrl2 = "https://rapsodo.com/product/rapsodo-hitting-monitor/";
        driver.get(baseUrl2);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (baseUrl2.equals(driver.getCurrentUrl())) {
            System.out.println("Hitting monitor url verification is done");
        } else {
            System.out.println("URLS are not matching");
        }
        //3.B
        //3c
        String stringC = driver.findElement(By.xpath("//*[@id=\"product-386\"]/div/div[2]/div/div[3]/span")).getText();
        System.out.println(stringC);
        //3d

        //4
        WebElement option = driver.findElement(By.xpath("//*[@id=\"stripe_plan_id\"]/option[2]"));
        option.click();

        String stringD = driver.findElement(By.xpath("//*[@id=\"product-386\"]/div/div[2]/div/form/div/div[1]/div[2]/span/span")).getText();
        System.out.println(stringD);

        WebElement add2 = driver.findElement(By.xpath("//*[@id=\"product-386\"]/div/div[2]/div/form/div/div[2]/div/div[3]/button"));
        add2.click();


        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //JavascriptExecutor executor =(JavascriptExecutor)driver;
        //executor.executeScript("document.body.style.zoom='0.75");

        // driver.findElement(By.xpath("//*[@id=\"post-368\"]/div/div/script/text()")).click();


        // WebElement element = driver.findElement(By.xpath("//*[@id=\"certification_discount\"]/div/a"));
        // if (element.isDisplayed() && element.isEnabled()) {
        //    element.click();
        //  }

        ((JavascriptExecutor) driver).executeScript("document.elementFromPoint(" + 100 + "," + 200 + ").click();");

        String baseUrl3 = "https://rapsodo.com/cart/";
        driver.get(baseUrl3);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (baseUrl3.equals(driver.getCurrentUrl())) {
            System.out.println("cart url verification is done");
        } else {
            System.out.println("URLS are not matching");
        }


        ((JavascriptExecutor) driver).executeScript("document.elementFromPoint(" + 100 + "," + 200 + ").click();");

        String stringF = driver.findElement(By.partialLinkText("item")).getText();
        String strr = stringF;
        String delimiterr = "-";
        String result2[] = split(strr , delimiterr);
        for (String s1 : result2)
            if("1 item ".equals(result2[0].toString()) ){
                System.out.println(s1);}
            else{
                System.out.println("values are not matching");
            }


        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.xpath("//*[@id=\"post-368\"]/div/div/form/div[2]/table/tbody/tr[2]/td/div/div/input"))).sendKeys("code"+ Keys.TAB).build().perform();
        driver.findElement(By.xpath("//*[@id=\"post-368\"]/div/div/form/div[2]/table/tbody/tr[2]/td/div/div/button")).click();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((JavascriptExecutor) driver).executeScript("document.elementFromPoint(" + 100 + "," + 200 + ").click();");

        String stringH = driver.findElement(By.xpath("//*[@id=\"post-368\"]/div/div/div[1]/div/ul/li")).getText();
        System.out.println(stringH);


    }

    //public void clickByCoordinateJs(int x,int y){
    //((JavascriptExecutor) driver).executeScript("document.elementFromPoint(" + x + "," + y + ").click();");
    //}




    private WebElement findElement(By by) {
        WebElement webElement = driver.findElement(by);
        new Actions(driver).moveToElement(webElement).build().perform();
        scroll(webElement);
        return webElement;
    }

    public void scroll(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})",
                webElement);
    }



}

