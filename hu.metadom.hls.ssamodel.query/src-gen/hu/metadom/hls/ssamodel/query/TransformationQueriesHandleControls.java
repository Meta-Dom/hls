/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesHandleControls.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in transformationQueriesHandleControls.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file transformationQueriesHandleControls.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>findReturnOrControlInBlock</li>
 * <li>returnInFunction</li>
 * <li>findBreakWithFunctionLoopBlock</li>
 * <li>findContinueWithFunctionLoopBlock</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueriesHandleControls extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueriesHandleControls instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueriesHandleControls();
    }
    return INSTANCE;
  }

  private static TransformationQueriesHandleControls INSTANCE;

  private TransformationQueriesHandleControls() {
    querySpecifications.add(FindReturnOrControlInBlock.instance());
    querySpecifications.add(ReturnInFunction.instance());
    querySpecifications.add(FindBreakWithFunctionLoopBlock.instance());
    querySpecifications.add(FindContinueWithFunctionLoopBlock.instance());
  }

  public FindReturnOrControlInBlock getFindReturnOrControlInBlock() {
    return FindReturnOrControlInBlock.instance();
  }

  public FindReturnOrControlInBlock.Matcher getFindReturnOrControlInBlock(final ViatraQueryEngine engine) {
    return FindReturnOrControlInBlock.Matcher.on(engine);
  }

  public ReturnInFunction getReturnInFunction() {
    return ReturnInFunction.instance();
  }

  public ReturnInFunction.Matcher getReturnInFunction(final ViatraQueryEngine engine) {
    return ReturnInFunction.Matcher.on(engine);
  }

  public FindBreakWithFunctionLoopBlock getFindBreakWithFunctionLoopBlock() {
    return FindBreakWithFunctionLoopBlock.instance();
  }

  public FindBreakWithFunctionLoopBlock.Matcher getFindBreakWithFunctionLoopBlock(final ViatraQueryEngine engine) {
    return FindBreakWithFunctionLoopBlock.Matcher.on(engine);
  }

  public FindContinueWithFunctionLoopBlock getFindContinueWithFunctionLoopBlock() {
    return FindContinueWithFunctionLoopBlock.instance();
  }

  public FindContinueWithFunctionLoopBlock.Matcher getFindContinueWithFunctionLoopBlock(final ViatraQueryEngine engine) {
    return FindContinueWithFunctionLoopBlock.Matcher.on(engine);
  }
}
