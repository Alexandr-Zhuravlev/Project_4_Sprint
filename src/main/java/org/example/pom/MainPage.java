package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MainPage {


    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    //Вопросы о важном
    private By accordionQuestionWithText(String text){
         return By.xpath(String.format("//div[contains(@id, 'accordion__heading')][text()='%s']", text));
    }
    //Ответы на вопросы
    private By accordionAnswerWithText(String text){
        return By.xpath(String.format("//div[contains(@id, 'accordion__panel')]/p[text()='%s']", text));
    }
    //Кнопка закрытия куки
    private By cookieAcceptButton = By.xpath("//button[@id='rcc-confirm-button']");
    //Кнопки заказа самоката
    private By orderButtonTop = By.xpath("//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    private By orderButtonBottom = By.xpath("(//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");


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
    //Вопрос
    public MainPage accordionQuestionWithTextClick(String text){
        driver.findElement(accordionQuestionWithText(text)).click();
        return this;
    }

    //Ответ
    public boolean isDisplayedAccordionAnswerWithText(String text){
        return driver.findElement(accordionAnswerWithText(text)).isDisplayed();
    }

    //Переместиться к элементу
    public MainPage accordionQuestionWithTextMoveTo(String text){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(accordionQuestionWithText(text)));
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
    public MainPage orderButtonBottomClick(){
        driver.findElement(orderButtonBottom).click();
        return this;
    }
}

