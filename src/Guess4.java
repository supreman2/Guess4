import javax.swing.*;
import java.sql.SQLOutput;

public class Guess4 {

    public static void main(String[] args) throws java.io.IOException {

        char ch, ignore, answer = 'K';
        int[] ar1 = new int[5];
        int ar2[] = new int[5];
        int[] ar3[] = new int[5][5];

        // ����� �������

        // ��� ���� �������

        do {

            System.out.println("�������� ����� �� ��������� �-�");
            System.out.println("����������� �� �������");

            ch = (char) System.in.read();

            String sql = "select * from t1 where true";

//            do {
//                ignore = (char) System.in.read();
//            } while (ignore != '\n');

            if (ch == answer) System.out.println("���������");
            else {
                System.out.println("����� ����� ��������� ��������� ");
                if (ch < answer) System.out.println("����� � ����� ��������");
                else System.out.println("����� � ������ ��������");
                System.out.println("��������� �������\n");
            }

        } while (answer != ch);

    }

}
