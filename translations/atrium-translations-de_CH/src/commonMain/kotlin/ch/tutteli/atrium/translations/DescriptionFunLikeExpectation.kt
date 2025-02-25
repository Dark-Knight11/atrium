package ch.tutteli.atrium.translations

import ch.tutteli.atrium.assertions.DescriptiveAssertion
import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable

/**
 * Contains the [DescriptiveAssertion.description]s of the assertion functions which are applicable to [Any].
 */
enum class DescriptionFunLikeExpectation(override val value: String) : StringBasedTranslatable {
    /** @since 0.18.0 */
    NO_EXCEPTION_OCCURRED("❗❗ keine Exception wurde geworfen"),

    /** @since 0.18.0 */
    THROWN_EXCEPTION_WHEN_CALLED("geworfene Exception bei Aufruf"),

    /** @since 0.18.0 */
    THREW("❗❗ warf %s")
}
