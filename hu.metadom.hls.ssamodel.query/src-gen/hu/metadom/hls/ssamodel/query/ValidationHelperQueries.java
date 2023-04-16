/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationHelperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in validationHelperQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file validationHelperQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.metadom.hls.ssamodel.query, the group contains the definition of the following patterns: <ul>
 * <li>essentialTypeCategories</li>
 * <li>essentialTypesWideness</li>
 * <li>essentialTypesVoidBool</li>
 * <li>essentialTypesVoidBoolChar</li>
 * <li>essentialTypesVoidBoolCharSigned</li>
 * <li>essentialTypesVoidBoolCharUnsigned</li>
 * <li>essentialTypesVoidCharSignedUnsignedFloat</li>
 * <li>binaryOperand</li>
 * <li>binaryAddSubtract</li>
 * <li>binaryMultiplyDivideModulo</li>
 * <li>binaryCompare</li>
 * <li>binaryLogical</li>
 * <li>binaryShift</li>
 * <li>bothPrimitive</li>
 * <li>accessibleByRef</li>
 * <li>refOfType</li>
 * <li>typesForNode</li>
 * <li>binaryArithmetic</li>
 * <li>typesForArithmeticNode</li>
 * <li>typesForCompositeExpressions</li>
 * <li>ssaReferenceNotPointerOrArray</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ValidationHelperQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ValidationHelperQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new ValidationHelperQueries();
    }
    return INSTANCE;
  }

  private static ValidationHelperQueries INSTANCE;

  private ValidationHelperQueries() {
    querySpecifications.add(EssentialTypeCategories.instance());
    querySpecifications.add(EssentialTypesWideness.instance());
    querySpecifications.add(EssentialTypesVoidBool.instance());
    querySpecifications.add(EssentialTypesVoidBoolChar.instance());
    querySpecifications.add(EssentialTypesVoidBoolCharSigned.instance());
    querySpecifications.add(EssentialTypesVoidBoolCharUnsigned.instance());
    querySpecifications.add(EssentialTypesVoidCharSignedUnsignedFloat.instance());
    querySpecifications.add(BinaryOperand.instance());
    querySpecifications.add(BinaryAddSubtract.instance());
    querySpecifications.add(BinaryMultiplyDivideModulo.instance());
    querySpecifications.add(BinaryCompare.instance());
    querySpecifications.add(BinaryLogical.instance());
    querySpecifications.add(BinaryShift.instance());
    querySpecifications.add(BothPrimitive.instance());
    querySpecifications.add(AccessibleByRef.instance());
    querySpecifications.add(RefOfType.instance());
    querySpecifications.add(TypesForNode.instance());
    querySpecifications.add(BinaryArithmetic.instance());
    querySpecifications.add(TypesForArithmeticNode.instance());
    querySpecifications.add(TypesForCompositeExpressions.instance());
    querySpecifications.add(SsaReferenceNotPointerOrArray.instance());
  }

  public EssentialTypeCategories getEssentialTypeCategories() {
    return EssentialTypeCategories.instance();
  }

  public EssentialTypeCategories.Matcher getEssentialTypeCategories(final ViatraQueryEngine engine) {
    return EssentialTypeCategories.Matcher.on(engine);
  }

  public EssentialTypesWideness getEssentialTypesWideness() {
    return EssentialTypesWideness.instance();
  }

  public EssentialTypesWideness.Matcher getEssentialTypesWideness(final ViatraQueryEngine engine) {
    return EssentialTypesWideness.Matcher.on(engine);
  }

  public EssentialTypesVoidBool getEssentialTypesVoidBool() {
    return EssentialTypesVoidBool.instance();
  }

  public EssentialTypesVoidBool.Matcher getEssentialTypesVoidBool(final ViatraQueryEngine engine) {
    return EssentialTypesVoidBool.Matcher.on(engine);
  }

  public EssentialTypesVoidBoolChar getEssentialTypesVoidBoolChar() {
    return EssentialTypesVoidBoolChar.instance();
  }

  public EssentialTypesVoidBoolChar.Matcher getEssentialTypesVoidBoolChar(final ViatraQueryEngine engine) {
    return EssentialTypesVoidBoolChar.Matcher.on(engine);
  }

  public EssentialTypesVoidBoolCharSigned getEssentialTypesVoidBoolCharSigned() {
    return EssentialTypesVoidBoolCharSigned.instance();
  }

  public EssentialTypesVoidBoolCharSigned.Matcher getEssentialTypesVoidBoolCharSigned(final ViatraQueryEngine engine) {
    return EssentialTypesVoidBoolCharSigned.Matcher.on(engine);
  }

  public EssentialTypesVoidBoolCharUnsigned getEssentialTypesVoidBoolCharUnsigned() {
    return EssentialTypesVoidBoolCharUnsigned.instance();
  }

  public EssentialTypesVoidBoolCharUnsigned.Matcher getEssentialTypesVoidBoolCharUnsigned(final ViatraQueryEngine engine) {
    return EssentialTypesVoidBoolCharUnsigned.Matcher.on(engine);
  }

  public EssentialTypesVoidCharSignedUnsignedFloat getEssentialTypesVoidCharSignedUnsignedFloat() {
    return EssentialTypesVoidCharSignedUnsignedFloat.instance();
  }

  public EssentialTypesVoidCharSignedUnsignedFloat.Matcher getEssentialTypesVoidCharSignedUnsignedFloat(final ViatraQueryEngine engine) {
    return EssentialTypesVoidCharSignedUnsignedFloat.Matcher.on(engine);
  }

  public BinaryOperand getBinaryOperand() {
    return BinaryOperand.instance();
  }

  public BinaryOperand.Matcher getBinaryOperand(final ViatraQueryEngine engine) {
    return BinaryOperand.Matcher.on(engine);
  }

  public BinaryAddSubtract getBinaryAddSubtract() {
    return BinaryAddSubtract.instance();
  }

  public BinaryAddSubtract.Matcher getBinaryAddSubtract(final ViatraQueryEngine engine) {
    return BinaryAddSubtract.Matcher.on(engine);
  }

  public BinaryMultiplyDivideModulo getBinaryMultiplyDivideModulo() {
    return BinaryMultiplyDivideModulo.instance();
  }

  public BinaryMultiplyDivideModulo.Matcher getBinaryMultiplyDivideModulo(final ViatraQueryEngine engine) {
    return BinaryMultiplyDivideModulo.Matcher.on(engine);
  }

  public BinaryCompare getBinaryCompare() {
    return BinaryCompare.instance();
  }

  public BinaryCompare.Matcher getBinaryCompare(final ViatraQueryEngine engine) {
    return BinaryCompare.Matcher.on(engine);
  }

  public BinaryLogical getBinaryLogical() {
    return BinaryLogical.instance();
  }

  public BinaryLogical.Matcher getBinaryLogical(final ViatraQueryEngine engine) {
    return BinaryLogical.Matcher.on(engine);
  }

  public BinaryShift getBinaryShift() {
    return BinaryShift.instance();
  }

  public BinaryShift.Matcher getBinaryShift(final ViatraQueryEngine engine) {
    return BinaryShift.Matcher.on(engine);
  }

  public BothPrimitive getBothPrimitive() {
    return BothPrimitive.instance();
  }

  public BothPrimitive.Matcher getBothPrimitive(final ViatraQueryEngine engine) {
    return BothPrimitive.Matcher.on(engine);
  }

  public AccessibleByRef getAccessibleByRef() {
    return AccessibleByRef.instance();
  }

  public AccessibleByRef.Matcher getAccessibleByRef(final ViatraQueryEngine engine) {
    return AccessibleByRef.Matcher.on(engine);
  }

  public RefOfType getRefOfType() {
    return RefOfType.instance();
  }

  public RefOfType.Matcher getRefOfType(final ViatraQueryEngine engine) {
    return RefOfType.Matcher.on(engine);
  }

  public TypesForNode getTypesForNode() {
    return TypesForNode.instance();
  }

  public TypesForNode.Matcher getTypesForNode(final ViatraQueryEngine engine) {
    return TypesForNode.Matcher.on(engine);
  }

  public BinaryArithmetic getBinaryArithmetic() {
    return BinaryArithmetic.instance();
  }

  public BinaryArithmetic.Matcher getBinaryArithmetic(final ViatraQueryEngine engine) {
    return BinaryArithmetic.Matcher.on(engine);
  }

  public TypesForArithmeticNode getTypesForArithmeticNode() {
    return TypesForArithmeticNode.instance();
  }

  public TypesForArithmeticNode.Matcher getTypesForArithmeticNode(final ViatraQueryEngine engine) {
    return TypesForArithmeticNode.Matcher.on(engine);
  }

  public TypesForCompositeExpressions getTypesForCompositeExpressions() {
    return TypesForCompositeExpressions.instance();
  }

  public TypesForCompositeExpressions.Matcher getTypesForCompositeExpressions(final ViatraQueryEngine engine) {
    return TypesForCompositeExpressions.Matcher.on(engine);
  }

  public SsaReferenceNotPointerOrArray getSsaReferenceNotPointerOrArray() {
    return SsaReferenceNotPointerOrArray.instance();
  }

  public SsaReferenceNotPointerOrArray.Matcher getSsaReferenceNotPointerOrArray(final ViatraQueryEngine engine) {
    return SsaReferenceNotPointerOrArray.Matcher.on(engine);
  }
}
