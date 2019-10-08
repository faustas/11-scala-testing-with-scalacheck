import org.scalacheck.Gen
import org.scalatest.prop.PropertyChecks
import org.scalatest.{MustMatchers, WordSpec}

class ExampleTest extends WordSpec with MustMatchers with PropertyChecks {

  val integerBigger10: Gen[Int] = Gen.choose(11,92)

  "Numbers between 11 and 100" should {
    "pass" in {
      integerBigger10.sample.map {
        e: Int =>
          Example.biggerThan10(e) mustBe true
      }
    }
  }

  val integerSmaller10: Gen[Int] = Gen.choose(1,9)

  "Numbers between 1 and 9" should {
    "won't pass" in {
      integerSmaller10.sample.map {
        e: Int =>
          Example.biggerThan10(e) mustBe false
      }
    }
  }
}
