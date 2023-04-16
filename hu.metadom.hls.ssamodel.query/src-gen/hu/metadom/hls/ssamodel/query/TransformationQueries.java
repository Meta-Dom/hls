/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in transformationQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file transformationQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>unusedNode</li>
 * <li>typeNameWithSpace</li>
 * <li>redundantAddressOperator</li>
 * <li>arrayWriteCascade</li>
 * <li>arrayReadCascade</li>
 * <li>unnamedIndirectOrArrayWrite</li>
 * <li>assignToNonameAndUsage</li>
 * <li>unusedPostIncDecAssign</li>
 * <li>originPostIncDecNode</li>
 * <li>multipleConsumerNonameNode</li>
 * <li>functionWithPassByRefParam</li>
 * <li>callWithPassByRefArgument</li>
 * <li>loopPhi</li>
 * <li>cSsaSwitch</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TransformationQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransformationQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new TransformationQueries();
    }
    return INSTANCE;
  }

  private static TransformationQueries INSTANCE;

  private TransformationQueries() {
    querySpecifications.add(UnusedNode.instance());
    querySpecifications.add(TypeNameWithSpace.instance());
    querySpecifications.add(RedundantAddressOperator.instance());
    querySpecifications.add(ArrayWriteCascade.instance());
    querySpecifications.add(ArrayReadCascade.instance());
    querySpecifications.add(UnnamedIndirectOrArrayWrite.instance());
    querySpecifications.add(AssignToNonameAndUsage.instance());
    querySpecifications.add(UnusedPostIncDecAssign.instance());
    querySpecifications.add(OriginPostIncDecNode.instance());
    querySpecifications.add(MultipleConsumerNonameNode.instance());
    querySpecifications.add(FunctionWithPassByRefParam.instance());
    querySpecifications.add(CallWithPassByRefArgument.instance());
    querySpecifications.add(LoopPhi.instance());
    querySpecifications.add(CSsaSwitch.instance());
  }

  public UnusedNode getUnusedNode() {
    return UnusedNode.instance();
  }

  public UnusedNode.Matcher getUnusedNode(final ViatraQueryEngine engine) {
    return UnusedNode.Matcher.on(engine);
  }

  public TypeNameWithSpace getTypeNameWithSpace() {
    return TypeNameWithSpace.instance();
  }

  public TypeNameWithSpace.Matcher getTypeNameWithSpace(final ViatraQueryEngine engine) {
    return TypeNameWithSpace.Matcher.on(engine);
  }

  public RedundantAddressOperator getRedundantAddressOperator() {
    return RedundantAddressOperator.instance();
  }

  public RedundantAddressOperator.Matcher getRedundantAddressOperator(final ViatraQueryEngine engine) {
    return RedundantAddressOperator.Matcher.on(engine);
  }

  public ArrayWriteCascade getArrayWriteCascade() {
    return ArrayWriteCascade.instance();
  }

  public ArrayWriteCascade.Matcher getArrayWriteCascade(final ViatraQueryEngine engine) {
    return ArrayWriteCascade.Matcher.on(engine);
  }

  public ArrayReadCascade getArrayReadCascade() {
    return ArrayReadCascade.instance();
  }

  public ArrayReadCascade.Matcher getArrayReadCascade(final ViatraQueryEngine engine) {
    return ArrayReadCascade.Matcher.on(engine);
  }

  public UnnamedIndirectOrArrayWrite getUnnamedIndirectOrArrayWrite() {
    return UnnamedIndirectOrArrayWrite.instance();
  }

  public UnnamedIndirectOrArrayWrite.Matcher getUnnamedIndirectOrArrayWrite(final ViatraQueryEngine engine) {
    return UnnamedIndirectOrArrayWrite.Matcher.on(engine);
  }

  public AssignToNonameAndUsage getAssignToNonameAndUsage() {
    return AssignToNonameAndUsage.instance();
  }

  public AssignToNonameAndUsage.Matcher getAssignToNonameAndUsage(final ViatraQueryEngine engine) {
    return AssignToNonameAndUsage.Matcher.on(engine);
  }

  public UnusedPostIncDecAssign getUnusedPostIncDecAssign() {
    return UnusedPostIncDecAssign.instance();
  }

  public UnusedPostIncDecAssign.Matcher getUnusedPostIncDecAssign(final ViatraQueryEngine engine) {
    return UnusedPostIncDecAssign.Matcher.on(engine);
  }

  public OriginPostIncDecNode getOriginPostIncDecNode() {
    return OriginPostIncDecNode.instance();
  }

  public OriginPostIncDecNode.Matcher getOriginPostIncDecNode(final ViatraQueryEngine engine) {
    return OriginPostIncDecNode.Matcher.on(engine);
  }

  public MultipleConsumerNonameNode getMultipleConsumerNonameNode() {
    return MultipleConsumerNonameNode.instance();
  }

  public MultipleConsumerNonameNode.Matcher getMultipleConsumerNonameNode(final ViatraQueryEngine engine) {
    return MultipleConsumerNonameNode.Matcher.on(engine);
  }

  public FunctionWithPassByRefParam getFunctionWithPassByRefParam() {
    return FunctionWithPassByRefParam.instance();
  }

  public FunctionWithPassByRefParam.Matcher getFunctionWithPassByRefParam(final ViatraQueryEngine engine) {
    return FunctionWithPassByRefParam.Matcher.on(engine);
  }

  public CallWithPassByRefArgument getCallWithPassByRefArgument() {
    return CallWithPassByRefArgument.instance();
  }

  public CallWithPassByRefArgument.Matcher getCallWithPassByRefArgument(final ViatraQueryEngine engine) {
    return CallWithPassByRefArgument.Matcher.on(engine);
  }

  public LoopPhi getLoopPhi() {
    return LoopPhi.instance();
  }

  public LoopPhi.Matcher getLoopPhi(final ViatraQueryEngine engine) {
    return LoopPhi.Matcher.on(engine);
  }

  public CSsaSwitch getCSsaSwitch() {
    return CSsaSwitch.instance();
  }

  public CSsaSwitch.Matcher getCSsaSwitch(final ViatraQueryEngine engine) {
    return CSsaSwitch.Matcher.on(engine);
  }
}
