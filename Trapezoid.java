// Trapezoid.java
package figuras;

import java.util.Scanner;

public class Trapezoid {
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base mayor del trapecio: ");
        double baseMayor = scanner.nextDouble();
        
        System.out.print("Ingrese la base menor del trapecio: ");
        double baseMenor = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();
        
        double area = ((baseMayor + baseMenor) * altura) / 2;
        
        System.out.println("El área del trapecio es: " + area);
        
        scanner.close();
    }
}
