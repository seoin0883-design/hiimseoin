void main() {
    int chicken, dog;

    System.out.println("[for문]");
    for (chicken = 0; chicken <= 37; chicken++) {
        dog = 37 - chicken;

        if (chicken * 2 + dog * 4 == 102) {
            System.out.println("닭 : " + chicken + "마리");
            System.out.println("개 : " + dog + "마리");
        }
    }

    System.out.println("[while문]");
    chicken = 0;

    while (chicken <= 37) {
        dog = 37 - chicken;

        if (chicken * 2 + dog * 4 == 102) {
            System.out.println("닭 : " + chicken + "마리");
            System.out.println("개 : " + dog + "마리");
        }
        chicken++;
    }

    System.out.println("[do-while문]");
    chicken = 0;

    do {
        dog = 37 - chicken;

        if (chicken * 2 + dog * 4 == 102) {
            System.out.println("닭 : " + chicken + "마리");
            System.out.println("개 : " + dog + "마리");
        }
        chicken++;
    } while (chicken <= 37);
}