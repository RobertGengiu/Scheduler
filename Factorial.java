/**
*Calculeaza n! % 9973
*/
public class Factorial extends Proces {

    public Factorial(int weight, String type) {

        super(weight, type);
    }

    public void compute() {
        if (this.x < 0) {
            this.value = 0;
            return;
        }

        this.value = 1;

        if (this.x  > 1) {
            for(int i = 1 ; i <= this.x; i++) {
                this.value *= i;
                if(this.value > 9973){
                    this.value %= 9973;
                }
            }
        }
        this.value %= 9973;
    }

}
