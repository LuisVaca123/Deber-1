// Clase principal que contiene el método main para ejecutar el programa
public class MainLuz {

    // Método main: punto de entrada del programa
    public static void main(String[] args) {

        // Creación de objetos LuzInteligente
        LuzInteligente l1 = new LuzInteligente("Luz-101");  // Crea luz con ID "Luz-101"
        LuzInteligente l2 = new LuzInteligente("LuZ-202");  // Crea luz con ID "LuZ-202"

        // Prueba 1: Encender l1 y ajustar brillo
        l1.encender();              // Enciende la luz (brillo automático a 50)
        l1.ajustarBrillo(80);       // Cambia el brillo a 80
        l1.mostrarEstado();         // Muestra: Luz-101, Encendida: true, Brillo: 80

        System.out.println();       // Línea en blanco para separar

        // Prueba 2: Intentar ajustar brillo de l2 estando apagada
        l2.ajustarBrillo(60);       // Muestra advertencia: "No se puede ajustar el brillo: la luz está apagada."
        l2.mostrarEstado();         // Muestra: LuZ-202, Encendida: false, Brillo: 0

        System.out.println();       // Línea en blanco para separar

        // Prueba 3: Encender l2 y ajustar brillo correctamente
        l2.encender();              // Enciende la luz (brillo automático a 50)
        l2.ajustarBrillo(40);       // Cambia el brillo a 40
        l2.mostrarEstado();         // Muestra: LuZ-202, Encendida: true, Brillo: 40

        System.out.println();       // Línea en blanco para separar

        // Prueba 4: Apagar l2
        l2.apagar();                // Apaga la luz y resetea brillo a 0
        l2.mostrarEstado();         // Muestra: LuZ-202, Encendida: false, Brillo: 0
    }
}