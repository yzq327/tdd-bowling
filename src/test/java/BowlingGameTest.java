import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlinggame ;
    @BeforeEach
    void setUp() {
        bowlinggame = new BowlingGame();
    }

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
        int[] scoreNUmbers2={10,10,10,10,10,10,10,10,10,9,1,10};
        int totalScore2=bowlinggame.countScore(scoreNUmbers2);
        int Excepted2=279;
        assertEquals(Excepted2, totalScore2);
    }
    @Test
    void should_return_total_score3(){
        int[] scoreNUmbers2={1,4,4,5,6,4,5,5,10,0,1,7,3,6,4,10,2,6};
        int totalScore2=bowlinggame.countScore(scoreNUmbers2);
        int Excepted2=123;
        assertEquals(Excepted2, totalScore2);
    }


}
