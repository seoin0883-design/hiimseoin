
void main() {
    Scanner keyboard = new Scanner(System.in);

    String isbn;
    int[] num = new int[12];

    int sum = 0;
    int check;

    System.out.print("ISBN 앞 12자리 입력 : ");
    isbn = keyboard.nextLine();

    if (isbn.length() != 12) {
        System.out.println("잘못된 입력입니다.");
        return;
    }

    // ISBN 숫자를 배열에 저장
    for (int i = 0; i < 12; i++) {
        if (isbn.charAt(i) < '0' || isbn.charAt(i) > '9') {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        num[i] = isbn.charAt(i) - '0';
    }

    // 가중치 1과 3을 번갈아 곱하기
    for (int i = 0; i < 12; i++) {
        if (i % 2 == 0) {
            sum += num[i] * 1;
        } else {
            sum += num[i] * 3;
        }
    }

    // 체크 기호 계산
    check = 10 - (sum % 10);

    if (check == 10) {
        check = 0;
    }

    // 최종 ISBN 출력
    System.out.println("체크 기호 : " + check);

    System.out.println("완성된 ISBN : "
            + isbn.substring(0, 3) + "-"
            + isbn.substring(3, 5) + "-"
            + isbn.substring(5, 11) + "-"
            + isbn.substring(11, 12) + "-"
            + check);
}
