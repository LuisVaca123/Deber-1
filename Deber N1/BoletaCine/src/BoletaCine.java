public class BoletaCine {
    private String nombrePelicula;
    private int cantidadBoletos;
    private double precioPorBoleto;
    private String diaSemana;

    public BoletaCine(String nombrePelicula, int cantidadBoletos, double precioPorBoleto, String diaSemana) {
        setNombrePelicula(nombrePelicula);
        setCantidadBoletos(cantidadBoletos);
        setPrecioPorBoleto(precioPorBoleto);
        setDiaSemana(diaSemana);
    }

    // Getters
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public double getPrecioPorBoleto() {
        return precioPorBoleto;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    // Setters
    public void setNombrePelicula(String nombrePelicula) {
        if (nombrePelicula != null && !nombrePelicula.trim().isEmpty()) {
            this.nombrePelicula = nombrePelicula.trim();
        } else {
            this.nombrePelicula = "Sin título";
        }
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        if (cantidadBoletos > 0) {
            this.cantidadBoletos = cantidadBoletos;
        } else {
            this.cantidadBoletos = 0;
        }
    }

    public void setPrecioPorBoleto(double precioPorBoleto) {
        if (precioPorBoleto > 0.0) {
            this.precioPorBoleto = precioPorBoleto;
        } else {
            this.precioPorBoleto = 0.0;
        }
    }

    public void setDiaSemana(String diaSemana) {
        if (diaSemana != null && !diaSemana.trim().isEmpty()) {
            this.diaSemana = diaSemana.trim().toLowerCase();
        } else {
            this.diaSemana = "lunes";
        }
    }

    // Método que calcula el monto total con descuento del 10% si es miércoles
    public double calcularMontoBoleta() {
        double montoTotal = cantidadBoletos * precioPorBoleto;

        // Aplicar descuento del 10% si es miércoles
        if (diaSemana.equals("miércoles") || diaSemana.equals("miercoles")) {
            montoTotal = montoTotal * 0.90;
        }

        return montoTotal;
    }
}