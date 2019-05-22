package animals;

import utils.Utilities;

import java.util.Random;

public class Giraffe extends Animal {

    private static final String UNFORMATTED_BODY =
            "       .-\",\n       `~||\n%s         ||___\n         (':.)`\n         || ||\n         || ||\n         ^^ ^^\n";

    private int bodyHeight;
    
    public Giraffe() {
        this.bodyHeight = new Random().nextInt(20);
        setMouthLocation(6);
        drawBody();
    }

    protected String getKind() {
        return "Giraffe";
    }

    @Override
    public void drawBody() {
        String neck = Utilities.repeat("         ||\n", bodyHeight);
        setBody(String.format(UNFORMATTED_BODY, neck));
    }
}
