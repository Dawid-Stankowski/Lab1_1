import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tekst: ");

        String wprowadzonyTekst = scanner.nextLine();

        System.out.println("Wprowadzony tekst: " + wprowadzonyTekst);

        scanner.close();
    }
}