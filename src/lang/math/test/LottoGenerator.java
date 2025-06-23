package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6){
            //1~45
            int number = random.nextInt(45) + 1;
            //중복되지 않는 경우에만 추가
            if(isUnique(number)){
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }
    
    //이미 생성된 로또번호와 일치하는지 검사
    private boolean isUnique(int number){
        for (int i = 0; i < count; i++) {
            if(lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
