package Cap5;

public class fibonacci {
	
	int calculaFibonacci(int num)
    {
        if(num==1 || num==2)
            return 1;
        else
            return calculaFibonacci(num-1) + calculaFibonacci(num-2);
    }
	
	int calcularFibonacci2(int num) {
		return (num==1 || num==2) ? 1 : calcularFibonacci2(num-1) + calcularFibonacci2(num-2);
	}

}
