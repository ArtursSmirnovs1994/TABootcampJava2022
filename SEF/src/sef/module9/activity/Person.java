package sef.module9.activity;

public class Person {

    public static void main(String[] args) {

    }

    private int weight;
    private float height;

    public Person(int weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    //TODO: Create getters and setters for weight and height
    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight


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

    //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)

    public String calculateBMI() {
        float result = weight / (height * height);
        return String.valueOf(result);

    }
}