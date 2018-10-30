package com.apothuaud.restassured.clickclack.tests.endtoend;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class Scenario1 {

    private final String apiUrl = "https://myclicksandclacks.herokuapp.com";
    private final String clipsEndPoint = apiUrl + "/clips";

    private String getClipEndPoint(String clipId) {
        return clipsEndPoint + "/" + clipId;
    }

    @Test
    public void test_a() {
        get(clipsEndPoint)
                .then()
                .statusCode(200);
    }
}
