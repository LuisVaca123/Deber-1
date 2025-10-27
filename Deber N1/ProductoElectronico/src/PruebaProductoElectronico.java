import java.text.DecimalFormat;

public class PruebaProductoElectronico {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        // Caso 1: Producto con valores válidos
        ProductoElectronico producto1 = new ProductoElectronico("LAPTOP-001", "Laptop Dell Inspiron 15", 25, 899.99);

        System.out.println("****PRODUCTO 1****");
        System.out.println("Código: " + producto1.getCodigoProducto());
        System.out.println("Nombre: " + producto1.getNombreProducto());
        System.out.println("Cantidad en stock: " + producto1.getCantidadStock());
        System.out.println("Precio unitario: $" + producto1.getPrecioUnitario());
        System.out.println("Valor total del inventario: $" + df.format(producto1.calcularValorInventario()));

        // Caso 2: Producto con stock bajo
        ProductoElectronico producto2 = new ProductoElectronico("MOUSE-045", "Mouse Inalámbrico Logitech", 150, 29.99);

        System.out.println("\n****PRODUCTO 2****");
        System.out.println("Código: " + producto2.getCodigoProducto());
        System.out.println("Nombre: " + producto2.getNombreProducto());
        System.out.println("Cantidad en stock: " + producto2.getCantidadStock());
        System.out.println("Precio unitario: $" + producto2.getPrecioUnitario());
        System.out.println("Valor total del inventario: $" + df.format(producto2.calcularValorInventario()));

        // Caso 3: Producto con valores inválidos (cantidad y precio negativos)
        ProductoElectronico producto3 = new ProductoElectronico("TECLADO-012", "Teclado Mecánico", -10, -75.50);

        System.out.println("\n****PRODUCTO 3 (CON VALORES INVÁLIDOS)****");
        System.out.println("Código: " + producto3.getCodigoProducto());
        System.out.println("Nombre: " + producto3.getNombreProducto());
        System.out.println("Cantidad en stock: " + producto3.getCantidadStock()); // debe ser 0
        System.out.println("Precio unitario: $" + producto3.getPrecioUnitario()); // debe ser 0.0
        System.out.println("Valor total del inventario: $" + df.format(producto3.calcularValorInventario())); // debe ser 0.0

        // Caso 4: Modificar producto con setters
        System.out.println("\n****MODIFICANDO PRODUCTO 3****");
        producto3.setCantidadStock(50);
        producto3.setPrecioUnitario(79.99);
        System.out.println("Nueva cantidad en stock: " + producto3.getCantidadStock());
        System.out.println("Nuevo precio unitario: $" + producto3.getPrecioUnitario());
        System.out.println("Nuevo valor del inventario: $" + df.format(producto3.calcularValorInventario()));

        // Caso 5: Producto de alto valor
        ProductoElectronico producto4 = new ProductoElectronico("TV-4K-089", "Smart TV Samsung 55 pulgadas", 12, 1299.99);

        System.out.println("\n****PRODUCTO 4****");
        System.out.println("Código: " + producto4.getCodigoProducto());
        System.out.println("Nombre: " + producto4.getNombreProducto());
        System.out.println("Cantidad en stock: " + producto4.getCantidadStock());
        System.out.println("Precio unitario: $" + producto4.getPrecioUnitario());
        System.out.println("Valor total del inventario: $" + df.format(producto4.calcularValorInventario()));

        // Caso 6: Resumen del inventario total
        System.out.println("\n****RESUMEN DEL INVENTARIO TOTAL****");
        double valorTotal = producto1.calcularValorInventario() +
                producto2.calcularValorInventario() +
                producto3.calcularValorInventario() +
                producto4.calcularValorInventario();
        System.out.println("Valor total de todos los productos: $" + df.format(valorTotal));
    }
}