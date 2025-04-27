import java.util.Scanner;

public class VerificadorDeIDade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade == 18){
            System.out.println("Você tem 18 anos e pode votar!");
            
        }
        else if (idade > 18) {
            System.out.println("Você tem mais de 18 anos e pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }

        scanner.close();
    }
}