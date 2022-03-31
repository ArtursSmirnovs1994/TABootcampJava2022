package sef.FinalActivity.FirstActivity;

public class Student_D extends Person_D{

        private String schoolName;

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        void introStudent (){
            System.out.println("I study in university " + getSchoolName());
        }

}
