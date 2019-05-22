/**
 * 
 */
package animals;

import utils.Utilities;

import java.util.Random;

public class Dog extends Animal {

    private static final String UNFORMATTED_BODY =
            "         %s  .-.\n(________%s_() 0`-,\n(   _____%s /--=\n//\\\\   %s//\\\\\n\"\" \"\"%s  \"\" \"\"\n";
    private int bodyWidth;
    
    public Dog() {
        this.bodyWidth = new Random().nextInt(60);
        setMouthLocation(bodyWidth+13);
        drawBody();
    }

    protected String getKind() {
        return "Dog";
    }

    @Override
    void drawBody() {
        String spaces = Utilities.repeat(" ", bodyWidth);
        String lines = Utilities.repeat("_", bodyWidth);
        setBody(String.format(UNFORMATTED_BODY, spaces, lines, lines, spaces, spaces));
    }
}
