package sef.finalActivity.firstActivity;

import java.util.Comparator;

public class NameComparator implements Comparator {
    public int compare(Object emp1, Object emp2) {

        String emp1Name = ((Employee) emp1).getName();
        String emp2Name = ((Employee) emp2).getName();

        return emp1Name.compareTo(emp2Name);
    }
}
