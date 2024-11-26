package org.example;

public class SeaTransport implements iTransport {
    @Override
    public void deliver(String packageDetails, String location) {
        System.out.println("Entrega marítima selecionada para entrega internacional. Pacote: " + packageDetails);
    }
}
