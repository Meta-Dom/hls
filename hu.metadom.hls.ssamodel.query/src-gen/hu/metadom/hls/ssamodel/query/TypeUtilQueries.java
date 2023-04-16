/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/typeUtilQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in typeUtilQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file typeUtilQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>ssaFunction</li>
 * <li>ssaCall</li>
 * <li>ssaAssign</li>
 * <li>ssaIndirectRead</li>
 * <li>ssaIndirectWrite</li>
 * <li>filePosition</li>
 * <li>ssaInitValue</li>
 * <li>ssaNodeVar</li>
 * <li>ssaCallFunction</li>
 * <li>ssaArgumentNode</li>
 * <li>ssaArgumentParam</li>
 * <li>ssaPassByRefArgumentParam</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class TypeUtilQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TypeUtilQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new TypeUtilQueries();
    }
    return INSTANCE;
  }

  private static TypeUtilQueries INSTANCE;

  private TypeUtilQueries() {
    querySpecifications.add(SsaFunction.instance());
    querySpecifications.add(SsaCall.instance());
    querySpecifications.add(SsaAssign.instance());
    querySpecifications.add(SsaIndirectRead.instance());
    querySpecifications.add(SsaIndirectWrite.instance());
    querySpecifications.add(FilePosition.instance());
    querySpecifications.add(SsaInitValue.instance());
    querySpecifications.add(SsaNodeVar.instance());
    querySpecifications.add(SsaCallFunction.instance());
    querySpecifications.add(SsaArgumentNode.instance());
    querySpecifications.add(SsaArgumentParam.instance());
    querySpecifications.add(SsaPassByRefArgumentParam.instance());
  }

  public SsaFunction getSsaFunction() {
    return SsaFunction.instance();
  }

  public SsaFunction.Matcher getSsaFunction(final ViatraQueryEngine engine) {
    return SsaFunction.Matcher.on(engine);
  }

  public SsaCall getSsaCall() {
    return SsaCall.instance();
  }

  public SsaCall.Matcher getSsaCall(final ViatraQueryEngine engine) {
    return SsaCall.Matcher.on(engine);
  }

  public SsaAssign getSsaAssign() {
    return SsaAssign.instance();
  }

  public SsaAssign.Matcher getSsaAssign(final ViatraQueryEngine engine) {
    return SsaAssign.Matcher.on(engine);
  }

  public SsaIndirectRead getSsaIndirectRead() {
    return SsaIndirectRead.instance();
  }

  public SsaIndirectRead.Matcher getSsaIndirectRead(final ViatraQueryEngine engine) {
    return SsaIndirectRead.Matcher.on(engine);
  }

  public SsaIndirectWrite getSsaIndirectWrite() {
    return SsaIndirectWrite.instance();
  }

  public SsaIndirectWrite.Matcher getSsaIndirectWrite(final ViatraQueryEngine engine) {
    return SsaIndirectWrite.Matcher.on(engine);
  }

  public FilePosition getFilePosition() {
    return FilePosition.instance();
  }

  public FilePosition.Matcher getFilePosition(final ViatraQueryEngine engine) {
    return FilePosition.Matcher.on(engine);
  }

  public SsaInitValue getSsaInitValue() {
    return SsaInitValue.instance();
  }

  public SsaInitValue.Matcher getSsaInitValue(final ViatraQueryEngine engine) {
    return SsaInitValue.Matcher.on(engine);
  }

  public SsaNodeVar getSsaNodeVar() {
    return SsaNodeVar.instance();
  }

  public SsaNodeVar.Matcher getSsaNodeVar(final ViatraQueryEngine engine) {
    return SsaNodeVar.Matcher.on(engine);
  }

  public SsaCallFunction getSsaCallFunction() {
    return SsaCallFunction.instance();
  }

  public SsaCallFunction.Matcher getSsaCallFunction(final ViatraQueryEngine engine) {
    return SsaCallFunction.Matcher.on(engine);
  }

  public SsaArgumentNode getSsaArgumentNode() {
    return SsaArgumentNode.instance();
  }

  public SsaArgumentNode.Matcher getSsaArgumentNode(final ViatraQueryEngine engine) {
    return SsaArgumentNode.Matcher.on(engine);
  }

  public SsaArgumentParam getSsaArgumentParam() {
    return SsaArgumentParam.instance();
  }

  public SsaArgumentParam.Matcher getSsaArgumentParam(final ViatraQueryEngine engine) {
    return SsaArgumentParam.Matcher.on(engine);
  }

  public SsaPassByRefArgumentParam getSsaPassByRefArgumentParam() {
    return SsaPassByRefArgumentParam.instance();
  }

  public SsaPassByRefArgumentParam.Matcher getSsaPassByRefArgumentParam(final ViatraQueryEngine engine) {
    return SsaPassByRefArgumentParam.Matcher.on(engine);
  }
}
