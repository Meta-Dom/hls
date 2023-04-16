/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query.internal;

import hu.metadom.hls.ssamodel.query.FunctionCalls;
import hu.metadom.hls.ssamodel.query.FunctionToLocalizeVariables;
import hu.metadom.hls.ssamodel.query.FunctionTraceItemToCreate;
import hu.metadom.hls.ssamodel.query.FunctionTraceToCreate;
import hu.metadom.hls.ssamodel.query.PushDownCondition;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in transformationQueriesVarLocalization.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>varIsWritten</li>
 * <li>readOrWriteByNode</li>
 * <li>functionWithGlobalVar</li>
 * <li>functionWithAllGlobalVar</li>
 * <li>functionWithTrace</li>
 * <li>functionTraceToCreate</li>
 * <li>functionTraceItemToCreate</li>
 * <li>functionCalls</li>
 * <li>functionToLocalizeVariables</li>
 * <li>varStrictInitNode</li>
 * <li>callArgumentNode</li>
 * <li>ssaCallOutputArgument</li>
 * <li>variableCanNotPushDown</li>
 * <li>dowhileBlock</li>
 * <li>underDowhile</li>
 * <li>pushDownCondition</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueriesVarLocalizationAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueriesVarLocalizationAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueriesVarLocalizationAll();
    }
    return INSTANCE;
  }

  private static TransformationQueriesVarLocalizationAll INSTANCE;

  private TransformationQueriesVarLocalizationAll() {
    querySpecifications.add(VarIsWritten.instance());
    querySpecifications.add(ReadOrWriteByNode.instance());
    querySpecifications.add(FunctionWithGlobalVar.instance());
    querySpecifications.add(FunctionWithAllGlobalVar.instance());
    querySpecifications.add(FunctionWithTrace.instance());
    querySpecifications.add(FunctionTraceToCreate.instance());
    querySpecifications.add(FunctionTraceItemToCreate.instance());
    querySpecifications.add(FunctionCalls.instance());
    querySpecifications.add(FunctionToLocalizeVariables.instance());
    querySpecifications.add(VarStrictInitNode.instance());
    querySpecifications.add(CallArgumentNode.instance());
    querySpecifications.add(SsaCallOutputArgument.instance());
    querySpecifications.add(VariableCanNotPushDown.instance());
    querySpecifications.add(DowhileBlock.instance());
    querySpecifications.add(UnderDowhile.instance());
    querySpecifications.add(PushDownCondition.instance());
  }
}
