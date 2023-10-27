
public class TestSandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich newSandwich = new Sandwich();
		
		// Set data fields
		newSandwich.setMainIngredient("Tuna");
		newSandwich.setBreadType("Wheat");
		newSandwich.setPrice(4.99);
		
		// Get data fields
		System.out.println("Main Ingredient: "+ newSandwich.getMainIngredient());
		System.out.println("Bread Type: "+ newSandwich.getBreadType());
		System.out.println("Price: "+ newSandwich.getPrice());

	}

}
