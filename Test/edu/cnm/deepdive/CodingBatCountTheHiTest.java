package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatCountTheHi.countHi;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatCountTheHiTest {

  private String[] hiParams = {
      "abc hi ho",
      "ABChi hi",
      "hihi",
      "hiHIhi,",
      "",
      "h",
      "hi",
      "Hi is no HI on ahI",
      "hiho not HOHIhi"
  };

  private int[] hiExpected = {1, 2, 2, 2, 0, 0, 1, 0, 2};

  @Test
  void hiTest() {
    for (int i = 0; i < hiParams.length; i++) {
      int actual = countHi(hiParams[i]);
      Assertions.assertEquals(actual, hiExpected[i]);
    }
  }

}