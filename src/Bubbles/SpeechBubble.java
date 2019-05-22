package Bubbles;

import utils.Utilities;

public class SpeechBubble extends Bubble {

    private StringBuilder bubbleBody;
    private String leftOffsetWhitespace;

    public SpeechBubble(String message) {
        super(message);
        this.bubbleBody = new StringBuilder();
    }

    public String draw(int connectionLocation) {
        int leftMargin = generateLeftMargin(connectionLocation);
        leftOffsetWhitespace = Utilities.repeat(" ", leftMargin);
        addTop();
        addMessage();
        int leftStart = connectionLocation-leftMargin-2;
        addBottom(leftStart);
        return bubbleBody.toString();
    }

    private void addTop() {
        bubbleBody.append(leftOffsetWhitespace);
        bubbleBody.append(" ").append(drawLine("_", " \n", getBubbleWidth()));
    }

    private void addMessage() {
        for (String line: getLines()) {
            bubbleBody.append(leftOffsetWhitespace);
            int rightPad = getBubbleWidth() - line.length();
            String padding = Utilities.repeat(" ", rightPad);
            bubbleBody.append("|").append(line).append(padding).append("|\n");
        }
    }

    private void addBottom(int leftStart) {
        bubbleBody.append(this.drawAtX(leftStart, getBubbleWidth(), "  ", "_", leftOffsetWhitespace+"|", "|"));
        bubbleBody.append(this.drawAtX(leftStart, getBubbleWidth(), "\\/", " ", leftOffsetWhitespace+" ", " "));

    }

    private int generateLeftMargin(int connectionLocation) {
        if (connectionLocation < getBubbleWidth()) {
            return 0;
        } else {
            return connectionLocation - getBubbleWidth();
        }
    }


}
