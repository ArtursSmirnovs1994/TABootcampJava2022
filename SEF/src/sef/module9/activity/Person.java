package sef.module9.activity;

public class Person {
    public static void main(String[] args) {

Person person = new Person();
        System.out.println(person.calculateBMI(18, 0.90f));

    }

    private int weight = 5;
    private float height = 6;

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
public String calculateBMI(int weight, float height) {
        float result = weight/(height*height);
        return String.valueOf(result);

}


        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)


}

