class franc extends money {   
    franc(int amount, String currency){      
      super(amount, currency);
     }					
     money times(int multiplier)  {      
      return money.francs(amount * multiplier);					
     }   
 }