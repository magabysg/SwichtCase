import java.util.Scanner;

public class Ex03 {

    void main() {
        int i = 1;
        Scanner sc = new Scanner(System.in);

        IO.println("\nEscolha entre as opções no menu e digite o codigo do produto correspondente: ");

        do {

            IO.println("\n-------MENU-------" + "\n1- X-Burguer R$15" + "\n2- X-Salada R$18" + "\n3- Refrigerante R$7" + "\n4- Batata Frita R$12");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    IO.println("\nProduto escolhido: X-Burguer" + "\nValor: R$15");
                    i = 1;
                    break;
                case 2:
                    IO.println("\nProduto escolhido: X-Salada" + "\nValor: R$18");
                    i = 1;
                    break;
                case 3:
                    IO.println("\nProduto escolhido: Refrigerante" + "\nValor: R$7");
                    i = 1;
                    break;
                case 4:
                    IO.println("\nProduto escolhido: Batata Frita" + "\nValor: R$12");
                    i = 1;
                    break;
                default:
                    IO.println("Produto não encontrado. Digite corretamente o codigo do produto!");
                    i = 2;

            }
        }while (i == 2);
    }
}