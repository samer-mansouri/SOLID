package com.directi.training.dip.exercise_refactored;

import java.util.Base64;

public class EncodingModule {
    private final InputSource inputSource;
    private final OutputDestination outputDestination;

    public EncodingModule(InputSource inputSource, OutputDestination outputDestination) {
        this.inputSource = inputSource;
        this.outputDestination = outputDestination;
    }

    public void encode() throws Exception {
        String input = inputSource.read();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        outputDestination.write(encoded);
    }
}
