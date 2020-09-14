
public class BowlingGame {

    private static int frame_number = 10;
    private static int throw_number = 0;
    private static int bestScore=10;




    public int  countScore(int [] scoreNumbers){
        int whichFrame=0;
        int[] frame_score = new int[frame_number];
        int len = scoreNumbers.length;
        for (int i=0; i<len;i++){
            if(throw_number == 0){ //该轮的第一次投球
                if(scoreNumbers[i]<bestScore){  //分数小于10
                    frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i];
                    throw_number ++;
                }else {  //分数等于10
                    if(whichFrame == frame_number-1){
                        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i];
                    }else{
                        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i]+scoreNumbers[i+1]+scoreNumbers[i+2];
                        whichFrame ++;
                    }
                }
            }else if(throw_number == 1){   //该轮的第二次投球
                if(scoreNumbers[i-1]+scoreNumbers[i] < bestScore){ //分数小于10
                    frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i];
                    whichFrame ++;
                }else{//分数等于10
                    if(whichFrame == frame_number-1){
                        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i];
                    }else{
                        frame_score[whichFrame] = frame_score[whichFrame] + scoreNumbers[i]+scoreNumbers[i+1];
                        whichFrame ++;
                    }
                }
                throw_number --;
            }
        }
        int totalScore=sumFrameScore(frame_score);
        return totalScore;
    }

    private static int sumFrameScore(int[] frame_score){
        int totalSCore=0;
        for(int i=0;i<frame_score.length;i++){
            totalSCore=totalSCore+frame_score[i];
            System.out.print(frame_score[i]+" ");
        }
        return totalSCore;
    }

    private static void isNormal(){

    }

    private static void isStrike(){

    }

    private static void isSpare(){

    }



}


