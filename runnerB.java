public class runnerB{
public static void main(String[]args){
	partnerB pB = (a)->{
		return (a == (Math.sqrt(a)*Math.sqrt(a)));
	};
	System.out.println(pB.isPerfectSquare(16f));
}
}