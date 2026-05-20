import java.util.Scanner;

public class Ex04 {

    void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("\nDigite um número de 1 a 12 para mostrar o mês correspondente: ");
        int mês = sc.nextInt();

        switch (mês){
            case 1:
                IO.println("Número: " + mês + "\nMês: Janeiro");
                break;
            case 2:
                IO.println("Número: " + mês + "\nMês: Fevereio");
                break;
            case 3:
                IO.println("Número: " + mês + "\nMês: Março");
                break;
            case 4:
                IO.println("Número: " + mês + "\nMês: Abril");
                break;
            case 5:
                IO.println("Número: " + mês + "\nMês: Maio");
                break;
            case 6:
                IO.println("Número: " + mês + "\nMês: Junho");
                break;
            case 7:
                IO.println("Número: " + mês + "\nMês: Julho");
                break;
            case 8:
                IO.println("Número: " + mês + "\nMês: Agosto");
                break;
            case 9:
                IO.println("Número: " + mês + "\nMês: Setembro");
                break;
            case 10:
                IO.println("Número: " + mês + "\nMês: Outubro");
                break;
            case 11:
                IO.println("Número: " + mês + "\nMês: Novembro");
                break;
            case 12:
                IO.println("Número: " + mês + "\nMês: Dezembro");
                break;
            default:
                IO.println("Digite um número valido!");
        }
    }
}
