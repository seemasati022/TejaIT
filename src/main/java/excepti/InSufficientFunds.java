package excepti;

/*
* creating our own custom R.exception
*
* create a class
* extend with RuntimeException class
* Create default/zero arg constructor - no mandatory
* create argumented constructor - to define the error message
*
* this has all the functionality same as class - obj,blocks,construcotr
*
* */
public class InSufficientFunds extends RuntimeException {


    //no detailed msg
    public InSufficientFunds(){

    }

    //when we need detailed msg
    public InSufficientFunds(String s){
        super(s);
    }


}
