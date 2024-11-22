```markdown
# ✈️ Indigo Flight Booking Automation with Selenium

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

This project automates the process of booking flights on the Indigo website using **Java**, **Maven**, and **Selenium WebDriver**. It tackles common issues posed by anti-bot mechanisms, such as bot detection and element blocking, by employing dynamic strategies like **incognito mode** and JavaScript-based interactions.

---

## ⚙️ Features

- Automates the entire flight booking process on Indigo:
  - Flight type selection.
  - Adding passengers.
  - Setting travel details (origin, destination, travel dates).
  - Inputting passenger information (name, gender, date of birth).
  - Configuring contact details (phone number, email).
- Incorporates **dynamic waits** and **JavaScriptExecutor** for seamless interaction with complex web elements.
- Bypasses anti-bot restrictions using **incognito mode** and advanced ChromeDriver configurations.

---

## 🛠️ Technologies Used

- **Java**: Core programming language for the script.
- **Selenium WebDriver**: Automates browser interactions.
- **Maven**: Dependency management and project build.
- **ChromeDriver**: Interacts with the Chrome browser.

---

## 🚀 Getting Started

### 1️⃣ **Prerequisites**

- **Java Development Kit (JDK)** installed (version 11+ recommended).
- **Maven** installed for dependency management.
- **Google Chrome** installed on your system.
- **ChromeDriver** compatible with your Chrome version. Download it from [here](https://chromedriver.chromium.org/downloads).

### 2️⃣ **Setup**

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/IndigoFlightBooking.git
   cd IndigoFlightBooking
   ```

2. Install dependencies via Maven:
   ```bash
   mvn clean install
   ```

3. Update the **ChromeDriver** path in the code:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
   ```

4. Create a new Chrome profile for Selenium automation and specify its directory in the script:
   ```java
   options.addArguments("user-data-dir=path/to/your/chrome_profile");
   ```

---

### 3️⃣ **How to Run**

1. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
2. Run the `App.java` file in the `com.Booking.IndigoFlightBooking` package.
3. The script will:
    - Open the Indigo website in **incognito mode**.
    - Perform flight booking steps dynamically.
    - Log progress in the console for monitoring.

---

## 📂 Project Structure

```plaintext
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.Booking.IndigoFlightBooking
│   │   │       └── App.java       # Main automation script
│   │   └── resources
├── pom.xml                        # Maven configuration file
└── README.md                      # Project documentation
```

---

## 📝 Key Functions and Strategies

### **1️⃣ Handling Anti-Bot Mechanisms**
- Utilizes **incognito mode** to bypass bot detection.
- Sets `--disable-blink-features=AutomationControlled` to prevent detection of automated behavior.

### **2️⃣ Dynamic Waits**
- `WebDriverWait` is employed for reliable interaction with dynamically loaded elements:
  ```java
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
  ```

### **3️⃣ JavaScriptExecutor**
- Used to scroll to elements and handle hidden or unresponsive elements:
  ```java
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
  ```

### **4️⃣ Dynamic Passenger Addition**
- The script dynamically adds passengers and fills in their details:
  ```java
  WebElement addPassenger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='stepper-input__btn']")));
  addPassenger.click();
  ```

---

## ❓ FAQ

### **Why does this script use incognito mode?**
Indigo's website employs anti-bot measures. Incognito mode helps bypass these restrictions by avoiding cache, cookies, and stored session data.

### **What happens if an element isn’t found?**
The script employs exception handling to log errors without breaking execution:
```java
catch (Exception e) {
    System.out.println("An unexpected error occurred.");
    e.printStackTrace();
}
```

---

## 🎯 Future Enhancements

- **Parameterization**: Allow user inputs (e.g., passenger details, destinations) via external files like JSON or Excel.
- **Reporting**: Add detailed logging and test reporting (e.g., using Log4j or Allure).
- **Multi-Browser Support**: Extend functionality to support browsers like Firefox and Edge.

---

## 🌟 Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request. Ensure proper testing before submitting your changes.

---

## 📄 License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

### 💻 Author

**Dibya Jyoti Mahanta**
- ✉️ Email: mahantasoham@gmail.com
- 🌐 [GitHub Profile](https://github.com/yourusername)

---

### ❤️ Acknowledgements

Thanks to the Selenium and Indigo teams for their tools and platforms, which made this project possible!
```