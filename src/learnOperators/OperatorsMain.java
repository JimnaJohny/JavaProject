package learnOperators;

public class OperatorsMain {

	public static void main(String[] args) {
		ArithmeticOperators ao = new ArithmeticOperators();
		ao.num1 = 2;
		ao.num2 = 3;
		ao.sumOfNumbers();
		ao.differenceOfNumbers();
		ao.productOFNumbers();
		System.out.println("Values Re-assigned");
		ao.num1 = 10;
		ao.num2 = 5;
		ao.sumOfNumbers();
		ao.differenceOfNumbers();
		ao.productOFNumbers();
		ao.num1 = 8;
		ao.num2 = 3;
		ao.divisionOfNumbers();
		System.out.println("********Assignment Operators*********");
		AssignmentOperators rojy = new AssignmentOperators();
		rojy.addEqualto();
		rojy.minusEqualto();

	}

}
