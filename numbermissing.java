public class numbermissing {
    public class cyclicsort {

        public static int sort(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;
                }
            }
            return arr.length;
        }

        static void swap(int[] arr, int num1, int num2) {
            int temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }

        public static void main(String[] args) {
            int[] arr = {4, 0, 2, 1};
            System.out.println(sort(arr));
        }
    }
}

