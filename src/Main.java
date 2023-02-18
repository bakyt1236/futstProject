import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Дабро пажаловат в Java.");
        System.out.println("Введите свой ФИО?");
        String b = a.nextLine();
        System.out.println("Введите свой дата рождения?");
        String w = a.nextLine();
        System.out.println("Введите свой адрес?");
        String d = a.nextLine();
        System.out.println("gmail или телефон номерю");
        String h = a.nextLine();
        System.out.println("Введите пароль");
        String g = a.nextLine();
        System.out.println("==============================================");
        System.out.println("ФИО:" +b+"\n"+"Дата:"+w+"\n"+"Адрес:"+d+"\n"+"Gmail:"+h+"\n"+"Пароль:"+g+"\n");
        System.out.println("==============================================");
    }
}