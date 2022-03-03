package task4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list);

        int count = 0;
        int res = list.get(list.size() / 2);
        boolean isDone = false;
        while (!isDone) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < res) {
                    list.set(i, list.get(i) + 1);
                    count++;
                } else if (list.get(i) > res) {
                    list.set(i, list.get(i) - 1);
                    count++;
                }
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if (!list.get(i).equals(list.get(i + 1))) {
                    isDone = false;
                    break;
                } else {
                    isDone = true;
                }
            }
        }
        System.out.println(count);
    }
    
}
