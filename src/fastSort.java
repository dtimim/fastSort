public class fastSort {
    public static void main(String[] args) {
        int[] testArray = new int[]{-336, 433, 368, 58, 6, 649, -64, 1, 61,0};
        fastSort(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }

    public static void fastSort(int[] array) {
        recursionFastSort(array, 0, array.length - 1);
    }


    public static void recursionFastSort(int[] array, int min, int max) {
        if (array.length == 0)
            return;

        if (min >= max)
            return;


        int middle = min + (max - min) / 2;
        int middleElement = array[middle];


        int i = min, j = max;
        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }
            while (array[j] > middleElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (min < j)
            recursionFastSort(array, min, j);

        if (max > i)
            recursionFastSort(array, i, max);
    }
}