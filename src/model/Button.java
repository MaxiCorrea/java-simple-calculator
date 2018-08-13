package model;

public enum Button {

  CLEAR {
    @Override
    void action(Calculator calculator) {
      calculator.clearDisplay();
    }

    @Override
    public String toString() {
      return "C/E";
    }
  },

  DEL {
    @Override
    void action(Calculator calculator) {
      calculator.delete();
    }

    @Override
    public String toString() {
      return "DEL";
    }
  },

  PER {
    @Override
    void action(Calculator calculator) {}

    @Override
    public String toString() {
      return "%";
    }
  },

  DIV {
    @Override
    void action(Calculator calculator) {
      calculator.setFunction(new Function() {
        @Override
        public String execute() {
          Double a = calculator.getNumerator().doubleValue();
          Double b = calculator.getDenominator().doubleValue();
          return String.valueOf(a / b);
        }
      });
    }

    @Override
    public String toString() {
      return "/";
    }
  },

  SEVEN {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "7";
    }
  },

  EIGHT {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "8";
    }
  },

  NINE {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "9";
    }
  },

  MUL {
    @Override
    void action(Calculator calculator) {
      calculator.setFunction(new Function() {
        @Override
        public String execute() {
          Integer a = calculator.getNumerator().intValue();
          Integer b = calculator.getDenominator().intValue();
          return String.valueOf(a * b);
        }
      });
    }

    @Override
    public String toString() {
      return "x";
    }
  },

  FOUR {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "4";
    }
  }

  ,
  FIVE {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "5";
    }
  },

  SIX {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "6";
    }
  },

  SUB {
    @Override
    void action(Calculator calculator) {
      calculator.setFunction(new Function() {
        @Override
        public String execute() {
          Integer a = calculator.getNumerator().intValue();
          Integer b = calculator.getDenominator().intValue();
          return String.valueOf(a - b);
        }
      });
    }

    @Override
    public String toString() {
      return "-";
    }
  },

  ONE {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "1";
    }
  },

  TWO {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "2";
    }
  },

  THREE {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "3";
    }
  },

  ADD {
    @Override
    void action(Calculator calculator) {
      calculator.setFunction(new Function() {
        @Override
        public String execute() {
          Integer a = calculator.getNumerator().intValue();
          Integer b = calculator.getDenominator().intValue();
          return String.valueOf(a + b);
        }
      });
    }

    @Override
    public String toString() {
      return "+";
    }
  },

  ZERO {
    @Override
    void action(Calculator calculator) {
      calculator.pressNumber(toString());
    }

    @Override
    public String toString() {
      return "0";
    }
  },

  DOT {
    @Override
    void action(Calculator calculator) {}

    @Override
    public String toString() {
      return ".";
    }
  },

  ANS {
    @Override
    void action(Calculator calculator) {
      calculator.ans();
    }

    @Override
    public String toString() {
      return "ANS";
    }
  },

  EQUAL {
    @Override
    void action(Calculator calculator) {
      calculator.executeFunction();
    }

    @Override
    public String toString() {
      return "=";
    }
  };

  abstract void action(Calculator calculator);

}
