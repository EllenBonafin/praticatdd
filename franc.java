class franc extends money {   
    franc(int amount) {      
       this.amount= amount;
     }					
     franc times(int multiplier)  {      
        return new franc(amount * multiplier);					
     }   
 }