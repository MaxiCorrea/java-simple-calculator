package view;

import static java.awt.Font.BOLD;
import static java.awt.Font.SANS_SERIF;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import model.Button;
import model.Calculator;

public class Window extends JFrame {

  private static final long serialVersionUID = 1L;

  public static final String MAIN_WINDOW = "Window";
  public static final String APPLICATION_TITLE = "Calculator";
  public static final String DISPLAY = "Display";

  private JTextField display;
  private Calculator calculator;

  public Window(Calculator calculator) {
    this.calculator = calculator;
    setTitle(APPLICATION_TITLE);
    setName(MAIN_WINDOW);
    setSize(250, 320);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    fillContentPane(makeDisplay(), makeControls());
    setLocationRelativeTo(null);
    setResizable(false);
  }

  private void fillContentPane(JPanel display, JPanel controls) {
    final Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(display, BorderLayout.NORTH);
    contentPane.add(controls, BorderLayout.CENTER);
  }

  private JPanel makeDisplay() {
    display = new JTextField();
    display.setName(DISPLAY);
    display.setFont(new Font(SANS_SERIF, BOLD, 25));
    display.setPreferredSize(new Dimension(225, 50));
    display.setHorizontalAlignment(JTextField.RIGHT);
    display.setEditable(false);
    JPanel panel = new JPanel();
    panel.add(display);
    return panel;
  }

  private JPanel makeControls() {
    JPanel controlsPanel = new JPanel();
    final int GRID_ROWS = 5;
    final int GRID_COLS = 4;
    controlsPanel.setLayout(new GridLayout(GRID_ROWS, GRID_COLS, 5, 5));
    for (Button b : Button.values()) {
      controlsPanel.add(makeButton(b));
    }
    controlsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
    return controlsPanel;
  }

  private JButton makeButton(Button button) {
    JButton btn = new JButton(button.toString());
    btn.setName(button.toString());
    btn.setFocusPainted(false);
    btn.setBorder(null);
    btn.addActionListener((ActionEvent e) -> {
      calculator.pressButton(button);
      display.setText(calculator.getDisplayText());
    });
    return btn;
  }

}
