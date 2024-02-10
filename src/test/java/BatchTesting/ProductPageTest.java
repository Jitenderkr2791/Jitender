package BatchTesting;

import org.testng.annotations.Test;

public class ProductPageTest 
{
	@Test
	public void AddProductToWishlist()
	{
		System.out.println("Add Product To Wishlist");
	}
	
	@Test
	public void AddProductCart()
	{
		System.out.println("Add Product To Cart");
	}
	
	@Test
	public void SelectQuantity()
	{
		System.out.println("Select Quantity");
	}
}
