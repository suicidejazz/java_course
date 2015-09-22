public class Calculate {
	
		public static void main(String[] arg){
				System.out.println("class Calculate is launched");
				System.out.printf("You entered %.3f & %.3f", Double.parseDouble(arg[0]),Double.parseDouble(arg[1]));
				int first = Integer.valueOf(arg[0]);
				int second = Integer.valueOf(arg[1]);
				int summ = first+second;
				int sub = first-second;
				System.out.println("\nSum is " +summ);
				System.out.println("Subtraction is " +sub);
				funPowDiv(arg);
		}
		public static void funPowDiv(String[] arg){
				System.out.println("funPowDiv is ready to calculate");
				double x = Double.valueOf(arg[0]);
				double y = Double.valueOf(arg[1]);
				System.out.printf("pow(%.3f, %.3f) is %.3f", x, y, Math.pow(x,y));
				System.out.printf("%n%.3f*%.3f) is %.3f", x, y, x*y));
				System.out.printf("%n%.3f / %.3f is %.3f", x, y, x/y);
		}
		
}