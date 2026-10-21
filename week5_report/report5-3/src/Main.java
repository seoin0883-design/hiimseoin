
void main() {
    int totalSeconds = 54321;

    int hour = totalSeconds / 3600;
    int minute = (totalSeconds % 3600) / 60;
    int second = totalSeconds % 60;

    System.out.println(totalSeconds + " 초 = " + hour + " 시간 " + minute + " 분 " + second + " 초");
}