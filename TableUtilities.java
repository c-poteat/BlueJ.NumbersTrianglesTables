 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String count = "";
          for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
            count = count + String.format("%3d ", i*j) + "|";
            }
            count = count + "\n";
        }
        return count;
   }
}
