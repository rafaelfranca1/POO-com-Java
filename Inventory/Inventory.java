import java.util.*;

public class Inventory<T> {
    ArrayList<T> itens;
    Scanner scanner;

    public Inventory() {
        itens = new ArrayList<T>();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        String input;

        do {
            System.out.println("O que você deseja?\n1. Adicionar item a lista\n2. Remover item da lista\n3. Verificar se ha um item\n4. Ver todos os itens\n5. Ver itens em ordem alfabetica\n");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Adicione um item na lista: ");
                    input = scanner.nextLine();
                    this.addItem((T) input);
                    break;
                case 2:
                    System.out.print("Remova um item na lista: ");
                    input = scanner.nextLine();
                    this.removeItem((T) input);
                    break;
                case 3:
                    System.out.print("Pesquise um item na lista: ");
                    input = scanner.nextLine();
                    this.hasItem((T) input);
                    break;
                case 4:
                    System.out.println("Veja a lista:");
                    this.listItems();
                    break;
                case 5:
                    System.out.println("Veja a lista em ordem alfabetica:");
                    this.listItems(Comparator.naturalOrder());
                    break;
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);
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
        System.out.println();
    }

    public void listItems(Comparator<T> comparator) {
        List<T> copy = new ArrayList<>(itens);
        Collections.sort(copy, comparator);
        
        for (T item : copy) {
            System.out.println(item);
        }
        System.out.println();
    }
}
