import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class Main {
    static int a =189; //třídní promenna - global - všude !!!

      public static void main(String[] args) throws InterruptedException {
        System.out.println("Start testu - trida Main");
        Main m =new Main(); //nový objekt konstruktor

        m.metodaSoucet2(a,1);

        m.metodaSelenium();


    }

    public void metodaSelenium() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\xkosm\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.globalpayments.com/cs-cz/");
        //driver.get("https://www.seznam.cz/");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


       //driver.save_screenshot('screenshot_1.png');

       // ---------test web stránky-------

       // 1) název stránky

       String nazev_stranky_zjistene = driver.getTitle();

       System.out.println(driver.getTitle());  // Card Transaction Processor | Global Payments

       String nazev_stranky_ocekavane="Card Transaction Processor | Global Payments";

       Assert.assertEquals("E1-chyba: nazev stranky se neshoduje",nazev_stranky_ocekavane , nazev_stranky_zjistene );

        if (nazev_stranky_ocekavane.equals(nazev_stranky_zjistene)) {
            System.out.println("M1: název stranky se shoduje");
            }
         else {
                System.out.println("M2: název stranky se NEshoduje");
                }


       // odkaz: "Kariéra"
        driver.findElement(By.linkText("Kariéra"));

       if (driver.findElement(By.linkText("Kariéra")) !=null){
           System.out.println("M3: kariera link nalezen");
       }
       else {
           System.out.println("M4: kariera link nalezen");
       }

        // kliknutí na odkaz "Kariéra"
        // driver.findElement(By.linkText("Kariéra")).click(); //nefunguje "not clicable - prekryti cookies výzvou?

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END); //..posun dolu aby bylo videt pres cookies

       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        //driver.findElement(By.linkText("Kariéra")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[11]/div[1]/div/div[1]/ul/li[1]/a")).click();








        //driver.quit();



    }


    public static int metodaSoucet2(int B, int C) {
    /*    int a = 0;
        a+=10;
        B = a;*/
        //System.out.println("metoda2");
        System.out.println(a);
        return a;         // return=metoda vraci hodnotu
    }
}
