
public class ShipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ship[] ships = new Ship[3];
        
        ships[0] =  new Ship("Lolipop", "1960");
        ships[1] = new CruiseShip("Disney Magic", "1998", 2400);
        ships[2] = new CargoShip("Black Pearl", "1800", 50000);
        
        for(int i = 0; i < 3; i++) {
        	System.out.println(ships[i]);
        	System.out.println(ships[i].toString());
        }
	}

}

/*
 * I am the Ship - parent class
 * I am the Ship - parent class
 * My name is Lolipop and I was built in 1960.
 * My name is Lolipop and I was built in 1960.
 * My name is Disney Magic and I was built in 1998. I have 2400passengers. 
 * My name is Disney Magic and I was built in 1998. I have 2400passengers. 
 * My name is 1800 and I was built in Black Pearl. I have a  tonnage of 50000.
 * My name is 1800 and I was built in Black Pearl. I have a  tonnage of 50000.*/
 