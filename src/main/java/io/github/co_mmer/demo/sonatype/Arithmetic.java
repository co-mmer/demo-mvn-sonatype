package io.github.co_mmer.demo.sonatype;

import java.util.Arrays;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

/**
 * The {@code Arithmetic} class provides basic arithmetic operations. This class cannot be
 * instantiated due to its private constructor. The class is designed as a utility class for
 * performing operations on a variable number of integers.
 *
 * <p><strong>Example usage:</strong>
 *
 * <pre>
 *     int sum = Arithmetic.add(1, 2, 3, 4);  // returns 10
 * </pre>
 */
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public final class Arithmetic {

  /**
   * Returns the sum of the provided integers.
   *
   * <p>This method accepts a variable number of integer arguments and returns the total sum of all
   * the passed numbers.
   *
   * <p>If no arguments are provided, the method will return {@code 0}.
   *
   * @param number the integers to be summed (can be zero or more integers)
   * @return the sum of the input integers
   */
  public static int sum(int... number) {
    return Arrays.stream(number).sum();
  }
}
