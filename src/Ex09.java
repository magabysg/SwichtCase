import java.util.Scanner;

public class Ex09 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("\nDigite a letra correspondente ao conceito do aluno: ");
        IO.println("A: Excelente" + "\n: Bom" + "\nC: Regular" + "\nD: Ruim");
        String escolha = sc.next();

        switch (escolha){
            case "A", "a":
                IO.println("Aluno excelente!");
                break;
            case "B", "b":
                IO.println("Aluno bom!");
                break;
            case "C", "c":
                IO.println("Aluno Regular.");
                break;
            case "D", "d":
                IO.println("Aluno ruim.");
                break;
            default:
                IO.println("Escolha uma opção valida!");
        }
    }
}
