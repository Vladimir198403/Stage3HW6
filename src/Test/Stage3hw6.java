package Test;

import java.util.Arrays;

public class Stage3hw6 {

    public int[] ans1(int[] data) {
        for (int i = data.length - 1; i > 0; i++) {
            if (data[i] == 4) {
                return Arrays.copyOfRange(data, i + 1, data.length);
            }
        }
        throw new RuntimeException("Неверный массив");
    }

    public boolean ans2(int[] data) {
        boolean cont1 = false;
        boolean cont4 = false;

        for (int i = 0; i < data.length; i++) {
            switch (data[i]) {
                case 1:
                    cont1 = true;
                    break;
                case 2:
                    cont4 = true;
                    break;
                default:
                    return false;
            }
        }
        return cont1 && cont4;
    }


}
