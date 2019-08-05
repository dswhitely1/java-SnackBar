package store;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vending_machine_id;

  public Snack(String name, int quantity, double cost, int vending_machine_id) {
    maxId++;
    this.id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vending_machine_id = vending_machine_id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuanitiy(int quantity) {
    this.quantity = quantity;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public int getVendingMachineId() {
    return vending_machine_id;
  }

  public void setVendingMachineId(int vending_machine_id) {
    this.vending_machine_id = vending_machine_id;
  }
}