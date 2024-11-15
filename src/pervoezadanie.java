import java.util.Scanner;

public class pervoezadanie {
    public static void main(String[] args) {
        System.out.println("Введите рост");
        Scanner sc = new Scanner(System.in);
        double Height = sc.nextDouble();
        boolean rabota  = true;

        if (Height > 180) {
            System.out.println("Иди нафик, не работаем с такими дылдами");
        } else if (Height < 140)
        {
            System.out.println("Ты слишком маленький, блин");
        } else {
            System.out.println("Введите вес");
            Scanner sc2 = new Scanner(System.in);
            double Weight = sc2.nextDouble();
            if (Weight > 60 && Weight < 80)
            {
                System.out.println("ты нормис");
            } else if (Weight > 81 && Weight < 99) {
                System.out.println("чут чут жирненький");
            } else if (Weight > 100) {
                System.out.println("пипец ты жирный,бан");
                rabota = false;
            } else if (Weight < 60) {
                System.out.println("ты кто ваще? бан");
                rabota = false;
            }
            if (rabota == true) {
                double right_Height = Height / 100;
                double imt = Weight / (right_Height * right_Height);
                System.out.println("твой имт " + imt);
            }
        }

    }
}
