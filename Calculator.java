import java.util.function.*; // для работы калькулятора нужно
// заимпортить все встроенные функциональные интерфейсы

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;

    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> { //обработаем исключение деления на 0
        try {
            if (y == 0) {
                throw new ArithmeticException("Делить на 0 нельзя");
            } else {
                return x / y;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

            return 0;
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
