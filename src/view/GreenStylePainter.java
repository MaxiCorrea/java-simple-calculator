package view;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import java.awt.Color;
import javax.swing.JPanel;

public class GreenStylePainter {

  private static final Color BACK_GREEN = new Color(0, 80, 71);
  private static final Color GREEN = new Color(0, 97, 87);

  private Window window;

  public GreenStylePainter(Window window) {
    this.window = window;
    greenBackground();
    blackClearEntryButton();
    blackDelButton();
    greenButtons();
    whiteEqualButton();
  }

  private void greenBackground() {
    window.getContentPane().getComponent(0).setBackground(BACK_GREEN);
    window.getContentPane().getComponent(1).setBackground(BACK_GREEN);
  }

  private void blackClearEntryButton() {
    JPanel panel = (JPanel) window.getContentPane().getComponent(1);
    panel.getComponent(0).setBackground(BLACK);
    panel.getComponent(0).setForeground(WHITE);
  }

  private void blackDelButton() {
    JPanel panel = (JPanel) window.getContentPane().getComponent(1);
    panel.getComponent(1).setBackground(BLACK);
    panel.getComponent(1).setForeground(WHITE);
  }

  private void greenButtons() {
    JPanel panel = (JPanel) window.getContentPane().getComponent(1);
    for (int i = 2; i < 19; ++i) {
      panel.getComponent(i).setBackground(GREEN);
      panel.getComponent(i).setForeground(WHITE);
    }
  }

  private void whiteEqualButton() {
    JPanel panel = (JPanel) window.getContentPane().getComponent(1);
    panel.getComponent(19).setBackground(WHITE);
    panel.getComponent(19).setForeground(BLACK);
  }

  public Window getWindow() {
    return window;
  }

}
