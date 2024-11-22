package com.Booking.IndigoFlightBooking;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:/selenium/chrome_profile"); // Use new profile path
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // Specify Chrome binary
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");



        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.goindigo.in/");
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement book = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-expanded])[1]")));
            book.click();



            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement flight = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@tabindex])[3]")));
            flight.click();



            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement pax = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button)[8]")));
            pax.click();



            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement addPassanger = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class = 'stepper-input__btn stepper-input__btn--plus'])[1]")));
            addPassanger.click();



            WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement done = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='custom-button pax-dropdown__action__done']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", done);
            done = wait.until(ExpectedConditions.elementToBeClickable(done));
            done.click();



            WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement from = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='input-text-field__input'])[1]")));
            from.click();

            Thread.sleep(500);

            from.sendKeys("Hyderabad(HYD)");

            Thread.sleep(500);

            WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement to = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='input-text-field__input'])[1]")));
            to.click();

            Thread.sleep(500);

            to.sendKeys("Delhi(DEL)");

            Thread.sleep(500);

            LocalDate currentDate = LocalDate.now();
            LocalDate nextMonthDate = currentDate.plusMonths(1);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
            String formattedDate = nextMonthDate.format(formatter).toUpperCase();

            WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement datee = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Travel Dates']")));
            datee.click();

            Thread.sleep(500);

            datee.sendKeys(Keys.CONTROL + "a"); // Select all text

            Thread.sleep(500);

            datee.sendKeys(Keys.BACK_SPACE);

            Thread.sleep(500);

            datee.sendKeys(formattedDate);

            Thread.sleep(500);

            WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement searchFlight = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[span[text()='Search Flight']]")));
            searchFlight.click();




            WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement select = wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Select'])[2]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", select);
            Thread.sleep(500);
            select = wait.until(ExpectedConditions.elementToBeClickable(select));
            if (select.isDisplayed()) {
                select.click(); // Example action to click the button
            }



            WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement nxt = wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
            nxt.click();



            WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger1Gender = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='Male'])[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger1Gender);
            Thread.sleep(500);
            passenger1Gender = wait.until(ExpectedConditions.elementToBeClickable(passenger1Gender));
            if (passenger1Gender.isDisplayed()) {
                passenger1Gender.click(); // Example action to click the button
            }



            WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger1FirstName = wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userFields.0.name.first']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger1FirstName);
            Thread.sleep(500);
            passenger1FirstName = wait.until(ExpectedConditions.elementToBeClickable(passenger1FirstName));
            if (passenger1FirstName.isDisplayed()) {
                passenger1FirstName.click();
                passenger1FirstName.sendKeys("Dibya Jyoti");// Example action to click the button
            }



            WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger1LastName= wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userFields.0.name.last']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger1LastName);
            Thread.sleep(500);
            passenger1LastName = wait.until(ExpectedConditions.elementToBeClickable(passenger1LastName));
            if (passenger1LastName.isDisplayed()) {
                passenger1LastName.click();
                passenger1LastName.sendKeys("Mahanta");// Example action to click the button
            }



            WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger1DOB= wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userFields.0.info.dateOfBirth']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger1DOB);
            Thread.sleep(500);
            passenger1DOB = wait.until(ExpectedConditions.elementToBeClickable(passenger1DOB));
            if (passenger1DOB.isDisplayed()) {
                passenger1DOB.click();
                passenger1DOB.sendKeys("23-03-2002");// Example action to click the button
            }



            WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger1= wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='accordion-header d-flex p-6 p-6 px-md-12 py-md-8 justify-content-between bg-transparent border-0 w-100'])[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger1);
            Thread.sleep(500);
            passenger1 = wait.until(ExpectedConditions.elementToBeClickable(passenger1));
            if (passenger1.isDisplayed()) {
                passenger1.click();
            }



            WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger2= wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='accordion-header d-flex p-6 p-6 px-md-12 py-md-8 justify-content-between bg-transparent border-0 w-100'])[2]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger2);
            Thread.sleep(500);
            passenger2 = wait.until(ExpectedConditions.elementToBeClickable(passenger2));
            if (passenger2.isDisplayed()) {
                passenger2.click();
            }

            WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger2Gender= wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='Female'])[2]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger2Gender);
            Thread.sleep(500);
            passenger2Gender = wait.until(ExpectedConditions.elementToBeClickable(passenger2Gender));
            if (passenger2Gender.isDisplayed()) {
                passenger2Gender.click();
            }

            WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger2FirstName= wait18.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userFields.1.name.first']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger2FirstName);
            Thread.sleep(500);
            passenger2FirstName = wait.until(ExpectedConditions.elementToBeClickable(passenger2FirstName));
            if (passenger2FirstName.isDisplayed()) {
                passenger2FirstName.click();
                passenger2FirstName.sendKeys("Dibyagana");
            }

            WebDriverWait wait19 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger2LastName= wait19.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userFields.1.name.last']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger2LastName);
            Thread.sleep(500);
            passenger2LastName = wait.until(ExpectedConditions.elementToBeClickable(passenger2LastName));
            if (passenger2LastName.isDisplayed()) {
                passenger2LastName.click();
                passenger2LastName.sendKeys("Mahanta");// Example action to click the button
            }

            WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement passenger2DOB= wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='userFields.1.info.dateOfBirth']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", passenger2DOB);
            Thread.sleep(500);
            passenger2DOB = wait.until(ExpectedConditions.elementToBeClickable(passenger2DOB));
            if (passenger2DOB.isDisplayed()) {
                passenger2DOB.click();
                passenger2DOB.sendKeys("09-01-2006");// Example action to click the button
            }

            WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement phNo= wait21.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='primaryContact']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", phNo);
            Thread.sleep(500);
            phNo = wait.until(ExpectedConditions.elementToBeClickable(phNo));
            if (phNo.isDisplayed()) {
                phNo.click();
                phNo.sendKeys("7978742327");// Example action to click the button
            }

            WebDriverWait wait22 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement email= wait22.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='email'])[1]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", email);
            Thread.sleep(500);
            email = wait.until(ExpectedConditions.elementToBeClickable(email));
            if (email.isDisplayed()) {
                email.click();
                email.sendKeys("mahantasoham@gmail.com");// Example action to click the button
            }

            WebDriverWait wait23 = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement whatsapp= wait23.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@role='checkbox'])[4]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", whatsapp);
            Thread.sleep(500);
            whatsapp = wait.until(ExpectedConditions.elementToBeClickable(whatsapp));
            if (whatsapp.isDisplayed()) {
                whatsapp.click();
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
//        finally {
//            driver.quit(); // Use quit() to ensure all resources are cleaned up
//        }
    }
}
