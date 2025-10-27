public class PedidoComida {
    private String nombrePlatillo;
    private String tamanio;
    private int cantidadPedida;
    private double precioBase;

    public PedidoComida(String nombrePlatillo, String tamanio, int cantidadPedida, double precioBase) {
        setNombrePlatillo(nombrePlatillo);
        setTamanio(tamanio);
        setCantidadPedida(cantidadPedida);
        setPrecioBase(precioBase);
    }

    // Getters
    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Setters
    public void setNombrePlatillo(String nombrePlatillo) {
        if (nombrePlatillo != null && !nombrePlatillo.trim().isEmpty()) {
            this.nombrePlatillo = nombrePlatillo.trim();
        } else {
            this.nombrePlatillo = "Sin nombre";
        }
    }

    public void setTamanio(String tamanio) {
        if (tamanio != null && !tamanio.trim().isEmpty()) {
            this.tamanio = tamanio.trim().toLowerCase();
        } else {
            this.tamanio = "pequeño";
        }
    }

    public void setCantidadPedida(int cantidadPedida) {
        if (cantidadPedida > 0) {
            this.cantidadPedida = cantidadPedida;
        } else {
            this.cantidadPedida = 0;
        }
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase > 0.0) {
            this.precioBase = precioBase;
        } else {
            this.precioBase = 0.0;
        }
    }

    // Método que calcula el total del pedido según tamaño y cantidad
    public double calcularTotalPedido() {
        double precioFinal = precioBase;

        // Ajustar precio según tamaño
        if (tamanio.equals("mediano")) {
            precioFinal = precioBase * 1.2;
        } else if (tamanio.equals("grande")) {
            precioFinal = precioBase * 1.5;
        }
        // Si es "pequeño" o cualquier otro valor, se usa el precio base

        return precioFinal * cantidadPedida;
    }
}