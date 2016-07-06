import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Executor executor = new Executor();
        executor.execute(()-> System.out.println("Text printed via lambda"));

        System.out.println();
        System.out.println("Sorting with lambdas");
        System.out.println();

        List<Integer> values = Arrays.asList(1,32,4,2,555,12,3,55,64,3,2,5,43234,422,43,123);
        Collections.sort(values, (o1, o2) -> o1-o2);
        System.out.println("First sort: " +values.toString());
        Collections.sort(values, (o1, o2) -> o2-o1);
        System.out.println("Second sort: " +values.toString());
        Collections.sort(values, (o1, o2) -> {
            if(o1.compareTo(43234) == 0){
                return -1;
            }
            else if(o2.compareTo(43234) == 0){
                return 1;
            }
            return o1 - o2;
        });
        System.out.println("Third sort(with wierd condition): " +values.toString());
    }
}


interface Runner {
    void run();
}

class Executor{
    void execute(Runner r){
        System.out.println("Execute :");
        r.run();
        System.out.println("=========================");
    }
}