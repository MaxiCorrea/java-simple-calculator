package test.endtoend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import app.Main;

public class CalculatorEndToEndTest {

  private CalculatorDriver driver;

  @Before
  public void initialize() {
    driver = new CalculatorDriver();
    Main.main(new String[] {});
  }

  @Test
  public void sumWithADigitInTheNumberAndInTheDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInAddButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("6");
  }

  @Test
  public void sumWithATwoDigitNumeratorAndOneDigitDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInDigitButton(4);
    driver.clickInAddButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("37");
  }
  
  @Test
  public void sumWithATwoDigitDenominatorAndOneDigitNumerotor() {
    driver.clickInDigitButton(3);
    driver.clickInAddButton();
    driver.clickInDigitButton(3);
    driver.clickInDigitButton(4);
    driver.clickInEqualButton();
    driver.displayNumber("37");
  }
  
  
  @Test
  public void subtractWithADigitInTheNumberAndInTheDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInSubtractButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("0");
  }
  
  @Test
  public void subtractWithATwoDigitNumeratorAndOneDigitDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInDigitButton(3);
    driver.clickInSubtractButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("30");
  }

  @Test
  public void subtractWithATwoDigitDenominatorAndOneDigitNumerotor() {
    driver.clickInDigitButton(3);
    driver.clickInSubtractButton();
    driver.clickInDigitButton(3);
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("-30");
  }
  
  @Test
  public void multiplyWithADigitInTheNumberAndInTheDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInMultiplyButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("9");
  }

  @Test
  public void multiplyWithATwoDigitNumeratorAndOneDigitDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInDigitButton(3);
    driver.clickInMultiplyButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("99");
  }
  
  @Test
  public void multiplyWithATwoDigitDenominatorAndOneDigitNumerotor() {
    driver.clickInDigitButton(3);
    driver.clickInMultiplyButton();
    driver.clickInDigitButton(2);
    driver.clickInDigitButton(2);
    driver.clickInEqualButton();
    driver.displayNumber("66");
  }
  
  @Test
  public void divisionWithADigitInTheNumberAndInTheDenominator() {
    driver.clickInDigitButton(3);
    driver.clickInDivideButton();
    driver.clickInDigitButton(3);
    driver.clickInEqualButton();
    driver.displayNumber("1");
  }
  
  @Test
  public void theDivisionOfAPositiveNumberOverZeroIsInfinite() {
    driver.clickInDigitButton(5);
    driver.clickInDivideButton();
    driver.clickInDigitButton(0);
    driver.clickInEqualButton();
    driver.displayNumber("Infinity");
  }
  
  @Test
  public void theDivisionOfZeroDividedZeroIsNaN() {
    driver.clickInDigitButton(0);
    driver.clickInDivideButton();
    driver.clickInDigitButton(0);
    driver.clickInEqualButton();
    driver.displayNumber("NaN");
  }
  
  @Test
  public void shouldCleanTheDisplay() {
    driver.clickInDigitButton(3);
    driver.clickInClearEntryButton();
    driver.displayNumber("");
  }

  @Test
  public void shouldRemoveTheDigitToTheRightOfTheDisplay() {
    driver.clickInDigitButton(4);
    driver.clickInDigitButton(7);
    driver.clickInDelButton();
    driver.displayNumber("4");
  }
  
  @Test
  public void deleteInEmptyDisplay() {
    driver.clickInDigitButton(1);
    driver.clickInDelButton();
    driver.clickInDelButton();
  }
  
  @Test 
  public void simpleANSOperation() {
    driver.clickInDigitButton(4);
    driver.clickInMultiplyButton();
    driver.clickInDigitButton(2);
    driver.clickInEqualButton();
    driver.clickInAnsButton();
    driver.displayNumber("88");
    driver.clickInAnsButton();
    driver.displayNumber("888");
  }
  
  @Test
  public void whenInfinityIsBeingShownDELErasesItCompletely() {
    driver.clickInDigitButton(8);
    driver.clickInDivideButton();
    driver.clickInDigitButton(0);
    driver.clickInDelButton();
    driver.displayNumber("");
  }
  
  @Test
  public void whenNaNIsBeingShownDELErasesItCompletely() {
    driver.clickInDigitButton(0);
    driver.clickInDivideButton();
    driver.clickInDigitButton(0);
    driver.clickInDelButton();
    driver.displayNumber("");
  }
  
  @After
  public void closeApp() {
    driver.dispose();
  }

}
