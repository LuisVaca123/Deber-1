import java.text.DecimalFormat;

public class PruebaBoletaCine {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        // Caso 1: Compra en día normal (sin descuento)
        BoletaCine boleta1 = new BoletaCine("Avatar: El Camino del Agua", 3, 8.50, "viernes");

        System.out.println("****BOLETA 1****");
        System.out.println("Película: " + boleta1.getNombrePelicula());
        System.out.println("Cantidad de boletos: " + boleta1.getCantidadBoletos());
        System.out.println("Precio por boleto: $" + boleta1.getPrecioPorBoleto());
        System.out.println("Día de la semana: " + boleta1.getDiaSemana());
        System.out.println("Monto total: $" + df.format(boleta1.calcularMontoBoleta()));

        // Caso 2: Compra en miércoles (con descuento del 10%)
        BoletaCine boleta2 = new BoletaCine("Oppenheimer", 2, 10.00, "miércoles");

        System.out.println("\n****BOLETA 2 (MIÉRCOLES - DESCUENTO 10%)****");
        System.out.println("Película: " + boleta2.getNombrePelicula());
        System.out.println("Cantidad de boletos: " + boleta2.getCantidadBoletos());
        System.out.println("Precio por boleto: $" + boleta2.getPrecioPorBoleto());
        System.out.println("Día de la semana: " + boleta2.getDiaSemana());
        System.out.println("Monto total: $" + df.format(boleta2.calcularMontoBoleta()));

        // Caso 3: Compra con valores inválidos (cantidad y precio negativos)
        BoletaCine boleta3 = new BoletaCine("Barbie", -5, -12.00, "sábado");

        System.out.println("\n****BOLETA 3 (CON VALORES INVÁLIDOS)****");
        System.out.println("Película: " + boleta3.getNombrePelicula());
        System.out.println("Cantidad de boletos: " + boleta3.getCantidadBoletos()); // debe ser 0
        System.out.println("Precio por boleto: $" + boleta3.getPrecioPorBoleto()); // debe ser 0.0
        System.out.println("Día de la semana: " + boleta3.getDiaSemana());
        System.out.println("Monto total: $" + df.format(boleta3.calcularMontoBoleta())); // debe ser 0.0

        // Caso 4: Modificar boleta con setters
        System.out.println("\n****MODIFICANDO BOLETA 3****");
        boleta3.setCantidadBoletos(4);
        boleta3.setPrecioPorBoleto(9.50);
        boleta3.setDiaSemana("miércoles");
        System.out.println("Nueva cantidad: " + boleta3.getCantidadBoletos());
        System.out.println("Nuevo precio: $" + boleta3.getPrecioPorBoleto());
        System.out.println("Nuevo día: " + boleta3.getDiaSemana());
        System.out.println("Nuevo monto total: $" + df.format(boleta3.calcularMontoBoleta()));

        // Caso 5: Comparación mismo pedido en diferentes días
        System.out.println("\n****COMPARACIÓN: MISMO PEDIDO EN DIFERENTES DÍAS****");
        BoletaCine boletaLunes = new BoletaCine("Spider-Man", 5, 7.00, "lunes");
        BoletaCine boletaMiercoles = new BoletaCine("Spider-Man", 5, 7.00, "miércoles");

        System.out.println("Lunes (sin descuento): $" + df.format(boletaLunes.calcularMontoBoleta()));
        System.out.println("Miércoles (con 10% descuento): $" + df.format(boletaMiercoles.calcularMontoBoleta()));
        System.out.println("Ahorro en miércoles: $" + df.format(boletaLunes.calcularMontoBoleta() - boletaMiercoles.calcularMontoBoleta()));
    }
}