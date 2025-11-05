import java.sql.SQLOutput;
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
        } else if (seleccion == 2) {
            clasificador();
        } else if (seleccion == 3) {
            validadorCont();
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

    public static void clasificador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");

        int num1 = sc.nextInt();
        int operacion = num1 % 2;

        if (operacion == 0 && num1 >= 0) {
            System.out.println("El numero " + num1 + " es par");
            System.out.println("El numero es positivo");
        } else if (operacion != 0 && num1 >= 0){
            System.out.println("El numero " + num1 + " es impar");
            System.out.println("El numero es positivo");
        } else if (operacion == 0) {
            System.out.println("El numero " + num1 + " es par");
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero " + num1 + " es impar");
            System.out.println("El numero es negativo");
        }

    }

    public static void validadorCont() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prueba");

        char ch;
        String password = sc.nextLine();
        int caracteres = password.length();

        for (int i = 0; i < caracteres; i++) {
            ch = password.charAt(i);
            if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
                System.out.println("Contraseña invalida, tiene que contener una mayuscula y una minuscula como minimo.");
            }
        }

        if (caracteres >= 8) {
            System.out.println("Contraseña aceptada");
        }
    }
}


