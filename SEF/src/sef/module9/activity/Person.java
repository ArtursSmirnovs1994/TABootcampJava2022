package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    public Person(int weight, float height) {
        this.weight = weight;
        this.height = convertHeightToMeters(height);
    }

    //TODO: Create getters and setters for weight and height

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = convertHeightToMeters(height);
    }

    float convertHeightToMeters(float input) {
        if (input < 0.1 || input > 10000) throw new IllegalArgumentException(String.valueOf(input));
        if (input < 10) return input; //Assume the input is in meters
        if (input <= 1000) { input /= 100; } //Assume the input is in centimeters
        else { input /= 1000; } //Assume the input is in millimeters?
        return input;
    }
    
    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    public String calculateBMI(float weight, float height) {
        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
        float result = weight/(height*height);
        return Float.toString(result);
    }

}
