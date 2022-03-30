package sef.module9.activity;

public class Person {

    private int weight; //Rclick - generate automatically getters and setters
    private float height;

    //TODO: Create getters and setters for weight and height

    //getter

    public int getWeight() { //getter weight
        return weight;
    }
    public void setWeight(int weight) { //setter weight
        this.weight = weight;
    }
    public float getHeight() { //getter height
        return height;
    }
    public void setHeight(float height) { //setter height
        this.height = height;
    }



    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

    public String getBMI() {
        float result = weight /(height*height);
        return String.valueOf(result);
    }

    //public float getBMIFloat(float height, int weight) {
    //      return weight/(height*height); easier option but not according to reqs

//TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)



}
