package com.bridgelabz.javaJUnit;

public class DbConnection {
    boolean isConnected = false;
    public boolean connect() {
        isConnected = true;
        return isConnected;
    }

    public boolean disconnect() {
        isConnected = false;
        return  isConnected;
    }
}
