import java.text.DecimalFormat;

public class PruebaServicioInternet {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        // Caso 1: Plan básico (velocidad <= 100 Mbps, sin recargo)
        ServicioInternet servicio1 = new ServicioInternet("Juan Pérez", 50, 25.00, 12);

        System.out.println("****SERVICIO 1 (PLAN BÁSICO)****");
        System.out.println("Cliente: " + servicio1.getNombreCliente());
        System.out.println("Velocidad: " + servicio1.getVelocidadMbps() + " Mbps");
        System.out.println("Precio mensual: $" + servicio1.getPrecioMensual());
        System.out.println("Cantidad de meses: " + servicio1.getCantidadMeses());
        System.out.println("Monto total a pagar: $" + df.format(servicio1.calcularMontoTotal()));

        // Caso 2: Plan estándar (velocidad = 100 Mbps, sin recargo)
        ServicioInternet servicio2 = new ServicioInternet("María González", 100, 35.00, 6);

        System.out.println("\n****SERVICIO 2 (PLAN ESTÁNDAR)****");
        System.out.println("Cliente: " + servicio2.getNombreCliente());
        System.out.println("Velocidad: " + servicio2.getVelocidadMbps() + " Mbps");
        System.out.println("Precio mensual: $" + servicio2.getPrecioMensual());
        System.out.println("Cantidad de meses: " + servicio2.getCantidadMeses());
        System.out.println("Monto total a pagar: $" + df.format(servicio2.calcularMontoTotal()));

        // Caso 3: Plan premium (velocidad > 100 Mbps, con recargo del 15%)
        ServicioInternet servicio3 = new ServicioInternet("Carlos Rodríguez", 200, 50.00, 12);

        System.out.println("\n****SERVICIO 3 (PLAN PREMIUM - RECARGO 15%)****");
        System.out.println("Cliente: " + servicio3.getNombreCliente());
        System.out.println("Velocidad: " + servicio3.getVelocidadMbps() + " Mbps");
        System.out.println("Precio mensual: $" + servicio3.getPrecioMensual());
        System.out.println("Cantidad de meses: " + servicio3.getCantidadMeses());
        System.out.println("Monto total a pagar: $" + df.format(servicio3.calcularMontoTotal()));

        // Caso 4: Servicio con valores inválidos
        ServicioInternet servicio4 = new ServicioInternet("Ana López", -50, -30.00, -6);

        System.out.println("\n****SERVICIO 4 (CON VALORES INVÁLIDOS)****");
        System.out.println("Cliente: " + servicio4.getNombreCliente());
        System.out.println("Velocidad: " + servicio4.getVelocidadMbps() + " Mbps"); // debe ser 0
        System.out.println("Precio mensual: $" + servicio4.getPrecioMensual()); // debe ser 0.0
        System.out.println("Cantidad de meses: " + servicio4.getCantidadMeses()); // debe ser 0
        System.out.println("Monto total a pagar: $" + df.format(servicio4.calcularMontoTotal())); // debe ser 0.0

        // Caso 5: Modificar servicio con setters
        System.out.println("\n****MODIFICANDO SERVICIO 4****");
        servicio4.setVelocidadMbps(300);
        servicio4.setPrecioMensual(60.00);
        servicio4.setCantidadMeses(24);
        System.out.println("Nueva velocidad: " + servicio4.getVelocidadMbps() + " Mbps");
        System.out.println("Nuevo precio mensual: $" + servicio4.getPrecioMensual());
        System.out.println("Nueva cantidad de meses: " + servicio4.getCantidadMeses());
        System.out.println("Nuevo monto total: $" + df.format(servicio4.calcularMontoTotal()));

        // Caso 6: Comparación de planes (mismo precio y meses, diferente velocidad)
        System.out.println("\n****COMPARACIÓN: MISMO PRECIO, DIFERENTE VELOCIDAD****");
        ServicioInternet planBasico = new ServicioInternet("Cliente A", 80, 40.00, 12);
        ServicioInternet planPremium = new ServicioInternet("Cliente B", 150, 40.00, 12);

        System.out.println("Plan Básico (80 Mbps, sin recargo): $" + df.format(planBasico.calcularMontoTotal()));
        System.out.println("Plan Premium (150 Mbps, con 15% recargo): $" + df.format(planPremium.calcularMontoTotal()));
        System.out.println("Diferencia por recargo: $" + df.format(planPremium.calcularMontoTotal() - planBasico.calcularMontoTotal()));
    }
}