import java.util.*;

public class Hashfunc {
    public static void main(String[] args) {
        int arraySize = 20;
        Integer[] hashTable = new Integer[arraySize];

        Random random = new Random();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int randomValue = random.nextInt(100000, 999999);
            values.add(randomValue);
        }

        for (int value : values) {
            int key = hashFunction(value);
            while (hashTable[key] != null) {
                key = (key + 1) % arraySize;
            }
            hashTable[key] = value;
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to find its key: ");
        int inputValue = sc.nextInt();
        int inputKey = hashFunction(inputValue);

        System.out.println("The key for " + inputValue + " is " + inputKey + ".");
        sc.close();
    }

    public static int hashFunction(int x) {
        return (x % 18) + 2;
    }
}
