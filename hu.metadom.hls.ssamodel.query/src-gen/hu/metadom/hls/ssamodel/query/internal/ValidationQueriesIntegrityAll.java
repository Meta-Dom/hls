/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesIntegrity.vql
 */
package hu.metadom.hls.ssamodel.query.internal;

import hu.metadom.hls.ssamodel.query.NodeRefInOtherFunction;
import hu.metadom.hls.ssamodel.query.VarInitNodeType;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in validationQueriesIntegrity.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>nodeRefInOtherFunction</li>
 * <li>initOrInitListOrParam</li>
 * <li>varInitNodeType</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationQueriesIntegrityAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationQueriesIntegrityAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationQueriesIntegrityAll();
    }
    return INSTANCE;
  }

  private static ValidationQueriesIntegrityAll INSTANCE;

  private ValidationQueriesIntegrityAll() {
    querySpecifications.add(NodeRefInOtherFunction.instance());
    querySpecifications.add(InitOrInitListOrParam.instance());
    querySpecifications.add(VarInitNodeType.instance());
  }
}
