package org.example;

public class DroneTransport implements iTransport {
    @Override
    public void deliver(String packageDetails, String location) {
        System.out.println("Entrega por drones para áreas metropolitanas. Pacote: " + packageDetails);
    }
}
