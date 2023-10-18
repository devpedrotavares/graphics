import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MainJPanel extends JPanel
{

    int width = 640;
    int height = 480;
    int midX = width/2;
    int midY = height/2;
    int legendShift = 5;
    int scale = 100;

    public void paintComponent( Graphics g )
    {


        super.paintComponent( g );

        this.setBackground( Color.WHITE );

        g.setColor( Color.BLACK );
        g.drawLine( 0, height/2, width, height/2 );
        g.drawLine( width/2, height, width/2, 0);

        drawMarksForX(g,
                new int[] {midX-scale*3,midX-scale*2,midX-scale, midX, midX + scale, midX + scale*2, midX + scale*3},
                midY);
        drawMarksForY(g, midX,
                new int[] {midY + scale*2, midY + scale, midY, midY-scale, midY-scale*2});

        g.setColor(Color.RED);
        g.drawLine(midX+scale, midY-scale, midX + scale*2, midY - scale*2);
    }

    public void drawMarksForX(Graphics g, int[] pointsX, int y) {
        for(int i =0; i < pointsX.length; i++) {
            int x = pointsX[i];
            g.setColor(Color.BLACK);
            g.drawLine(x, y - legendShift, x, y + legendShift);

            g.setColor(Color.BLUE);
            g.drawString(String.valueOf(i - (pointsX.length/2)), x - legendShift*3, y + legendShift*4);
        }
    }

    public void drawMarksForY(Graphics g, int x, int[] pointsY) {
        for(int i =0; i < pointsY.length; i++) {
            int y = pointsY[i];

            if(y == midY) {
                continue;
            }

            g.setColor(Color.BLACK);
            g.drawLine(x - legendShift, y, x + legendShift, y);

            g.setColor(Color.BLUE);
            g.drawString(String.valueOf(i - (pointsY.length/2)), x - legendShift*4, y - legendShift*2);
        }
    }
}