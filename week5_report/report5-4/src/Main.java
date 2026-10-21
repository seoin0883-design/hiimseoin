

void main() {
    Scanner keyboard = new Scanner(System.in);

    int price;
    boolean membership;

    System.out.print("구매 금액 입력 : ");
    price = keyboard.nextInt();

    System.out.print("멤버십 회원 여부(true/false) : ");
    membership = keyboard.nextBoolean();

    if (price < 0) {
        System.out.println("오류: 구매 금액은 음수일 수 없습니다.");
    } else if (price >= 50000 || (membership && price >= 30000)) {
        System.out.println("무료배송 가능");
    } else {
        System.out.println("무료배송 불가능");
    }
}