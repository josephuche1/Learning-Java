
public class Bean extends BubbleBee {
	private String hiveLocation;

    // Constructors
    public Bean(int honeyLevel, boolean hasStinger, int pollinationCapacity, double wingSize) {
        super(honeyLevel, hasStinger, pollinationCapacity, wingSize);
    }

    public Bean(int honeyLevel, boolean hasStinger, int pollinationCapacity, double wingSize, String hiveLocation) {
        super(honeyLevel, hasStinger, pollinationCapacity, wingSize);
        this.hiveLocation = hiveLocation;
    }

    public Bean(int honeyLevel, boolean hasStinger, int pollinationCapacity, double wingSize, String hiveLocation, boolean isNocturnal) {
        super(honeyLevel, hasStinger, pollinationCapacity, wingSize);
        this.hiveLocation = hiveLocation;
        this.isNocturnal = isNocturnal;
    }

    public void setHiveLocation(String hiveLocation) {
    	this.hiveLocation = hiveLocation;
    }
    public String getHiveLocation() {
    	return this.hiveLocation;
    }

	@Override
	public void gatherNectar() {
		System.out.println("Bean is gathering nectar");
		
	}
}