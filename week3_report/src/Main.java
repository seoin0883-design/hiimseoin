//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner sc = new Scanner(System.in);

    int test1;
    int test2;

    System.out.print("첫번째 숫자를 입력하세요 ");
    test1 = sc.nextInt();
    System.out.print("두번째 숫자를 입력하세요 ");
    test2 = sc.nextInt();
    System.out.printf("%d + %d = %d\n", test1, test2, test1 + test2);
}
