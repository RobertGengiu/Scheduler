import java.io.IOException;
import java.io.Writer;

public abstract class Proces {
    int weight;
    String type;
    int value;
    int x;


/**
*Constructor apelat de restul claselor care extind Proces
* @param1 cota
* @param2 numele tipului de proces
*/
    public Proces (int weight, String type) {
        this.weight = weight;
        this.type = type;
        this.value = 0;
        this.x = 0;
        }

/**
*Intoarce tipul de proces
*/
    public String getType() {

        return this.type;
    }

/**
*Intoarce cota unui proces
*/
    public int getWeight() {

        return this.weight;
    }

/**
*Calculeaza valoarea intoarsa de un proces pe un numar
*Metoda este suprascrisa in fiecare proces
*/    
    public abstract void compute();

/**
*Intoarce rezultatul unui proces
*/
    public int getResult() {

        return this.value;
    }

/**
*Seteaza numarul de calculat pentru un proces
*/
    public void setX(int x) {

        this.x = x;
    }

/**
*Scrie rezultatul in fisier 
*/
    public void showResult(Writer writer) throws IOException {

        writer.write(this.x + " " + this.type + " " + this.value + " " + "Computed\n");
    }

}
