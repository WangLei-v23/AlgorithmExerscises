package SouthWind.s017;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> task = new FutureTask<>(myCallable);
        new Thread(task).start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("Mycallable start-------end");
        return "Mycallable success finished";
    }
}
