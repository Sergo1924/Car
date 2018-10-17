import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sergo on 17.10.2018.
 */
public class Main {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
    public static void main(String[] args) throws ParseException {

        List<Zabor> cars =new ArrayList();
        for (int i = 0; i < 100; i++) {
            cars.add(new Zabor("900"+i, sdf.parse("28.09.18"), 35+i, 45, "0897"+i));
        }
        for (Zabor z: cars) {
            System.out.println(z);
        }
    }
}
