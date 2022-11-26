import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.sql.SQLOutput;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static int a=189; //třídní promenna - global - všude !!!
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        Main m =new Main();

        m.metodaSoucet2(a,1);

        m.metodaSelenium();




     /*       System.setProperty("webdriver.chrome.driver","C:\\Users\\xkosm\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            Thread.sleep(1000);
            System.out.println(driver.getTitle());
            driver.quit();*/
    }

    public void metodaSelenium() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\xkosm\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            driver.wait(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(driver.getTitle());
        driver.quit();



    }


    public static int metodaSoucet2(int B, int C) {   //metoda s parametry B, C(nevyuzitej)
    /*    int a = 0;
        a+=10;
        B = a;*/
        System.out.println("metoda2");
        System.out.println(a);
        return a;                                // return=metoda vraci nejakou hodnotu. kdyz nechci aby                                                              vracel,potom return neni a nahore musi mit "void"
    }
}
