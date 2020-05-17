import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    void arrayList(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++){
           list.add(i);
        }
        System.out.println(list);
    }
}
