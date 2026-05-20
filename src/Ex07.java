import java.util.Scanner;

public class Ex07 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("\nDigite uma letra para saber se ela é uma vogal ou não: ");
        String letra = sc.next();

        switch (letra){
            case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u":
                IO.println("Essa letra é uma vogal!!");
                break;
            default:
                IO.println("Essa letra é uma consoante!");
        }
    }
}
