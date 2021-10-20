import javax.swing.*;
import java.awt.*;

public final class EngineWindow {
    private final JFrame frame;
    private final BorderLayoutPanel contentPanel;
    private final Viewport viewport;


    public EngineWindow(String applicationTitle) {
        frame = new JFrame(applicationTitle);
        frame.setMinimumSize(new Dimension(800, 600));

        contentPanel = new BorderLayoutPanel();
        frame.setContentPane(contentPanel.getPanel());

        viewport = new Viewport();
        contentPanel.addComponent(viewport, BorderLayoutPanel.PlacementLocation.CENTER);
    }

    public void show() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void dispose() {
        viewport.stop();
        frame.dispose();
    }
}
