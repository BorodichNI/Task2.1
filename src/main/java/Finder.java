public class Finder {

    public static void main(String[] args) {

        AggregateList list1 = new AggregateList();


//        for (int i : list1.AggregateList()) {
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");

        SecondMaxValue2 secondMaxValue2 = new SecondMaxValue2();
        try {
            System.out.println(secondMaxValue2.findSecondMaxValue(list1.AggregateList()));
        } catch (NullPointerException | IllegalInputException e) {
            System.err.println(e.getMessage());
        }

        SecondMaxValue1 secondMaxValue1 = new SecondMaxValue1();
        try {
            System.out.println(secondMaxValue1.findSecondMaxValue(list1.AggregateList()));
        } catch (NullPointerException | IllegalInputException e) {
            System.err.println(e.getMessage());
        }
    }

}
