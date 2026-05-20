import java.util.Scanner;

public class exemplo {

    void main(){

//        int dia = 12;
//
//        if (dia == 1) {
//            IO.println("Hoje é domingo");
//
//        } else if (dia == 2) {
//            IO.println("Hoje é segunda");
//
//        } else if (dia == 3) {
//            IO.println("");
//        }

//        int dia = 12;

        String dia = "Segunda";
        switch (dia){

            case "segunda":
                IO.println("Hoje é domingo");
                break;
            case "segu":
                IO.println("Hoje é segunda");
                break;
            case "sea":
                IO.println("Hoje é terça");
                break;
            default:
                IO.println("Digite um dia existente");

        }
    }
}
