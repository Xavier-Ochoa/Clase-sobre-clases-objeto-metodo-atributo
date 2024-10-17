public class llamarclase {
    public static void main(String[] args) {
        // Creación de tres objetos Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Toyota Corolla", 2020, "Rojo");
        Vehiculo vehiculo2 = new Vehiculo("Honda Civic", 2019, "Negro");
        Vehiculo vehiculo3 = new Vehiculo("Ferrari");
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", 2017, "Azul", 2000, 4);
        Vehiculo vehiculo5 = new Vehiculo();

        // Muestra información de los vehículos
        vehiculo1.imprimir();
        vehiculo2.imprimir();
        vehiculo3.imprimir2();
        vehiculo4.imprimir3();
        vehiculo5.imprimir3();
    }
}