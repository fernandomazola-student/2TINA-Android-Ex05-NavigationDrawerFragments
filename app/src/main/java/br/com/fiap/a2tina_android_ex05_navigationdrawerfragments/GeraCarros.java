package br.com.fiap.a2tina_android_ex05_navigationdrawerfragments;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fernando.oliveira on 24/03/2017.
 */

public class GeraCarros {
    public static List<Carros> listaCarros(){
        List<Carros> carros = new ArrayList<>();
        carros.add(new Carros("Impala", 1960, "A Chevrolet consolidou o nome Impala como sucesso da indústria automobilística norte-americana. Nascido nos anos dourados atravessa décadas sempre com inovações.", R.drawable.impala));
        carros.add(new Carros("Cadilac", 1952, "Cadillac é uma marca automotiva estadunidense, divisão da General Motors, fundada em 1902 por Henry M. Leland.", R.drawable.cadillac));
        carros.add(new Carros("Maverick GT", 1975, "O Maverick foi um automóvel criado pela Ford dos Estados Unidos que obteve grande sucesso em seu país de origem.", R.drawable.maverick));
        carros.add(new Carros("Fusca", 1990, "O Fusca ou Carocha foi o primeiro modelo de automóvel fabricado pela companhia alemã Volkswagen. Foi o carro mais vendido no mundo", R.drawable.fusca));
        carros.add(new Carros("Brasilia", 1978, "O Brasília foi um automóvel produzido de 1973 até 1982 pela Volkswagen do Brasil.", R.drawable.brasilia));
        carros.add(new Carros("Covertte", 1975, "O Chevrolet Corvette foi um carro esportivo que foi produzido pela Chevrolet .", R.drawable.corvette));
        return carros;
    }


}
