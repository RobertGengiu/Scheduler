/**
*Se calculeaza al n termen fibonacci %9973
*Termenul este in prealabil setat prin proces.set(X)  
*Valoarea calculata este pastrata in value
*/

public class Fibonacci extends Proces {

    public Fibonacci(int weight, String type) {

        super(weight, type);
    }


    @Override
    public void compute() {
        int a = 0;
        int b = 1;
        int aux;

        if (this.x < 0) {
            this.value = -1;
            return;
        }

        if (this.x == 0) {
            this.value = a;
            return;
        }

        if (this.x == 1) {
            this.value = b;
            return;
        }

        for(int i = 2; i <= this.x; i++ ) {
            aux = b;
            b += a;
            a = aux;
            if( a > 9973) {
                a = a % 9973;
            }
        }

        this.value = b % 9973;
        return;

    }

}
