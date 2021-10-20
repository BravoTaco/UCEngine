import javax.swing.*;
import java.awt.*;

public final class BorderLayoutPanel {
    private final JPanel panel;
    private final JPanel centerPanel;
    private final JPanel northPanel;
    private final JPanel eastPanel;
    private final JPanel westPanel;
    private final JPanel southPanel;

    public BorderLayoutPanel() {
        panel = new JPanel(new BorderLayout());

        centerPanel = new JPanel();
        northPanel = new JPanel();
        eastPanel = new JPanel();
        southPanel = new JPanel();
        westPanel = new JPanel();

        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(eastPanel, BorderLayout.EAST);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(westPanel, BorderLayout.WEST);
    }

    public void addComponent(Component component, PlacementLocation location) {
        switch (location) {
            case CENTER:
                centerPanel.add(component);
                break;
            case NORTH:
                northPanel.add(component);
                break;
            case EAST:
                eastPanel.add(component);
                break;
            case SOUTH:
                southPanel.add(component);
                break;
            case WEST:
                westPanel.add(component);
                break;
        }
    }

    public JPanel getPanel() {
        return panel;
    }

    public enum PlacementLocation {
        CENTER,
        NORTH,
        EAST,
        SOUTH,
        WEST
    }
}
