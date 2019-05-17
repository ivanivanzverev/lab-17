import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter {

    AppWindow appWindow;

    public MyKeyListener(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void keyTyped(KeyEvent ke) {
        Button button = new Button();
        button.setLabel("Push me!");
        button.setSize(new Dimension(100, 50));
        button.setLocation(100,100);
        button.setEnabled(true);
        appWindow.add(button);
        appWindow.repaint();
    }
}
