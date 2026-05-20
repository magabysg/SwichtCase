import java.util.Scanner;

public class Ex06 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("\nEscolha entre as opções abaixo:");
        IO.println("Opções de cursos disponiveis: " + "\n1- Java" + "\n2- Banco de Dados" + "3- Desenvolvimento Web" + "\n4- Redes");
        int curso = sc.nextInt();

        switch (curso){
            case 1:
                IO.println("Você aprende Java!");
                break;
            case 2:
                IO.println("Você aprende Banco de Dados!");
                break;
            case 3:
                IO.println("Você aprende Desenvolvimento Web!");
                break;
            case 4:
                IO.println("Você aprende Redes com o Fabbri!!");
                break;
            default:
                IO.println("Digite uma opção valida!!");
        }
    }
}
