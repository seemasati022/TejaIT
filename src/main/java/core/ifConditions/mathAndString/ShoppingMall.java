package core.ifConditions.mathAndString;

public class ShoppingMall {

      public void shoppingEntry(int amount, String category) {
          if (amount >= 1000) {
              System.out.println("Welcome to the mall and choose category");{
//              if ("kids".equals(category)) {
//                  System.out.println("welcome to " + category);
//              }
              if (Category.kids.equals(category)) {
                  System.out.println("welcome to " + category + " store");
              } else if (Category.mobile.equals(category)) {
                  System.out.println("welcome to " + category);
              } else if (Category.clothes.equals(category)) {
                  System.out.println("welcome to " + category);
              } else if (Category.electronics.equals(category)) {
                  System.out.println("welcome to " + category);
              }else {
                  System.out.println("Sorry, the given category isnt available");}
              }
          } else {
              System.out.println("You dont have enough credit balance");
          }
      }

    public static void main(String[] args) {
        ShoppingMall sm = new ShoppingMall();
        sm.shoppingEntry(5000,"kids");
    }
}
