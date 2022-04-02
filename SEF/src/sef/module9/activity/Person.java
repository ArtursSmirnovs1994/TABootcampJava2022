package sef.module9.activity;


public class Person {
    private int weight;
    private float height;

    public Person(int weight, float height) {
       this.weight=weight;
       this.height=height;
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

        String result = BMI(80, 1.8F);

        //TODO: Create a method to calculate humans body mass index with two parameters for height and weight
        public String BMI ( int weight, float height){
         //   BMI = kg/m2 where kg is a person's weight in kilograms and m2 is their height in metres squared
            double index = weight / (height * height);
            //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)
            return Double.toString(index);
        }




}
