public class main {
	
	public static void main(String[] args) {
		
		//조건에 맞는지 확인
		
		//식
		Scanner sc  = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 = sc.nextInt();
		
		double answer = (double)num1/num2 * 1000;
		System.out.println((int)answer);
	}
