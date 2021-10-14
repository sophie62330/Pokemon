package packagePokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pokemon> listePokemon=new ArrayList<Pokemon>();
		int indicePokAttaquant;
		int indicePokAttaque;
		Pokemon pokemonAttaquant;
		PokemonEau pokEau;
		PokemonFeu pokFeu;
		PokemonPlante pokPlante;
		Pokemon pokemonAttaque;
		
		//ON demande un nombre aléatoire de pokémons entre 1 et 100
		int nbPok=Math.round((float)Math.random()*100);

		//Construction des pokémons
		for (int i=1;i<=nbPok;i++) {
			if (i%4==0) { listePokemon.add(new PokemonFeu("PokFeu"+i,100,40));}
			else if (i%4==1) { listePokemon.add(new PokemonEau("PokEau"+i,100,20));}
			else if (i%4==2) { listePokemon.add(new PokemonPlante("PokPlante"+i,100,30));}
			else if (i%4==3) { listePokemon.add(new Pokemon("PokSimple"+i,100,10));}
			else;
		}
		
		System.out.println("Nombre de pokémons dans l'arène : "+Pokemon.getNbPokemons());
		
		while (listePokemon.size()>1) {
			//on récupére 2 pokémons aléatoirement dans la liste
			indicePokAttaquant=new Random().nextInt(listePokemon.size());
			indicePokAttaque=new Random().nextInt(listePokemon.size());
			while (indicePokAttaque==indicePokAttaquant) {
				indicePokAttaque=new Random().nextInt(listePokemon.size());
			}
			pokemonAttaquant=listePokemon.get(indicePokAttaquant);
			pokemonAttaque=listePokemon.get(indicePokAttaque);
			
			//Combat
			if (pokemonAttaquant instanceof PokemonEau) {
				pokEau=(PokemonEau)pokemonAttaquant;
				pokEau.attaquer(pokemonAttaque);
			} else 	if (pokemonAttaquant instanceof PokemonFeu) {
				pokFeu=(PokemonFeu)pokemonAttaquant;
				pokFeu.attaquer(pokemonAttaque);
			} else if (pokemonAttaquant instanceof PokemonPlante) {
				pokPlante=(PokemonPlante)pokemonAttaquant;
				pokPlante.attaquer(pokemonAttaque);
			} else {
				pokemonAttaquant.attaquer(pokemonAttaque, pokemonAttaquant.getAtk());
			}
			
			//si le pokemon est mort on le supprime de la liste
			if (pokemonAttaque.isDead()) {
				listePokemon.remove(indicePokAttaque);
			}
		}
		
		System.out.println(listePokemon.get(0).getNom()+" a gagné avec une vie restante de "+listePokemon.get(0).getHp());
	}

}
