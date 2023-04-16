/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesArgumentSimplifier.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in transformationQueriesArgumentSimplifier.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file transformationQueriesArgumentSimplifier.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>argumentPair</li>
 * <li>usedByUnaryAddress</li>
 * <li>readonlyParameters</li>
 * <li>usedOutputParameter</li>
 * <li>notUsedOutputParameter</li>
 * <li>writeonlyParameters</li>
 * <li>noneDirectionArguments</li>
 * <li>noneDirectionParameters</li>
 * <li>argumentOfUnusedParam</li>
 * <li>unusedVar</li>
 * <li>unusedParam</li>
 * <li>unusedPhi</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueriesArgumentSimplifier extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueriesArgumentSimplifier instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueriesArgumentSimplifier();
    }
    return INSTANCE;
  }

  private static TransformationQueriesArgumentSimplifier INSTANCE;

  private TransformationQueriesArgumentSimplifier() {
    querySpecifications.add(ArgumentPair.instance());
    querySpecifications.add(UsedByUnaryAddress.instance());
    querySpecifications.add(ReadonlyParameters.instance());
    querySpecifications.add(UsedOutputParameter.instance());
    querySpecifications.add(NotUsedOutputParameter.instance());
    querySpecifications.add(WriteonlyParameters.instance());
    querySpecifications.add(NoneDirectionArguments.instance());
    querySpecifications.add(NoneDirectionParameters.instance());
    querySpecifications.add(ArgumentOfUnusedParam.instance());
    querySpecifications.add(UnusedVar.instance());
    querySpecifications.add(UnusedParam.instance());
    querySpecifications.add(UnusedPhi.instance());
  }

  public ArgumentPair getArgumentPair() {
    return ArgumentPair.instance();
  }

  public ArgumentPair.Matcher getArgumentPair(final ViatraQueryEngine engine) {
    return ArgumentPair.Matcher.on(engine);
  }

  public UsedByUnaryAddress getUsedByUnaryAddress() {
    return UsedByUnaryAddress.instance();
  }

  public UsedByUnaryAddress.Matcher getUsedByUnaryAddress(final ViatraQueryEngine engine) {
    return UsedByUnaryAddress.Matcher.on(engine);
  }

  public ReadonlyParameters getReadonlyParameters() {
    return ReadonlyParameters.instance();
  }

  public ReadonlyParameters.Matcher getReadonlyParameters(final ViatraQueryEngine engine) {
    return ReadonlyParameters.Matcher.on(engine);
  }

  public UsedOutputParameter getUsedOutputParameter() {
    return UsedOutputParameter.instance();
  }

  public UsedOutputParameter.Matcher getUsedOutputParameter(final ViatraQueryEngine engine) {
    return UsedOutputParameter.Matcher.on(engine);
  }

  public NotUsedOutputParameter getNotUsedOutputParameter() {
    return NotUsedOutputParameter.instance();
  }

  public NotUsedOutputParameter.Matcher getNotUsedOutputParameter(final ViatraQueryEngine engine) {
    return NotUsedOutputParameter.Matcher.on(engine);
  }

  public WriteonlyParameters getWriteonlyParameters() {
    return WriteonlyParameters.instance();
  }

  public WriteonlyParameters.Matcher getWriteonlyParameters(final ViatraQueryEngine engine) {
    return WriteonlyParameters.Matcher.on(engine);
  }

  public NoneDirectionArguments getNoneDirectionArguments() {
    return NoneDirectionArguments.instance();
  }

  public NoneDirectionArguments.Matcher getNoneDirectionArguments(final ViatraQueryEngine engine) {
    return NoneDirectionArguments.Matcher.on(engine);
  }

  public NoneDirectionParameters getNoneDirectionParameters() {
    return NoneDirectionParameters.instance();
  }

  public NoneDirectionParameters.Matcher getNoneDirectionParameters(final ViatraQueryEngine engine) {
    return NoneDirectionParameters.Matcher.on(engine);
  }

  public ArgumentOfUnusedParam getArgumentOfUnusedParam() {
    return ArgumentOfUnusedParam.instance();
  }

  public ArgumentOfUnusedParam.Matcher getArgumentOfUnusedParam(final ViatraQueryEngine engine) {
    return ArgumentOfUnusedParam.Matcher.on(engine);
  }

  public UnusedVar getUnusedVar() {
    return UnusedVar.instance();
  }

  public UnusedVar.Matcher getUnusedVar(final ViatraQueryEngine engine) {
    return UnusedVar.Matcher.on(engine);
  }

  public UnusedParam getUnusedParam() {
    return UnusedParam.instance();
  }

  public UnusedParam.Matcher getUnusedParam(final ViatraQueryEngine engine) {
    return UnusedParam.Matcher.on(engine);
  }

  public UnusedPhi getUnusedPhi() {
    return UnusedPhi.instance();
  }

  public UnusedPhi.Matcher getUnusedPhi(final ViatraQueryEngine engine) {
    return UnusedPhi.Matcher.on(engine);
  }
}
