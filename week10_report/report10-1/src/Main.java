//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
        Scanner keyboard = new Scanner(System.in);

        double[] score = new double[7];
        double sum = 0;
        double max = 60.0;
        double min = 100.0;

        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + "번째 채점 점수 입력 : ");
            score[i] = keyboard.nextDouble();

            if (score[i] < 60.0 || score[i] > 100.0) {
                System.out.println("점수는 60.0점부터 100.0점까지 입력하세요.");
                i--;
                continue;
            }

            sum += score[i];

            if (score[i] > max) {
                max = score[i];
            }

            if (score[i] < min) {
                min = score[i];
            }
        }

        double result = (sum - max - min) / 5;

        System.out.printf("홍길동 선수의 최종 점수 : %.2f점\n", result);
    }
