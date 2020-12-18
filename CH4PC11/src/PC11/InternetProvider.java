package PC11;
public class InternetProvider {
    public static void main(String[] args) {
        InternetProv A = new InternetProv(30, "a");
        InternetProv B = new InternetProv(30, "b");
        InternetProv C = new InternetProv(30, "c");
        A.findPrice();
        B.findPrice();
        C.findPrice();
       System.out.println(A.ReturnPrice());
       System.out.println(B.ReturnPrice());
       System.out.println(C.ReturnPrice());
        
       A.findSavings();
       B.findSavings();
       C.findSavings();
       System.out.println(A.ReturnSavings());
       System.out.println(B.ReturnSavings());
       System.out.println(C.ReturnSavings());
       
       
       
         }
    }
    

