

void main() {
    Scanner keyboard = new Scanner(System.in);

    int score;
    String grade;

    System.out.print("당신의 JAVA 점수 입력 : ");
    score = keyboard.nextInt();

    if (score >= 95)
        grade = "A+";
    else if (score >= 90)
        grade = "A0";
    else if (score >= 85)
        grade = "B+";
    else if (score >= 80)
        grade = "B0";
    else if (score >= 75)
        grade = "C+";
    else if (score >= 70)
        grade = "C0";
    else if (score >= 65)
        grade = "D+";
    else if (score >= 60)
        grade = "D0";
    else
        grade = "F";

    System.out.println("입력 점수 : " + score);
    System.out.println("학점 : " + grade);
}