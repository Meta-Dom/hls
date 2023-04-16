/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesIntegrity.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in validationQueriesIntegrity.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file validationQueriesIntegrity.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>nodeRefInOtherFunction</li>
 * <li>varInitNodeType</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationQueriesIntegrity extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationQueriesIntegrity instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationQueriesIntegrity();
    }
    return INSTANCE;
  }

  private static ValidationQueriesIntegrity INSTANCE;

  private ValidationQueriesIntegrity() {
    querySpecifications.add(NodeRefInOtherFunction.instance());
    querySpecifications.add(VarInitNodeType.instance());
  }

  public NodeRefInOtherFunction getNodeRefInOtherFunction() {
    return NodeRefInOtherFunction.instance();
  }

  public NodeRefInOtherFunction.Matcher getNodeRefInOtherFunction(final ViatraQueryEngine engine) {
    return NodeRefInOtherFunction.Matcher.on(engine);
  }

  public VarInitNodeType getVarInitNodeType() {
    return VarInitNodeType.instance();
  }

  public VarInitNodeType.Matcher getVarInitNodeType(final ViatraQueryEngine engine) {
    return VarInitNodeType.Matcher.on(engine);
  }
}
