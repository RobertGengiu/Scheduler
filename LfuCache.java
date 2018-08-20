import java.io.IOException;

public class LfuCache extends CacheType {
    public static void execute(FileRead F, Proces[]Procese, String out) throws IOException {
        if(F.SchedulerType.equals("RandomScheduler")) {
            SchedulerType.random(F, Procese, out);
        }

        if(F.SchedulerType.equals("RoundRobinScheduler")) {
            SchedulerType.round(F, Procese, out);
        }

        if(F.SchedulerType.equals("WeightedScheduler")) {
            SchedulerType.weighted(F, Procese, out);
        }
    }
}