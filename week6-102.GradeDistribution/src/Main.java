
import java.util.Scanner;

public class Main {

    public static int doSomething(Scanner scanner) {
        int mark = Integer.parseInt(scanner.nextLine());

        return mark;
    }

    public static void main(String[] args) {
        List list = new List();
        int mark;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            mark = doSomething(scanner);
            if (mark != -1) {
                Grades objmark = new Grades(mark);
                list.addToList(objmark);

            } else {
                break;
            }

        }

        list.showList();

    }
}
