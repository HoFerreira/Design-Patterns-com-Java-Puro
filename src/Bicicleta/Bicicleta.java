package Bicicleta;
import Veiculo.Veiculo;

public class Bicicleta implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Andando de bicicleta!");
    }
}
