import java.awt.*;
import java.util.Arrays;
import java.util.Date;


public class ReferenceType {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());

        Point newPoint = new Point();
        String message = "Hello World";
        int[]  numbers ={ 1,2, 4, 4, 10};
        final float PI = 3.14f;
        Arrays.sort(numbers);
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(Arrays.toString(numbers));
        System.out.println(PI);


    }
}
