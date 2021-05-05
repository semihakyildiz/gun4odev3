package gamer.gamerCheck;

import gamer.BaseUserManager;
import gamer.User;
import product.Product;

public class UserManager extends BaseUserManager{
	 private IUserCheckService checkService;

	    public UserManager(IUserCheckService checkService) {
	       
	        this.checkService = checkService;
	    }

	    @Override
	    public void signup(User user) {
	        if(checkService.checkIfRealPerson(user)) super.signup(user);
	        else System.out.println("Not a real person.");
	    }

		@Override
		public void addMultiToCart(User user, Product[] product) {
			// TODO Auto-generated method stub
			
		}
}
