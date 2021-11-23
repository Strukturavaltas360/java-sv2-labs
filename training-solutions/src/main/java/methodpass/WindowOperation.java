package methodpass;

import java.util.List;

public class WindowOperation {

    public void riseSize(List<Window> windows, int plusSize) {

        for (Window window : windows) {
            window.setHeight(plusSize);
        }
    }
}
