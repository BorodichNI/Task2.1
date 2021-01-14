public class SecondMaxValue2 implements SecondMaxValue {

    public Integer findSecondMaxValue(Iterable<Integer> input) {

        if (input.iterator().hasNext()) {
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (Integer item : input) {
                if (item > firstMax) {
                    secondMax = firstMax;
                    firstMax = item;
                } else if (item > secondMax) {
                    secondMax = item;
                }
            }
            return secondMax;
        } else {
            return 0;
        }
    }
}

