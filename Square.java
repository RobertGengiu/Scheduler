/**
*Calculeaza n^2
*/
public class Square extends Proces {

    public Square(int weight, String type) {
        super(weight, type);
    }
    @Override
    public void compute() {
        this.value = this.x * this.x;
    }
}
