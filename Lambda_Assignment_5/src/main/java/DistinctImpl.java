
import java.util.stream.Collectors;

public class DistinctImpl {

    public Distinct uniqueList = (listElement) -> {
        return listElement.stream().distinct().collect(Collectors.toList());
    };

}
