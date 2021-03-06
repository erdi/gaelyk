package groovyx.gaelyk.datastore

import java.lang.annotation.Retention
import java.lang.annotation.Target
import static java.lang.annotation.ElementType.FIELD
import static java.lang.annotation.ElementType.METHOD
import static java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * Annotation for properties of a Groovy class that should be set as indexed in coercion to and from entities.
 *
 * @author Vladimir Orany
 */

@Retention(RUNTIME)
@Target([METHOD, FIELD])
@interface Indexed { }