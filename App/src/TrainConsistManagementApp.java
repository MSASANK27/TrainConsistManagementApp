import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC3 - Track Unique Bogie IDs");

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println("Final Unique Bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("\nUC3 operations completed successfully...");
    }
}