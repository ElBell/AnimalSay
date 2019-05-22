package Bubbles;

import utils.Utilities;

import java.util.List;


public abstract class Bubble {
    private String message;
    private int bubbleWidth;

    public Bubble(String message) {
        this.message = message;
        this.bubbleWidth = Utilities.getLongestLineLength(getLines());
    }

    public abstract String draw(int connectionLocation);

    protected String drawAtX(
        int offset,
        int width,
        String marker,
        String filler,
        String left,
        String right) {
        int markerWidth = marker.length();
        return left + Utilities.repeat(filler, offset) + marker
            + Utilities.repeat(filler, width - offset - markerWidth)
            + right + "\n";
    }

    
    protected String drawLine(String middle, String end, int width) {
        return Utilities.repeat(middle, width)+end;
    }

    public List<String> getLines() {
        return Utilities.wrap(message);
    }

    public int getBubbleWidth() {
        return bubbleWidth;
    }
}
