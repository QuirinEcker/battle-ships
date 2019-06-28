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

    public boolean isHit(char x, char y) {
        for (ShipPart part : parts) {
            if (part.getX() == x && part.getY() == y) {
                if (!part.isShot()) {
                    part.setShot(true);
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String output = "";

        for (ShipPart shipPart : parts) {
//            output += shipPart.getX() + shipPart.getY() + " ";
            output = String.format("%c%c, ", shipPart.getX(), shipPart.getY());
        }

        return output;
    }


}
