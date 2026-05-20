import java.util.Scanner;

public class Ex05 {

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("\nDigite o codigo de usuário: ");
        IO.println("A: Administrador" + "\nF: Funcionario" + "\nC: Cliente");
        String user = sc.next();

        switch (user){
            case "A", "a":
                IO.println("Acesso total liberado!");
                break;
            case "F", "f":
                IO.println("Acesso parcial liberado!");
            case "C", "c":
                IO.println("Vizualização concedida!");
            default:
                IO.println("Digite o codigo do usuario corretamente!");

        }
    }
}
