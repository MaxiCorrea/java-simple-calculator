package model;

public class Calculator {

  private String display;
  private Double numerator;
  private Double denominator;
  private Function function;
  private Double ans;

  public Calculator() {
    display = "";
    numerator = null;
    denominator = null;
    function = null;
    ans = null;
  }

  public void pressButton(Button button) {
    button.action(this);
  }

  void pressNumber(String n) {
    setDisplay(n);
    if (function != null) {
      denominator = Double.valueOf(getDisplayText());
    } else {
      numerator = Double.valueOf(getDisplayText());
    }
  }

  void clearDisplay() {
    numerator = null;
    denominator = null;
    function = null;
    display = "";
  }

  void setFunction(Function function) {
    this.function = function;
    this.display = "";
  }

  void executeFunction() {
    if (denominator != null) {
      display = removeUnnecessaryZeros(function.execute());
      ans = Double.valueOf(display);
      function = null;
    }
  }

  void setDisplay(String text) {
    text = removeUnnecessaryZeros(text);
    removeInfinityOrNaN();
    if (display.isEmpty()) {
      display = text;
    } else {
      display += text;
    }
  }

  String removeUnnecessaryZeros(String s) {
    if (s.endsWith(".0")) {
      s = s.substring(0, s.indexOf('.'));
    }
    return s;
  }

  void removeInfinityOrNaN() {
    if (display.equals("NaN") || display.equals("Infinity")) {
      display = "";
    }
  }

  void ans() {
    if (ans != null) {
      pressNumber(ans.toString());
    }
  }

  Number getNumerator() {
    return numerator;
  }

  Number getDenominator() {
    return denominator;
  }

  void delete() {
    removeInfinityOrNaN();
    if (display.length() == 1) {
      display = "";
    } else if (display.length() > 1) {
      display = display.substring(0, display.length() - 1);
      updateCurrentNumberDisplayed();
    }
  }

  void updateCurrentNumberDisplayed() {
    if (function == null) {
      if (numerator != null) {
        numerator = Double.valueOf(display);
      }
    } else {
      if (denominator != null) {
        denominator = Double.valueOf(display);
      }
    }
  }

  public String getDisplayText() {
    return display;
  }

}
