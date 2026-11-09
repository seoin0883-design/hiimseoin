void main() {
    Scanner keyboard = new Scanner(System.in);

    double height;
    double distance = 0;

    System.out.print("초기 높이 X(m)를 입력하세요: ");
    height = keyboard.nextDouble();

    for (int i = 1; i <= 10; i++) {
        System.out.printf("공의 %d번째 낙하 높이: %.4f m%n", i, height);

        distance = distance + height;

        if (i < 10) {
            height = height * 2 / 3;
            distance = distance + height;
        }
    }

    System.out.printf("총 이동 거리: %.4f m%n", distance);
}