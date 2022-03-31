package sef.finalActivity.firstActivity;

import static org.junit.Assert.assertEquals;

public class StudentTest {

  public static void main(String[] args) {
    Student studentYuliia = new Student();

    testSchoolNameGetterSetter(studentYuliia, "5th High School");
    testStudentIntroduction(studentYuliia, "University Of British Columbia");
  }

  public static void testSchoolNameGetterSetter(Student student, String schoolName) {
    student.setSchoolName(schoolName);
    assertEquals(schoolName, student.getSchoolName());
  }

  public static void testStudentIntroduction(Student student, String schoolName) {
    student.setSchoolName(schoolName);
    assertEquals(
        "I am studying in university " + schoolName,
        "I am studying in university " + student.getSchoolName());
  }
}
