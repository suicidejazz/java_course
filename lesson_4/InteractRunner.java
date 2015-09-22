import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "N";
			while(!exit.equals("Y")){
				System.out.println("Enter arg[1]: ");
				String num1 = reader.next();
				System.out.println("Enter arg[2]: ");
				String num2 = reader.next();
				calc.add(Double.valueOf(num1), Double.valueOf(num2));
				System.out.println("Result : "+calc.getResult());
				calc.cleanResult();
				System.out.println("Exit Y/N ?");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}	
	}	
}