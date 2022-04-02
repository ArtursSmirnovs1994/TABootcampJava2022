package sef.module9.activity;


public class Person {



        private int weight;
        private float height;



        Person(int testweight, float testheight){
        this.weight = weight;
        this.height = height;

    }

        //getter
        public int getWeight () {
        return weight;
    }


        public float getHeight () {
        return height;
    }

//setter
        public void setWeight ( int weight){
        this.weight = weight;
    }


        public void setHeight ( float height){
        this.height = height;
    }


    public String calculateBMI(){
            float result = weight/(height*height);
            return Float.toString(result);
    }


        //TODO: Create getters and setters for weight and height


        //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)



}
