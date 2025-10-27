import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String primerNombre;
    private String apellidoPaterno;
    private String sexo; // Ej: "M", "F", "Otro"
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaCm; // centímetros
    private double pesoKg;   // kilogramos

    public PerfilMedico(String primerNombre, String apellidoPaterno, String sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento,
                        double alturaCm, double pesoKg) {
        setPrimerNombre(primerNombre);
        setApellidoPaterno(apellidoPaterno);
        setSexo(sexo);
        setDiaNacimiento(diaNacimiento);
        setMesNacimiento(mesNacimiento);
        setAnioNacimiento(anioNacimiento);
        setAlturaCm(alturaCm);
        setPesoKg(pesoKg);
    }

    // Getters
    public String getPrimerNombre() { return primerNombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getSexo() { return sexo; }
    public int getDiaNacimiento() { return diaNacimiento; }
    public int getMesNacimiento() { return mesNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }
    public double getAlturaCm() { return alturaCm; }
    public double getPesoKg() { return pesoKg; }

    // Setters (validaciones sencillas donde tiene sentido)
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = (primerNombre != null && !primerNombre.trim().isEmpty())
                ? primerNombre.trim() : "Sin nombre";
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = (apellidoPaterno != null && !apellidoPaterno.trim().isEmpty())
                ? apellidoPaterno.trim() : "Sin apellido";
    }

    public void setSexo(String sexo) {
        this.sexo = (sexo != null && !sexo.trim().isEmpty()) ? sexo.trim() : "No especificado";
    }

    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }
    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }
    public void setAnioNacimiento(int anioNacimiento) { this.anioNacimiento = anioNacimiento; }

    public void setAlturaCm(double alturaCm) { this.alturaCm = alturaCm > 0 ? alturaCm : 0.0; }
    public void setPesoKg(double pesoKg) { this.pesoKg = pesoKg > 0 ? pesoKg : 0.0; }

    // Edad en años usando java.time
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        return Period.between(nacimiento, hoy).getYears();
    }

    // Frecuencia cardiaca máxima = 220 - edad
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Rango de frecuencia esperada (50% - 85% de la máxima)
    public double[] calcularRangoFrecuenciaEsperada() {
        int max = calcularFrecuenciaMaxima();
        return new double[] { max * 0.50, max * 0.85 };
    }

    // BMI = peso(kg) / (altura(m))^2
    public double calcularBMI() {
        if (alturaCm <= 0) return 0.0;
        double alturaM = alturaCm / 100.0;
        return pesoKg / (alturaM * alturaM);
    }

    // Categoría BMI según tabla
    public String categoriaBMI() {
        double bmi = calcularBMI();
        if (bmi < 18.5) return "Bajo peso";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Sobrepeso";
        return "Obeso";
    }

    // Fecha como texto
    public String getFechaNacimientoComoTexto() {
        return String.format("%02d/%02d/%04d", diaNacimiento, mesNacimiento, anioNacimiento);
    }
}