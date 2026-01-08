package application;

import util.FiltroNome;
import java.util.Arrays; // Arrays.asList precisa disso
import java.util.List;

public class Principal {
    public static void main(String[] args) {


        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda");


        FiltroNome filtro = (n) -> {
            return n.startsWith("A"); // Retorna true se começar com "A"
        };
        System.out.println("Nomes que começam com A");


        nomes.stream()
                // Aqui conectamos o stream com a sua interface
                .filter(n -> filtro.testar(n))
                .forEach(System.out::println);
    }
}