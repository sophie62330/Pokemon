package packagePokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PokemonFeu pokFeu=new PokemonFeu("PokFire",100,20);
		PokemonEau pokEau=new PokemonEau("pokBlue",100,100);
		PokemonPlante pokPlante=new PokemonPlante("pokGreen",100,40);
		Pokemon pokNormal=new Pokemon("pokDefault",100,10);
		
		//while (Pokemon.getNbPokemons()!=1) {
			pokFeu.attaquer(pokNormal);
			pokEau.attaquer(pokFeu);
			pokPlante.attaquer(pokEau);
			pokNormal.attaquer(pokPlante,pokNormal.getAtk());
		//}
		
	}

}
