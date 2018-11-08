package Calc;

public class Calculation {
	public int Calc(int num,String operator,int num2) {
		int result = 0;
		if(operator=="+") {
			result = num + num2;
		}else if(operator=="-") {
			result = num - num2;
		}else if(operator=="*")	{
			result = num * num2;
		}else if(operator=="/")	{
			result = num / num2;
		}
		return result;
	}
}
