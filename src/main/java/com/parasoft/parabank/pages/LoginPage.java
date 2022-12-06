package com.parasoft.parabank.pages;


import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    // //Enter valid username
 /*1.userShouldLoginSuccessfullyWithValidCredentials
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Accounts Overview’ text is display*/
    By userNameField = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]");
    By passWordField = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]");
    By loginLinkField = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
    By textMessage = By.xpath("//h1[contains(text(),'Accounts Overview')]");//"Accounts Overview"

    public void enterUserNameField (String userName){sendTextToElement(userNameField , userName);}
    public void enterPassWordField (String password){sendTextToElement(passWordField , password);}
    public void clickOnLoginButton (){clickOnElement(loginLinkField);}
    public void verifyTextMessage(){verifyTextFromElements(textMessage,"Accounts Overview");}

 /*--------------------------------------------------------------------------------------------------*/
 /*2.verifyTheErrorMessage
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘The username and password could not be verified.’*/
 By invalidUserName = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]");
 By invalidPassword = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]");
// By loginButton =By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
 By invalidTextMessage= By.xpath("//h1[contains(text(),'Error!')]");

 public void enterInvalidUsername (String username){sendTextToElement(invalidUserName,username);}
 public void enterInvalidPassword (String password){sendTextToElement(invalidPassword,password);}
 public void verifyInvalidTextMessage(){verifyTextFromElements(invalidTextMessage,"Error!");}

 /*-----------------------------------------------------------------------------------------*/
 /*3.userShouldLogOutSuccessfully
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Click on ‘Log Out’ link
* Verify the text ‘Customer Login’*/

 By logoutButton =By.xpath("//a[contains(text(),'Log Out')]");
 By customerLogin = By.xpath("//h2[contains(text(),'Customer Login");
 public void clickOnLogoutButton(){clickOnElement(logoutButton);}
 public void verifyCustomerLogin(){verifyTextFromElements(customerLogin,"Customer Login");}






}
