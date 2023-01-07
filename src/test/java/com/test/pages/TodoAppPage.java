package com.test.pages;

import com.codeborne.selenide.Selenide;

public class TodoAppPage {
    
    public TodoAppPage() {
        super();
    }

    public static final String URL = "http://217.151.231.130:5050/";

    public void open() {
        Selenide.open(URL);
        Selenide.page(LoginPage.class)
            .login("admin", "admin");
    }
}
