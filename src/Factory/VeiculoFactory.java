package Factory;

import Veiculo.Veiculo;
import Carro.Carro;
import Bicicleta.Bicicleta;
import Moto.Moto;

public class VeiculoFactory {
    public Veiculo criarVeiculo(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        switch (tipo.toLowerCase()) {
            case "carro":
                return new Carro();
            case "moto":
                return new Moto();
            case "bicicleta":
                return new Bicicleta();
            default:
                throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }
    }
}   
