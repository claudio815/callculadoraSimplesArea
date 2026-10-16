
import java.util.Scanner; 

public class CalculadoraArea {
    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        System.out.print("Digite a largura: ");
        double largura = teclado.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = teclado.nextDouble(); 

        teclado.close();
        
        double area = largura * altura;
        
        System.out.printf("A área do retângulo é: %.2f%n", area);
    }
}
