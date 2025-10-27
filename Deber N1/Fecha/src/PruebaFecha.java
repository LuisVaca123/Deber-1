public class PruebaFecha {
    public static void main(String[] args) {
        // Crear objeto Fecha
        Fecha fecha = new Fecha(10, 26, 2025);

        // Mostrar fecha inicial
        System.out.println("Fecha inicial:");
        fecha.mostrarFecha();

        // Modificar valores con setters
        fecha.setMes(12);
        fecha.setDia(31);
        fecha.setAnio(2026);

        // Mostrar fecha después de modificar
        System.out.println("Fecha después de modificar:");
        fecha.mostrarFecha();

        // Acceder con getters
        System.out.println("Detalle con getters:");
        System.out.println("Mes: " + fecha.getMes());
        System.out.println("Día: " + fecha.getDia());
        System.out.println("Año: " + fecha.getAnio());
    }
}