package adapter;

public class Test {

	public static void main(String[] args) {
		IUser iu = new AdapterUser();
		TraitementUser tu = new TraitementUser();
		tu.afficher(iu);
		
	}

}
