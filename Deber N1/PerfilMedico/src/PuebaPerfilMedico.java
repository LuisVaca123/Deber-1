import java.text.DecimalFormat;
import java.util.Scanner;

public class PuebaPerfilMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Primer nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Sexo (M/F/Otro): ");
        String sexo = sc.nextLine();

        System.out.print("Día de nacimiento (1-31): ");
        int dia = leerEntero(sc);

        System.out.print("Mes de nacimiento (1-12): ");
        int mes = leerEntero(sc);

        System.out.print("Año de nacimiento (e.g., 1990): ");
        int anio = leerEntero(sc);

        System.out.print("Altura en centímetros (e.g., 170): ");
        double altura = leerDouble(sc);

        System.out.print("Peso en kilogramos (e.g., 65.5): ");
        double peso = leerDouble(sc);

        // Crear objeto
        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Calcular métricas
        int edad = perfil.calcularEdad();
        int fMax = perfil.calcularFrecuenciaMaxima();
        double[] rango = perfil.calcularRangoFrecuenciaEsperada();
        double bmi = perfil.calcularBMI();
        String cat = perfil.categoriaBMI();
        DecimalFormat df1 = new DecimalFormat("#0.0");
        DecimalFormat df2 = new DecimalFormat("#0.00");

        // Salida
        System.out.println("\n===== PERFIL MÉDICO =====");
        System.out.println("Nombre: " + perfil.getPrimerNombre() + " " + perfil.getApellidoPaterno());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getFechaNacimientoComoTexto());
        System.out.println("Altura: " + perfil.getAlturaCm() + " cm");
        System.out.println("Peso: " + perfil.getPesoKg() + " kg");

        System.out.println("\nEdad: " + edad + " años");
        System.out.println("Frecuencia cardiaca máxima: " + fMax + " ppm");
        System.out.println("Rango de frecuencia esperada: " + df1.format(rango[0]) + " - " + df1.format(rango[1]) + " ppm");
        System.out.println("BMI: " + df2.format(bmi) + " (" + cat + ")");

        // Tabla valores BMI
        System.out.println("\nTabla de valores del BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        sc.close();
    }

    // Utilidades para leer de forma segura
    private static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Valor inválido. Intente de nuevo: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double leerDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Valor inválido. Intente de nuevo: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}