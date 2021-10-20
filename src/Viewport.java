import java.awt.*;
import java.awt.image.BufferStrategy;

public final class Viewport extends Canvas {
    private final Thread graphicsThread;
    private volatile boolean isRunning = false;

    public Viewport() {
        graphicsThread = new Thread(this::graphicsLoop);
        graphicsThread.setName("GraphicsThread");
    }

    private void graphicsLoop() {
        while (isRunning) {
            BufferStrategy bufferStrategy = getBufferStrategy();
            if (bufferStrategy == null) {
                createBufferStrategy(3);
                bufferStrategy = getBufferStrategy();
            }

            Graphics2D g2 = (Graphics2D) bufferStrategy.getDrawGraphics();

            g2.dispose();
        }
    }

    public void start() {
        if (isRunning) return;
        isRunning = true;
        graphicsThread.start();
    }

    public void stop() {
        isRunning = false;
    }
}