import java.util.Arrays;

public class IndexSum {

    public static void findPair(int[] A, int target)
    {
        Arrays.sort(A);
        int least = 0;
        int next = A.length - 1;

        while (least < next)
        {
            if (A[least] + A[next] == target)
            {
                System.out.println("Pair found " + A[least] + ", " + A[next] );
                //return;
            }

            if (A[least] + A[next] < target) {
                least++;
            }
            else {
                next--;
            }
        }

        System.out.println("Pair not found");
    }

    public static void main (String[] args)
    {
        int[] A = { 0, 8, 7, 2, 5, 3,9, 1, 11, 14 };
        int target = 10;

        findPair(A, target);
    }


}

