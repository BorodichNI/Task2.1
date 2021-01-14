public class Finder {

    public static void main(String[] args) {

        AggregateList list1 = new AggregateList();

//        for (int i : list1.AggregateList()) {
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");

        SecondMaxValue2 secondMaxValue2 = new SecondMaxValue2();
        System.out.println(secondMaxValue2.findSecondMaxValue(list1.AggregateList()));
        System.out.println("--");
        SecondMaxValue1 secondMaxValue1 = new SecondMaxValue1();
        System.out.println(secondMaxValue1.findSecondMaxValue(list1.AggregateList()));
    }

}
