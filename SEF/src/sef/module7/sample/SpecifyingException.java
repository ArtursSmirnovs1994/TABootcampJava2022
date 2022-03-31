package sef.module7.sample;

import java.io.FileReader;

public class SpecifyingException {
    public static void main(String[] args) {
        String fileName = "SomeFileThatDoesNotExist.txt";
        FileReader reader;
        reader = new FileReader(fileName);
    }

}
