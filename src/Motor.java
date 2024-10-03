public class Motor {
    private int potencia;
    private int cilindradas;

    public Motor(int potencia, int cilindradas) {
        this.potencia = potencia;
        this.cilindradas = cilindradas;
    }

    public int getPotencia() {
        return potencia;
    }
    public int getCilindradas() {
        return cilindradas;
    }
}
