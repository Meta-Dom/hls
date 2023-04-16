/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/helperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in helperQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file helperQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>reachableFromDowhile</li>
 * <li>blockInBlockWithDoWhile</li>
 * <li>blockInBlockOnlySwitch</li>
 * <li>reachableNodesNoDowhile</li>
 * <li>reachableNodesNoDowhile2</li>
 * <li>switchInnerBlock</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class HelperQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static HelperQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new HelperQueries();
    }
    return INSTANCE;
  }

  private static HelperQueries INSTANCE;

  private HelperQueries() {
    querySpecifications.add(ReachableFromDowhile.instance());
    querySpecifications.add(BlockInBlockWithDoWhile.instance());
    querySpecifications.add(BlockInBlockOnlySwitch.instance());
    querySpecifications.add(ReachableNodesNoDowhile.instance());
    querySpecifications.add(ReachableNodesNoDowhile2.instance());
    querySpecifications.add(SwitchInnerBlock.instance());
  }

  public ReachableFromDowhile getReachableFromDowhile() {
    return ReachableFromDowhile.instance();
  }

  public ReachableFromDowhile.Matcher getReachableFromDowhile(final ViatraQueryEngine engine) {
    return ReachableFromDowhile.Matcher.on(engine);
  }

  public BlockInBlockWithDoWhile getBlockInBlockWithDoWhile() {
    return BlockInBlockWithDoWhile.instance();
  }

  public BlockInBlockWithDoWhile.Matcher getBlockInBlockWithDoWhile(final ViatraQueryEngine engine) {
    return BlockInBlockWithDoWhile.Matcher.on(engine);
  }

  public BlockInBlockOnlySwitch getBlockInBlockOnlySwitch() {
    return BlockInBlockOnlySwitch.instance();
  }

  public BlockInBlockOnlySwitch.Matcher getBlockInBlockOnlySwitch(final ViatraQueryEngine engine) {
    return BlockInBlockOnlySwitch.Matcher.on(engine);
  }

  public ReachableNodesNoDowhile getReachableNodesNoDowhile() {
    return ReachableNodesNoDowhile.instance();
  }

  public ReachableNodesNoDowhile.Matcher getReachableNodesNoDowhile(final ViatraQueryEngine engine) {
    return ReachableNodesNoDowhile.Matcher.on(engine);
  }

  public ReachableNodesNoDowhile2 getReachableNodesNoDowhile2() {
    return ReachableNodesNoDowhile2.instance();
  }

  public ReachableNodesNoDowhile2.Matcher getReachableNodesNoDowhile2(final ViatraQueryEngine engine) {
    return ReachableNodesNoDowhile2.Matcher.on(engine);
  }

  public SwitchInnerBlock getSwitchInnerBlock() {
    return SwitchInnerBlock.instance();
  }

  public SwitchInnerBlock.Matcher getSwitchInnerBlock(final ViatraQueryEngine engine) {
    return SwitchInnerBlock.Matcher.on(engine);
  }
}
