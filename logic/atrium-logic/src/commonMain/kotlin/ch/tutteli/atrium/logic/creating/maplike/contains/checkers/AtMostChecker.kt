//TODO remove file with 0.19.0
@file:Suppress("DEPRECATION")

package ch.tutteli.atrium.logic.creating.maplike.contains.checkers

import ch.tutteli.atrium.logic.creating.maplike.contains.MapLikeContains

/**
 * Represents a check that an expected search criterion is contained at most [times] in the search input.
 */
@Deprecated("Will be removed with 0.19.0 without replacement")
interface AtMostChecker :
    ch.tutteli.atrium.logic.creating.basic.contains.checkers.AtMostChecker,
    MapLikeContains.Checker
