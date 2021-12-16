public class Clean_Code {
    static class Check {

        int smallestNumber;
        int largestNumber;
    }

    static Check findLargestSmallest(int []arr, int sizeOfArray) {
        Check objectOfCheck = new Check();
        int i;

        if (sizeOfArray == 1) {
            objectOfCheck.largestNumber = arr[0];
            objectOfCheck.smallestNumber = arr[0];
            return objectOfCheck;
        }

        if (arr[0] > arr[1]) {
            objectOfCheck.largestNumber = arr[0];
            objectOfCheck.smallestNumber = arr[1];
        } else {
            objectOfCheck.largestNumber = arr[1];
            objectOfCheck.smallestNumber = arr[0];
        }

        for (i = 2; i < sizeOfArray; i++) {
            if (arr[i] > objectOfCheck.largestNumber) {
                objectOfCheck.largestNumber = arr[i];
            } else if (arr[i] < objectOfCheck.smallestNumber) {
                objectOfCheck.smallestNumber = arr[i];
            }
        }

        return objectOfCheck;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int sizeOfArray = 6;
        Check objectOfCheck = findLargestSmallest(arr, sizeOfArray);
        System.out.printf("\nsmallest number is %d", objectOfCheck.smallestNumber);
        System.out.printf("\nlargest number is %d", objectOfCheck.largestNumber);
    }
}

