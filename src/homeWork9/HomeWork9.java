package homeWork9;
import java.util.*;
public class HomeWork9 {

    public static void main(String[] args) {
        String str = "milk, bread, milk, cheese,   cheese.";
        printSet(str);
    }
    private static String printSet(String str) {
        str = str.replaceAll(" ", "").replaceAll("\\.","");
        List<String> list = new ArrayList<>();
        list = Arrays.stream(str.split(",")).toList();

        Set<String> setlist = new HashSet<String>(list);
        for (String l : setlist)
        {
            l = l.substring(0, 1).toUpperCase() + l.substring(1);
            System.out.println(l);
        }
        return null;
    }
}











































