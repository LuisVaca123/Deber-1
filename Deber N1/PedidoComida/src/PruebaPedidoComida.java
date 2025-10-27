import java.text.DecimalFormat;

public class PruebaPedidoComida {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        // Caso 1: Pedido pequeño
        PedidoComida pedido1 = new PedidoComida("Pizza Margarita", "pequeño", 2, 10.00);

        System.out.println("****PEDIDO 1****");
        System.out.println("Platillo: " + pedido1.getNombrePlatillo());
        System.out.println("Tamaño: " + pedido1.getTamanio());
        System.out.println("Cantidad: " + pedido1.getCantidadPedida());
        System.out.println("Precio base: $" + pedido1.getPrecioBase());
        System.out.println("Total del pedido: $" + df.format(pedido1.calcularTotalPedido()));

        // Caso 2: Pedido mediano
        PedidoComida pedido2 = new PedidoComida("Hamburguesa Clásica", "mediano", 3, 8.50);

        System.out.println("\n****PEDIDO 2****");
        System.out.println("Platillo: " + pedido2.getNombrePlatillo());
        System.out.println("Tamaño: " + pedido2.getTamanio());
        System.out.println("Cantidad: " + pedido2.getCantidadPedida());
        System.out.println("Precio base: $" + pedido2.getPrecioBase());
        System.out.println("Total del pedido: $" + df.format(pedido2.calcularTotalPedido()));

        // Caso 3: Pedido grande
        PedidoComida pedido3 = new PedidoComida("Ensalada César", "grande", 1, 12.00);

        System.out.println("\n****PEDIDO 3****");
        System.out.println("Platillo: " + pedido3.getNombrePlatillo());
        System.out.println("Tamaño: " + pedido3.getTamanio());
        System.out.println("Cantidad: " + pedido3.getCantidadPedida());
        System.out.println("Precio base: $" + pedido3.getPrecioBase());
        System.out.println("Total del pedido: $" + df.format(pedido3.calcularTotalPedido()));

        // Caso 4: Pedido con valores inválidos (cantidad y precio negativos)
        PedidoComida pedido4 = new PedidoComida("Tacos", "grande", -5, -7.00);

        System.out.println("\n****PEDIDO 4 (CON VALORES INVÁLIDOS)****");
        System.out.println("Platillo: " + pedido4.getNombrePlatillo());
        System.out.println("Tamaño: " + pedido4.getTamanio());
        System.out.println("Cantidad: " + pedido4.getCantidadPedida()); // debe ser 0
        System.out.println("Precio base: $" + pedido4.getPrecioBase()); // debe ser 0.0
        System.out.println("Total del pedido: $" + df.format(pedido4.calcularTotalPedido())); // debe ser 0.0

        // Caso 5: Modificar pedido con setters
        System.out.println("\n****MODIFICANDO PEDIDO 4****");
        pedido4.setCantidadPedida(4);
        pedido4.setPrecioBase(6.50);
        pedido4.setTamanio("mediano");
        System.out.println("Nueva cantidad: " + pedido4.getCantidadPedida());
        System.out.println("Nuevo precio base: $" + pedido4.getPrecioBase());
        System.out.println("Nuevo tamaño: " + pedido4.getTamanio());
        System.out.println("Nuevo total del pedido: $" + df.format(pedido4.calcularTotalPedido()));

        // Caso 6: Comparación de tamaños con el mismo platillo
        System.out.println("\n****COMPARACIÓN DE TAMAÑOS (Refresco)****");
        PedidoComida refrescoPeq = new PedidoComida("Refresco", "pequeño", 1, 2.00);
        PedidoComida refrescoMed = new PedidoComida("Refresco", "mediano", 1, 2.00);
        PedidoComida refrescoGra = new PedidoComida("Refresco", "grande", 1, 2.00);

        System.out.println("Pequeño (precio base): $" + df.format(refrescoPeq.calcularTotalPedido()));
        System.out.println("Mediano (precio base * 1.2): $" + df.format(refrescoMed.calcularTotalPedido()));
        System.out.println("Grande (precio base * 1.5): $" + df.format(refrescoGra.calcularTotalPedido()));
    }
}