package utils;

public enum MessageEnum {
    // utils.Car Initialize
    INIT_CARS("자동차의 갯수를 입력해주세요."),
    INPUT_NAME("해당 자동차의 이름을 입력해주세요. (type: String)"),
    INPUT_SPEED("해당 자동차의 속도를 입력해주세요. (type: integer)"),
    INPUT_IS_SPUERCAR("해당 자동차는 SuperCar 인가요? (True = 1, False = 0)"),
    NUMBER_OF_CAR(""),

    // utils.Car Show
    CAR_SHOW("\n\n\n===== : 경기 참가자 소개 : ====="),
    BROADCAST_WINNER("===== : 최종 결과 발표 : ====="),

    GAME_TIME("경기를 몇 초동안 진행시킬까요? (type: integer)"),

    INPUT_FAIL("입력 오류. 다시 한번 입력해주세요.");


    String s;
    String PREFIX = "[ ! ] ";

    MessageEnum(String s) {
        this.s = s;
    }

    public String getMessage() {
        return this.s;
    }

    public void printMessage() {
        System.out.println(PREFIX + this.s);
    }

    public void getNumberOfCars(int curr, int size) {
        if (!this.name().equals("NUMBER_OF_CAR")) {
            return;
        } // 다른 경우 예외 처리
        String res = "\n[" + curr + "/" + size + "] ==========";
        System.out.println(res);
    }
}
