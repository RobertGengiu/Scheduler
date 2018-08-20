/**
*Se calculeaza urmatorul numar prim
*Rezultatul se gaseste in value
*/
public class NextPrime extends Proces {

    public NextPrime(int weight, String type) {

        super(weight, type);
    }

    @Override
    public void compute() {
        if(this.x < 0) {
            this.value = 2;
            return;
        }
        CheckPrime prime = new CheckPrime(weight, "CheckPrime");
        int a = this.x;
        prime.setX(a + 1);
        prime.compute();
        while(prime.value == 0)
        {
            a++;
            prime.setX(a);
            prime.compute();
        }

        this.value = prime.x;
    }

}
