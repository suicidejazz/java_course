public class Calculator {
	private double result;
	
		public void add(double ... nums){
			this.result=0;
			for (Double num : nums)
			{
				this.result+=num;
			}
		}
		public void sub(double num1, double num2){
			this.result=num1-num2;
		}
		public void pow(double num1, double num2){
			this.result=num1*num2;
		}
		public void div(double num1, double num2){
			if(num2!=0){
				this.result=num1/num2;
			}
			else{
				System.out.println("Number 2 is equal 0, enter negative or positive number");
			}
		}
		public double getResult(){
			return this.result;
		}
		public void cleanResult(){
			this.result=0;
		}
}