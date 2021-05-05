package gamer;

import product.Product;

public interface IUserService {
	void signup(User user);

	void update(User user);

	void delete(User user);

	void addtoCart(User user, Product product);
	void addMultiToCart(User user, Product[] product);
	
}
