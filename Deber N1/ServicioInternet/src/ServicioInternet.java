public class ServicioInternet {
    private String nombreCliente;
    private int velocidadMbps;
    private double precioMensual;
    private int cantidadMeses;

    public ServicioInternet(String nombreCliente, int velocidadMbps, double precioMensual, int cantidadMeses) {
        setNombreCliente(nombreCliente);
        setVelocidadMbps(velocidadMbps);
        setPrecioMensual(precioMensual);
        setCantidadMeses(cantidadMeses);
    }

    // Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getVelocidadMbps() {
        return velocidadMbps;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    // Setters
    public void setNombreCliente(String nombreCliente) {
        if (nombreCliente != null && !nombreCliente.trim().isEmpty()) {
            this.nombreCliente = nombreCliente.trim();
        } else {
            this.nombreCliente = "Sin nombre";
        }
    }

    public void setVelocidadMbps(int velocidadMbps) {
        if (velocidadMbps > 0) {
            this.velocidadMbps = velocidadMbps;
        } else {
            this.velocidadMbps = 0;
        }
    }

    public void setPrecioMensual(double precioMensual) {
        if (precioMensual > 0.0) {
            this.precioMensual = precioMensual;
        } else {
            this.precioMensual = 0.0;
        }
    }

    public void setCantidadMeses(int cantidadMeses) {
        if (cantidadMeses > 0) {
            this.cantidadMeses = cantidadMeses;
        } else {
            this.cantidadMeses = 0;
        }
    }

    // Método que calcula el monto total con recargo del 15% si velocidad > 100 Mbps
    public double calcularMontoTotal() {
        double montoTotal = precioMensual * cantidadMeses;

        // Aplicar recargo del 15% si la velocidad es mayor a 100 Mbps
        if (velocidadMbps > 100) {
            montoTotal = montoTotal * 1.15;
        }

        return montoTotal;
    }
}