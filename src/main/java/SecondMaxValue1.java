import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMaxValue1 {

    public Integer findSecondMaxValue(List<Integer> inList) throws NullPointerException, IllegalInputException {
        if (inList == null) {
            throw new NullPointerException("Size is incorrect");
        } else if (inList.size() <= 2){
           throw  new IllegalInputException("Size <= 2");
        } else {
            Collections.sort(inList);
            return inList.get(inList.size() - 2);
        }
    }

}