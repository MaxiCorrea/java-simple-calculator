package test.endtoend;

import static java.lang.String.valueOf;
import static model.Button.ADD;
import static model.Button.ANS;
import static model.Button.CLEAR;
import static model.Button.DEL;
import static model.Button.DIV;
import static model.Button.EQUAL;
import static model.Button.MUL;
import static model.Button.PER;
import static model.Button.SUB;
import static view.Window.DISPLAY;
import static view.Window.MAIN_WINDOW;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JButtonDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JTextFieldDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

public class CalculatorDriver extends JFrameDriver {

  @SuppressWarnings("unchecked")
  public CalculatorDriver() {
    super(new GesturePerformer(), new AWTEventQueueProber(), named(MAIN_WINDOW),
        showingOnScreen());
  }

  public void displayNumber(String expectedText) {
    display().hasText(expectedText);
  }
  
  @SuppressWarnings("unchecked")
  private JTextFieldDriver display() {
    return new JTextFieldDriver(this, JTextField.class, named(DISPLAY));
  }
  
  public void clickInClearEntryButton() {
    button(CLEAR.toString()).click();
  }
  
  public void clickInDelButton() {
    button(DEL.toString()).click();
  }
  
  public void clickInPercentageButton() {
    button(PER.toString()).click();
  }
  
  public void clickInAddButton() {
    button(ADD.toString()).click();
  }
  
  public void clickInDivideButton() {
    button(DIV.toString()).click();
  }
  
  public void clickInMultiplyButton() {
    button(MUL.toString()).click();
  }
  
  public void clickInSubtractButton() {
    button(SUB.toString()).click();
  }
  
  public void clickInAnsButton() {
    button(ANS.toString()).click();
  }
 
  public void clickInEqualButton() {
    button(EQUAL.toString()).click();
  }
  
  public void clickInDigitButton(int digit) {
    button(valueOf(digit)).click();
  }
  
  @SuppressWarnings("unchecked")
  private JButtonDriver button(String nameButton) {
    return new JButtonDriver(this, JButton.class , named(nameButton));
  }
  
}
