public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Pérez", 2500.00);
        Empleado empleado2 = new Empleado("María", "González", 3000.00);

        System.out.println("****SALARIOS ANUALES INICIALES****");
        System.out.println("Empleado: " + empleado1.getPrimerNombre() + " " + empleado1.getApellidoPaterno());
        System.out.println("Salario mensual: $" + empleado1.getSalarioMensual());
        System.out.println("Salario anual: $" + empleado1.obtenerSalarioAnual());

        System.out.println("\nEmpleado: " + empleado2.getPrimerNombre() + " " + empleado2.getApellidoPaterno());
        System.out.println("Salario mensual: $" + empleado2.getSalarioMensual());
        System.out.println("Salario anual: $" + empleado2.obtenerSalarioAnual());

        empleado1.darAumento(10);
        empleado2.darAumento(10);

        System.out.println("\n****SALARIOS ANUALES DESPUÉS DEL AUMENTO DEL 10%****");
        System.out.println("Empleado: " + empleado1.getPrimerNombre() + " " + empleado1.getApellidoPaterno());
        System.out.println("Salario mensual: $" + empleado1.getSalarioMensual());
        System.out.println("Salario anual: $" + empleado1.obtenerSalarioAnual());

        System.out.println("\nEmpleado: " + empleado2.getPrimerNombre() + " " + empleado2.getApellidoPaterno());
        System.out.println("Salario mensual: $" + empleado2.getSalarioMensual());
        System.out.println("Salario anual: $" + empleado2.obtenerSalarioAnual());
    }
}