/**
* Se verifica daca un numar este prim
* Inputul se seteaza in campul x
* Rezultatul se afla in campul value
*/
public class CheckPrime extends Proces{

    public CheckPrime(int weight, String type) {

        super(weight, type);
    }

    @Override
    public void compute() {


        if (this.x < 2){
            this.value = 0;
            return;
        }
        

        for (int i = 2; i <= this.x / 2 + 1 ; i++) {
            if(this.x % i == 0 && this.x != i){
                this.value = 0;
                return;
            }
        }

        this.value = 1;

    }

}
