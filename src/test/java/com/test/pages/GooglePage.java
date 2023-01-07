package com.test.pages;

import com.codeborne.selenide.Selenide;

public class GooglePage {
    public static final String URL = "https://google.com";

    public static void open() {
        Selenide.open(URL);
    }

    public static void search(String text) {
        Selenide.$("[name='q']").setValue(text).pressEnter();
    }
}
