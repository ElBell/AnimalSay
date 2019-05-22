/**
 * Encapsulation: Bundle together related data into an object
 *  Animals have name, kind, mouthX, etc.
 * Inheritance: IS-A relationships
 *  Giraffe is-a Animal
 * Polymorphism: Access a subclass generically
 *  Speech.say()
 * Abstraction: Keep things from knowing unnecessary things
 *  Separate balloon and dog
 */
package core;

import Bubbles.Bubble;
import Bubbles.SpeechBubble;
import animals.Animal;
import animals.Dog;
import animals.Giraffe;

import java.util.Scanner;

public class AnimalSay {
    private static Scanner scanner = new Scanner(System.in);
    private static String userInput;
    private static Animal speakingAnimal = null;

    public static void main(String[] args) {
        getUserInput();
        printMessageWithAnimal();
    }

    private static void printMessageWithAnimal() {
        String message = userInput.substring(userInput.indexOf(" ") + 1);
        Bubble bubble = new SpeechBubble(message);
        speakingAnimal.say(bubble);
    }

    private static void getUserInput() {
        while (speakingAnimal == null) {
            System.out.println("What animal would you like to talk to?");
            userInput = scanner.nextLine();
            String firstWordInInput = userInput.substring(0, userInput.indexOf(" "));
            speakingAnimal = getAnimal(firstWordInInput);
        }
    }

    private static Animal getAnimal(String requestedAnimal) {
        switch (requestedAnimal.toLowerCase().trim()) {
            case "dogsay":
                return new Dog();
            case "giraffesay":
                return new Giraffe();
                default:
                    return null;
        }
    }

}
