package packagePokemon;

public class PokemonPlante extends Pokemon {
	public PokemonPlante(String nom, double hp, double atk) {
		super(nom,hp,atk);
	}
	
	/**
	 * Attaque spécifique de pokemonPlante
	 * @param pok le pokémon attaqué
	 */
	public void attaquer(Pokemon pok) {
		double attaqueDeBase=this.getAtk();
		
		//si un pokemonplante attaque un pokemonFeu son attaque est multipliée par 2
		if (pok instanceof PokemonEau) {
			super.attaquer(pok,2*attaqueDeBase);
		} else if ((pok instanceof PokemonPlante) || (pok instanceof PokemonFeu)) { //sil attaque un polemon feu ou plante son attaque est divisée par 2
			super.attaquer(pok, attaqueDeBase/2);
		} else {
			super.attaquer(pok, attaqueDeBase); //sinon attaque normale
		}
	}
}
