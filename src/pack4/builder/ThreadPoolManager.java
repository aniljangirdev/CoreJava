package pack4.builder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolManager {

    private static ThreadPoolManager instance;

    private final ExecutorService executorService;

    private ThreadPoolManager() {
        executorService = Executors.newFixedThreadPool(10);
    }

    public static synchronized ThreadPoolManager getInstance() {
        if (instance == null)
            instance = new ThreadPoolManager();
        return instance;
    }

    public void executeTask(Runnable runnable) {
        this.executorService.execute(runnable);
    }

    public void shutdown() {
        this.executorService.shutdown();
    }


}
