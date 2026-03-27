package gr.codehub.unit.service;

import gr.codehub.unit.domain.Item;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {
	boolean addItem(Item item);

	boolean removeItem(Item item);

	List<Item> getCartItems();

	BigDecimal getTotalPrice();

	boolean checkout();
}
