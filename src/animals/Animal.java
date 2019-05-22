/**
 * 
 */
package animals;

import balloons.Balloon;
import balloons.SpeechBalloon;

/**
 * @author acbart
 *
 */
public abstract class Animal {
    protected int mouthX;
    protected String name;
    protected Balloon speechStyle;
    
    public Animal(String name) {
        this.name = name;
        this.speechStyle = new SpeechBalloon();
    }

    protected int getMouthX() {
        return mouthX;
    }
    
    public void speak(String message) {
        System.out.println(speechStyle.draw(message, mouthX) + drawAnimal());
        System.out.println("says "+this.name+" the "+this.getKind());
    }
    
    protected String getKind() {
        return "Generic Animal";
    }

    protected abstract String drawAnimal();
}
