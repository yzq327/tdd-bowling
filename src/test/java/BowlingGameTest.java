import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlinggame = new BowlingGame();

    @Test
    void should_return_total_score(){
        int[] scoreNumbers1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      //int[] scoreNUmbers2={10,10,10,10,10,10,10,10,10,10,10,10};
        int totalScore1=bowlinggame.countScore(scoreNumbers1);
        int Excepted1=0;
        //int totalScore2=bowlinggame.countScore(scoreNUmbers2);
        //int Excepted2=300;
        assertEquals(Excepted1, totalScore1);
       // assertEquals(Excepted2, totalScore2);
    }
    @Test
    void should_return_total_score2(){
        int[] scoreNUmbers2={1,9,10,10,10,10,10,10,10,10,10,10,10};
        int totalScore2=bowlinggame.countScore(scoreNUmbers2);
        int Excepted2=290;
        assertEquals(Excepted2, totalScore2);
    }


}
