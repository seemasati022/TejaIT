package core.ifConditions;

public class Tickets {

    public void movirTicket(int price){
        if (price == 350){
            System.out.println("your seat - Recliner");
        } else if (price<350 && price >= 150) {
            System.out.println(" you are seat - balcony");
        } else if(price <150 && price >=70){
            System.out.println("you are seat - 1st row");
        }else {
            System.out.println("insufficient data");
        }
    }
    public static void main(String[] args) {
        Tickets t = new Tickets();
        t.movirTicket(360);
    }
}
