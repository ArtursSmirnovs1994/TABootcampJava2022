package sef.FinalActivity.extra;

import sef.FinalActivity.extra.Activity;

import java.util.Random;

public class Hobby extends Activity {
    public static String[] hobbiesList = {"play sports", "read", "have dinner", "play computer games", "stare at the wall", "go shopping", "skydive"};
    private final String hobby;
    private String hobbyCompany;
    private String hobbyLocation;
    private String hobbyFrequency;

    public Hobby() {
        this.hobby = "do more work!";
        initialize();
    }

    public Hobby(String hobby) {
        this.hobby = hobby;
        initialize();
    }

    public Hobby(String hobby, String hobbyCompany, String hobbyLocation, String hobbyFrequency) {
        this.hobby = hobby;
        this.hobbyCompany = hobbyCompany;
        this.hobbyLocation = hobbyLocation;
        this.hobbyFrequency = hobbyFrequency;
    }

    private void initialize() {
        Random generator = new Random();
        hobbyCompany= company[generator.nextInt(company.length)];
        hobbyLocation = location[generator.nextInt(location.length)];
        hobbyFrequency = frequency[generator.nextInt(frequency.length)];
    }

    @Override
    public String doActivity() {
        String result = String.format(
                "likes to %s %s %s %s",
                hobby,
                hobbyCompany,
                hobbyLocation,
                hobbyFrequency
        );
        return result;
    }
}
