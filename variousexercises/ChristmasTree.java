package variousexercises;

import java.util.Scanner;

public class ChristmasTree {
    private static final char treeSign = '*';
    private static final char indentationSign = ' ';
    private int chrisTreeHeight;

    @Override
    public String toString() {
        StringBuilder christmasTree = new StringBuilder();
        for (int level = 1; level <= chrisTreeHeight; level++) {
            for (int indentation = 0; indentation < (chrisTreeHeight - level); indentation++) {
                christmasTree.append(indentationSign);
            }
            for (int j = 0; j < (level * 2) - 1; j++) {
                christmasTree.append(treeSign);
            }
            christmasTree.append(System.lineSeparator());
        }
        return christmasTree.toString();
    }

    public ChristmasTree(int chrisTreeHeight) {
        this.chrisTreeHeight = chrisTreeHeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HI there! Type how high you want your Christmas Tree to be: ");
        System.out.println(new ChristmasTree(scanner.nextInt()));
    }
}

