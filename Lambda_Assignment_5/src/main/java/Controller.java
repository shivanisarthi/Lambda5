import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        ArrayList<String> listElements = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three", "an", "an", "a"));
        DistinctImpl DistinctString = new DistinctImpl();
        List<String> distinctList = DistinctString.uniqueList.distinctElements(listElements);
        System.out.println(distinctList);


        }
}
