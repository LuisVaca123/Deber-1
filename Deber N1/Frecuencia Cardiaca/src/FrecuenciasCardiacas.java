import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellidoPaterno;
    private int mesNacimiento; // 1-12
    private int diaNacimiento; // 1-31 (según mes)
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellidoPaterno,
                                int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        setPrimerNombre(primerNombre);
        setApellidoPaterno(apellidoPaterno);
        setMesNacimiento(mesNacimiento);
        setDiaNacimiento(diaNacimiento);
        setAnioNacimiento(anioNacimiento);
    }

    // Getters
    public String getPrimerNombre() { return primerNombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public int getMesNacimiento() { return mesNacimiento; }
    public int getDiaNacimiento() { return diaNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }

    // Setters
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

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento; // El enunciado no exige validación
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento; // El enunciado no exige validación
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento; // El enunciado no exige validación
    }

    // Calcula la edad en años completos con java.time
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        return Period.between(nacimiento, hoy).getYears();
    }

    // Frecuencia cardiaca máxima
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Rango de frecuencia cardiaca
    public double[] calcularRangoFrecuenciaEsperada() {
        int max = calcularFrecuenciaMaxima();
        double minEsperada = max * 0.50;
        double maxEsperada = max * 0.85;
        return new double[] { minEsperada, maxEsperada };
    }

    // Representación simple de la fecha
    public String getFechaNacimientoComoTexto() {
        return mesNacimiento + "/" + diaNacimiento + "/" + anioNacimiento;
    }
}