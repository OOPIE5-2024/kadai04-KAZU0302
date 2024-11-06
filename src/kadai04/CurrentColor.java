package kadai04;

import java.awt.Color;

public class CurrentColor {
   private int red = 0;
   private int blue = 0;
   private int green = 0;
   
   public Color changeRed() {
     red = nextBright(red);
     return new Color(red,blue,green);
   }
   public Color changeBlue() {
     blue = nextBright(blue);
     return new Color(red,blue,green);
   }
   public Color changeGreen() {
     green = nextBright(green);
     return new Color(red, blue, green);
   }
   public int nextBright(int b) {
     int z = -1;
     if (b == 0) z = 128;
     if (b == 128) z = 255;
     if (b == 255) z = 0;
     return z;   
   }
}
