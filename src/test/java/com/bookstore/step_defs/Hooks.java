package com.bookstore.step_defs;

import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {

    @Before
    public void setUp(){
        RestAssured.baseURI="https://demoqa.com";
    }
}
