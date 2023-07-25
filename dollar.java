class dollar extends money {
    dollar(int amount) {
      this.amount = amount;
    }			
    dollar times(int multiplier) {
      return new dollar(amount * multiplier);
    }
  }