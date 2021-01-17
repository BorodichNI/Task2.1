public class SecondMaxValue2 implements SecondMaxValue {

    public Integer findSecondMaxValue(Iterable<Integer> input) throws NullPointerException, IllegalInputException {



        if (input == null) {
            throw new NullPointerException("Size is incorrect");
        }

        int size = 0;
        for(Integer amount : input) {
            size++;
        }

        if (size <= 2) {
            throw new IllegalInputException("Size <= 2");
        } else {
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
        }
    }
}

