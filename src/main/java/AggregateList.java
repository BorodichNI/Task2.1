import java.util.*;

public class AggregateList {

    public List<Integer> aggregateList() {
        int size = 0;
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter array length: ");

        try {
            size = scannerInput.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("You entered not an integer");
            System.exit(0);
        }

        List<Integer> numberList = new ArrayList<>();
        System.out.println("Insert array elements:");

        try {
            for (int index = 0; index < size; index++) {
                numberList.add(scannerInput.nextInt());
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong input (Enter number)");
            System.exit(0);
        }
        return numberList;
    }
}