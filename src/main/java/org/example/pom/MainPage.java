package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MainPage {


    private String URL = "https://qa-scooter.praktikum-services.ru/";



    //Вопросы о важном
    private By accordionCourierPayment = By.xpath("//div[text()='Сколько это стоит? И как оплатить?']");
    private By accordionManyScooters = By.xpath("//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    private By accordionRentTimeCalculation = By.xpath("//div[text()='Как рассчитывается время аренды?']");
    private By accordionOrderToday = By.xpath("//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    private By accordionExtendOrReturn = By.xpath("//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    private By accordionCharger = By.xpath("//div[text()='Вы привозите зарядку вместе с самокатом?']");
    private By accordionCancelOrder = By.xpath("//div[text()='Можно ли отменить заказ?']");
    private By accordionDeliveryBeyondTheMKAD = By.xpath("//div[text()='Я живу за МКАДом, привезёте?']");

    //Ответы на вопросы
    private By accordionCourierPaymentText = By.xpath("//div[@id='accordion__panel-0']/p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    private By accordionManyScootersText = By.xpath("//div[@id='accordion__panel-1']/p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    private By accordionRentTimeCalculationText = By.xpath("//div[@id='accordion__panel-2']/p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    private By accordionOrderTodayText = By.xpath("//div[@id='accordion__panel-3']/p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    private By accordionExtendOrReturnText = By.xpath("//div[@id='accordion__panel-4']/p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    private By accordionChargerText = By.xpath("//div[@id='accordion__panel-5']/p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    private By accordionCancelOrderText = By.xpath("//div[@id='accordion__panel-6']/p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    private By accordionDeliveryBeyondTheMKADText = By.xpath("//div[@id='accordion__panel-7']/p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");
    private By cookieAcceptButton = By.xpath("//button[@id='rcc-confirm-button']");

    //Кнопки заказа самоката
    private By orderButtonTop = By.xpath("(//button[text()='Заказать'])[1]");
    private By orderButtonBottom = By.xpath("(//button[text()='Заказать'])[2]");
    private By orderFurtherButton = By.xpath("//button[text()='Далее']");
    private By orderFinishButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private By orderYesButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    //Заполнение полей заказа
    private By correctName = By.xpath("//input[@placeholder='* Имя']");
    private By correctLastName = By.xpath("//input[@placeholder='* Фамилия']");
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStation = By.xpath("//input[@placeholder='* Станция метро']");
    private By metroStationOption(String metroStationName){
        return By.xpath("//li/button/div[text()='" + metroStationName + "']");
    }
    private By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By dateDelivery = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By rentTime = By.xpath("//div[text()='* Срок аренды']");
    private By rentTimeOptions(String timeName){
        return By.xpath("//div[@class='Dropdown-option'][text()='" + timeName + "']");
    }
    private By scooterBlackColor = By.xpath("//label/input[@id='black']");
    private By scooterGreyColor = By.xpath("//label/input[@id='grey']");
    private By courierComment = By.xpath("//input[@placeholder='Комментарий для курьера']");

    private By successOrderText = By.xpath("//div[text()='Заказ оформлен']");


    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public MainPage open(){
        driver.get(URL);
        return this;
    }
    public MainPage maximizeWindow(){
        driver.manage().window().maximize();
        return this;
    }

    //Проверка вопросов о главном
    public MainPage cookieAcceptButtonClick(){
        driver.findElement(cookieAcceptButton).click();
        return this;
    }
    //Вопрос1
    public MainPage accordionCourierPaymentClick(){
        driver.findElement(accordionCourierPayment).click();
        return this;
    }
    //Вопрос2
    public MainPage accordionManyScootersClick(){
        driver.findElement(accordionManyScooters).click();
        return this;
    }
    //Вопрос3
    public MainPage accordionRentTimeCalculationClick(){
        driver.findElement(accordionRentTimeCalculation).click();
        return this;
    }
    //Вопрос4
    public MainPage accordionOrderTodayClick(){
        driver.findElement(accordionOrderToday).click();
        return this;
    }
    //Вопрос5
    public MainPage accordionExtendOrReturnClick(){
        driver.findElement(accordionExtendOrReturn).click();
        return this;
    }
    //Вопрос6
    public MainPage accordionChargerClick(){
        driver.findElement(accordionCharger).click();
        return this;
    }
    //Вопрос7
    public MainPage accordionCancelOrderClick(){
        driver.findElement(accordionCancelOrder).click();
        return this;
    }
    //Вопрос8
    public MainPage accordionDeliveryBeyondTheMKADClick(){
        driver.findElement(accordionDeliveryBeyondTheMKAD).click();
        return this;
    }

    //Проверка ответов на вопросы
    //1
    public boolean checkAccordionCourierPaymentText(){
        return driver.findElement(accordionCourierPaymentText).isDisplayed();
    }
    //2
    public boolean accordionManyScootersText(){
        return driver.findElement(accordionManyScootersText).isDisplayed();
    }
    //3
    public boolean accordionRentTimeCalculationText(){
        return driver.findElement(accordionRentTimeCalculationText).isDisplayed();
    }
    //4
    public boolean accordionOrderTodayText(){
        return driver.findElement(accordionOrderTodayText).isDisplayed();
    }
    //5
    public boolean accordionExtendOrReturnText(){
        return driver.findElement(accordionExtendOrReturnText).isDisplayed();
    }
    //6
    public boolean accordionChargerText(){
        return driver.findElement(accordionChargerText).isDisplayed();
    }
    //7
    public boolean accordionCancelOrderText(){
        return driver.findElement(accordionCancelOrderText).isDisplayed();
    }
    //8
    public boolean accordionDeliveryBeyondTheMKADText(){
        return driver.findElement(accordionDeliveryBeyondTheMKADText).isDisplayed();
    }

    //Переместиться к элементу
    public MainPage accordionCourierPaymentMoveTo(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(accordionCourierPayment));
        action.perform();
        return this;
    }
    public MainPage orderButtonBottomMoveTo(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(orderButtonBottom));
        action.build();
        return this;
    }

    //Заказ
    //Клик по верхней кнопке "Заказать"
    public MainPage orderButtonTopClick(){
        driver.findElement(orderButtonTop).click();
        return this;
    }
    //Ввод имени
    public MainPage correctNameSetText(String name){
        driver.findElement(correctName).sendKeys(name);
        return this;
    }
    //Ввод фамилии
    public MainPage correctLastNameSetText(String lastName){
        driver.findElement(correctLastName).sendKeys(lastName);
        return this;
    }
    //Ввод адреса
    public MainPage addressSetText(String addressName){
        driver.findElement(address).sendKeys(addressName);
        return this;
    }
    //Выбор станции метро
    public MainPage metroStationSelect(String metroStationName){
        driver.findElement(metroStation).click();
        driver.findElement(metroStationOption(metroStationName)).click();
        return this;
    }
    //Ввод номера телефона
    public MainPage phoneSetText(String phoneNumber){
        driver.findElement(phone).sendKeys(phoneNumber);
        return this;
    }
    public MainPage orderFurtherButtonClick(){
        driver.findElement(orderFurtherButton).click();
        return this;
    }
    public MainPage dateDeliverySelect(String date){
        driver.findElement(dateDelivery).sendKeys(date, Keys.ENTER);
        return this;
    }
    public MainPage rentTimeSelect(String time){
        driver.findElement(rentTime).click();
        driver.findElement(rentTimeOptions(time)).click();
        return this;
    }
    public MainPage scooterBlackColorClick(){
        driver.findElement(scooterBlackColor).click();
        return this;
    }
    public MainPage scooterGreyColorClick(){
        driver.findElement(scooterGreyColor).click();
        return this;
    }
    public MainPage courierCommentText(String text){
        driver.findElement(courierComment).sendKeys(text);
        return this;
    }
    public MainPage orderFinishButtonClick(){
        driver.findElement(orderFinishButton).click();
        return this;
    }
    public MainPage orderYesButtonClick(){
        driver.findElement(orderYesButton).click();
        return this;
    }

    public boolean successOrderText(){
        return driver.findElement(successOrderText).isDisplayed();
    }

    public MainPage orderButtonBottomClick(){
        driver.findElement(orderButtonBottom).click();
        return this;
    }
}

