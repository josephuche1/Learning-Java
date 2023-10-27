
public class TestSandwichImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SandwichImmutable newSandwich = new SandwichImmutable("Tuna", "Wheat", 4.99);

		// Get data fields
		System.out.println("Main Ingredient: "+ newSandwich.getMainIngredient());
		System.out.println("Bread Type: "+ newSandwich.getBreadType());
		System.out.println("Price: "+ newSandwich.getPrice());

	}

}
