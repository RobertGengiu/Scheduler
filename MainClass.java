/**
*Clasa principala care deschide fisierul de citire, creeaza vectorul de procese
*Parametrii functiei main sunt fisierele de intrare, si respectiv, iesire
*In main se apeleaza tipul de planificator, cu numerele incarcate  
*/

import java.io.*;
public class MainClass {


    public static void main(String[] args) throws IOException {
        FileRead F = new FileRead(args[0]);
        if(F.CacheType.equals("NoCache")) {
            Proces[] Procese = new Proces[F.NumberOfEvents];
            NoCache.load(F, Procese);
            NoCache.execute(F, Procese, args[1]);

        }
      
    }
}

