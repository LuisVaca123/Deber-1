import java.util.Scanner;
import java.text.DecimalFormat;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos
        System.out.print("Ingrese primer nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese apellido paterno: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Ingrese día de nacimiento (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Ingrese año de nacimiento (ej. 1999): ");
        int anio = sc.nextInt();

        // Crear objeto
        FrecuenciasCardiacas fc = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        // Calcular métricas
        int edad = fc.calcularEdad();
        int maxima = fc.calcularFrecuenciaMaxima();
        double[] rango = fc.calcularRangoFrecuenciaEsperada();
        DecimalFormat df = new DecimalFormat("#0.0");

        // Imprimir resultados
        System.out.println("\n===== INFORMACIÓN DEL PACIENTE =====");
        System.out.println("Nombre: " + fc.getPrimerNombre() + " " + fc.getApellidoPaterno());
        System.out.println("Fecha de nacimiento: " + fc.getFechaNacimientoComoTexto());
        System.out.println("Edad: " + edad + " años");
        System.out.println("Frecuencia cardiaca máxima: " + maxima + " pulsos/minuto");
        System.out.println("Rango de frecuencia esperada: " + df.format(rango[0]) + " - " + df.format(rango[1]) + " pulsos/minuto");

        sc.close();
    }
}