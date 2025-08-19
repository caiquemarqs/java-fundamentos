public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Caique";
        p1.idade = 31;
        p1.apresentar();

        Carro c1 = new Carro();
        c1.modelo = "Fusca";
        c1.ano = 1975;
        c1.exibirDados();
    }
}
