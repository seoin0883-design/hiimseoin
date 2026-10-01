//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    int length;
    double boxArea;
    double circleArea;
    double area;

    System.out.print("원의 반지름 : ");
    radius = keyboard.nextInt();
    System.out.print("정사각형 한 변의 길이 : ");

    length = keyboard.nextInt();
    boxArea = length * length;
    circleArea = radius * radius * 3.141592;
    area = boxArea - circleArea;

    System.out.printf("정사각형 면적 : %.0f Cm2\n", boxArea);
    System.out.printf("원의 면적 : %.2f Cm2\n", circleArea);
    System.out.printf("구하는 면적 : %.2f Cm2\n", area);
}

