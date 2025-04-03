package com.bridgelabz.javaJUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DbConnectionTest {
    DbConnection dbConnect = new DbConnection();

    @BeforeEach
    void setup(){
        dbConnect.connect();
    }

    @AfterEach
    void tearDown(){
        dbConnect.disconnect();
    }

    @Test
    void shouldConnectToDataBase(){
        Assertions.assertTrue(dbConnect.connect());
    }

    @Test
    void shouldDisConnectFromDataBase(){
        Assertions.assertFalse(dbConnect.disconnect());
    }
}
