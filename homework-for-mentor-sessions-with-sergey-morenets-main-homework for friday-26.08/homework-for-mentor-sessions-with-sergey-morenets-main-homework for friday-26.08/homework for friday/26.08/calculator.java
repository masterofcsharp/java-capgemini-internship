package capgemini.lecture1;

//Thread-safe

//TODO implement all other operations (-, /, *) and add unit-tests
public class Calculator {

    public long sum(int firstOp, int secondOp) {
        return (long) firstOp + secondOp;
    }

public double product(int num1, int num2) {
return (double) num1 * num2;
}

public double division (int num1, int num2) {
return 1.0 * num1 / num2;
}

public subtraction (int num1, int num2) {
return (long) num1 - num2;
}
}
