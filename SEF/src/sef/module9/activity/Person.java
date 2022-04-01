package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

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


    public String bodyIndex() {
        float result = weight / (height * height);
        return String.valueOf(result);
    }


}

//TODO: Create a method to calculate humans body mass index with two parameters for height and weight

//TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)



