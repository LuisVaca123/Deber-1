// Clase que representa una luz inteligente con control de encendido/apagado y brillo
public class LuzInteligente {

    // Atributos (variables de instancia)
    private String idLuz;        // Identificador único de la luz
    private int nivelBrillo;     // Nivel de brillo de 0 a 100
    private boolean encendida;   // Estado: true = encendida, false = apagada

    // Constructor sin parámetros (vacío)
    public LuzInteligente(){
        // No inicializa nada, los valores serán los predeterminados de Java
    };

    // Constructor con parámetro idLuz
    public LuzInteligente(String idLuz){
        this.idLuz = idLuz;           // Asigna el ID recibido
        this.nivelBrillo = 0;         // Inicia con brillo en 0
        this.encendida = false;       // Inicia apagada
    }

    // Método setter: establece el ID de la luz
    public void setIdLuz(String idLuz){
        this.idLuz = idLuz;
    }

    // Método getter: obtiene el ID de la luz
    public String getIdLuz(){
        return idLuz;
    }

    // Método para encender la luz
    public void encender(){
        this.encendida = true;        // Cambia el estado a encendida
        if(this.nivelBrillo == 0){
            this.nivelBrillo = 50;    // Si el brillo está en 0, lo pone en 50 por defecto
        }
    }

    // Método para apagar la luz
    public void apagar(){
        this.encendida = false;       // Cambia el estado a apagada
        this.nivelBrillo = 0;         // Resetea el brillo a 0
    }

    // Método para ajustar el nivel de brillo
    public void ajustarBrillo(int nuevoNivel){
        // Verifica si la luz está apagada
        if(!encendida){
            System.out.println("No se puede ajustar el brillo: la luz está apagada.");
            return;  // Sale del método sin hacer cambios
        }
        // Valida que el nivel esté entre 0 y 100
        if(nuevoNivel < 0 || nuevoNivel > 100){
            System.out.println("Nivel de brillo inválido (0-100).");
            return;  // Sale del método sin hacer cambios
        }
        // Si todo es válido, actualiza el brillo
        this.nivelBrillo = nuevoNivel;
    }

    // Método para mostrar el estado actual de la luz en consola
    public void mostrarEstado(){
        System.out.println("Luz: " + idLuz);
        System.out.println("Encendida: " + encendida);
        System.out.println("Brillo: " + nivelBrillo);
    }
}