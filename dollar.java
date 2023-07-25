class dollar extends money {
    dollar(int amount) {
      this.amount = amount;
    }			
    money times(int multiplier) {
      return new dollar(amount * multiplier);
    }
  }