package com.portfolio.test;

import com.porfolio.page.SignInPage;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test
    public void signInTest(){
        SignInPage signInPage = new SignInPage();
        signInPage.navigateToPage();
        signInPage.setEmailField("ememail");
        signInPage.setPasswordField("ememail");
        signInPage.clickOnSignInButton();
    }
}
