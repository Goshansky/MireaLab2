package pr4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        // Создаем пул потоков с фиксированным количеством потоков
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//
//        // Подаем задачи на выполнение
//        for (int i = 0; i < 10; i++) {
//            Runnable task = new MyTask(i);
//            executor.execute(task);
//        }
//
//        // Останавливаем пул потоков после выполнения всех задач
//        executor.shutdown();


        MyExecutorService executor = new MyExecutorService(5); // Создаем пул из 5 потоков
        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executor.execute(task); // Подаем на выполнение 10 задач
        }
        executor.shutdown(); // Останавливаем пул потоков после выполнения всех задач

    }
}
