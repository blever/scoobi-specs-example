
import com.nicta.scoobi.Scoobi._
import com.nicta.scoobi.testing.mutable.HadoopSpecification

class ExampleSpec extends HadoopSpecification {
  "Can add 1 to DList elements" >> { implicit sc: ScoobiConfiguration =>
    DList(1, 2, 3).map(_ + 1).run must_== Seq(1, 2, 3)
  }
}