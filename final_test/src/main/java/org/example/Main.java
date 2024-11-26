package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String packageDetails = "Pacote pequeno, 2kg";

        String locationLand = "Porto Alegre";
        String locationAir = "Recife";
        String locationSea = "Madrid, Espanha";
        String locationDrone = "Araucaria, PR";

        ContextTransport context = new ContextTransport(new LandTransport());
        System.out.println("Transporte Terrestre:");
        context.deliver(packageDetails, locationLand);

        context.setTransportStrategy(new AirTransport());
        System.out.println("\nTransporte Aéreo:");
        context.deliver(packageDetails, locationAir);

        context.setTransportStrategy(new SeaTransport());
        System.out.println("\nTransporte Marítimo:");
        context.deliver(packageDetails, locationSea);

        context.setTransportStrategy(new DroneTransport());
        System.out.println("\nEntrega por Drones:");
        context.deliver(packageDetails, locationDrone);
    }
}