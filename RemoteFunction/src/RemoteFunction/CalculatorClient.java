package RemoteFunction;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			CalculatorInterface calculator = (CalculatorInterface) registry.lookup("CalculatorInterface");
			int a=10;
			int b=10;
			int result = calculator.add(a, b);
			System.out.println("Résultat :"+result);
		} catch(Exception e) {
			System.err.println("Error occured in Calculatorclient : "+e);
		}
	}

}