import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<ShipPart> parts = new ArrayList<ShipPart>();

    public Ship(char startX, char startY, int lenght, boolean horizontal) {
        char x = startX;
        char y = startY;

        for (int i = 0; i < lenght; i++) {
            parts.add(new ShipPart(x, y));

            if (horizontal) {
                x++;
            } else {
                y++;
            }
        }
    }


}
