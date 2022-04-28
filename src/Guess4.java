import javax.swing.*;
import java.sql.SQLOutput;

public class Guess4 {

    public static void main(String[] args) throws java.io.IOException {

        char ch, ignore, answer = 'K';
        int[] ar1 = new int[5];
        int ar2[] = new int[5];
        int[] ar3[] = new int[5][5];

        // новый коммент

        // еще один коммент

        do {

            System.out.println("задумана буква из диапазона а-з");
            System.out.println("попытайтесь ее угадать");

            ch = (char) System.in.read();

            String sql = "select * from t1 where true";

//            do {
//                ignore = (char) System.in.read();
//            } while (ignore != '\n');

            if (ch == answer) System.out.println("правильно");
            else {
                System.out.println("нужна буква находится находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("повторите попытку\n");
            }

        } while (answer != ch);

    }

}
