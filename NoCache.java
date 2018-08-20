/**
*Aici se alege timpul de Scheduler
* @param1 - fisierul incarcat in memorie
* @param2 - vectorul de procese
* @param3 - fisierul de iesire
*/

import java.io.IOException;

public class NoCache extends CacheType {
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
