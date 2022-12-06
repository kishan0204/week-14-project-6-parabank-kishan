package com.parasoft.parabank.pages;


import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;


public class RegisterTestPage extends Utility {
    /*1.verifyThatSigningUpPageDisplay
     * click on the ‘Register’ link
     * Verify the text ‘Signing up is easy!’*/
    By registerButton = By.xpath("//a[contains(text(),'Register')]");
    By signingLink = By.xpath("//h1[contains(text(),'Signing up is easy!')]");

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public void verifySigningLink() {
        verifyTextFromElements(signingLink, "Signing up is easy!");
    }

    /*-------------------------------------------------------------------------------------*/
    /*2.userSholdRegisterAccountSuccessfully*/
    By firstNameLink = By.xpath("//input[@id='customer.firstName']");
    By lastNameLink = By.xpath("//input[@id='customer.lastName']");
    By addressLink = By.xpath("//input[@id='customer.address.street']");
    By cityNameLink = By.xpath("//input[@id='customer.address.city']");
    By stateNameLink = By.xpath("//input[@id='customer.address.state']");
    By zipCodeLink = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNumberLink = By.xpath("//input[@id='customer.phoneNumber']");
    By ssnLink = By.xpath("//input[@id='customer.ssn']");
    By userNameLink = By.xpath("//input[@id='customer.username']");
    By passwordLink = By.xpath("//input[@id='customer.password']");
    By confirmPasswordLink = By.xpath("//input[@id='repeatedPassword']");
    By registerButtonLink = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    By createSuccessfully = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");
public void enterFirstNmeLink (String name ){sendTextToElement(firstNameLink,name);}
    public void enterLastNameLink (String lastname ){sendTextToElement(lastNameLink ,lastname);}
    public void enterAddressLink (String address){sendTextToElement(addressLink,address);}
    public void enterCityNameLink(String cityname){sendTextToElement(cityNameLink,cityname);}
    public void enterStateNameLink(String state){sendTextToElement(stateNameLink,state);}
    public void enterZipCodeLink(String zipCode){sendTextToElement(zipCodeLink,zipCode);}
    public void enterPhoneNumberLink(String phoneNumber){sendTextToElement(phoneNumberLink,phoneNumber);}
    public void enterSsnLink (String ssn){sendTextToElement(ssnLink,ssn);}
    public void enterUserNameLink(String username){sendTextToElement(userNameLink,username);}
    public void enterPasswordLink(String password){sendTextToElement(passwordLink,password);}
    public void enterConfirmPasswordLink(String confirmPassword){sendTextToElement(confirmPasswordLink,confirmPassword);}
    public void clickOnRegisterButtonLink(){clickOnElement(registerButtonLink);}
    public void verifyCreateSuccessfully(){verifyTextFromElements(createSuccessfully,"Your account was created successfully. You are now logged in.");}
}






