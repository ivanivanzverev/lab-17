import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {
    AppWindow appWindow;

    public MyMouseListener(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void mousePressed(MouseEvent me) {
        appWindow.msg = "Hello World!";
        appWindow.repaint();
    }
}
