import java.util.Collections;
import java.util.List;

public class SecondMaxValue1 {

    public Integer findSecondMaxValue(List<Integer> inList) {
        validateInput(inList);
        Collections.sort(inList);
        return inList.get(inList.size() - 2);
    }

    private void validateInput(List<Integer> inList) {
        if (inList == null) {
            throw new NullPointerException("Input is NULL");
        } else if (sizeList(inList) <= 2) {
            throw new IllegalArgumentException("Size <= 2");
        }
    }

    private int sizeList(List<Integer> inList) {
        int size = 0;
        for (Integer amount : inList) {
            size++;
        }
        return size;
    }
}