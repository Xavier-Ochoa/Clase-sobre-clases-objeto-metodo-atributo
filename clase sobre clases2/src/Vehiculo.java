class Vehiculo {
    // Atributos
    String modelo;
    int anio;
    String color;
    int kilometraje;
    int puertas;

    // Metodo Constructor
    public Vehiculo(String modelo, int año, String color) {
        this.modelo = modelo;
        this.anio = año;
        this.color = color;
    }

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(String modelo, int año, String color, int kilometraje, int puertas) {
        this.modelo = modelo;
        this.anio = año;
        this.color = color;
        this.kilometraje = kilometraje;
        this.puertas = puertas;
    }

    public Vehiculo() {
        this.modelo = "Niisan";
        this.anio = 2023;
        this.color = "Cafe";
        this.kilometraje = 3000;
        this.puertas = 3;
    }

    // Metodo para mostrar la información del vehículo
    public void imprimir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("----------------------------");
    }

    public void imprimir2() {
        System.out.println("Modelo: " + modelo);
        System.out.println("----------------------------");
    }
    public void imprimir3() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Color: " + kilometraje);
        System.out.println("Color: " + puertas);
        System.out.println("----------------------------");
    }
}
