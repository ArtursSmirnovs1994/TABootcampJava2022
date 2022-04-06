package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    public Person(int weight, float height) {
        this.weight=weight;
        this.height=height;
    }

    public float getHeight() {
        return height;
    }


    public void setHeight(float height) {
        this.height = height;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    //TODO: Create getters and setters for weight and height

    public  String BMIcalculator(int weight,float height) {
                return (String.valueOf(weight/(height*weight)));
    }

    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)



}
