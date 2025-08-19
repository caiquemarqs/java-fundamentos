import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Herança e Polimorfismo
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mimi");

        cachorro.emitirSom();
        gato.emitirSom();

        // Interface
        Veiculo carro = new Carro("Fusca");
        carro.acelerar();
        carro.frear();

        // Coleções
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        System.out.println("Lista de animais:");
        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}