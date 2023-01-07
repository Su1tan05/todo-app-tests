package com.test.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By.ByName;

public class LoginPage {

    private SelenideElement usernameField = $(ByName.name("login"));
    private SelenideElement passwordField = $(ByName.name("password"));
    private SelenideElement loginButton = $("button[type='submit']");

    public void InputLogin(String login) {
        usernameField.setValue(login);
    }

    public void InputPassword(String password) {
        passwordField.setValue(password);
    }

    public void submit() {
        loginButton.click();
    }

    public void login(String username, String password) {
        InputLogin(username);
        InputPassword(password);
        loginButton.click();
    }
}