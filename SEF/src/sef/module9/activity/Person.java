package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    public Person (int weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    //TODO: Create getters and setters for weight and height

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

        //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
    static String getBMI (int w, float h){
        float result = w / (h * h);
        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
        return Float.toString(result);
    }

}
