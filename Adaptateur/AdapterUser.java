package adapter;

public class AdapterUser implements IUser {
	private User2 user2 = new User2();
	@Override
	public void afficher() {
		user2.show();
		
		
	}

}
