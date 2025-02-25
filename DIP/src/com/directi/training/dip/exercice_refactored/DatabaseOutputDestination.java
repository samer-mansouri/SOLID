package com.directi.training.dip.exercise_refactored;


import java.io.IOException;

public class DatabaseOutputDestination implements OutputDestination {
    private final MyDatabase database;

    public DatabaseOutputDestination(com.directi.training.dip.exercise_refactored.MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String data) throws IOException {
        database.write(data);
    }
}
