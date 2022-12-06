package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.pages.RegisterTestPage;
import com.parasoft.parabank.testbase.BaseTest;
import com.parasoft.parabank.utility.Utility;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    RegisterTestPage registerTestPage = new RegisterTestPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //1.userShouldLoginSuccessfullyWithValidCredentials
        loginPage.enterUserNameField("kishan_0254");
        loginPage.enterPassWordField("Vivek241990");
        loginPage.clickOnLoginButton();
        loginPage.verifyTextMessage();
    }

    @Test
    public void verifyTheErrorMessage() {
        //2.verifyTheErrorMessage
        loginPage.enterInvalidUsername("kishan_0254");
        loginPage.enterPassWordField("123456");
        loginPage.clickOnLoginButton();
        loginPage.verifyInvalidTextMessage();
    }

    @Test
    public void userShouldLogOutSuccessfully() {
        //3.userShouldLogOutSuccessfully
        loginPage.enterUserNameField("kishan_0254");
        loginPage.enterPassWordField("Vivek241990");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutButton();
        loginPage.verifyCustomerLogin();
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        /*1.verifyThatSigningUpPageDisplay*/
        registerTestPage.clickOnRegisterButton();
        registerTestPage.verifySigningLink();
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //2.userSholdRegisterAccountSuccessfully
        registerTestPage.clickOnRegisterButton();
        registerTestPage.enterFirstNmeLink("kishan");
        registerTestPage.enterLastNameLink("malaviya");
        registerTestPage.enterAddressLink("115a manor drive");
        registerTestPage.enterCityNameLink("London");
        registerTestPage.enterStateNameLink("new maldon");
        registerTestPage.enterZipCodeLink("kt3 5pd");
        registerTestPage.enterPhoneNumberLink("0753445680");
        registerTestPage.enterSsnLink("kkk");
        registerTestPage.enterUserNameLink("kishan_" + getAlphaNumericString(2));
        registerTestPage.enterPasswordLink("Vivek241990");
        registerTestPage.enterConfirmPasswordLink("Vivek241990");
        registerTestPage.clickOnRegisterButtonLink();
        registerTestPage.verifyCreateSuccessfully();

    }
}