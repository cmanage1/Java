public class Arithmetic extends AbstractSeries {

    private double tot = 0.0;
    private double pos = 1.0;

    public double next() {

        tot += pos;
        pos += 1.0;
        return tot;

    }
}
