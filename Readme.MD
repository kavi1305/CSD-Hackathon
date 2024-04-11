**Project Name: Book one way outstation cab and display the lowest charges**
**WebSite used: Makemytrip.com**

# Overview
This project aims to automate Book one way outstation cab and display the lowest charges in Makemytrip.com using Selenium WebDriver. The automation process involves navigating to Makemytrip page, then select cab option and try to book a ticket from Delhi to Manali and get the lowest "SUV" cab price.Next navigate to Gift cards page and select a gift card, fill all the details and give invalid email id and check whether invalid email id message appears. Next navigate to On the Hotel booking page, extract all the numbers for Adult persons shown in the dropdown and store in a List then Display the same in th econsole.

## Libraries and Dependencies
- **Maven Repository:** Maven 3.12.1
- **Selenium WebDriver:** 4.19.1
- **cucumber** 7.16.1 (cucumber-junit & cucumber-java)
- **Apache POI:** 5.2.5
- **extentreports-cucumber7-adapter** 1.14.0
- **Loggers:** 2.23.1 (log4j-core & log4j-api)

## Plugins
- **Maven-compiler-plugin:** 3.13.0
- **maven-surefire-plugin:** 3.2.5

## Automation Flow
1. Book one way outstation cab, From Delhi to Manali, himachal Pradesh.
2. Give future date and time.
3. Select car type as "SUV".
4. Display the lowest cab charge.
5. Select a gift card from gift cards section.
6. Fill card details and give invalid email.
7. Error message should be shown, which should be captured and displayed.
8. Next navigate to hotel bookings page.
9. Start filing the options and extract all the numbers for Adult persons and store in a List.
10.Display the same in the console.

## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **Selenium WebDriver:** Automates browser interactions.
- **cucumber:** Facilitates test case organization ,execution and readability.
- **Apache POI:** Handles Excel operations for data-driven testing.
- **Extent Report:** Generates comprehensive test reports for cucumber.
- **Loggers:** Facilitates logging for better debugging.

## Screenshots
Screenshots are captured at relevant steps for documentation and analysis.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run Test Suite:**
   - Locate the test suite file (`TestRunner.java`)
   - Right-click on the file and choose `Run As` -> `JUnit test`.

6. **View Reports:**
   - After execution, open the `reports` folder.
   - Find the Reports file (`myreport.html`) for detailed test case reports.

## Reporting
1. **Locate Test Reports:**
   - After execution, open the `reports` folder.
   - Find the Reports file (`myreport.html`) for detailed test case reports.

2. **Open Extent Report:**
   - Inside the `test-output` folder, find the Extent Report HTML file named `SparkReport`.

3. **View Test Reports:**
   - click on `SparkReport` and you will get Report and screenshots folder,click on reports and open the file named `CucumberExtentReport.html`

4. **Screenshots and Logs:**
   - screenshots captured during test execution and relevant logs for test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the TestNG Report to quickly identify test status and any issues encountered during the test run.

## Contributors
- **L Kavi Arasu    2318696**
- **Maikandan M     2318698**
- **Aravindan N     2318690**
- **Atharva Pakhode 2318693**
- **Karthik A       2318671**

## Known Issues
- **Issue 1: From and To location load delay**
  - Description: At times While filling from location in cabs tab ,even after entering data it takes time to load the auto suggestion. .
  - Workaround: Connecting to better network and providing delay is the temporary solution.

- **Issue 2: Website load issue in lan network**
  - Description:Makemytrip website will not even load via Lan network.
  - Workaround: Connecting to wifi is the temporary solution.
  
- **Issue 3: Time out issue**
  - Description: At times , randomly time out issue appears here and there.
  - Workaround: Connecting to a faster network is the only temporary solution.

## Future Enhancements
.
- **Enhancement 1: Increase in number of Test cases**
  - Description: Currently we are having less than 50 test cases,in future we will increase more number of test cases .
  - Timeline: Considered for the upcoming sprint.

- **Enhancement 2: Cross browser testing **
  - Description: Currently we had not implemented cross browser testing.
  - Timeline: Long-term goal for improved data-driven testing.



