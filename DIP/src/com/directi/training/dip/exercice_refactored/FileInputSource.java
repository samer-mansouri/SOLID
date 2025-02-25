package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputSource implements InputSource {
    private final String filePath;

    public FileInputSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
