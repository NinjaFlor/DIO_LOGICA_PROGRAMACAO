import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String>pokemon = new ArrayList<String>();
		pokemon.add("Pikachu");
		pokemon.add("Charmander");
		pokemon.add("Bulbassaur");

		pokemon.remove(0);
		pokemon.remove(pokemon.size()-1);


		for (String p : pokemon) {
			System.out.printLn(p);
		}
	}
}