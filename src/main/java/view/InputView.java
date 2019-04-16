package view;

import utils.InputUtil;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMovieId() {
        System.out.println("## 예약할 영화를 선택하세요.");
        return InputUtil.getInt();
    }

    public static int inputScheduleIndex() {
        System.out.println("## 일정을 선택하세요");
        return InputUtil.getInt();
    }

    public static int inputBuyCount() {
        System.out.println("## 인원을 선택하세요");
        return InputUtil.getInt();
    }
}
