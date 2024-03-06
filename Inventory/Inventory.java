import java.util.ArrayList;

public class Inventory<T> {
    ArrayList<T> itens;

    public Inventory() {
        itens = new ArrayList<T>();
    }

    public boolean hasItem(T item) {//verifica se o inventário contém um dado item (usando equals)
        for(int i = 0; i < itens.size(); i++) {
            if(itens.get(i).equals(item)) {
                return true;
            }
        }
        
        return false;
    }

    public void addItem(T item) {//adiciona um item ao inventário
        itens.add(item);
    }

    public void removeItem(T item) {//remove um item do inventário
        itens.remove(item);
    }

    public void listItems() {//imprime todos os itens do inventário, em ordem alfabética 
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
