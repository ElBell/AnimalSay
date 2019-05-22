/**
 * Encapsulation: Bundle together related data into an object
 *  Animals have name, kind, mouthX, etc.
 * Inheritance: IS-A relationships
 *  Dog is-a Animal
 * Polymorphism: Access a subclass generically
 *  Speech.speak()
 * Abstraction: Keep things from knowing unnecessary things
 *  Separate balloon and dog
 */
package core;

import animals.Dog;
import animals.Giraffe;

/**
 * @author acbart
 *
 */
public class AnimalSay {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Dog carlos = new Dog("Carlos");
        carlos.speak("Bark! Bark!");
                
        carlos.stretch(3);
        carlos.speak("Bark!\nBark!");
        
        carlos.stretch(-15);
        carlos.speak("What an eloquent dog!");
        
        Giraffe jeff = new Giraffe("Jeff");
        jeff.speak("<Giraffe noises!>");
        
        jeff.grow(5);
        jeff.speak("<Really Tall Giraffe noises!>");
    }

}
