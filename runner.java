public class runner{
    public static void main(String[]args){
        InterfaceA partnerA = (a,b)-> {
            System.out.printf("'%.3f'%n",a/b);
        };
        partnerA.returnQuotient(5f, 3f);
        
        InterfaceB partnerB = (a)->{
            return (a == (Math.sqrt(a)*Math.sqrt(a)));
        };
        System.out.println(partnerB.isPerfectSquare(4f));


    }
     interface InterfaceA{
        public void returnQuotient(float a, float b);
    }
    interface InterfaceB{
        public boolean isPerfectSquare(float a);
    }
}