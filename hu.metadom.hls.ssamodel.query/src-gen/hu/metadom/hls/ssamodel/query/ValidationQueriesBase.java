/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesBase.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in validationQueriesBase.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file validationQueriesBase.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>wrongReturn</li>
 * <li>undefIsUsed</li>
 * <li>valueNotUsed</li>
 * <li>gotoPresent</li>
 * <li>switchFallThrough</li>
 * <li>breakContinueReturnIsNotLast</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationQueriesBase extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationQueriesBase instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationQueriesBase();
    }
    return INSTANCE;
  }

  private static ValidationQueriesBase INSTANCE;

  private ValidationQueriesBase() {
    querySpecifications.add(WrongReturn.instance());
    querySpecifications.add(UndefIsUsed.instance());
    querySpecifications.add(ValueNotUsed.instance());
    querySpecifications.add(GotoPresent.instance());
    querySpecifications.add(SwitchFallThrough.instance());
    querySpecifications.add(BreakContinueReturnIsNotLast.instance());
  }

  public WrongReturn getWrongReturn() {
    return WrongReturn.instance();
  }

  public WrongReturn.Matcher getWrongReturn(final ViatraQueryEngine engine) {
    return WrongReturn.Matcher.on(engine);
  }

  public UndefIsUsed getUndefIsUsed() {
    return UndefIsUsed.instance();
  }

  public UndefIsUsed.Matcher getUndefIsUsed(final ViatraQueryEngine engine) {
    return UndefIsUsed.Matcher.on(engine);
  }

  public ValueNotUsed getValueNotUsed() {
    return ValueNotUsed.instance();
  }

  public ValueNotUsed.Matcher getValueNotUsed(final ViatraQueryEngine engine) {
    return ValueNotUsed.Matcher.on(engine);
  }

  public GotoPresent getGotoPresent() {
    return GotoPresent.instance();
  }

  public GotoPresent.Matcher getGotoPresent(final ViatraQueryEngine engine) {
    return GotoPresent.Matcher.on(engine);
  }

  public SwitchFallThrough getSwitchFallThrough() {
    return SwitchFallThrough.instance();
  }

  public SwitchFallThrough.Matcher getSwitchFallThrough(final ViatraQueryEngine engine) {
    return SwitchFallThrough.Matcher.on(engine);
  }

  public BreakContinueReturnIsNotLast getBreakContinueReturnIsNotLast() {
    return BreakContinueReturnIsNotLast.instance();
  }

  public BreakContinueReturnIsNotLast.Matcher getBreakContinueReturnIsNotLast(final ViatraQueryEngine engine) {
    return BreakContinueReturnIsNotLast.Matcher.on(engine);
  }
}
