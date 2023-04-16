/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in validationQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file validationQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>differentBaseTypesForNode</li>
 * <li>differentTypesForNode</li>
 * <li>differentEssentialTypesForNode</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationQueries();
    }
    return INSTANCE;
  }

  private static ValidationQueries INSTANCE;

  private ValidationQueries() {
    querySpecifications.add(DifferentBaseTypesForNode.instance());
    querySpecifications.add(DifferentTypesForNode.instance());
    querySpecifications.add(DifferentEssentialTypesForNode.instance());
  }

  public DifferentBaseTypesForNode getDifferentBaseTypesForNode() {
    return DifferentBaseTypesForNode.instance();
  }

  public DifferentBaseTypesForNode.Matcher getDifferentBaseTypesForNode(final ViatraQueryEngine engine) {
    return DifferentBaseTypesForNode.Matcher.on(engine);
  }

  public DifferentTypesForNode getDifferentTypesForNode() {
    return DifferentTypesForNode.instance();
  }

  public DifferentTypesForNode.Matcher getDifferentTypesForNode(final ViatraQueryEngine engine) {
    return DifferentTypesForNode.Matcher.on(engine);
  }

  public DifferentEssentialTypesForNode getDifferentEssentialTypesForNode() {
    return DifferentEssentialTypesForNode.instance();
  }

  public DifferentEssentialTypesForNode.Matcher getDifferentEssentialTypesForNode(final ViatraQueryEngine engine) {
    return DifferentEssentialTypesForNode.Matcher.on(engine);
  }
}
