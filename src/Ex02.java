import java.util.Scanner;

public class Ex02 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("\nDigite dois numeros para realizar a operação:");
        double num1 = sc.nextInt(), num2 = sc.nextInt();

        IO.println("\nAgora escolha sua operação: ");
        String operação = sc.next();

        switch (operação){
            case "+":
                double soma = num1 + num2;
                IO.println(num1 + " + " + num2 + " = " + soma);
                break;
            case "-":
                double sub = num1 - num2;
                IO.println(num1 + " - " + num2 + " = " + sub);
                break;
            case "*":
                double mult = num1 * num2;
                IO.println(num1 + " x " + num2 + " = " + mult);
                break;
            case "/":
                double divisão = num1 / num2;
                IO.println(num1 + " / " + num2 + " = " + divisão);
                break;
            default:
                IO.println("Digite uma operação valida!");
        }
    }
}
