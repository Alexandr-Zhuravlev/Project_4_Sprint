package org.example;

import org.example.pom.MainPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class OrderTest {

    private WebDriver driver;

    @Test
    public void questionTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);

        mainPage
                .open()
                .maximizeWindow()
                .cookieAcceptButtonClick()
                .accordionCourierPaymentMoveTo()
                .accordionCourierPaymentClick()
                .checkAccordionCourierPaymentText();
        mainPage
                .accordionManyScootersClick()
                .accordionManyScootersText();
        mainPage
                .accordionRentTimeCalculationClick()
                .accordionRentTimeCalculationText();
        mainPage
                .accordionOrderTodayClick()
                .accordionOrderTodayText();
        mainPage
                .accordionExtendOrReturnClick()
                .accordionExtendOrReturnText();
        mainPage
                .accordionChargerClick()
                .accordionChargerText();
        mainPage
                .accordionCancelOrderClick()
                .accordionCancelOrderText();
        //В этом шаге баг с текстом в вопросе
        mainPage
                .accordionDeliveryBeyondTheMKADClick()
                .accordionDeliveryBeyondTheMKADText();
    }

    @Test
    public void orderTestChromeTopButton(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);

        mainPage
                .open()
                .maximizeWindow()
                .orderButtonTopClick()
                .correctNameSetText("Герберт")
                .correctLastNameSetText("Шилдт")
                .addressSetText("Чистопрудный бульвар 8")
                .metroStationSelect("Бульвар Рокоссовского")
                .phoneSetText("89998887766")
                .orderFurtherButtonClick()
                .dateDeliverySelect("12.12.2025")
                .rentTimeSelect("сутки")
                .scooterBlackColorClick()
                .courierCommentText("Комментарий")
                .orderFinishButtonClick()
                .orderYesButtonClick()
                .successOrderText();
    }

    @Test
    public void orderTestChromeBottomButton(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);

        mainPage
                .open()
                .maximizeWindow().cookieAcceptButtonClick()
                .orderButtonBottomMoveTo()
                .orderButtonBottomClick()
                .correctNameSetText("Иван")
                .correctLastNameSetText("Иванов")
                .addressSetText("Чистопрудный бульвар 224")
                .metroStationSelect("Бульвар Рокоссовского")
                .phoneSetText("81234567890")
                .orderFurtherButtonClick()
                .dateDeliverySelect("11.11.2025")
                .rentTimeSelect("двое суток")
                .scooterGreyColorClick()
                .courierCommentText("Комментарий приветствуется")
                .orderFinishButtonClick()
                .orderYesButtonClick()
                .successOrderText();
    }

    @Test
    public void orderTestFireFox(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);

        mainPage
                .open()
                .maximizeWindow()
                .orderButtonTopClick()
                .correctNameSetText("Альберт")
                .correctLastNameSetText("Энштейн")
                .addressSetText("Чистопрудный бульвар 12")
                .metroStationSelect("Бульвар Рокоссовского")
                .phoneSetText("81112223344")
                .orderFurtherButtonClick()
                .dateDeliverySelect("22.12.2025")
                .rentTimeSelect("трое суток")
                .scooterBlackColorClick()
                .courierCommentText("Комментарий отсутствует")
                .orderFinishButtonClick()
                .orderYesButtonClick()
                .successOrderText();
    }

    @Test
    public void orderTestFireFoxBottomButton(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);

        mainPage
                .open()
                .maximizeWindow()
                .cookieAcceptButtonClick()
                .orderButtonBottomMoveTo()
                .orderButtonBottomClick()
                .correctNameSetText("Павел")
                .correctLastNameSetText("Павлов")
                .addressSetText("Бабушкинская 12")
                .metroStationSelect("Бульвар Рокоссовского")
                .phoneSetText("89876543210")
                .orderFurtherButtonClick()
                .dateDeliverySelect("10.10.2025")
                .rentTimeSelect("четверо суток")
                .scooterGreyColorClick()
                .courierCommentText("Комментарий есть")
                .orderFinishButtonClick()
                .orderYesButtonClick()
                .successOrderText();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
