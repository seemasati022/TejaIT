package loops;

public class SwitchCases {
    /*
    * better peerformance than if
    * */

    public static void main(String[] args) {

        int i = 10;      //initilaization
        switch (i) {
            case 1:     // which datatype has been initizlozedsx, that dt value has to be given
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("case 2");
                //break;           //if break stmt is not provide for a false case, it doesnt execute
            case 7:
                System.out.println("case " + i);                //if break is not provided in matching case, then cases after
                                                               // true will be executed till break is found.
                                                                //if case is matched. it doesnt execute, default.
                break;
            case 0:                                             //order of case can be anything
                System.out.println("case 0" + i);
                break;
            case 10:
                System.out.println("case " + i);
                break;
            case 9:
                System.out.println("case " + i);            //if this case, matches, only this will be printed
                break;
            default:
                System.out.println("default");              //if any case is not true, then default is executed
                break;                              //for default, break is not compulsory
        }


        String s = "Ss";
        switch (s){
            case "non" :

        }
    }
}
