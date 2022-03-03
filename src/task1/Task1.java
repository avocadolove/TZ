package task1;

public class Task1 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        String result = "";
        int p = 1;
        do {
            result = result + p;
            p = (p + m - 1) % n;
            if (p == 0) {
                p = n;
            }
        } while (p != 1);

        System.out.println(result);
    }

}