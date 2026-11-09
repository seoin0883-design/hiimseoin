
void main() {
    int height = 0;
    int day = 0;

    while (height < 300) {
        day++;
        height = height + 55;

        if (height >= 300) {
            break;
        }

        height = height - 13;
    }

    System.out.println("우물 탈출 날짜 : " + day + "일");

    if (day <= 7) {
        System.out.println("일주일 안에 우물을 탈출할 수 있습니다.");
    } else {
        System.out.println("일주일 안에 우물을 탈출할 수 없습니다.");
    }
}