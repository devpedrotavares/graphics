import java.awt.Color;
import javax.swing.JFrame;

public class Program
{
    public static void main( String args[] )
    {
        JFrame frame =
                new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        MainJPanel mainJPanel =
                new MainJPanel();
        mainJPanel.setBackground( Color.WHITE );

        frame.add( mainJPanel );

        // um pouco maior do que o tamanho desejado, que é 640x480
        int width = 660;
        int height = 500;

        frame.setSize(width, height);

        frame.setVisible( true );
    }
}