import java.util.Scanner;
public class Ejerciciodos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un valor en Celsius ");
        int celsius = input.nextInt();
        double fahrenheit = (9.0/5)*celsius + 32;
            System.out.println("El resultado es: " + fahrenheit)
    }
}