package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private Driver(){
    }

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (driver.get() == null) {
            String browser = ConfigReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver.set(new ChromeDriver(options));
                    break;
                case "firefox":
                    driver.set(new FirefoxDriver());
                case "ie":
                    driver.set(new InternetExplorerDriver());
                    break;
                case "safari":
                    driver.set(new SafariDriver());
                    break;
                case "chrome-headless":
                    driver.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                    break;
                default:
                    System.out.println("browser is not valid");
                    driver.set(null);
            }
        }
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get().manage().window().maximize();

        return driver.get();
    }

    public static void closeDriver(){
        driver.get().quit();
//        driver.set(null);
    }
}
