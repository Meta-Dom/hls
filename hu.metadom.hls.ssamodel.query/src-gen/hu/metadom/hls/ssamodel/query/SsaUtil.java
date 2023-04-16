/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in ssaUtil.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ssaUtil.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>blockInBlock</li>
 * <li>reachableBlock</li>
 * <li>nodeOrInnerNode</li>
 * <li>functionNode</li>
 * <li>functionCallInFunction</li>
 * <li>functionCallPair</li>
 * <li>innerInitList</li>
 * <li>allInitList</li>
 * <li>nodeUseNode</li>
 * <li>nodeUseNodeIndirectly</li>
 * <li>produceNode</li>
 * <li>controlNode</li>
 * <li>originName</li>
 * <li>simplePointerLeft</li>
 * <li>simplePointerRight</li>
 * <li>arrayPointerLeft</li>
 * <li>arrayPointerRight</li>
 * <li>varNodeUseNonameNode</li>
 * <li>functionReturn</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SsaUtil extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SsaUtil instance() {
    if (INSTANCE == null) {
        INSTANCE = new SsaUtil();
    }
    return INSTANCE;
  }

  private static SsaUtil INSTANCE;

  private SsaUtil() {
    querySpecifications.add(BlockInBlock.instance());
    querySpecifications.add(ReachableBlock.instance());
    querySpecifications.add(NodeOrInnerNode.instance());
    querySpecifications.add(FunctionNode.instance());
    querySpecifications.add(FunctionCallInFunction.instance());
    querySpecifications.add(FunctionCallPair.instance());
    querySpecifications.add(InnerInitList.instance());
    querySpecifications.add(AllInitList.instance());
    querySpecifications.add(NodeUseNode.instance());
    querySpecifications.add(NodeUseNodeIndirectly.instance());
    querySpecifications.add(ProduceNode.instance());
    querySpecifications.add(ControlNode.instance());
    querySpecifications.add(OriginName.instance());
    querySpecifications.add(SimplePointerLeft.instance());
    querySpecifications.add(SimplePointerRight.instance());
    querySpecifications.add(ArrayPointerLeft.instance());
    querySpecifications.add(ArrayPointerRight.instance());
    querySpecifications.add(VarNodeUseNonameNode.instance());
    querySpecifications.add(FunctionReturn.instance());
  }

  public BlockInBlock getBlockInBlock() {
    return BlockInBlock.instance();
  }

  public BlockInBlock.Matcher getBlockInBlock(final ViatraQueryEngine engine) {
    return BlockInBlock.Matcher.on(engine);
  }

  public ReachableBlock getReachableBlock() {
    return ReachableBlock.instance();
  }

  public ReachableBlock.Matcher getReachableBlock(final ViatraQueryEngine engine) {
    return ReachableBlock.Matcher.on(engine);
  }

  public NodeOrInnerNode getNodeOrInnerNode() {
    return NodeOrInnerNode.instance();
  }

  public NodeOrInnerNode.Matcher getNodeOrInnerNode(final ViatraQueryEngine engine) {
    return NodeOrInnerNode.Matcher.on(engine);
  }

  public FunctionNode getFunctionNode() {
    return FunctionNode.instance();
  }

  public FunctionNode.Matcher getFunctionNode(final ViatraQueryEngine engine) {
    return FunctionNode.Matcher.on(engine);
  }

  public FunctionCallInFunction getFunctionCallInFunction() {
    return FunctionCallInFunction.instance();
  }

  public FunctionCallInFunction.Matcher getFunctionCallInFunction(final ViatraQueryEngine engine) {
    return FunctionCallInFunction.Matcher.on(engine);
  }

  public FunctionCallPair getFunctionCallPair() {
    return FunctionCallPair.instance();
  }

  public FunctionCallPair.Matcher getFunctionCallPair(final ViatraQueryEngine engine) {
    return FunctionCallPair.Matcher.on(engine);
  }

  public InnerInitList getInnerInitList() {
    return InnerInitList.instance();
  }

  public InnerInitList.Matcher getInnerInitList(final ViatraQueryEngine engine) {
    return InnerInitList.Matcher.on(engine);
  }

  public AllInitList getAllInitList() {
    return AllInitList.instance();
  }

  public AllInitList.Matcher getAllInitList(final ViatraQueryEngine engine) {
    return AllInitList.Matcher.on(engine);
  }

  public NodeUseNode getNodeUseNode() {
    return NodeUseNode.instance();
  }

  public NodeUseNode.Matcher getNodeUseNode(final ViatraQueryEngine engine) {
    return NodeUseNode.Matcher.on(engine);
  }

  public NodeUseNodeIndirectly getNodeUseNodeIndirectly() {
    return NodeUseNodeIndirectly.instance();
  }

  public NodeUseNodeIndirectly.Matcher getNodeUseNodeIndirectly(final ViatraQueryEngine engine) {
    return NodeUseNodeIndirectly.Matcher.on(engine);
  }

  public ProduceNode getProduceNode() {
    return ProduceNode.instance();
  }

  public ProduceNode.Matcher getProduceNode(final ViatraQueryEngine engine) {
    return ProduceNode.Matcher.on(engine);
  }

  public ControlNode getControlNode() {
    return ControlNode.instance();
  }

  public ControlNode.Matcher getControlNode(final ViatraQueryEngine engine) {
    return ControlNode.Matcher.on(engine);
  }

  public OriginName getOriginName() {
    return OriginName.instance();
  }

  public OriginName.Matcher getOriginName(final ViatraQueryEngine engine) {
    return OriginName.Matcher.on(engine);
  }

  public SimplePointerLeft getSimplePointerLeft() {
    return SimplePointerLeft.instance();
  }

  public SimplePointerLeft.Matcher getSimplePointerLeft(final ViatraQueryEngine engine) {
    return SimplePointerLeft.Matcher.on(engine);
  }

  public SimplePointerRight getSimplePointerRight() {
    return SimplePointerRight.instance();
  }

  public SimplePointerRight.Matcher getSimplePointerRight(final ViatraQueryEngine engine) {
    return SimplePointerRight.Matcher.on(engine);
  }

  public ArrayPointerLeft getArrayPointerLeft() {
    return ArrayPointerLeft.instance();
  }

  public ArrayPointerLeft.Matcher getArrayPointerLeft(final ViatraQueryEngine engine) {
    return ArrayPointerLeft.Matcher.on(engine);
  }

  public ArrayPointerRight getArrayPointerRight() {
    return ArrayPointerRight.instance();
  }

  public ArrayPointerRight.Matcher getArrayPointerRight(final ViatraQueryEngine engine) {
    return ArrayPointerRight.Matcher.on(engine);
  }

  public VarNodeUseNonameNode getVarNodeUseNonameNode() {
    return VarNodeUseNonameNode.instance();
  }

  public VarNodeUseNonameNode.Matcher getVarNodeUseNonameNode(final ViatraQueryEngine engine) {
    return VarNodeUseNonameNode.Matcher.on(engine);
  }

  public FunctionReturn getFunctionReturn() {
    return FunctionReturn.instance();
  }

  public FunctionReturn.Matcher getFunctionReturn(final ViatraQueryEngine engine) {
    return FunctionReturn.Matcher.on(engine);
  }
}
