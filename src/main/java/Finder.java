public class Finder {

    public static void main(String[] args) {

        AggregateList list1 = new AggregateList();

        SecondMaxValue1 secondMaxValue1 = new SecondMaxValue1();
        try {
            System.out.println(secondMaxValue1.findSecondMaxValue(list1.aggregateList()));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        SecondMaxValue2 secondMaxValue2 = new SecondMaxValue2();
        try {
            System.out.println(secondMaxValue2.findSecondMaxValue(list1.aggregateList()));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}