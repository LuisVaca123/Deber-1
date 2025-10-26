public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("A123", "Martillo de acero", 5, 12.50);

        System.out.println("****FACTURA 1****");
        System.out.println("Número de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripción: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por artículo: $" + factura1.getPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + factura1.obtenerMontoFactura());

        Factura factura2 = new Factura("B456", "Destornillador", -3, -7.50);

        System.out.println("\n****FACTURA 2 (CON VALORES INVÁLIDOS)****");
        System.out.println("Número de pieza: " + factura2.getNumeroPieza());
        System.out.println("Descripción: " + factura2.getDescripcionPieza());
        System.out.println("Cantidad: " + factura2.getCantidad());
        System.out.println("Precio por artículo: $" + factura2.getPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + factura2.obtenerMontoFactura());

        System.out.println("\n****MODIFICANDO FACTURA 2****");
        factura2.setCantidad(10);
        factura2.setPrecioPorArticulo(8.75);
        System.out.println("Nueva cantidad: " + factura2.getCantidad());
        System.out.println("Nuevo precio por artículo: $" + factura2.getPrecioPorArticulo());
        System.out.println("Nuevo monto total: $" + factura2.obtenerMontoFactura());
    }
}