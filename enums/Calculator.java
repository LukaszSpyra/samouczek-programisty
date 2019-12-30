package enums;

import java.util.Scanner;

enum Computation{
    MULTIPLY {
        public double perform(double x, double y){
        return x*y;
        }
    },
    DIVIDE{
        public double perform(double x, double y){
            return x/y;
        }
    },
    ADD{
        public double perform(double x, double y){
            return x+y;
        }
    },
    SUBTRACT{
        public double perform(double x, double y){
            return x-y;
        }
    };
public abstract double perform(double x, double y);

}
public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 2 liczby:");
        double input1 = input.nextDouble();
        double input2 = input.nextDouble();

        System.out.println(Computation.ADD.perform(input1,input2));

    }
}
