public class runnerA implements partnerA{
    public static void main(String[] args){
        partnerA pA = (a,b)-> {
            System.out.printf("'%.3f'%n",a/b);
        };
        pA.returnQuotient(5f, 3f);
    }
}