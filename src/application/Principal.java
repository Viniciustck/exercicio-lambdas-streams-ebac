package application;

import util.FiltroNome;
import java.util.Arrays; // Arrays.asList precisa disso
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criando a lista de nomes
        List<String> nomes = Arrays.asList(
                "Ana",
                "Bruno",
                "Carlos",
                "Amanda",
                "Beatriz",
                "André",
                "Carla",
                "Alberto"
        );

        System.out.println("Lista completa de nomes:");
        nomes.forEach(nome -> System.out.println("- " + nome));

        System.out.println("\n" + "=".repeat(50));

        // Instanciando a interface funcional FiltroNome usando Lambda
        // Esta expressão lambda verifica se o nome começa com "A"
        FiltroNome filtroLetraA = nome -> nome.startsWith("A");

        // Filtrando e exibindo apenas os nomes que começam com "A"
        System.out.println("\nNomes que começam com a letra 'A':");
        nomes.stream()
                .filter(nome -> filtroLetraA.testar(nome))
                .forEach(nome -> System.out.println("✓ " + nome));

        System.out.println("\n" + "=".repeat(50));

        // Exemplo adicional: filtro direto usando lambda no filter()
        System.out.println("\nNomes que começam com a letra 'B' (usando lambda direto):");
        nomes.stream()
                .filter(nome -> nome.startsWith("B"))
                .forEach(nome -> System.out.println("✓ " + nome));

        System.out.println("\n" + "=".repeat(50));

        // Exemplo extra: contando quantos nomes começam com "A"
        long quantidade = nomes.stream()
                .filter(nome -> filtroLetraA.testar(nome))
                .count();

        System.out.println("\nTotal de nomes que começam com 'A': " + quantidade);
    }
}