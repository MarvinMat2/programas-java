import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un numero entero");
        int numero = entrada.nextInt();

        if (numero % 2 ==0){
            System.out.println(numero + "es par");
        } else{
            System.out.println(numero + " es impar");
        }
        entrada.close();
    }
}
