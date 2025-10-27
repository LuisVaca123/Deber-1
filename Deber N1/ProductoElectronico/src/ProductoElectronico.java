public class ProductoElectronico {
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadStock;
    private double precioUnitario;

    public ProductoElectronico(String codigoProducto, String nombreProducto, int cantidadStock, double precioUnitario) {
        setCodigoProducto(codigoProducto);
        setNombreProducto(nombreProducto);
        setCantidadStock(cantidadStock);
        setPrecioUnitario(precioUnitario);
    }

    // Getters
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    // Setters
    public void setCodigoProducto(String codigoProducto) {
        if (codigoProducto != null && !codigoProducto.trim().isEmpty()) {
            this.codigoProducto = codigoProducto.trim();
        } else {
            this.codigoProducto = "SIN-CODIGO";
        }
    }

    public void setNombreProducto(String nombreProducto) {
        if (nombreProducto != null && !nombreProducto.trim().isEmpty()) {
            this.nombreProducto = nombreProducto.trim();
        } else {
            this.nombreProducto = "Sin nombre";
        }
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock > 0) {
            this.cantidadStock = cantidadStock;
        } else {
            this.cantidadStock = 0;
        }
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0.0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 0.0;
        }
    }

    // Método que calcula el valor total del inventario
    public double calcularValorInventario() {
        return cantidadStock * precioUnitario;
    }
}