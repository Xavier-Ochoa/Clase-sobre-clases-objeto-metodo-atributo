class Jugador {
    // Atributos
    String avatar;
    int edad;
    String pais;

    // Metodo Constructor
    public Jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }
    public Jugador() {
        avatar = "Crown";
        edad = 21;
        pais = "Colombia";
    }


    // Metodo para mostrar la información
    public void patear() {
        System.out.println("El jugador " + avatar + " patea" );
    }

    public void correr() {
        System.out.println("El jugador " + avatar + " corre");
    }
    public void saltar(int s ) {
        System.out.println("El jugador " + avatar + " " + 2*s + " veces salto");
    }
}
