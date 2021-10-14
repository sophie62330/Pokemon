package packagePokemon;

public class PokemonEau extends Pokemon{
	public PokemonEau(String nom, double hp, double atk) {
		super(nom,hp,atk);
	}
	
	/**
	 * Attaque spécifique de PokemonEau
	 * @param pok le pokémon attaqué
	 */
	public void attaquer(Pokemon pok) {
		double attaqueDeBase=this.getAtk();
		
		//si un pokemonEau attaque un pokemonFeu son attaque est multipliée par 2
		if (pok instanceof PokemonFeu) {
			super.attaquer(pok,2*attaqueDeBase);
		} else if ((pok instanceof PokemonPlante) || (pok instanceof PokemonEau)) { //sil attaque un polemon eau ou plante son attaque est divisée par 2
			super.attaquer(pok, attaqueDeBase/2);
		} else {
			super.attaquer(pok, attaqueDeBase); //sinon attaque normale
		}
	}
/*
	@Override
	public String toString() {
		return "PokemonEau [nom=" + nom + ", isDead()=" + isDead() + ", getNom()=" + getNom() + ", getHp()=" + getHp()
				+ ", getAtk()=" + getAtk() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}	*/
	
	
}
