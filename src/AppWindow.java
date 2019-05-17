import java.awt.*;

public class AppWindow extends Frame {

    String msg ="";

    public AppWindow() {
        addWindowListener(new MyWindowAdapter());
        addMouseListener(new MyMouseListener(this));
        addKeyListener(new MyKeyListener(this));
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 40);
    }
}
