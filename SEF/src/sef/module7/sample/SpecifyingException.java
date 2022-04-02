package sef.module7.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class SpecifyingException {
    public static void main(String[] args) throws FileNotFoundException {
    String FileName = "test.txt";
    FileReader reader;
    reader = new FileReader(FileName);
    }
}
