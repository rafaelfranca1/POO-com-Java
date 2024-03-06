import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Inventory<String> inventory = new Inventory<String>();

        inventory.addItem("banana");
        inventory.addItem("morango");
        inventory.addItem("pera");
        inventory.addItem("biscoito");
        inventory.addItem("arroz");
        inventory.addItem("refri");
        inventory.addItem("chocolate");

        inventory.listItems();
        
    }
}
