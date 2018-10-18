package com.apothuaud.selenium.anydo.tests.scenarios;

import com.apothuaud.selenium.anydo.Account;
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
