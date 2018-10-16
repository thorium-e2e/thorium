package com.apothuaud.selenium.google;

import org.testng.annotations.DataProvider;

public class QueryProvider {

    @DataProvider
    public Object[][] getGoogleQueries() {
        return new Object[][]{
                {"Adrian Pothuaud"},
                {"Selenium"},
                {"TestNG"},
                {"Open Source"},
                {"Wikipédia"},
                {"Amazon"},
                {"Google"},
                {"Gmail"},
                {"Leboncoin"},
                {"Facebook"}
        };
    }
}
