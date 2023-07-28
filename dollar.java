class dollar extends money {
   dollar(int amount, String currency){
      super(amount, currency);
    }			
    money times(int multiplier) {
      return money.dollars(amount * multiplier);
    }
  }