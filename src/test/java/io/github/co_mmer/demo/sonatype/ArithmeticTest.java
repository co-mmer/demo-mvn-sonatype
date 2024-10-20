package io.github.co_mmer.demo.sonatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

  @Test
  void GIVEN_no_number_WHEN_sum_THEN_return_0() {
    // Act
    var sum = Arithmetic.sum();

    // Assert
    assertEquals(0, sum);
  }

  @Test
  void GIVEN_1_2_5_WHEN_sum_THEN_return_8() {
    // Act
    var sum = Arithmetic.sum(1, 2, 5);

    // Assert
    assertEquals(8, sum);
  }
}
