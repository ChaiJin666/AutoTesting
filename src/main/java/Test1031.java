import test999.TaskRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Test1031 {
    public static void main(String []args){
        //创建线程池对象，参数5，表带有5个线程的线程池
        ExecutorService service =Executors.newFixedThreadPool(5);
        TaskRunnable task = new TaskRunnable();
        //从线程池中获取线程对象
        service.submit(task);
        System.out.println("-----------------");
        //再获取一个线程对象
        service.submit(task);
        //关闭线程池
        service.shutdown();

    }
}
