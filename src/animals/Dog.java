/**
 * 
 */
package animals;

import utils.Utilities;

/**
 * @author acbart
 *
 */
public class Dog extends Animal {
    
    private int bodyWidth;
    
    protected String getKind() {
        return "Dog";
    }
    
    public void stretch(int units) {
        this.bodyWidth += units;
        this.mouthX += units;
    }
    
    public Dog(String name) {
        super(name);
        this.bodyWidth = 20;
        this.mouthX = bodyWidth+13;
    }

    @Override
    public String drawAnimal() {
        //String line = "`/"+Utilities.repeat("-", bodyWidth)+"\\*";
        
        String w = Utilities.repeat(" ", bodyWidth);
        String _ = Utilities.repeat("_", bodyWidth);
        
        String line = (
        "         "+w+"  .-.\n"+
        "(________"+_+"_()6 `-,\n"+
        "(   _____"+_+" /''\"`\n"+
        "//\\\\   "+w+"//\\\\\n"+
        "\"\" \"\""+w+"  \"\" \"\"\n"
        );
        
        return line;
    }
}
