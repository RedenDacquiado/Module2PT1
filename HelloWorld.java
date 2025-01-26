import java.util.Scanner;
public class HelloWorld{
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("What is your favorite programming language? ");
        String language = input.nextLine();

        System.out.println("Hello, " + name + "! It's great that you love " + language + ".");

    }
}