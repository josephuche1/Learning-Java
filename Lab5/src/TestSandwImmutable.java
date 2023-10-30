
public class TestSandwImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmSandwich newSandwich = new ImmSandwich("Tuna", "Wheat", 4.99);

		// Get data fields
		System.out.println("Main Ingredient: "+ newSandwich.getMainIngredient());
		System.out.println("Bread Type: "+ newSandwich.getBreadType());
		System.out.println("Price: "+ newSandwich.getPrice());

	}

}
