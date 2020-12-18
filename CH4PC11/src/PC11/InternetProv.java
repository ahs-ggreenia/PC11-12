
package PC11;
public class InternetProv {
    private String pack;
    private double hours;
    private double price;
    private double savings;


    public InternetProv(double h, String p){
        p = pack; 
        h = hours;
    }


    public void findPrice(){
        double extraHours;
        double extraFee;
        pack = pack.toLowerCase();
        
        if(pack == "c"){
            price = 19.95;
        }else if(pack == "b"){
            
            if(hours > 20){
                extraHours = hours - 20;
                extraFee = extraHours * 1.00; 
                price = 14.95 + extraFee;
            }else{
                price = 14.95;
            }
        }else if (pack == "a"){    
        
            if(hours > 10){
                extraHours = hours - 10;
                extraFee = extraHours * 2.00; 
                price = 9.95 + extraFee;
            }else{
                price = 9.95;
            }
        }
    
    }
    public double ReturnPrice(){
        return price;
    }
    
    public void findSavings(){
        pack = pack.toLowerCase();
        double price2;
        double extraHours;
        double extraFee;
        if(pack == "a"){
        extraHours = hours - 20;
            if(extraHours >= 0){
                extraFee = 1.0 * extraHours;
            }else{
                extraFee = 0;
            }
        price2 = 14.95 + extraFee;
        savings = price - price2;
        }else if(pack == "c"){
            price2 = 19.95;
            savings = price - price;
        }else{
            savings = 0;
        }
    }
        
     public double ReturnSavings(){
        return savings;
    }
        
        
  }
    
    
    
    
    

    

