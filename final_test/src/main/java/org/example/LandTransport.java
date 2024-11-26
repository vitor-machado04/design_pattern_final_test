package org.example;

public class LandTransport implements iTransport {
    @Override
    public void deliver(String packageDetails, String location) {
        System.out.println("Entrega terrestre selecionada para " + location +
                ". Transportadora local será usada. Pacote: " + packageDetails);
    }
}
