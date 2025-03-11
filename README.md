# Java 8 Web Test Automation with Selenium and Maven

This project is a web test automation suite built with Java 8, Selenium, and Maven. It covers essential user flows for an e-commerce application, including purchasing a product, managing the shopping cart, and logging out. The test execution is managed through TestNG, and tests are organized in a suite.xml file within the resources package.

## 🧩 Implemented Test Cases

1. **Buy Product Path**:
   - Simulates the complete purchase flow: browsing products, adding items to the cart, and completing the checkout.

2. **Delete Products from Shopping Cart**:
   - Verifies the functionality to remove items from the shopping cart.

3. **Logout**:
   - Tests the logout process to ensure users are securely logged out of the application.

## 🛠️ Prerequisites

- **Java 8** installed
- **Maven** installed and configured
- Internet connection for dependency resolution

## 🏃 Running the Tests

1. **Clone the repository:**
```bash
git clone <repository_url>
cd <repository_folder>
```

2. **Install dependencies:**
```bash
mvn clean install
```

3. **Run the test suite:**

Execute the tests using the TestNG suite defined in `suite.xml`:
```bash
mvn test -DsuiteXmlFile=src/test/resources/suite.xml
```

Alternatively, you can run the tests directly with TestNG from your IDE.




