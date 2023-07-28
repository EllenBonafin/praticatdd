
  abstract class money{
    protected int amount;

    public boolean equals(Object object) {
      money moneys = (money) object;
      return amount == moneys.amount&& getClass().equals(moneys.getClass());
    }
    protected String currency;

    static money dollars(int amount) {
      return new dollar(amount, "USD");
    }

    static money francs(int amount) {
      return new franc(amount, "CHF");
    }


    Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
    }
  

    abstract money times(int multiplier);

    String currency() {
      return currency;
    }

    public boolean equals(Object object) {
      money money = (money) object;
      return amount == money.amount && getClass().equals(money.getClass());
    }
  
    

