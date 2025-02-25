package com.directi.training.dip.exercise_refactored;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        EncodingModule encodingModule = new EncodingModule(
            new FileInputSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"),
            new FileOutputDestination("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt")
        );
        encodingModule.encode();

        EncodingModule encodingModule2 = new EncodingModule(
            new NetworkInputSource("http", "myfirstappwith.appspot.com", "/index.html"),
            new DatabaseOutputDestination(new MyDatabase())
        );
        encodingModule2.encode();
    }
}
