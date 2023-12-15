
public class GrasshopperBaby extends Grasshopper {
    private String family;
    private int legCount;
    // Constructors
    public GrasshopperBaby(String camouflageColor, double antennaLength, String diet, String family) {
        super(camouflageColor, antennaLength, diet);
        this.family = family;
    }

    public GrasshopperBaby(String camouflageColor, double antennaLength, String diet, String family, boolean isJumping) {
        super(camouflageColor, antennaLength, diet);
        this.family = family;
        this.isJumping = isJumping;
    }

    public GrasshopperBaby(String camouflageColor, double antennaLength, String diet, String family, boolean isJumping, int legCount) {
        super(camouflageColor, antennaLength, diet);
        this.family = family;
        this.isJumping = isJumping;
        this.legCount = legCount;
    }

    public GrasshopperBaby(String camouflageColor, double antennaLength, String diet, String family, boolean isJumping, int legCount, String habitat) {
        super(camouflageColor, antennaLength, diet);
        this.family = family;
        this.isJumping = isJumping;
        this.legCount = legCount;
        this.habitat = habitat;
    }

    public GrasshopperBaby(String camouflageColor, double antennaLength, String diet, String family, boolean isJumping, int legCount, String habitat, boolean isNocturnal) {
        super(camouflageColor, antennaLength, diet);
        this.family = family;
        this.isJumping = isJumping;
        this.legCount = legCount;
        this.habitat = habitat;
        this.isNocturnal = isNocturnal;
    }

    public void setFamily(String family) {
    	this.family = family;
    }
    public void setLegCount(int legCount) {
    	this.legCount = legCount;
    }
    
    public String getFamily() {
    	return this.family;
    }
    public int getLegCount() {
    	return this.legCount;
    }
}