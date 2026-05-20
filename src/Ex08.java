import java.util.Scanner;

public class Ex08 {

    void main(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        IO.println("\nEscolha entre as opções abaixo: ");

        do {
        IO.println("1- Consultar saldo" + "\n2- Sacar dinheiro" + "\n3- Depositar dinheiro" + "\n4- Sair");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                IO.println("\nSaldo da conta atualmente: R$67.000");
                i = 1;
                break;
            case 2:
                IO.println("\nDigite a quantia que deseja sacar: ");
                int dinheiro = sc.nextInt();
                i = 1;
                break;
            case 3:
                IO.println("\nDigite a quantia que deseja depositar na sua conta: ");
                int dinheiro2 = sc.nextInt();
                i = 1;
                break;
            case 4:
                IO.println("\nVocê saiu da sua conta com sucesso!");
                i = 1;
                break;
            default:
                IO.println("\nDigite uma opção valida!");
                i = 2;
        }
        }while (i == 2);
    }
}
