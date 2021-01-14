public class MaxValue {

    public void value () {
        int size = 10;
        int range = -100;
        int[] arr = new int[size];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (int) (Math.random() * range);
        }
        System.out.println("Массив рандомных чисел: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int indx = 0; indx < arr.length; indx++) {
            if (arr[indx] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[indx];
            } else if (arr[indx] > secondMax) {
                secondMax = arr[indx];
            }
        }
        System.out.println(" ");
        System.out.println("Второе максимальное число: " + secondMax);
    }
}

