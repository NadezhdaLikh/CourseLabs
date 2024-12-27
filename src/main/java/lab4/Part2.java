package lab4;

public class Part2 {
    public void checkSortAsc(int[] array) {
        boolean isSortedAsc = true;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1]) {
                isSortedAsc = false;
                break;
            }
        }
        if (isSortedAsc) {
            System.out.println("OK");
        } else System.out.println("Please, try again");
    }

    public int[] stringArrToIntArr(String[] stringArr) {
        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        return intArr;
    }

    public int[] swapFirstAndLast(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        return array;
    }

    public void findFirstUnique(int[] array) {
        int firstUnique = 0; // default value for int type variables
        boolean isUnique = false;
        for (int i = 0; i < (array.length - 1); i++) {
            if (!isUnique) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] != array[j]) {
                        firstUnique = array[i];
                        isUnique = true;
                    } else {
                        isUnique = false;
                        break;
                    }
                }
            } else break;
        }

        if (isUnique) {
            System.out.println("Первое уникальное число в данном массиве: " + firstUnique);
        } else System.out.println("В данном массиве нет уникальных чисел.");
    }

    /*public int[] sortAsc(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }*/

    public int[] mergeSort(int[] array) {
        if (array == null) {
            return null;
        }

        if (array.length <= 1) {
            return array;
        }

        int middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[middle++];
        }

        return merge(mergeSort(left), mergeSort(right));
    }

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int resPos = 0;
        int leftPos = 0;
        int rightPos = 0;

        while (leftPos < left.length && rightPos < right.length) {
            result[resPos++] = left[leftPos] < right[rightPos] ? left[leftPos++] : right[rightPos++];
        }

        while (resPos < result.length) {
            result[resPos++] = leftPos != left.length ? left[leftPos++] : right[rightPos++];
        }

        return result;
    }
}
