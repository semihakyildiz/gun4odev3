package gamer.gamerCheck;

import gamer.User;

public class UserCheckManager implements IUserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

}
