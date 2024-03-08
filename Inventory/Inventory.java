import java.util.*;

public class Inventory<T> {
    private ArrayList<T> itens;
    private Scanner scanner;

    public Inventory() {
        itens = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao = -1;
        String input;

        do {
            System.out.println("Qual acao voce deseja realizar?");
            System.out.println("1. Adicionar item a lista");
            System.out.println("2. Remover item da lista");
            System.out.println("3. Verificar se ha um item");
            System.out.println("4. Ver todos os itens");
            System.out.println("5. Ver itens em ordem alfabetica");
            System.out.println("0. Sair\n");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcao invalida. Digite um numero entre 0 e 5.\n");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item que voce deseja adicionar: ");
                    input = scanner.nextLine();
                    this.addItem((T) input);
                    break;
                case 2:
                    System.out.print("Digite o item que voce deseja remover: ");
                    input = scanner.nextLine();
                    this.removeItem((T) input);
                    break;
                case 3:
                    System.out.print("Digite o item que voce deseja verificar: ");
                    input = scanner.nextLine();

                    if (this.hasItem((T) input)) {
                        System.out.println("\'" + input + "\'' esta na lista.\n");
                    } else {
                        System.out.println("O item \'" + input + "\' nao esta presente no inventario.\n");
                    }
                    break;
                case 4:
                    System.out.println("Veja a lista:");
                    this.listItems();
                    break;
                case 5:
                    System.out.println("Veja a lista em ordem alfabetica:");
                    this.listItemsSorted();
                    break;
                case 0:
                    System.out.println("Fim do programa.\n");
                    break;
                default:
                    System.out.println("Opcao invalida. Digite um numero entre 0 e 5.\n");
                    break;
            }
        } while (opcao != 0);
    }

    public boolean hasItem(T item) {//verifica se o inventário contém um dado item (usando equals)
        return itens.contains(item);
    }

    public void addItem(T item) {//adiciona um item ao inventário
        itens.add(item);
        System.out.println("\'" + item + "\' adicionado ao inventario com sucesso!\n");
    }

    public void removeItem(T item) {//remove um item do inventário
        if(this.hasItem(item)) {
            itens.remove(item);
            System.out.println("\'" + item + "\' removido do inventario com sucesso!\n");
        } else {
            System.out.println("O item \'" + item + "\' nao esta presente no inventario.\n");
        }
    }

    public void listItems() {//imprime todos os itens do inventário 
        for (T item : itens) {
            System.out.println(item);
        }
        System.out.println();
    }

    public void listItemsSorted() {//imprime todos os itens do inventário, em ordem alfabética 
        List<T> copy = new ArrayList<>(itens);
        Collections.sort(copy, new Comp());
        
        for (T item : copy) {
            System.out.println(item);
        }
        System.out.println();
    }

    private class Comp implements Comparator<T> {
        @Override
        public int compare(T item1, T item2) {
            return item1.toString().compareTo(item2.toString());
        }
    }
}
