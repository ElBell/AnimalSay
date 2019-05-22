/**
 * 
 */
package balloons;

import java.util.ArrayList;
import java.util.List;
import utils.Utilities;

/**
 * @author acbart
 *
 */
public abstract class Balloon {
    public abstract String draw(String message, int connectionX);

    protected int maxWidth;


    public Balloon(int maxWidth) {
        this.maxWidth = maxWidth;
    }
    
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
    

    
    protected String drawLine(String start, String middle, String end, int width) {
        return start+Utilities.repeat(middle, width)+end;
    }
}
