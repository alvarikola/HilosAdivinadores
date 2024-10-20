package hilosadivinadores;

public class HilosAdivinadores {

    public static void main(String[] args) {
        NumeroOculto numeroOculto = new NumeroOculto(); // Instancia del número oculto.

        // Crear y ejecutar los 10 hilos adivinadores.
        for (int i = 1; i <= 10; i++) {
            new Adivinador(numeroOculto, i).start();
        }
    }
    
}
