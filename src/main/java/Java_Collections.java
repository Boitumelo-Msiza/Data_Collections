import java.util.HashMap;

public class Java_Collections {

    public static int maxUniqueNum(int arr[],
                                   int N, int M)
    {
        int maxUnique = 0;


        for (int i = 0; i < N - M; i++) {
            int currentUnique = 0;

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int k = i; k < i + M; k++) {

                if (!map.containsKey(arr[k])) {
                    map.put(arr[i], 1);
                    currentUnique++;
                    continue;
                }
            }

            if (currentUnique > maxUnique)
                maxUnique = currentUnique;
        }

        return maxUnique;
    }

    public static void main(String[] args)
    {
        int[] arr = { 6, 2, 6, 8, 3, 7, 1, 4, 4 };
        int N = 9;
        int M = 3;

        System.out.println(maxUniqueNum(arr, N, M));
    }
}




