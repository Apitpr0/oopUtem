package exe.three;

/**
 * This is the interface that we will be using
 * to convert from the number from Imperial to Metric
 * @author Muhammad Afiq Muhaimin
 */
public interface MetricConversion {
    double convertFtToMeter(int feet);
    double convertMileToKm(int mile);
    double convertPoundToKg(int pound);
}
