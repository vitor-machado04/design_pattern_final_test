package org.example;

public class ContextTransport {
    private iTransport transportStrategy;

    public ContextTransport(iTransport transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public iTransport getTransportStrategy() {
        return transportStrategy;
    }

    public void setTransportStrategy(iTransport transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void selectTransport(String packageDetails, String location, String type) {
        switch (type.toLowerCase()) {
            case "land":
                this.transportStrategy = new LandTransport();
                break;
            case "air":
                this.transportStrategy = new AirTransport();
                break;
            case "sea":
                this.transportStrategy = new SeaTransport();
                break;
            case "drone":
                this.transportStrategy = new DroneTransport();
                break;
            default:
                throw new IllegalArgumentException("Tipo de transporte não suportado: " + type);
        }
    }

    public void deliver(String packageDetails, String location) {
        if (this.transportStrategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de transporte foi definida.");
        }
        this.transportStrategy.deliver(packageDetails, location);
    }
}
