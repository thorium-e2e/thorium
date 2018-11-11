package com.apothuaud.restassured.samples.restassured.jsonplaceholder.tests;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.get;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;

public class SampleTest {

    @Test
    public void test_a_post_has_user_id() {
        get("https://jsonplaceholder.typicode.com/posts/1")
            .then().body("userId", equalTo(1));
    }

    @Test
    public void test_a_post_has_json() throws FileNotFoundException {
        String myJson = new FileReader("src/test/resources/data/json/jsonplaceholder/posts-1.json").toString();
        get("https://jsonplaceholder.typicode.com/posts/1")
            .then().assertThat()
            .body(matchesJsonSchema(myJson));
    }

}
