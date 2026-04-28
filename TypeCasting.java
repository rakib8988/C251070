public class TypeCasting{
	public static void main(String args[]){
		int myScore=555;
		double maxScore=1000;

		double percentage = (double) myScore / maxScore * 100d;

		System.out.println(percentage);
	}
}