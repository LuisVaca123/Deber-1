public class Libro {
    private String isbn;
    private String titulo;
    private int numeroPaginas;
    private double precio;

    public Libro(String isbn, String titulo, int numeroPaginas, double precio) {
        setIsbn(isbn);
        setTitulo(titulo);
        setNumeroPaginas(numeroPaginas);
        setPrecio(precio);
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.trim().isEmpty()) {
            this.isbn = isbn.trim();
        } else {
            this.isbn = "SIN-ISBN";
        }
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo.trim();
        } else {
            this.titulo = "Sin título";
        }
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        } else {
            this.numeroPaginas = 0;
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    // Método que calcula el costo promedio por página
    public double calcularCostoPorPagina() {
        if (numeroPaginas > 0) {
            return precio / numeroPaginas;
        } else {
            return 0.0;
        }
    }
}