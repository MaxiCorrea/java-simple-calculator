package app;

import javax.swing.SwingUtilities;
import model.Calculator;
import view.GreenStylePainter;
import view.Window;

public class Main {

  private final Calculator calculator;

  public Main() {
    calculator = new Calculator();
    startUserInterface();
  }

  private void startUserInterface() {
    SwingUtilities.invokeLater(() -> {
      new GreenStylePainter(new Window(calculator)).getWindow().setVisible(true);
    });
  }

  public static void main(String[] args) {
    new Main();
  }
}
