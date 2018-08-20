/**
*Calculeaza partea intreaga a radicalui din modului unui numar
*/
public class Sqrt extends Proces {

    public Sqrt(int weight, String type) {
        super(weight, type);
    }

    @Override
    public void compute() {
        this.value = (int) Math.floor(Math.sqrt(Math.abs(this.x)));
    }

}
