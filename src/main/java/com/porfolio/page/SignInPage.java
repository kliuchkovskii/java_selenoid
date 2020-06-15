package com.porfolio.page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SignInPage extends BasePage {
    private static final String PAGE_URL = BASE_URL + "/index.php?controller=authentication&back=my-account";
    private static final String EMAIL_FIELD = "";
    private static final String PASSWORD_FIELD = "";
    private static final String SIGN_IN_BUTTON = "";

    @Override
    public void navigateToPage() {
        open(PAGE_URL);
    }

    public SignInPage setEmailField(String email){
        $x(EMAIL_FIELD).shouldBe(Condition.visible).setValue(email);
        return this;
    }

    public SignInPage setPasswordField(String password){
        $x(PASSWORD_FIELD).shouldBe(Condition.visible).setValue(password);
        return this;
    }

    public void clickOnSignInButton(){
        $x(SIGN_IN_BUTTON).shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
    }
}
