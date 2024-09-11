package Carro;
import Veiculo.Veiculo;

public class Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro!");
    }
}
