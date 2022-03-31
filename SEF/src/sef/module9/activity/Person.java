package sef.module9.activity;

import static java.lang.String.valueOf;

public class Person {

    private int weight;
    private float height;

    public Person(int testWeight, float testHeight) {
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
        this.height = height;
    }

    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    public String bmi (int weight, float height) {

        float bmi = weight / ( height * height );
        return String.valueOf(bmi);
    }

    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)

}
