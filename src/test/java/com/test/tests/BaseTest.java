package com.test.tests;

import org.junit.After;
import org.junit.Before;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.test.config.Project;

public abstract class BaseTest {

    @Before
    public void setUp() {
        
        switch (Project.config.browser()) {
            case "chrome":
                setUpChrome();
                break;
            case "firefox":
                setUpFirefox();
                break;
            default:
                break;
        }
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    public void setUpChrome() {
        Configuration.browser = Project.config.browser();
        Configuration.browserSize = Project.config.browserSize();
        Configuration.headless = Project.config.headless();
    }

    public void setUpFirefox() {
        Configuration.browser = Project.config.browser();
        Configuration.browserSize = Project.config.browserSize();
        Configuration.headless = Project.config.headless();
    }
}
