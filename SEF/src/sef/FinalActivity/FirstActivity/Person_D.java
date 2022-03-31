package sef.FinalActivity.FirstActivity;

public class Person_D {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.matches(".*[0-9].*")){
                System.out.println("Name cannot contain a number. Please check name " + name);
            } else{
                this.name = name;
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        void introPerson (String name, int age){
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }


}
