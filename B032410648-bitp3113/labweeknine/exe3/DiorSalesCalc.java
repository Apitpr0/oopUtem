package exe3;
import java.util.ArrayList;
public class DiorSalesCalc {
    public static double calculateTotalSales(ArrayList<DiorItem> items) {
        double total = 0;
        for (DiorItem item : items) {
            total += item.calculateTotalSales();
        }
        return total;
    }
}
