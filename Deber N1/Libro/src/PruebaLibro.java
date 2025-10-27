import java.text.DecimalFormat;

public class PruebaLibro {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        // Caso 1: Libro con valores válidos
        Libro libro1 = new Libro("978-0134685991", "Effective Java", 416, 45.99);

        System.out.println("****LIBRO 1****");
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Número de páginas: " + libro1.getNumeroPaginas());
        System.out.println("Precio: $" + libro1.getPrecio());
        System.out.println("Costo por página: $" + df.format(libro1.calcularCostoPorPagina()));

        // Caso 2: Libro con valores inválidos (páginas y precio negativos)
        Libro libro2 = new Libro("978-1234567890", "Libro de prueba", -100, -25.50);

        System.out.println("\n****LIBRO 2 (CON VALORES INVÁLIDOS)****");
        System.out.println("ISBN: " + libro2.getIsbn());
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Número de páginas: " + libro2.getNumeroPaginas()); // debe ser 0
        System.out.println("Precio: $" + libro2.getPrecio()); // debe ser 0.0
        System.out.println("Costo por página: $" + df.format(libro2.calcularCostoPorPagina())); // debe ser 0.0

        // Caso 3: Modificar valores con setters
        System.out.println("\n****MODIFICANDO LIBRO 2****");
        libro2.setNumeroPaginas(250);
        libro2.setPrecio(19.99);
        System.out.println("Nuevo número de páginas: " + libro2.getNumeroPaginas());
        System.out.println("Nuevo precio: $" + libro2.getPrecio());
        System.out.println("Nuevo costo por página: $" + df.format(libro2.calcularCostoPorPagina()));

        // Caso 4: Libro con muchas páginas y bajo precio
        Libro libro3 = new Libro("978-9876543210", "Enciclopedia Completa", 1200, 29.99);

        System.out.println("\n****LIBRO 3****");
        System.out.println("ISBN: " + libro3.getIsbn());
        System.out.println("Título: " + libro3.getTitulo());
        System.out.println("Número de páginas: " + libro3.getNumeroPaginas());
        System.out.println("Precio: $" + libro3.getPrecio());
        System.out.println("Costo por página: $" + df.format(libro3.calcularCostoPorPagina()));
    }
}