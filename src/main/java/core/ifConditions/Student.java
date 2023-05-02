package core.ifConditions;

public class Student {

    //instance method
    public void marks(int marks){
        if (marks >= 90 && marks <=100) {
            System.out.println("Pass! A+");
        } else if (marks < 90 && marks >= 50) {
            System.out.println("Passed! B");
        } else if (marks < 50 & marks >= 35) {
            System.out.println("just pass");
        } else {
            System.out.println("Fail!");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks(0);
    }

}
