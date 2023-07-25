class franc extends money {   
    franc(int amount) {      
       this.amount= amount;
     }					
     money times(int multiplier)  {      
        return new franc(amount * multiplier);					
     }   
 }