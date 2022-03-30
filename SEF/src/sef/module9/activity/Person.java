package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    public Person(int weight, float height) {
        setWeight(weight);
        setHeight(height);
    }

    // Create getters and setters for weight and height
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight should be within 1..200 range");
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height >= 30 && height <= 300) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height should be within 30..300 range");
        }
    }

    // Create a method to calculate humans body mass index with two parameters for height and weight
    // return String which indicates persons BMI. Calculation should be used weight/(height*height)

    public String getBMI() {
        return String.valueOf(weight / (height * height));
    }

}
