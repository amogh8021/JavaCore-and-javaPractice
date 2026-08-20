import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServices{
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(()->{
            System.out.println("task is running aschronously in the thread" +Thread.currentThread().getName());
        });

        service.shutdown();

    }


}

