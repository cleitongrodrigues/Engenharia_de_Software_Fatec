import java.util.Scanner;

public class CalculadoraDeDesconto{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço original do produto: \n");
        float produto = scanner.nextFloat();

        System.out.print("Digite o percentual do desconto(em %): \n");
        float desconto = scanner.nextFloat();

        float vlDesconto = (produto * desconto / 100);
        float precoFinal =  produto - vlDesconto;

        System.out.print("O valor original do produto é: " + produto +
                         " reais, o valor do desconto foi de: " + vlDesconto+
                         " reais e o preço final é: " + precoFinal + "\n");
        if(vlDesconto >= 20){
            System.out.print("Desconto Generoso!");
        } else {
            System.out.print("Desconto padrão");
        }

        scanner.close();
    }
}