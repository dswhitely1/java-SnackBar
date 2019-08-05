package store;

public class LambdaCafeteria {
  private static void sendStudentsToVendingMachine() {
    Customer c1 = new Customer("Jane", 44.25);
    Customer c2 = new Customer("Bob", 33.14);
    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");
    Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
    Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
    Snack s5 = new Snack("Water", 20, 2.75, v2.getId());
    c1.buySnack(s4.totalCost(4));
    s4.buySnack(4);
    System.out.println("*** Customer 1 buys 4 of Snack 4 ***");
    System.out.println(
        c1.getName() + " has $" + c1.getCash() + " and " + s4.getName() + " has " + s4.getQuantity() + " remaining.");
    c1.buySnack(s3.totalCost(1));
    s3.buySnack(1);
    System.out.println("*** Customer 1 buys 1 of Snack 3 ***");
    System.out.println(
        c1.getName() + " has $" + c1.getCash() + " and " + s3.getName() + " has " + s3.getQuantity() + " remaining.");
    c2.buySnack(s4.totalCost(2));
    s4.buySnack(2);
    System.out.println("*** Customer 2 buys 2 of Snack 4 ***");
    System.out.println(
        c2.getName() + " has $" + c2.getCash() + " and " + s4.getName() + " has " + s4.getQuantity() + " remaining.");
    c1.addCash(10.00);
    System.out.println("*** Customer 1 found $10.00");
    System.out.println(c1.getName() + " has $" + c1.getCash() + ".");
    c1.buySnack(s2.totalCost(1));
    s2.buySnack(1);
    System.out.println("*** Customer 1 buys 1 of Snack 2 ***");
    System.out.println(
        c1.getName() + " has $" + c1.getCash() + " and " + s2.getName() + " has " + s2.getQuantity() + " remaining.");
    s3.addQuantity(12);
    System.out.println("*** Add 12 to Snack 3 ***");
    System.out.println("Added 12 " + s3.getName() + " to the machine.  The new quantity is " + s3.getQuantity() + ".");
    c2.buySnack(s3.totalCost(3));
    s3.buySnack(3);
    System.out.println("*** Customer 2 buys 3 of Snack 3 ***");
    System.out.println(
        c2.getName() + " has $" + c2.getCash() + " and " + s3.getName() + " has " + s3.getQuantity() + " remaining.");

  }

  public static void main(String[] arg) {
    sendStudentsToVendingMachine();
  }
}