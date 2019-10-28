
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        List list = new List();

        while (true) {
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();

                list.Add(new Bird(name, latinName));

            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                list.Observation(name);
            } else if (command.equalsIgnoreCase("Statistics")) {
                list.Statistics();
            } else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                list.Show(name);
            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            }

        }
    }
}
