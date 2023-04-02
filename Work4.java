import java.util.ArrayList;
import java.util.Arrays;
public class Work4 {
    public static void main(String[] args) {

        ArrayList munja = new ArrayList();

        munja.add("Life");
        munja.add("is");
        munja.add("too");
        munja.add("short");

        String result = String.join(" ",munja);
        System.out.println(result);

    }
}
