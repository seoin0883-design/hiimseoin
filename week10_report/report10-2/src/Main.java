
void main() {
    Scanner keyboard = new Scanner(System.in);

    String[] name = new String[10];
    double[] weight = new double[10];

    double sum = 0;
    int count = 0;

    for (int i = 0; i < 10; i++) {
        System.out.print((i + 1) + "번째 학생 이름 입력 : ");
        name[i] = keyboard.next();

        System.out.print("몸무게 입력 : ");
        weight[i] = keyboard.nextDouble();

        if (weight[i] < 30.0 || weight[i] > 120.0) {
            System.out.println("몸무게는 30.0~120.0Kg 사이로 입력하세요.");
            i--;
            continue;
        }

        sum += weight[i];
    }

    double avg = sum / 10;

    for (int i = 0; i < 10; i++) {
        if (weight[i] >= avg) {
            count++;
        }
    }

    System.out.printf("\n평균 몸무게 : %.1f Kg\n", avg);
    System.out.printf("평균 이상자 비율 : %.1f%%\n", count / 10.0 * 100);

    // 몸무게 내림차순 정렬
    for (int i = 0; i < 9; i++) {
        for (int j = i + 1; j < 10; j++) {
            if (weight[i] < weight[j]) {
                double temp = weight[i];
                weight[i] = weight[j];
                weight[j] = temp;

                String tempName = name[i];
                name[i] = name[j];
                name[j] = tempName;
            }
        }
    }

    System.out.println("\n[몸무게 상위 2명]");
    for (int i = 0; i < 2; i++) {
        System.out.printf("%s : %.1f Kg\n", name[i], weight[i]);
    }

    System.out.println("\n[몸무게 하위 2명]");
    for (int i = 8; i < 10; i++) {
        System.out.printf("%s : %.1f Kg\n", name[i], weight[i]);
    }
}
