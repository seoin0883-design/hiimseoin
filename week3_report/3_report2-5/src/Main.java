import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    String school = sc.next();
    String name = sc.next();

    int age = sc.nextInt();
    char gender = sc.next().charAt(0);
    double height = sc.nextDouble();
    double weight = sc.nextDouble();

    System.out.println("*********************");
    System.out.println("학교 : " + school);
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("성별 : " + gender);
    System.out.println("신장 : " + height + " Cm");
    System.out.println("체중 : " + weight + " Kg");
    System.out.println("*********************");
}
