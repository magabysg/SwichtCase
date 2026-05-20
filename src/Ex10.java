import javax.swing.*;
import java.util.Scanner;

public class Ex10 {

    void main(){
        Scanner sc = new Scanner(System.in);
        int i = 1;

        IO.println("\nEscolha entre as opções do menu administrativo: ");

        do {
            IO.println("1- Cadastrar usuário" + "\n2- Listar usuários" + "\n3- Atualizar usuário" + "\n4- Excluir usuário" + "\n5- Encerrar sistema");
            int escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    IO.println("\nCadastrar usuario, digite seu nome e senha: ");
                    String nome = sc.next();
                    int senha = sc.nextInt();
                    i = 1;
                    break;
                case 2:
                    IO.println("\nUsuários: " + "\nAna Clara" + "\nFernanda" + "\nDouglas");
                    i = 1;
                    break;
                case 3:
                    IO.println("Para atualizar seu usuario digite seu usuario e senha: " + nome + ", " + senha);
                    i = 1;
                    break;
                case 4:
                    IO.println("Usuário excluido com sucesso: " + nome);
                    i = 1;
                    break;
                case 5:
                    IO.println("Sistema encerrado com sucesso!");
                    i = 1;
                    break;
                default:
                    IO.println("Escolha uma opção valida!");
                    i = 2;
            }
        }while (i == 2);
    }
}
