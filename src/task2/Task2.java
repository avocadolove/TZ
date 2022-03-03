package task2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        try {
            File file1 = new File(args[0]);
            Scanner scanner1 = new Scanner(file1);
            double centerX = scanner1.nextDouble();
            double centerY = scanner1.nextDouble();
            double radius = scanner1.nextDouble();
            scanner1.close();

            File file2 = new File(args[1]);
            Scanner scanner2 = new Scanner(file2);
            while (scanner2.hasNext()) {
                double pointX = scanner2.nextDouble();
                double pointY = scanner2.nextDouble();
                double distanceX = (pointX - centerX) * (pointX - centerX);
                double distanceY = (pointY - centerY) * (pointY - centerY);
                double distance = Math.sqrt(distanceX + distanceY);
                if (distance < radius) {
                    System.out.println(1);
                } else if (distance == radius) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
            scanner2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}