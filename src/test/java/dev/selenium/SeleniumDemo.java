package dev.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumDemo extends MainDriver {
@Test
    public void TestOpenBrowser () {

   // WebElement textInput = driver.findElement(By.cssSelector("#my-text-id"));
    WebElement textInput =driver.findElement(By.xpath("//*[@id='my-text-id' ]"));
    textInput.click();

    //WebElement password = driver.findElement(By.cssSelector("[type=password]"));
    WebElement password =driver.findElement(By.xpath("//*[@type='password']"));
    password.click();

    //WebElement textarea = driver.findElement(By.cssSelector("[name=my-textarea]"));
    WebElement textarea = driver.findElement(By.xpath("//*[@name='my-textarea']"));
    textarea.click();

    //WebElement textarea1 = driver.findElement(By.cssSelector("textarea.form-control"));
    WebElement textarea1 = driver.findElement(By.xpath("//textarea[contains(@class,'form-control')]"));
    textarea1.click();

    //WebElement checkedCheckbox = driver.findElement(By.cssSelector("#my-check-1"));
    WebElement checkedCheckbox = driver.findElement(By.xpath("//*[@id='my-check-1']"));
    checkedCheckbox.click();

   // WebElement defaultCheckbox = driver.findElement(By.cssSelector("#my-check-2"));
    WebElement defaultCheckbox = driver.findElement(By.xpath("//*[@id='my-check-2']"));
    defaultCheckbox.click();

    //WebElement dataPicker = driver.findElement(By.cssSelector("input.form-control[name=my-date]"));
    WebElement dataPicker = driver.findElement(By.xpath("//input[contains(@class,'form-control') and contains(@name,'my-date')]"));
    dataPicker.click();

    //WebElement colorPicker = driver.findElement(By.cssSelector("[type=color]"));
    WebElement colorPicker = driver.findElement(By.xpath("//*[@type='color']"));
    colorPicker.click();


    //WebElement submitButton = driver.findElement(By.cssSelector("button[type=submit]"));
    WebElement submitButton = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
    submitButton.click();






}

    }

