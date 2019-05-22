package balloons;

import utils.Utilities;

public class SpeechBalloon extends Balloon {

    public SpeechBalloon(int maxWidth) {
        super(maxWidth);
    }
    
    public SpeechBalloon() {
        super(10);
    }

    public String draw(String message, int connectionX) {
        String[] wrappedMessage = Utilities.wrap(message, maxWidth);
        
        int bubbleWidth = Utilities.getLongestLineLength(wrappedMessage);
        int leftMargin = 0;

        if (connectionX < bubbleWidth) {
            leftMargin = 0;
        } else {
            leftMargin = connectionX - bubbleWidth;
        }
        
        String leftOffsetWhitespace = Utilities.repeat(" ", leftMargin);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(leftOffsetWhitespace);
        sb.append(drawLine(" ", "_", " \n", bubbleWidth));
        
        for (String line: wrappedMessage) {
            sb.append(leftOffsetWhitespace);
            int rightPad = bubbleWidth - line.length();
            String padding = Utilities.repeat(" ", rightPad);
            sb.append("|"+line+padding+"|\n");
        }
        
        int leftStart = connectionX-leftMargin-2;
        sb.append(this.drawAtX(leftStart, bubbleWidth, "  ", "_", leftOffsetWhitespace+"|", "|"));
        sb.append(this.drawAtX(leftStart, bubbleWidth, "\\/", " ", leftOffsetWhitespace+" ", " "));

        return sb.toString();
    }
    
    
    
}
