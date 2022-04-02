package sef.FinalActivity.extra;

public abstract class Activity {
    String[] company = {"alone", "with a buddy", "with other people"};
    String[] location = {"at home", "in the city", "in the countryside", "abroad"};
    String[] frequency = {"every day", "once per week", "two times per week", "on weekends", "sometimes"};

    public abstract String doActivity();
}
