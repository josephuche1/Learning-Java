
public class DemoCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candle newCandle = new Candle();
        ScentedCandle newScentedCandle = new ScentedCandle();
        
        
        newCandle.setColor("white");
        newCandle.setHeight(2.0);
        
        newScentedCandle.setColor("Red");
        newScentedCandle.setHeight(2.0);
        
        System.out.println("Candle: "
        		    +newCandle.getColor()+", "
        		    +newCandle.getHeight()+", "
        		    +newCandle.getPrice());
        System.out.println("Scented Candle: "
    		    +newScentedCandle.getColor()+", "
    		    +newScentedCandle.getHeight()+", "
    		    +newScentedCandle.getPrice());
	}

}
