package sef.module7.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SpecifyingExceptionSample {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "SomeFileThatDoesNotExist.txt";
        FileReader reader;
        reader = new FileReader(fileName);
    }
}
