package Bubbles;

import utils.Utilities;

public class SpeechBubble extends Bubble {

    private StringBuilder bubbleBody;

    public SpeechBubble(String message) {
        super(message);
        this.bubbleBody = new StringBuilder();
    }

    public String draw(int connectionLocation) {
        int leftMargin = generateLeftMargin(connectionLocation);
        String leftOffsetWhitespace = Utilities.repeat(" ", leftMargin);

        bubbleBody.append(leftOffsetWhitespace);
        bubbleBody.append(" ").append(drawLine("_", " \n", getBubbleWidth()));
        
        for (String line: getLines()) {
            bubbleBody.append(leftOffsetWhitespace);
            int rightPad = getBubbleWidth() - line.length();
            String padding = Utilities.repeat(" ", rightPad);
            bubbleBody.append("|"+line+padding+"|\n");
        }
        
        int leftStart = connectionLocation-leftMargin-2;
        bubbleBody.append(this.drawAtX(leftStart, getBubbleWidth(), "  ", "_", leftOffsetWhitespace+"|", "|"));
        bubbleBody.append(this.drawAtX(leftStart, getBubbleWidth(), "\\/", " ", leftOffsetWhitespace+" ", " "));

        return bubbleBody.toString();
    }

    private int generateLeftMargin(int connectionLocation) {
        if (connectionLocation < getBubbleWidth()) {
            return 0;
        } else {
            return connectionLocation - getBubbleWidth();
        }
    }


}
