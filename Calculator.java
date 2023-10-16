package pk.edu.pucit;

public class calculator {
public int add(int a, int b) {
int result = a + b;
return result;
}
public int multiply(int a, int b) {
int result = a * b;
return result;
}
public int calculate(int x, int y) {
// Some complex calculations here
int intermediateResult = add(x,y);
int finalResult = multiply(intermediateResult, 2);
return finalResult;
}

public static void main(String[] args) {
Calculator calculator = new Calculator();
int result = calculator.calculate(5, 3);
System.out.println("Result: " + result);
}
}
