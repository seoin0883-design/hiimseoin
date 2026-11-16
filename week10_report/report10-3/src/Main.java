
void main() {
    Scanner keyboard = new Scanner(System.in);

    String jumin;
    int[] num = new int[13];

    int sum = 0;
    int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

    System.out.print("주민등록번호 입력 (- 제외) : ");
    jumin = keyboard.nextLine();

    if (jumin.length() != 13) {
        System.out.println("잘못된 주민등록번호입니다.");
        return;
    }

    // 주민등록번호를 배열에 저장
    for (int i = 0; i < 13; i++) {
        if (jumin.charAt(i) < '0' || jumin.charAt(i) > '9') {
            System.out.println("잘못된 주민등록번호입니다.");
            return;
        }

        num[i] = jumin.charAt(i) - '0';
    }

    // 성별 코드 확인
    if (num[6] < 1 || num[6] > 8) {
        System.out.println("잘못된 주민등록번호입니다.");
        return;
    }

    // 오류검증 코드 계산
    for (int i = 0; i < 12; i++) {
        sum += num[i] * weight[i];
    }

    int check = 11 - (sum % 11);

    if (check >= 10) {
        check = check - 10;
    }

    // 마지막 숫자와 검증 코드 비교
    if (check == num[12]) {
        System.out.println("올바른 주민등록번호입니다.");
    } else {
        System.out.println("잘못된 주민등록번호입니다.");
    }
}

