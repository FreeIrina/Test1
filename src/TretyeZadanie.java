import java.util.Arrays;
import java.util.Scanner;

public class TretyeZadanie {
    public static void main(String[] args) {
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++){
            System.out.println("Введи свою задачу на день");
            Scanner sc = new Scanner(System.in);
            String task = sc.nextLine();
            if (task.equalsIgnoreCase("выход")) {
                break;
            } else {
                array[i] = task;
            }
        }
        System.out.println("все задачи" + Arrays.toString(array));

    }
}
