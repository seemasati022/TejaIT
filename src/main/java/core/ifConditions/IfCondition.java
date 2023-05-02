package core.ifConditions;

public class IfCondition {

    //instance method with parameter
    public void loan(int cibil){
        if (cibil >= 750){
            System.out.println("Congrats! You are eligible");
        }else {
            System.out.println("Sorry! Try again in 30days");
        }
    }

    public static void main(String[] args) {
        IfCondition ic = new IfCondition();
        ic.loan(700);
    }

}
