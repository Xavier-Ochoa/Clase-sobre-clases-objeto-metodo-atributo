public class Main {
    public static void main(String[] args) {
        // Creación de objetoo
        Jugador jugador1 = new Jugador("BLack", 23, "Ecuador");
        Jugador jugador2 = new Jugador();

        // Muestra información de los vehículos
        jugador1.patear();
        jugador1.correr();
        jugador2.patear();
        jugador2.correr();
        jugador2.saltar(2);
    }
}