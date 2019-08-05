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
    System.out.println("***Customer 1 buys 4 of Snack 4");
    System.out.println(
        c1.getName() + " has $" + c1.getCash() + " and " + s4.getName() + " has " + s4.getQuantity() + " remaining.");
  }

  public static void main(String[] arg) {
    sendStudentsToVendingMachine();
  }
}