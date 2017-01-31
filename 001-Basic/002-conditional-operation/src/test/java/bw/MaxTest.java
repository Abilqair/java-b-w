package com.bw;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * Created by BAtmAN on 29.01.17.
 */
 
public class MaxTest {
	@Test
       public void WhenOneFiveThenMaxFive() {
              Max maxi = new Max();
              assertThat(maxi.max(1,5), is(5));
       }
	   
	   @Test
       public void WhenOneFiveTwoThenMaxFive() {
              Max maxi = new Max();
              assertThat(maxi.max(1,5,2), is(5));
       }
}