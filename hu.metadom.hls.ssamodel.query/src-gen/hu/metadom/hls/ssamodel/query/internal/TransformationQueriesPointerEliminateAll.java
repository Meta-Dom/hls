/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesPointerEliminate.vql
 */
package hu.metadom.hls.ssamodel.query.internal;

import hu.metadom.hls.ssamodel.query.ArrayPointerParamR;
import hu.metadom.hls.ssamodel.query.ArrayPointerParamWR;
import hu.metadom.hls.ssamodel.query.AssignFromNoname;
import hu.metadom.hls.ssamodel.query.AssignToNoname;
import hu.metadom.hls.ssamodel.query.FunctionToDepointerParams;
import hu.metadom.hls.ssamodel.query.PointerTraceItemToCreate;
import hu.metadom.hls.ssamodel.query.PointerTraceToCreate;
import hu.metadom.hls.ssamodel.query.SimplePointerParam;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in transformationQueriesPointerEliminate.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>functionWithPointerParam</li>
 * <li>pointerTraceToCreate</li>
 * <li>pointerTraceItemToCreate</li>
 * <li>functionToDepointerParams</li>
 * <li>assignToNoname</li>
 * <li>assignFromNoname</li>
 * <li>paramCallPair</li>
 * <li>pointerParamInFunction</li>
 * <li>equals</li>
 * <li>equals_p</li>
 * <li>notArrayPointerVar</li>
 * <li>arrayPointerParamInFunction</li>
 * <li>notArrayPointerParamChain</li>
 * <li>arrayPointerParam</li>
 * <li>modifiedArrayBase</li>
 * <li>arrayPointerParamR</li>
 * <li>arrayPointerParamWR</li>
 * <li>notSimplePointerVar</li>
 * <li>simplePointerParamInFunction</li>
 * <li>notSimplePointerParamChain</li>
 * <li>simplePointerParam</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueriesPointerEliminateAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueriesPointerEliminateAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueriesPointerEliminateAll();
    }
    return INSTANCE;
  }

  private static TransformationQueriesPointerEliminateAll INSTANCE;

  private TransformationQueriesPointerEliminateAll() {
    querySpecifications.add(FunctionWithPointerParam.instance());
    querySpecifications.add(PointerTraceToCreate.instance());
    querySpecifications.add(PointerTraceItemToCreate.instance());
    querySpecifications.add(FunctionToDepointerParams.instance());
    querySpecifications.add(AssignToNoname.instance());
    querySpecifications.add(AssignFromNoname.instance());
    querySpecifications.add(ParamCallPair.instance());
    querySpecifications.add(PointerParamInFunction.instance());
    querySpecifications.add(Equals.instance());
    querySpecifications.add(Equals_p.instance());
    querySpecifications.add(NotArrayPointerVar.instance());
    querySpecifications.add(ArrayPointerParamInFunction.instance());
    querySpecifications.add(NotArrayPointerParamChain.instance());
    querySpecifications.add(ArrayPointerParam.instance());
    querySpecifications.add(ModifiedArrayBase.instance());
    querySpecifications.add(ArrayPointerParamR.instance());
    querySpecifications.add(ArrayPointerParamWR.instance());
    querySpecifications.add(NotSimplePointerVar.instance());
    querySpecifications.add(SimplePointerParamInFunction.instance());
    querySpecifications.add(NotSimplePointerParamChain.instance());
    querySpecifications.add(SimplePointerParam.instance());
  }
}
