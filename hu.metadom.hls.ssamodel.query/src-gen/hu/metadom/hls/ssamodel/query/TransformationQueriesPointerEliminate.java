/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesPointerEliminate.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in transformationQueriesPointerEliminate.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file transformationQueriesPointerEliminate.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>pointerTraceToCreate</li>
 * <li>pointerTraceItemToCreate</li>
 * <li>functionToDepointerParams</li>
 * <li>assignToNoname</li>
 * <li>assignFromNoname</li>
 * <li>arrayPointerParamR</li>
 * <li>arrayPointerParamWR</li>
 * <li>simplePointerParam</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueriesPointerEliminate extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueriesPointerEliminate instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueriesPointerEliminate();
    }
    return INSTANCE;
  }

  private static TransformationQueriesPointerEliminate INSTANCE;

  private TransformationQueriesPointerEliminate() {
    querySpecifications.add(PointerTraceToCreate.instance());
    querySpecifications.add(PointerTraceItemToCreate.instance());
    querySpecifications.add(FunctionToDepointerParams.instance());
    querySpecifications.add(AssignToNoname.instance());
    querySpecifications.add(AssignFromNoname.instance());
    querySpecifications.add(ArrayPointerParamR.instance());
    querySpecifications.add(ArrayPointerParamWR.instance());
    querySpecifications.add(SimplePointerParam.instance());
  }

  public PointerTraceToCreate getPointerTraceToCreate() {
    return PointerTraceToCreate.instance();
  }

  public PointerTraceToCreate.Matcher getPointerTraceToCreate(final ViatraQueryEngine engine) {
    return PointerTraceToCreate.Matcher.on(engine);
  }

  public PointerTraceItemToCreate getPointerTraceItemToCreate() {
    return PointerTraceItemToCreate.instance();
  }

  public PointerTraceItemToCreate.Matcher getPointerTraceItemToCreate(final ViatraQueryEngine engine) {
    return PointerTraceItemToCreate.Matcher.on(engine);
  }

  public FunctionToDepointerParams getFunctionToDepointerParams() {
    return FunctionToDepointerParams.instance();
  }

  public FunctionToDepointerParams.Matcher getFunctionToDepointerParams(final ViatraQueryEngine engine) {
    return FunctionToDepointerParams.Matcher.on(engine);
  }

  public AssignToNoname getAssignToNoname() {
    return AssignToNoname.instance();
  }

  public AssignToNoname.Matcher getAssignToNoname(final ViatraQueryEngine engine) {
    return AssignToNoname.Matcher.on(engine);
  }

  public AssignFromNoname getAssignFromNoname() {
    return AssignFromNoname.instance();
  }

  public AssignFromNoname.Matcher getAssignFromNoname(final ViatraQueryEngine engine) {
    return AssignFromNoname.Matcher.on(engine);
  }

  public ArrayPointerParamR getArrayPointerParamR() {
    return ArrayPointerParamR.instance();
  }

  public ArrayPointerParamR.Matcher getArrayPointerParamR(final ViatraQueryEngine engine) {
    return ArrayPointerParamR.Matcher.on(engine);
  }

  public ArrayPointerParamWR getArrayPointerParamWR() {
    return ArrayPointerParamWR.instance();
  }

  public ArrayPointerParamWR.Matcher getArrayPointerParamWR(final ViatraQueryEngine engine) {
    return ArrayPointerParamWR.Matcher.on(engine);
  }

  public SimplePointerParam getSimplePointerParam() {
    return SimplePointerParam.instance();
  }

  public SimplePointerParam.Matcher getSimplePointerParam(final ViatraQueryEngine engine) {
    return SimplePointerParam.Matcher.on(engine);
  }
}
