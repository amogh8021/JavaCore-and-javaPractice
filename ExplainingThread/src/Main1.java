import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i <100 ; i++) {
            int finalI = i;
        executorService.submit(()->{
                System.out.println("this is thread" + finalI);
            });
        }


        executorService.shutdown();





    }
}
