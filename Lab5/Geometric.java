public class Geometric extends AbstractSeries {

    private double tot = 0.0;
    private double pow = 0.0;

    public double next() {

        tot+= 1.0 / Math.pow(2.0, pow);
        pow+= 1.0;
        return tot;

    }
}
