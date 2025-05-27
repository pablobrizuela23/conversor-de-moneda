import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();
        Menu menu = new Menu();
        int opcion = 0;
        double monto = 0;
        String finalizar = "";

        do {
            try {


                menu.principal();
                opcion = teclado.nextInt();

                if (opcion != 7) {
                    System.out.println("ingrese el monto que desea convertir:\n");
                    monto = teclado.nextDouble();
                    System.out.println("Convirtiendo por favor espere....\n");
                    menu.casos(opcion, monto);

                    System.out.println("¿Desea continuar? S/N\n");
                    finalizar = teclado.next();

                    while (!finalizar.equalsIgnoreCase("s") && !finalizar.equalsIgnoreCase("n")) {
                        System.out.println("Entrada inválida. Por favor, ingrese S o N.\n");
                        finalizar = teclado.next();
                    }

                    if (finalizar.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no valida por favor ingrese un numero valido\n");
                teclado.nextLine();//limpia buffer del scanner
            }
        }while (opcion!=7);

        System.out.println("Gracias por utilizar nuestro conversor de moneda");
    }
}
