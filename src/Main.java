import Factory.VeiculoFactory;
import Veiculo.Veiculo;

public class Main {
    public static void main(String[] args) {
        VeiculoFactory factory = new VeiculoFactory();

        Veiculo carro = factory.criarVeiculo("carro");
        carro.dirigir();

        Veiculo moto = factory.criarVeiculo("moto");
        moto.dirigir();

        Veiculo bicicleta = factory.criarVeiculo("bicicleta");
        bicicleta.dirigir();
    }
}
