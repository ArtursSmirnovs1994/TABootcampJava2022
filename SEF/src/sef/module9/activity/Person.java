package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height
    public int getWeight() {
        return weight;
    }
    public float getHeight() {
        return height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    public String getBodyIndex() {
        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
        return Float.toString(weight/(height*height));
    }
}
