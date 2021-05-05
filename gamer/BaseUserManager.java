package gamer;

import product.Product;

public abstract class BaseUserManager implements IUserService {
	
	@Override
	public void signup(User user) {
		System.out.println("Kullanici eklendi: "+ user.getNickName());
		
	}
	@Override
	public void delete(User user) {
		System.out.println("Kullanici hesabi silindi: "+ user.getNickName());
		
	}
	@Override
	public void update(User user) {
		System.out.println("Kullanici bilgileri guncellendi: "+ user.getNickName());
		
	}
	@Override
	public void addtoCart(User user, Product product) {
		System.out.println("Sepete eklendi: "+ product.getName());
		
	}
}
