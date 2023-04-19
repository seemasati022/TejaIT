package org.example;

public class MethodTypes {

    //no args/zero parameter method
    public void noArgMethod(){
        System.out.println("No Args/Parameter method");
    }

    //argumented/parmeterised method
    public void movieName(String movieName){
        //passing movieName in the parameter is as same as
        // String movieName = "KGF";
        //but above line is static data. we always need dynamic nature
        System.out.println("your movie is "+ movieName);
    }

    //argumented/parmeterised method
    public void Shirt(String brand,int size,String material){
        //multipkle parameters can we taken in a single method.
        //these are like filters
        System.out.println("your choosen shirt is "+ brand +" and of size "+size+" of fabric "+material);
    }

    public static void main(String[] args) {
        MethodTypes methodTypes = new MethodTypes();
        methodTypes.noArgMethod();
        methodTypes.movieName("ABCD");
        //the values passesd in the parameters gets assigned to the parameters of the methods
        methodTypes.Shirt("Levis",40,"Viscose");
    }

}
