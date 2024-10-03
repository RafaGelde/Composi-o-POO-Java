public class Carro {
    //Atributo
    private String modelo;
    private Motor motor;
    private Roda rodas[];

    //Construtor

    public Carro(String modelo, Motor motor, Roda[] rodas) {
        this.modelo = modelo;
        this.motor = motor;
        this.rodas = new Roda[] {
                new Roda(32),
                new Roda(32),
                new Roda(32),
                new Roda(32)
        };
    }

    //Getters
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }
}
