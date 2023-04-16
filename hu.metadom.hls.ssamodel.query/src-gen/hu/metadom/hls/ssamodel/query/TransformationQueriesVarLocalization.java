/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in transformationQueriesVarLocalization.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file transformationQueriesVarLocalization.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>functionTraceToCreate</li>
 * <li>functionTraceItemToCreate</li>
 * <li>functionCalls</li>
 * <li>functionToLocalizeVariables</li>
 * <li>pushDownCondition</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueriesVarLocalization extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueriesVarLocalization instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueriesVarLocalization();
    }
    return INSTANCE;
  }

  private static TransformationQueriesVarLocalization INSTANCE;

  private TransformationQueriesVarLocalization() {
    querySpecifications.add(FunctionTraceToCreate.instance());
    querySpecifications.add(FunctionTraceItemToCreate.instance());
    querySpecifications.add(FunctionCalls.instance());
    querySpecifications.add(FunctionToLocalizeVariables.instance());
    querySpecifications.add(PushDownCondition.instance());
  }

  public FunctionTraceToCreate getFunctionTraceToCreate() {
    return FunctionTraceToCreate.instance();
  }

  public FunctionTraceToCreate.Matcher getFunctionTraceToCreate(final ViatraQueryEngine engine) {
    return FunctionTraceToCreate.Matcher.on(engine);
  }

  public FunctionTraceItemToCreate getFunctionTraceItemToCreate() {
    return FunctionTraceItemToCreate.instance();
  }

  public FunctionTraceItemToCreate.Matcher getFunctionTraceItemToCreate(final ViatraQueryEngine engine) {
    return FunctionTraceItemToCreate.Matcher.on(engine);
  }

  public FunctionCalls getFunctionCalls() {
    return FunctionCalls.instance();
  }

  public FunctionCalls.Matcher getFunctionCalls(final ViatraQueryEngine engine) {
    return FunctionCalls.Matcher.on(engine);
  }

  public FunctionToLocalizeVariables getFunctionToLocalizeVariables() {
    return FunctionToLocalizeVariables.instance();
  }

  public FunctionToLocalizeVariables.Matcher getFunctionToLocalizeVariables(final ViatraQueryEngine engine) {
    return FunctionToLocalizeVariables.Matcher.on(engine);
  }

  public PushDownCondition getPushDownCondition() {
    return PushDownCondition.instance();
  }

  public PushDownCondition.Matcher getPushDownCondition(final ViatraQueryEngine engine) {
    return PushDownCondition.Matcher.on(engine);
  }
}
