public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        setPrimerNombre(primerNombre);
        setApellidoPaterno(apellidoPaterno);
        setSalarioMensual(salarioMensual);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setPrimerNombre(String primerNombre) {
        if (primerNombre != null && !primerNombre.trim().isEmpty()) {
            this.primerNombre = primerNombre.trim();
        } else {
            this.primerNombre = "Sin nombre";
        }
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if (apellidoPaterno != null && !apellidoPaterno.trim().isEmpty()) {
            this.apellidoPaterno = apellidoPaterno.trim();
        } else {
            this.apellidoPaterno = "Sin apellido";
        }
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    public void darAumento(double porcentaje) {
        if (porcentaje > 0.0) {
            salarioMensual = salarioMensual * (1 + porcentaje / 100.0);
        }
    }
}