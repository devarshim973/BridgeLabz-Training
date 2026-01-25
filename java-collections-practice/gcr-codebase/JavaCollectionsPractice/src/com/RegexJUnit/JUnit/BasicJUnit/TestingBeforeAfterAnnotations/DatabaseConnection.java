package com.RegexJUnit.JUnit.BasicJUnit.TestingBeforeAfterAnnotations;

class DatabaseConnection {

    private boolean connected;

    public void connect() {
        connected = true;
    }

    public void disconnect() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }
}
