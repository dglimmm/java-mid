package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] generate = lottoGenerator.generate();
        System.out.println("생성된 로또 번호입니다. 행복하세요~ : " + Arrays.toString(generate));
    }
}
