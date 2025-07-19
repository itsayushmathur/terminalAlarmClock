import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        scanner.close();


    }
}