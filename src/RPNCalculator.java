import java.io.*;
import java.util.*;
import java.util.function.BinaryOperator;

import java.util.function.Function;
import java.util.regex.Pattern;

public class RPNCalculator {

    //Using Lambda functions in enum, this save me from needing if or switch statement
   private enum Operation {

        ADD("+", (evalqueue) ->
        {
            int x = evalqueue.pop();
            int y = evalqueue.pop();
            return x + y;
        }),
        SUB("-", (evalqueue) ->
        {
            int x = evalqueue.pop();
            int y = evalqueue.pop();
            return y - x;
        }),
        MULT("*", (evalqueue) ->
        {
            int x = evalqueue.pop();
            int y = evalqueue.pop();
            return x * y;
        }),
        DIV("/", (evalqueue) ->
        {
            int x = evalqueue.pop();
            int y = evalqueue.pop();
            return y / x;
        });

       private final Function<Deque<Integer>, Integer> operator;
       private final String symbol;

        // Constructor for the enum takes the value inside and assign them to the variable
       private Operation(String symbol, Function<Deque<Integer>, Integer> operator) {
           this.symbol = symbol;
           this.operator = operator;
       }

       //Calculate the values in the Deque list
       public int calculate(Deque<Integer> evalqueue) {
           return operator.apply(evalqueue);
       }


       public static Operation of(String operationElement) {
           Optional<Operation> operator = findOperatorBySymbol(operationElement);
           return operator.orElse(null);
       }

       //Check is the char is an operation and return a boolean
       public static boolean isAnOperation(String operationElement) {
           Optional<Operation> operator = findOperatorBySymbol(operationElement);
           return operator.isPresent();
       }

        //Find the operation by the symbol in the expression
       private static Optional<Operation> findOperatorBySymbol(String operationElement) {
           return Arrays.stream(values()).filter(op -> op.symbol.equals(operationElement)).findAny();
       }

    }


    public int calculate(String evalinput) {
        if(evalinput.isEmpty()){return 0; }
        Deque<Integer> evalqueue = new ArrayDeque<>();

        //Split the input by Space and Loop through each
        Pattern.compile(" ").splitAsStream(evalinput)
                .forEach(
                        operationElement -> {
                            if (Operation.isAnOperation(operationElement)) {
                                int result = Operation.of(operationElement).calculate(evalqueue);
                                evalqueue.push(result);
                            } else {
                                evalqueue.push(Integer.parseInt(operationElement));
                            }
                        }
                );

        return evalqueue.pop();
    }

}
