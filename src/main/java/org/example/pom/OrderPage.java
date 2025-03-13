package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    //Кнопки оформления заказа
    private By orderFurtherButton = By.xpath("//button[text()='Далее']");
    private By orderFinishButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private By orderYesButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    //Заполнение полей заказа
    private By correctName = By.xpath("//input[@placeholder='* Имя']");
    private By correctLastName = By.xpath("//input[@placeholder='* Фамилия']");
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStation = By.xpath("//input[@placeholder='* Станция метро']");
    private By metroStationOption(String metroStationName){
        return By.xpath(String.format("//li/button/div[text()='%s']", metroStationName));
    }
    private By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By dateDelivery = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By rentTime = By.xpath("//div[text()='* Срок аренды']");
    private By rentTimeOptions(String timeName){
        return By.xpath(String.format("//div[@class='Dropdown-option'][text()='%s']", timeName));
    }
    private By scooterBlackColor = By.xpath("//label/input[@id='black']");
    private By scooterGreyColor = By.xpath("//label/input[@id='grey']");
    private By courierComment = By.xpath("//input[@placeholder='Комментарий для курьера']");

    private By successOrderText = By.xpath("//div[text()='Заказ оформлен']");


    private WebDriver driver;

    public OrderPage (WebDriver driver){
        this.driver = driver;
    }
    //Ввод имени
    public OrderPage correctNameSetText(String name){
        driver.findElement(correctName).sendKeys(name);
        return this;
    }
    //Ввод фамилии
    public OrderPage correctLastNameSetText(String lastName){
        driver.findElement(correctLastName).sendKeys(lastName);
        return this;
    }
    //Ввод адреса
    public OrderPage addressSetText(String addressName){
        driver.findElement(address).sendKeys(addressName);
        return this;
    }
    //Выбор станции метро
    public OrderPage metroStationSelect(String metroStationName){
        driver.findElement(metroStation).click();
        driver.findElement(metroStationOption(metroStationName)).click();
        return this;
    }
    //Ввод номера телефона
    public OrderPage phoneSetText(String phoneNumber){
        driver.findElement(phone).sendKeys(phoneNumber);
        return this;
    }
    public OrderPage orderFurtherButtonClick(){
        driver.findElement(orderFurtherButton).click();
        return this;
    }
    public OrderPage dateDeliverySelect(String date){
        driver.findElement(dateDelivery).sendKeys(date, Keys.ENTER);
        return this;
    }
    public OrderPage rentTimeSelect(String time){
        driver.findElement(rentTime).click();
        driver.findElement(rentTimeOptions(time)).click();
        return this;
    }
    public OrderPage scooterBlackColorClick(){
        driver.findElement(scooterBlackColor).click();
        return this;
    }
    public OrderPage scooterGreyColorClick(){
        driver.findElement(scooterGreyColor).click();
        return this;
    }
    public OrderPage courierCommentText(String text){
        driver.findElement(courierComment).sendKeys(text);
        return this;
    }
    public OrderPage orderFinishButtonClick(){
        driver.findElement(orderFinishButton).click();
        return this;
    }
    public OrderPage orderYesButtonClick(){
        driver.findElement(orderYesButton).click();
        return this;
    }

    public boolean successOrderText(){
        return driver.findElement(successOrderText).isDisplayed();
    }
}
