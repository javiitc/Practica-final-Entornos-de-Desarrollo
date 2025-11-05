import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el programa a ejecutar:");
        System.out.println("1. Calculadora básica");
        System.out.println("2. Clasificador de numeros");
        System.out.println("3. Validador de contraseñas");
        System.out.println("4. Generador de numeros aleatorios");
        System.out.println("5. Contador de Palabras y caracteres");

        int seleccion = sc.nextInt();

        if (seleccion == 1) {
            calculadora();
        }

    }
        public static void calculadora() {
        Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Introduzca la operación a realizar:");
                double num1 = sc.nextDouble();
                String operacion = sc.next();
                double num2 = sc.nextDouble();
                switch (operacion) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                }
            }
        }

        }


