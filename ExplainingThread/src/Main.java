import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("easiest way to make thread using runnable intrefaces with lambda function");
        Thread t1 = new Thread(()->{
            System.out.println("this is first thread");
        });

        Thread t2 = new Thread(()->{
            System.out.println("this is second thread");
        });


        t1.start();
        t2.start();





    }
}