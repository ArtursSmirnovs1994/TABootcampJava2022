package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height

    public Person(int weight, float height) {
        this.weight = weight;
        this.height = height;
    }

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
    public String getBodyMassIndex() {
        float result = weight / (height * height);
        String resultAsString = Float.toString(result);
        return resultAsString;
    }
    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)


}
