package sef.module7.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SpecifyingException {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Somefilethatnotexists.txt";
        FileReader reader ;
        reader = new FileReader(fileName);
    }

}
