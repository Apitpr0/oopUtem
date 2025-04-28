package exe.three;

/**
 * This class is responsible for the calculation of the
 * imperial -> metric
 * @author Muhammad Afiq Muhaimin
 */
public class MetricConverter implements MetricConversion, MetricFactor {

    /**
     * Implement method override for each of the number
     * that we have declared in MetricFactor.java
     * @param feet
     * @return Meter
     */
    public double convertFtToMeter(int feet) {
        return feet * MetricFactor.lengthFactor;
    }

    /**
     *
     * @param mile
     * @return KM
     */

    public double convertMileToKm(int mile) {
        return mile * MetricFactor.distanceFactor;
    }

    /**
     * @param pound
     * @return KG
     */

    public double convertPoundToKg(int pound) {
        return pound * MetricFactor.weightFactor;
    }
}
