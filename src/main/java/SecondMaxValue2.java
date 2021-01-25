public class SecondMaxValue2 implements SecondMaxValue {

    public Integer findSecondMaxValue(Iterable<Integer> input) {

        validateInput(input);
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

    private void validateInput(Iterable<Integer> input) {
        if (input == null) {
            throw new NullPointerException("Input is NULL");
        } else if (sizeList(input) <= 2) {
            throw new IllegalArgumentException("Size <= 2");
        }

    }

    private int sizeList(Iterable<Integer> input) {
        int size = 0;
        for (Integer amount : input) {
            size++;
        }
        return size;
    }
}