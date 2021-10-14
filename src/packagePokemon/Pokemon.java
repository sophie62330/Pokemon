package packagePokemon;

public class Pokemon {
	/**
	 * Nom du pokémon
	 */
	public String nom;
	
	/**
	 * Nombre de points de vie
	 */
	private double hp;
	
	/**
	 * Points de vie enlevés à l'adversaire en cas d'attaque
	 */
	private double atk;
	
	/**
	 * Nombre de pokémons construits
	 */
	private static int nbPokemons;
	
	/**
	 * constructeur vide
	 */
	public Pokemon() {
		nbPokemons++;
	}
	
	/**
	 * Constructeur complet
	 * @param nom le nom du pokémon 
	 * @param hp le nb de points de vie
	 * @param atk le nombre de points de vie enlevés à l'adversaiare en cas d'attaque
	 */
	public Pokemon(String nom, double hp, double atk) {
		this();
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
		System.out.println("nb pok : "+getNbPokemons());
	}

	/**
	 * permet de savoir si un pokémo est mort
	 * @return false sil est en vie, true sil est mort
	 */
	public boolean isDead() {
		return this.hp<=0;
	}
	
	/**
	 * permet de lancer une attaque sur un pokémon
	 * @param pok le pokemon attaqué
	 */
	public void attaquer(Pokemon pok,double degats) {
		System.out.println(this.nom+" attaque de "+degats+" points le Pokemon "+pok.nom+" (vie : "+pok.getHp()+")");
		pok.setHp(hp-degats);
		
		System.out.println(pok.toString());
		
		if (pok.isDead()) {
			nbPokemons--;
			System.out.println("RIP "+pok+"...");
		}
	}
	
	
	
	/**
	 * Getters setters 
	 * @return 
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getAtk() {
		return atk;
	}

	public void setAtk(double atk) {
		this.atk = atk;
	}

	public static int getNbPokemons() {
		return nbPokemons;
	}

	public static void setNbPokemons(int nbPokemons) {
		Pokemon.nbPokemons = nbPokemons;
	}
	
	
	
	@Override
	public String toString() {
		return "Pokemon " + nom + " a " + hp + "points de vie";
	}
	
}
