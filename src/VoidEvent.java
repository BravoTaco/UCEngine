import java.util.ArrayList;

public class VoidEvent {
    private final ArrayList<VoidEventListener> listeners = new ArrayList<>();

    public void addListener(VoidEventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(VoidEventListener listener) {
        listeners.remove(listener);
    }

    public void invoke() {
        listeners.forEach(VoidEventListener::onInvoke);
    }
}
