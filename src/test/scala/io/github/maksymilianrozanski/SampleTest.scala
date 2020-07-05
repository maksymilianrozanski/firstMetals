package io.github.maksymilianrozanski

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SampleTest extends AnyFlatSpec with should.Matchers {
  "test" should "pass" in {
    assert(1 == 1)
  }

  "test" should "fail" in {
    assert(1 == 2)
  }
}
