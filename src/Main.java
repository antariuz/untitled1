import java.util.Arrays;

public class Main {

    private static Integer[] merge(Integer[] a, Integer p, Integer q, Integer r) {
        Integer[] newA = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = p; j < q; j++) {
                for (int k = q; k < r; k++) {
                    if (newA[i] == null) newA[i] = Math.min(a[j], a[k]);
                    else newA[i] = Math.min(newA[i], Math.min(a[j], a[k]));
                }
            }
        }
        return newA;
    }

    public static void main(String[] args) {

        Integer[] array = {2,4,5,6,1,2,3,6};
        Integer[] newA = merge(array, 0, 4, array.length);
        System.out.println(Arrays.toString(newA));

    }

}
