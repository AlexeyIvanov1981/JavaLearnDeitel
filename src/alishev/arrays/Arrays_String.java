package alishev.arrays;

public class Arrays_String {
    public static void main(String[] args) {

//        String[] words = new String[3];

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                for (int k = 1; k <= 4; k++)
                    System.out.print('*');
                System.out.println();
            } // end inner for
            System.out.println();
        } // end outer for

    }
}
