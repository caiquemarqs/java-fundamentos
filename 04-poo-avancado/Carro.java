public class Carro implements Veiculo {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelerando...");
    }

    @Override
    public void frear() {
        System.out.println(modelo + " freando...");
    }
}