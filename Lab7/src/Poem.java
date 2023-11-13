public class Poem{
    private String name;
    private int numOfLines;

    public Poem(String name, int number){
        this.name = name;
        this.numOfLines = number;
    }

    public String getName(){
        return this.name;
    }
    public int getNumOfLines(){
        return this.numOfLines;
    }
}