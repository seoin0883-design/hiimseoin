//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    byte value1 = 127; // -128 ~ 127
    int value2 = 40000;
    Short value22 = 32767;
    long value3 = 40000l;
    double value4 = 3.14;
    float value = 3.14f;
    char value6 = '가'; // 이중 따옴표 할 거면 스트링으로 묶으셈
    String value7 = "가";

    System.out.printf("%d + 1 = %d\n", value1, value1 + 1);
}
