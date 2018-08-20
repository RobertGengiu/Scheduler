
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileRead {
    String CacheType;
    int CacheLine;
    String SchedulerType;
    int NumberOfEvents;
    String[] ProccesName;
    int[] Weight;
    int NumberofNumbersToBeProcessed;
    int[] Numbers;

    public FileRead(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        this.CacheType = scanner.next();
        this.CacheLine = scanner.nextInt();
        this.SchedulerType = scanner.next();
        this.NumberOfEvents =scanner.nextInt();
        this.ProccesName = new String[this.NumberOfEvents];
        this.Weight = new int[this.NumberOfEvents];

        for(int i = 0 ; i < this.NumberOfEvents; i++) {
            this.ProccesName[i] = scanner.next();
            this.Weight[i] = scanner.nextInt();
        }

        this.NumberofNumbersToBeProcessed = scanner.nextInt();
        this.Numbers = new int[this.NumberofNumbersToBeProcessed];

        for(int i = 0; i < this.NumberofNumbersToBeProcessed; i++) {
            this.Numbers[i] = scanner.nextInt();
        }
    }
}
