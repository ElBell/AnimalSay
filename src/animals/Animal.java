/**
 * 
 */
package animals;

import Bubbles.Bubble;

public abstract class Animal {
    private int mouthLocation;
    private String body;
    
    public Animal() {
    }

    abstract void drawBody();
    
    public void say(Bubble bubble) {
        System.out.println(bubble.draw(mouthLocation) + body);
        System.out.println("Says the "+this.getKind());
    }

    public void setMouthLocation(int mouthLocation) {
        this.mouthLocation = mouthLocation;
    }

    void setBody(String body) {
        this.body = body;
    }

    protected String getKind() {
        return "Generic Animal";
    }
}
