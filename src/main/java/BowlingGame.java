
public class BowlingGame {

    private static int frame_number = 10;
    private static int throw_number = 0;
    private static int bestScore=10;
    private static int[]frame_score;




    public int  countScore(int [] scoreNumbers){
        int whichFrame=0;
        int[] frame_score = new int[frame_number];
        int len = scoreNumbers.length;
        for (int i=0; i<len;i++){
            if(throw_number == 0){ //该轮的第一次投球
                whichFrame = firstThrow(scoreNumbers, whichFrame, frame_score, i);
            }else if(throw_number == 1){   //该轮的第二次投球
                whichFrame = secondThrow(scoreNumbers, whichFrame, frame_score, i);
            }
        }
        int totalScore=sumFrameScore(frame_score);
        return totalScore;
    }

    private int secondThrow(int[] scoreNumbers, int whichFrame, int[] frame_score, int i) {
        if(scoreNumbers[i -1]+ scoreNumbers[i] < bestScore){ //分数小于10
            isNormal(scoreNumbers, whichFrame, frame_score, i);
            whichFrame++;
        }else{//分数等于10
            if(whichFrame == frame_number-1){
                isNormal(scoreNumbers, whichFrame, frame_score, i);
            }else{
                isSpare(scoreNumbers, whichFrame, frame_score, i);
                whichFrame++;
            }
        }
        throw_number --;
        return whichFrame;
    }

    private int firstThrow(int[] scoreNumbers, int whichFrame, int[] frame_score, int i) {
        if(scoreNumbers[i]<bestScore){  //分数小于10
            isNormal(scoreNumbers, whichFrame, frame_score, i);
            throw_number ++;
        }else {  //分数等于10
            if(whichFrame == frame_number-1){
                isNormal(scoreNumbers, whichFrame, frame_score, i);
            }else{
                isStrike(scoreNumbers, whichFrame, frame_score, i);
                whichFrame++;
            }
        }
        return whichFrame;
    }

    private void isSpare(int[] scoreNumbers, int whichFrame, int[] frame_score, int i) {
        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i]+ scoreNumbers[i +1];
    }

    private void isStrike(int[] scoreNumbers, int whichFrame, int[] frame_score, int i) {
        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i]+ scoreNumbers[i +1]+ scoreNumbers[i +2];
    }

    private void isNormal(int[] scoreNumbers, int whichFrame, int[] frame_score, int i) {
        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i];
    }

    private static int sumFrameScore(int[] frame_score){
        int totalSCore=0;
        for(int i=0;i<frame_score.length;i++){
            totalSCore=totalSCore+frame_score[i];
            System.out.print(frame_score[i]+" ");
        }
        return totalSCore;
    }







}


