class money {
    protected int amount;

    public boolean equals(Object object) {
      money money = (money) object;
      return amount == money.amount;
    }
  }
