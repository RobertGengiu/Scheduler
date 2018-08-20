/**
*Contine tipurile de planificatoare
*/

import java.io.*;
import java.util.Random;

public class SchedulerType {

/**
*Calculeaza cmmdc dintre cotele proceselor
* @param1 - vectorul de procese
*/
    public static int cmmdc(Proces[] Procese){
        int cmmdc = Procese[0].weight;

        for(int i = 1; i < Procese.length; i++) {
            int copy = Procese[i].weight;
            while(copy != cmmdc) {

                if(copy > cmmdc) {
                    copy -= cmmdc;
                }

                else if(copy < cmmdc) {
                    cmmdc -= copy;
                }
            }
        }

        return cmmdc;
    }

/**
*Planificatorul Random care selecteaza aleatoriu tipul de proces
* @param1 - fisierul incarcat in memorie
* @param2 - vectorul de procese
* @param3 - fisierul de iesire
*/

    public static void random(FileRead F,Proces[] Procese, String out) throws IOException {
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(out)));

        Random randomGenerator = new Random();

        for(int j = 0; j < F.NumberofNumbersToBeProcessed; j++){
            int random = randomGenerator.nextInt(F.NumberOfEvents);
            Procese[random].setX(F.Numbers[j]);
            Procese[random].compute();
            Procese[random].showResult(writer);
        }
        writer.close();
    }

    /**
*Planificatorul Round care selecteaza cate un proces
* @param1 - fisierul incarcat in memorie
* @param2 - vectorul de procese
* @param3 - fisierul de iesire
*/

    public static void round(FileRead F,Proces[] Procese, String out) throws IOException {
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(out)));

        int i = 0;
        while(true) {
            for(int j = 0; j < F.NumberOfEvents; j++){
                if(i == F.NumberofNumbersToBeProcessed) {
                    writer.close();
                    return;
                }
                Procese[j].setX(F.Numbers[i]);
                Procese[j].compute();
                Procese[j].showResult(writer);
                i++;
            }
        }
    }

    /**
*Planificatorul Weighted care selecteaza procesele in functie de cmmdc
* @param1 - fisierul incarcat in memorie
* @param2 - vectorul de procese
* @param3 - fisierul de iesire
*/

    public static void weighted(FileRead F, Proces[] Procese, String out) throws IOException {
        int current = 0;
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(out)));
        int s = 0;
        for (int i = 0; i < F.NumberOfEvents; i++) {

            s += Procese[i].weight;
        }

        int t = cmmdc(Procese);
        int i = 0;

        while (true) {
            for(int j = 0; j < F.NumberOfEvents; j++) {
                for(int k = 0; k <  Procese[j].weight / t; k++) {
                    if(i == F.NumberofNumbersToBeProcessed) {
                        writer.close();
                    return;
                    }
                    Procese[j].setX(F.Numbers[i]);
                    Procese[j].compute();
                    Procese[j].showResult(writer);
                    i++;
                }
            }
        }
    }

}
