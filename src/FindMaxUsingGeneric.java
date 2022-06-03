import java.util.Arrays;
    import java.util.Arrays;

    public class FindMaxUsingGeneric<T extends Comparable<T>> {
        T[] element;

        /**
         * @param element is arrays list of different data type
         */
        public FindMaxUsingGeneric(T[] element) {
            this.element = element;

        }

        /**
         * @param <T>
         * @param element is argument of generic method which contain arrays list.
         * @return max Of arrays list
         */
        public static <T extends Comparable<T>> T maxInArrays(T[] element) {
            Arrays.sort(element);
            System.out.println("Array list elements after sorting: " + Arrays.toString(element));
            int lenght = element.length;
            T max = element[lenght - 1];
            return max;
        }

        /**
         * @param <T>
         * @param elements arrays list
         * @param max element of arrays list
         */
        public static <T> void printMax(T[] elements, T max) {
            for (T element : elements) {
                System.out.println(element);
            }
            System.out.printf("%d of %d is: ", max, elements);
        }
        /**
         * @arraysOfDataType() is a method for arrays list of different data type which
         *                     pass as a argument to the @maxInArrays Method
         */
        public static void arraysOfDataType() {

            Integer[] intMax = { 4, 82, 9, 72, 4, 12, 98, 58 };
            System.out.println("Maximum Of Integer : " + maxInArrays(intMax));

            Float[] floatMax = { 4.6f, 85.8f, 72.8f, 30.2f, 9.8f };
            System.out.println("Maximum Of Float : " + maxInArrays(floatMax));

            String[] stringMax = { "Peach", "Apple", "Banana", "Mango", "Orange" };
            System.out.println("Maximum Of String : " + maxInArrays(stringMax));
        }

        /**
         * @param Main method Of Class
         */
        public static void main(String[] args) {
            arraysOfDataType();
        }
    }
