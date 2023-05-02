package core.ifConditions;

public class TicketStringCompare {
    //List<String> Cate = Arrays.asList("Normal","Gold","Silver","Diamond","Platinum");
    String Gold = "Gold Category";
    String Silver = "Silver Category";
    String Normal = "Normal Category";

    //instance method takes in string input
    public void ticketCategory(String TicketCat){
        if (TicketCat.equals("Diamond")){
            System.out.println("Diamond Caterogy");
        }else if (TicketCat.equals(Gold)){
            System.out.println(Gold);
        }else if (TicketCat.equals(Silver)){
            System.out.println(Silver);
        }else if (TicketCat.equals(Normal)){
            System.out.println(Normal);
        }
    }
    public static void main(String[] args) {
        TicketStringCompare tsc = new TicketStringCompare();
        //tsc.ticketCategory("Diamond");
        tsc.ticketCategory(tsc.Gold);
    }
}
