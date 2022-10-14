package IdeaProjects.foxandhounds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üdvözlöm, kérem adja meg a nevét: ");
        String nev= scanner.nextLine();
        Display a = new Display();
        System.out.println("Kedves "+nev +",kezdődik a játék!");
        a.start();
    }

}
