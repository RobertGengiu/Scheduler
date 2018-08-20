/**
*Calculea n^3
*/
public class Cube extends Proces {

    public Cube(int weight, String type) {
        super(weight, type);
    }

    @Override
    public void compute() {
        this.value = this.x * this.x * this.x;
    }
}
