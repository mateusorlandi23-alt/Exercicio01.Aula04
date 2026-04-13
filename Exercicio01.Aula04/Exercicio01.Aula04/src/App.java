import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite outro valor: ");
        int valor2 = scanner.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valoe é: " + valor1);
        }else 
            System.out.println("O maior valor é: " + valor2);
             
            scanner.close();

    }
}
