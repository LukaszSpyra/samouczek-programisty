package arraysandloops;

public class Excercises {

    public static void main(String[] args) {
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }
        int x = 10;
        while (x <= 20) {
            System.out.println(x);
            x++;
        }
        for (int i = -10; i <=40 ; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
        int y = -11;
        while (y<40){
            y++;
            if (y % 2 == 0){
                continue;
            }
            System.out.println(y);
        }
    }
}
