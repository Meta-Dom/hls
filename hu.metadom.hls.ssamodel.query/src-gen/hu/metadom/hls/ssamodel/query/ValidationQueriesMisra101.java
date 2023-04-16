/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesMisra101.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in validationQueriesMisra101.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file validationQueriesMisra101.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>unaryPositiveInappropriateTypes</li>
 * <li>unaryNegativeInappropriateTypes</li>
 * <li>binaryAddSubtractInappropriateTypes</li>
 * <li>binaryMultiplyDivideModuloInappropriateTypes</li>
 * <li>binaryCompareInappropriateTypes</li>
 * <li>unaryNegationInappropriateTypes</li>
 * <li>binaryLogicalInappropriateTypes</li>
 * <li>binaryShiftInappropriateTypes</li>
 * <li>binaryBitInappropriateTypes</li>
 * <li>unaryComplementInappropriateTypes</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationQueriesMisra101 extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationQueriesMisra101 instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationQueriesMisra101();
    }
    return INSTANCE;
  }

  private static ValidationQueriesMisra101 INSTANCE;

  private ValidationQueriesMisra101() {
    querySpecifications.add(UnaryPositiveInappropriateTypes.instance());
    querySpecifications.add(UnaryNegativeInappropriateTypes.instance());
    querySpecifications.add(BinaryAddSubtractInappropriateTypes.instance());
    querySpecifications.add(BinaryMultiplyDivideModuloInappropriateTypes.instance());
    querySpecifications.add(BinaryCompareInappropriateTypes.instance());
    querySpecifications.add(UnaryNegationInappropriateTypes.instance());
    querySpecifications.add(BinaryLogicalInappropriateTypes.instance());
    querySpecifications.add(BinaryShiftInappropriateTypes.instance());
    querySpecifications.add(BinaryBitInappropriateTypes.instance());
    querySpecifications.add(UnaryComplementInappropriateTypes.instance());
  }

  public UnaryPositiveInappropriateTypes getUnaryPositiveInappropriateTypes() {
    return UnaryPositiveInappropriateTypes.instance();
  }

  public UnaryPositiveInappropriateTypes.Matcher getUnaryPositiveInappropriateTypes(final ViatraQueryEngine engine) {
    return UnaryPositiveInappropriateTypes.Matcher.on(engine);
  }

  public UnaryNegativeInappropriateTypes getUnaryNegativeInappropriateTypes() {
    return UnaryNegativeInappropriateTypes.instance();
  }

  public UnaryNegativeInappropriateTypes.Matcher getUnaryNegativeInappropriateTypes(final ViatraQueryEngine engine) {
    return UnaryNegativeInappropriateTypes.Matcher.on(engine);
  }

  public BinaryAddSubtractInappropriateTypes getBinaryAddSubtractInappropriateTypes() {
    return BinaryAddSubtractInappropriateTypes.instance();
  }

  public BinaryAddSubtractInappropriateTypes.Matcher getBinaryAddSubtractInappropriateTypes(final ViatraQueryEngine engine) {
    return BinaryAddSubtractInappropriateTypes.Matcher.on(engine);
  }

  public BinaryMultiplyDivideModuloInappropriateTypes getBinaryMultiplyDivideModuloInappropriateTypes() {
    return BinaryMultiplyDivideModuloInappropriateTypes.instance();
  }

  public BinaryMultiplyDivideModuloInappropriateTypes.Matcher getBinaryMultiplyDivideModuloInappropriateTypes(final ViatraQueryEngine engine) {
    return BinaryMultiplyDivideModuloInappropriateTypes.Matcher.on(engine);
  }

  public BinaryCompareInappropriateTypes getBinaryCompareInappropriateTypes() {
    return BinaryCompareInappropriateTypes.instance();
  }

  public BinaryCompareInappropriateTypes.Matcher getBinaryCompareInappropriateTypes(final ViatraQueryEngine engine) {
    return BinaryCompareInappropriateTypes.Matcher.on(engine);
  }

  public UnaryNegationInappropriateTypes getUnaryNegationInappropriateTypes() {
    return UnaryNegationInappropriateTypes.instance();
  }

  public UnaryNegationInappropriateTypes.Matcher getUnaryNegationInappropriateTypes(final ViatraQueryEngine engine) {
    return UnaryNegationInappropriateTypes.Matcher.on(engine);
  }

  public BinaryLogicalInappropriateTypes getBinaryLogicalInappropriateTypes() {
    return BinaryLogicalInappropriateTypes.instance();
  }

  public BinaryLogicalInappropriateTypes.Matcher getBinaryLogicalInappropriateTypes(final ViatraQueryEngine engine) {
    return BinaryLogicalInappropriateTypes.Matcher.on(engine);
  }

  public BinaryShiftInappropriateTypes getBinaryShiftInappropriateTypes() {
    return BinaryShiftInappropriateTypes.instance();
  }

  public BinaryShiftInappropriateTypes.Matcher getBinaryShiftInappropriateTypes(final ViatraQueryEngine engine) {
    return BinaryShiftInappropriateTypes.Matcher.on(engine);
  }

  public BinaryBitInappropriateTypes getBinaryBitInappropriateTypes() {
    return BinaryBitInappropriateTypes.instance();
  }

  public BinaryBitInappropriateTypes.Matcher getBinaryBitInappropriateTypes(final ViatraQueryEngine engine) {
    return BinaryBitInappropriateTypes.Matcher.on(engine);
  }

  public UnaryComplementInappropriateTypes getUnaryComplementInappropriateTypes() {
    return UnaryComplementInappropriateTypes.instance();
  }

  public UnaryComplementInappropriateTypes.Matcher getUnaryComplementInappropriateTypes(final ViatraQueryEngine engine) {
    return UnaryComplementInappropriateTypes.Matcher.on(engine);
  }
}
