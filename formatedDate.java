import java.text.SimpleDateFormat;
import java.util.Date;

public class formatedDate {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd/M/yyy");
        Date d = new Date();
        String formateDate = date.format(d);
        System.out.println(formateDate);

    }
}
