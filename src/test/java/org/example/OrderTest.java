package org.example;

import org.example.pom.MainPage;
import org.example.pom.OrderPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrderTest {

    private WebDriver driver;

    @Test
    public void orderTestChromeTopButton(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        mainPage
                .open()
                .maximizeWindow()
                .cookieAcceptButtonClick()
                .orderButtonTopClick();
        orderPage
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
        OrderPage orderPage = new OrderPage(driver);

        mainPage
                .open()
                .maximizeWindow().cookieAcceptButtonClick()
                .orderButtonBottomMoveTo()
                .orderButtonBottomClick();
        orderPage
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
    @After
    public void tearDown() {
        driver.quit();
    }
}
