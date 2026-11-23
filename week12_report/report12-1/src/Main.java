
void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 학생 정보 배열
    String[][] class1 = {
            {"3456", "오준우"},
            {"2342", "이대한"},
            {"1234", "홍길동"},
            {"3456", "한민국"},
            {"4563", "이재명"},
            {"1334", "경복대"}
    };

    String[][] class2 = {
            {"4863", "이순재"},
            {"3414", "오대한"},
            {"3476", "정도형"},
            {"3342", "이순신"}
    };

    String[][][] grade = {class1, class2};

    // 성적, 결과, 평균 배열
    int[][][] score = new int[2][10][3];
    int[][][] result = new int[2][10][3];
    float[][] avg = new float[2][10];

    int[] count = {class1.length, class2.length};

    // 성적 입력
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < count[i]; j++) {

            System.out.printf("[%d반] %s 학생의 국어 성적 : ",
                    i + 1, grade[i][j][1]);
            score[i][j][0] = sc.nextInt();

            System.out.printf("[%d반] %s 학생의 영어 성적 : ",
                    i + 1, grade[i][j][1]);
            score[i][j][1] = sc.nextInt();

            System.out.printf("[%d반] %s 학생의 수학 성적 : ",
                    i + 1, grade[i][j][1]);
            score[i][j][2] = sc.nextInt();

            // 총점과 평균 계산
            result[i][j][0] = score[i][j][0]
                    + score[i][j][1]
                    + score[i][j][2];

            avg[i][j] = result[i][j][0] / 3.0f;
        }
    }

    // 학급 등수와 학년 등수 계산
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < count[i]; j++) {

            result[i][j][1] = 1;
            result[i][j][2] = 1;

            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < count[k]; l++) {

                    // 학급 등수
                    if (i == k &&
                            result[k][l][0] > result[i][j][0]) {
                        result[i][j][1]++;
                    }

                    // 학년 등수
                    if (result[k][l][0] > result[i][j][0]) {
                        result[i][j][2]++;
                    }
                }
            }
        }
    }
    for (int i = 0; i < 2; i++) {

        int[] order = new int[count[i]];

        for (int j = 0; j < count[i]; j++) {
            order[j] = j;
        }

        // 학급 등수 순서대로 정렬
        for (int j = 0; j < count[i] - 1; j++) {
            for (int k = j + 1; k < count[i]; k++) {

                if (result[i][order[j]][1] >
                        result[i][order[k]][1]) {

                    int temp = order[j];
                    order[j] = order[k];
                    order[k] = temp;
                }
            }
        }

        System.out.println("\n" + (i + 1) + "반");

        System.out.println("*******************************************************");
        System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t반석차\t학년석차");
        System.out.println("*******************************************************");

        float classAvg = 0;

        for (int j = 0; j < count[i]; j++) {

            int n = order[j];

            System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
                    grade[i][n][0],
                    grade[i][n][1],
                    score[i][n][0],
                    score[i][n][1],
                    score[i][n][2],
                    result[i][n][0],
                    avg[i][n],
                    result[i][n][1],
                    result[i][n][2]);

            classAvg += avg[i][n];
        }

        System.out.println("*******************************************************");

        System.out.printf("학급 평균 : %.5f\n",
                classAvg / count[i]);
    }

    sc.close();
}
