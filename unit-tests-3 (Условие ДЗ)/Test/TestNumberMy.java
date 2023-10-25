import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.NumberMy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNumberMy {
   NumberMy number;

   @BeforeEach
    void setUp(){
       number = new NumberMy();
   }

   @Test
    void testPEvenOddNumberTrue(){
       assertTrue(number.evenOddNumber(4));
   }
   @Test
    void testPEvenOddNumberFalse(){
       assertFalse(number.evenOddNumber(3));
   }

   @Test
    void testPNumberInIntervalMin(){
       assertTrue(number.numberInInterval(25));
   }
   @Test
    void testPNumberInIntervalMax(){
       assertTrue(number.numberInInterval(100));
   }
   @Test
    void testNNumberInIntervalMin(){
       assertFalse(number.numberInInterval(24));
   }
   @Test
    void testNNumberInIntervalMax(){
       assertFalse(number.numberInInterval(101));
   }
}
