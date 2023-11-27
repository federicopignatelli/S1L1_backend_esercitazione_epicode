import java.util.Scanner;

public class Secondmain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("dimmi il tuo nome");
        String name = scanner.nextLine();

        System.out.println("dimmi dove abiti");
        String location = scanner.nextLine();

        System.out.println("cosa ti piace mangiare?");
        String food = scanner.nextLine();

        System.out.println("ciao "+name+" abiti a "+location+" e ti piace la/il "+food);
    }
}
