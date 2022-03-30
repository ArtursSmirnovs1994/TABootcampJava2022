package sef.module7.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class SpecifyingException {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, IOException, SQLException {
        String fileName = "SomeFileThatDoesNotExist.txt";
        FileReader reader;

        reader = new FileReader(fileName);

    }
}
