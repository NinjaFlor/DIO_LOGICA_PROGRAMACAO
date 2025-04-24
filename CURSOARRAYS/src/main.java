import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomesPokemon = Arrays.asList("Pikachu", "Charmander", "Bulbassaur");

        List<List<String>> timePokemon = new ArrayList<>();
        timePokemon.add(Arrays.asList("Pikachu", "M", "level 1"));
        timePokemon.add(Arrays.asList("Chamander", "F", "level 4"));

        List<String> pokemon = new ArrayList<>();
        pokemon.add("Pikachu");
        pokemon.add("Charmander");
        pokemon.add("Bulbassaur");

        pokemon.remove(0); // remove "Pikachu"
        pokemon.remove(pokemon.size() - 1); // remove "Bulbassaur"

        System.out.println("Conteúdo da lista 'nomesPokemon':");
        for (String nome : nomesPokemon) {
            System.out.println(nome);
        }

        System.out.println("\nConteúdo da lista 'pokemon' após remoções:");
        for (String p : pokemon) {
            System.out.println(p);
        }

        System.out.println("\nConteúdo da lista 'timePokemon':");
        for (List<String> pokeInfo : timePokemon) {
            System.out.println(pokeInfo);
        }
    }
}
