package ch.tutteli.atrium.reporting

import ch.tutteli.atrium.api.infix.en_GB.feature
import ch.tutteli.atrium.api.infix.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.internal.expect
import ch.tutteli.atrium.reporting.erroradjusters.NoOpAtriumErrorAdjuster
import io.kotest.core.spec.style.DescribeSpec

class AtriumErrorSpec : DescribeSpec ({
    describe("creating an AtriumError") {
        it("has `null` as cause - regression for #303") {
            val e = AtriumError.create("hello world", NoOpAtriumErrorAdjuster)
            expect(e).feature(Throwable::cause) toEqual null
        }
    }
})
