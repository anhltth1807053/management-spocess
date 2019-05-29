package entity;

public class Student {
    private String EnrolID;
    private String FirstName;
    private String LastName;
    private String Age;

    public Student(String enrollID, String firstNamel, String lastName, String age) {
        EnrolID = enrollID;
        FirstName = firstNamel;
        LastName = lastName;
        Age = age;
    }

    public Student() {
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
