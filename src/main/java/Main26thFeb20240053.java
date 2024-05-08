import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Main26thFeb20240053 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("The task was run by " + Thread.currentThread());
        var start = Instant.now();
        IntStream.rangeClosed(1, 100)
                .boxed()
                .parallel()
                .map(i -> Thread.ofVirtual()
                        .name("my-virtual-thread-" + i)
                        .unstarted(runnable))
                .forEach(thread -> {
                    thread.start();
                    try {
                        Thread.sleep(1000);
//                        thread.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
        var end = Instant.now();
        var duration = Duration.between(start, end);
        System.out.println(duration.getSeconds());
    }
}
