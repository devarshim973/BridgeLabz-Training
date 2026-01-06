package com.LinearandBinarySearch.InputStreamReaderConvertBytetoCharacter;

public class InputStreamReaderMain {

    public static void main(String[] args) {

        String filePath = "data.txt";

        ByteToCharFileReader reader = new ByteToCharFileReader();
        reader.readFile(filePath);
    }
}
