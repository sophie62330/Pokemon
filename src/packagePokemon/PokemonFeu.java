package packagePokemon;

public class PokemonFeu extends Pokemon {
	
	public PokemonFeu(String nom, double hp, double atk) {
		super(nom,hp,atk);
	}
	
	/**
	 * attaque spécifique de pokemonFeu
	 * @param pok le pokémon attaqué
	 */
	public void attaquer(Pokemon pok) {
		double attaqueDeBase=this.getAtk();
		
		//si un pokemonfeu attaque un pokemonplante son attaque est multipliée par 2
		if (pok instanceof PokemonPlante) {
			super.attaquer(pok,2*attaqueDeBase);
		} else if (pok instanceof PokemonEau) { //sil attaque un polemon eau son attaque est divisée par 2
			super.attaquer(pok, attaqueDeBase/2);
		} else {
			super.attaquer(pok, attaqueDeBase); //sinon attaque normale
		}
	}
/*
	@Override
	public String toString() {
		return "PokemonFeu [nom=" + nom + ", isDead()=" + isDead() + ", getNom()=" + getNom() + ", getHp()=" + getHp()
				+ ", getAtk()=" + getAtk() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}	
	*/
}
 