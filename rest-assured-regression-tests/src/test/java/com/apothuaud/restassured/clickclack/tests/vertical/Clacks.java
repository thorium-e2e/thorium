package com.apothuaud.restassured.clickclack.tests.vertical;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class Clacks {

    String testClackID;

    @Test
    public void testListClacks(){
        Response r = get("http://localhost:5000/clacks");
        Assert.assertEquals(r.statusCode(), 200);
        System.out.println("=====================");
        JsonPath jp = r.jsonPath().get(0);
        System.out.println(jp.get("_id"));
    }
}
