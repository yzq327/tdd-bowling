
public class BowlingGame {

    private static int frame_number = 10;
    private static int throw_number = 0;
    private static int bestScore=10;
    private static int[] frame_score;
    public static int whichFrame;

    public int  countScore(int [] scoreNumbers){
        whichFrame=0;
        frame_score = new int[frame_number];
        int len = scoreNumbers.length;
        for (int i=0; i<len;i++){
            if(throw_number == 0){
                whichFrame = firstThrow(scoreNumbers, i);
            }else if(throw_number == 1){
                whichFrame = secondThrow(scoreNumbers, i);
            }
        }
        int totalScore=sumFrameScore(frame_score);
        return totalScore;
    }

    private int firstThrow(int[] scoreNumbers,  int i) {
        if(scoreNumbers[i]<bestScore){
            isNormal(scoreNumbers, i);
            throw_number ++;
        }else {
            if(whichFrame == frame_number-1){
                isNormal(scoreNumbers, i);
            }else{
                isStrike(scoreNumbers, i);
                whichFrame++;
            }
        }
        return whichFrame;
    }

    private int secondThrow(int[] scoreNumbers,  int i) {
        if(scoreNumbers[i -1]+ scoreNumbers[i] < bestScore){
            isNormal(scoreNumbers, i);
            whichFrame++;
        }else{
            if(whichFrame == frame_number-1){
                isNormal(scoreNumbers, i);
            }else{
                isSpare(scoreNumbers, i);
                whichFrame++;
            }
        }
        throw_number --;
        return whichFrame;
    }

    private void isSpare(int[] scoreNumbers,  int i) {
        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i]+ scoreNumbers[i+1];
    }

    private void isStrike(int[] scoreNumbers, int i) {
        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i]+ scoreNumbers[i+1]+ scoreNumbers[i+2];
    }

    private void isNormal(int[] scoreNumbers,  int i) {
        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i];
    }

    private int sumFrameScore(int[] frame_score){
        int totalSCore=0;
        for(int i=0;i<frame_score.length;i++){
            totalSCore=totalSCore+frame_score[i];
        }
        return totalSCore;
    }

}


