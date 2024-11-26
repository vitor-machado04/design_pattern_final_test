package org.example;

public class AirTransport implements iTransport {
    @Override
    public void deliver(String packageDetails, String location) {
        System.out.println("Entrega aérea. Limites de peso e dimensões aceitas. Pacote: " + packageDetails);
    }
}
