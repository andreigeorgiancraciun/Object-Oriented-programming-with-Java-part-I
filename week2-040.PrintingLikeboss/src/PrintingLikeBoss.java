
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        while (i <= amount) {
            System.out.print(" ");
            i++;
        }

    }

    public static void printTriangle(int size) {
        // 40.2
        int spaces = size - 1;
        int stars = 1;
        int i = 1;
        while (i <= size) {
            printWhitespaces(spaces);
            spaces--;
            printStars(stars);
            stars++;
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int star = 1;
        int spaces = height - 1;
        int i = 1;
        while (i <= height) {
            printWhitespaces(spaces);
            printStars(star);
            spaces--;
            star = star + 2;
            i++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
