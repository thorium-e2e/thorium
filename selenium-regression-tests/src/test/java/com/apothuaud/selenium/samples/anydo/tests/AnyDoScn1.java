package com.apothuaud.selenium.samples.anydo.tests;

import com.apothuaud.selenium.samples.anydo.Account;
import com.apothuaud.selenium.samples.anydo.pages.AnyDoGuestHomePage;
import org.testng.annotations.Test;

public class AnyDoScn1 {

    Account testNewAccount = new Account(
        "",
        ""
    );

    @Test
    public void test_create_account() {
        new AnyDoGuestHomePage()
        .openPage()
        .signUp(testNewAccount)
        .verifySignedIn()
        ;
    }
}
