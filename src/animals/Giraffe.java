package animals;

import utils.Utilities;

public class Giraffe extends Animal {

    private int neckHeight;
    
    protected String getKind() {
        return "Giraffe";
    }
    
    public void grow(int units) {
        this.neckHeight += units;
    }
    
    public Giraffe(String name) {
        super(name);
        this.neckHeight = 0;
        this.mouthX = 6;
    }

    @Override
    public String drawAnimal() {        
        String head = (
            "       .-\",\n"+
            "       `~||\n");
        String body = (
            "         ||___\n"+
            "         (':.)`\n"+
            "         || ||\n"+
            "         || ||\n"+
            "         ^^ ^^\n");
        String neck = Utilities.repeat("         ||\n", neckHeight); 
        
        return head+neck+body;
    }
}
