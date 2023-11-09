import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Задание ?Калькулятор?");
//        Calculator calc = Calculator.instance.get();
//
//        int a = calc.plus.apply(1, 2);
//        int b = calc.minus.apply(1, 1); // в примере  "1-1" будет b = 0. На 0 делить нельзя. Нужно обработать это исключение
//        int c = calc.devide.apply(a, b);
//
//        calc.println.accept(c);
//        /////////////////////////////////////////////////
//        System.out.println("Задание ?Воркер?");
//        Worker.OnTaskDoneListener listener = System.out::println;
//        Worker.OnTaskErrorListener errorListener = System.out::println;
//        Worker worker = new Worker(listener, errorListener);
//        worker.start();
//        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
//        System.out.println(count);
        int[] input = {60, 70, 80, 90, 100};

//        List<Integer> result = new ArrayList<>();
        int count = 0;
        List<Integer> result = Arrays.stream(input).
                filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);

//        for (int x : input) {
//            if (x >= 90) continue;{
//            x += 10;
//            count++;
//        } if (count > 3 ) break;{
//            result.add(x);
//            }
//            }
//        System.out.println(result);
            
        
    }


}