
  abstract class money{
    protected int amount;

    public boolean equals(Object object) {
      money moneys = (money) object;
      return amount == moneys.amount&& getClass().equals(moneys.getClass());
    }

    static money dollars(int amount) {
      return new dollar(amount);
    }

    static money francs(int amount) {
      return new franc(amount);
    }

    abstract money times(int multiplier);
  }

  
    

