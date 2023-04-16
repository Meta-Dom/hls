/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesMisra101.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaBinaryOperator;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // Misra C 10.1 Binary + (Add) and Binary - (Subtract) Operators
 *         //Should run at the end of the generation
 *         {@literal @}Constraint(
 *         	targetEditorId = "",
 *         	key = {op},
 *         	severity = "error",
 *         	message = "The type is not appropriate for the operator."
 *         )
 *         pattern binaryAddSubtractInappropriateTypes(op: SsaBinaryOperator){
 *         	find binaryAddSubtract(op);
 *         	find binaryOperand(op, r);
 *         	find accessibleByRef(t, r);
 *         	PrimitiveType(t);
 *         	find essentialTypesVoidBool(t, 1);
 *         } or {
 *         	find binaryAddSubtract(op);
 *         	find binaryOperand(op, t);
 *         	Enum(t);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BinaryAddSubtractInappropriateTypes extends BaseGeneratedEMFQuerySpecification<BinaryAddSubtractInappropriateTypes.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.binaryAddSubtractInappropriateTypes pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private SsaBinaryOperator fOp;

    private static List<String> parameterNames = makeImmutableList("op");

    private Match(final SsaBinaryOperator pOp) {
      this.fOp = pOp;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "op": return this.fOp;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fOp;
          default: return null;
      }
    }

    public SsaBinaryOperator getOp() {
      return this.fOp;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("op".equals(parameterName) ) {
          this.fOp = (SsaBinaryOperator) newValue;
          return true;
      }
      return false;
    }

    public void setOp(final SsaBinaryOperator pOp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOp = pOp;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.binaryAddSubtractInappropriateTypes";
    }

    @Override
    public List<String> parameterNames() {
      return BinaryAddSubtractInappropriateTypes.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fOp};
    }

    @Override
    public BinaryAddSubtractInappropriateTypes.Match toImmutable() {
      return isMutable() ? newMatch(fOp) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"op\"=" + prettyPrintValue(fOp));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fOp);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BinaryAddSubtractInappropriateTypes.Match)) {
          BinaryAddSubtractInappropriateTypes.Match other = (BinaryAddSubtractInappropriateTypes.Match) obj;
          return Objects.equals(fOp, other.fOp);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }

    @Override
    public BinaryAddSubtractInappropriateTypes specification() {
      return BinaryAddSubtractInappropriateTypes.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BinaryAddSubtractInappropriateTypes.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BinaryAddSubtractInappropriateTypes.Match newMutableMatch(final SsaBinaryOperator pOp) {
      return new Mutable(pOp);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BinaryAddSubtractInappropriateTypes.Match newMatch(final SsaBinaryOperator pOp) {
      return new Immutable(pOp);
    }

    private static final class Mutable extends BinaryAddSubtractInappropriateTypes.Match {
      Mutable(final SsaBinaryOperator pOp) {
        super(pOp);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends BinaryAddSubtractInappropriateTypes.Match {
      Immutable(final SsaBinaryOperator pOp) {
        super(pOp);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.binaryAddSubtractInappropriateTypes pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Misra C 10.1 Binary + (Add) and Binary - (Subtract) Operators
   * //Should run at the end of the generation
   * {@literal @}Constraint(
   * 	targetEditorId = "",
   * 	key = {op},
   * 	severity = "error",
   * 	message = "The type is not appropriate for the operator."
   * )
   * pattern binaryAddSubtractInappropriateTypes(op: SsaBinaryOperator){
   * 	find binaryAddSubtract(op);
   * 	find binaryOperand(op, r);
   * 	find accessibleByRef(t, r);
   * 	PrimitiveType(t);
   * 	find essentialTypesVoidBool(t, 1);
   * } or {
   * 	find binaryAddSubtract(op);
   * 	find binaryOperand(op, t);
   * 	Enum(t);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BinaryAddSubtractInappropriateTypes
   * 
   */
  public static class Matcher extends BaseMatcher<BinaryAddSubtractInappropriateTypes.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BinaryAddSubtractInappropriateTypes.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }

    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static BinaryAddSubtractInappropriateTypes.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_OP = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BinaryAddSubtractInappropriateTypes.Matcher.class);

    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }

    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BinaryAddSubtractInappropriateTypes.Match> getAllMatches(final SsaBinaryOperator pOp) {
      return rawStreamAllMatches(new Object[]{pOp}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BinaryAddSubtractInappropriateTypes.Match> streamAllMatches(final SsaBinaryOperator pOp) {
      return rawStreamAllMatches(new Object[]{pOp});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BinaryAddSubtractInappropriateTypes.Match> getOneArbitraryMatch(final SsaBinaryOperator pOp) {
      return rawGetOneArbitraryMatch(new Object[]{pOp});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBinaryOperator pOp) {
      return rawHasMatch(new Object[]{pOp});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBinaryOperator pOp) {
      return rawCountMatches(new Object[]{pOp});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBinaryOperator pOp, final Consumer<? super BinaryAddSubtractInappropriateTypes.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pOp}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BinaryAddSubtractInappropriateTypes.Match newMatch(final SsaBinaryOperator pOp) {
      return BinaryAddSubtractInappropriateTypes.Match.newMatch(pOp);
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBinaryOperator> rawStreamAllValuesOfop(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OP, parameters).map(SsaBinaryOperator.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBinaryOperator> getAllValuesOfop() {
      return rawStreamAllValuesOfop(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBinaryOperator> streamAllValuesOfop() {
      return rawStreamAllValuesOfop(emptyArray());
    }

    @Override
    protected BinaryAddSubtractInappropriateTypes.Match tupleToMatch(final Tuple t) {
      try {
          return BinaryAddSubtractInappropriateTypes.Match.newMatch((SsaBinaryOperator) t.get(POSITION_OP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BinaryAddSubtractInappropriateTypes.Match arrayToMatch(final Object[] match) {
      try {
          return BinaryAddSubtractInappropriateTypes.Match.newMatch((SsaBinaryOperator) match[POSITION_OP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BinaryAddSubtractInappropriateTypes.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BinaryAddSubtractInappropriateTypes.Match.newMutableMatch((SsaBinaryOperator) match[POSITION_OP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<BinaryAddSubtractInappropriateTypes.Matcher> querySpecification() {
      return BinaryAddSubtractInappropriateTypes.instance();
    }
  }

  private BinaryAddSubtractInappropriateTypes() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BinaryAddSubtractInappropriateTypes instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected BinaryAddSubtractInappropriateTypes.Matcher instantiate(final ViatraQueryEngine engine) {
    return BinaryAddSubtractInappropriateTypes.Matcher.on(engine);
  }

  @Override
  public BinaryAddSubtractInappropriateTypes.Matcher instantiate() {
    return BinaryAddSubtractInappropriateTypes.Matcher.create();
  }

  @Override
  public BinaryAddSubtractInappropriateTypes.Match newEmptyMatch() {
    return BinaryAddSubtractInappropriateTypes.Match.newEmptyMatch();
  }

  @Override
  public BinaryAddSubtractInappropriateTypes.Match newMatch(final Object... parameters) {
    return BinaryAddSubtractInappropriateTypes.Match.newMatch((hu.metadom.hls.ssamodel.SsaBinaryOperator) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link BinaryAddSubtractInappropriateTypes} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link BinaryAddSubtractInappropriateTypes#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BinaryAddSubtractInappropriateTypes INSTANCE = new BinaryAddSubtractInappropriateTypes();

    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();

    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }

  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final BinaryAddSubtractInappropriateTypes.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_op = new PParameter("op", "hu.metadom.hls.ssamodel.SsaBinaryOperator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_op);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.binaryAddSubtractInappropriateTypes";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("op");
    }

    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }

    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_op = body.getOrCreateVariableByName("op");
          PVariable var_r = body.getOrCreateVariableByName("r");
          PVariable var_t = body.getOrCreateVariableByName("t");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	find binaryAddSubtract(op)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_op), BinaryAddSubtract.instance().getInternalQueryRepresentation());
          // 	find binaryOperand(op, r)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_op, var_r), BinaryOperand.instance().getInternalQueryRepresentation());
          // 	find accessibleByRef(t, r)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_t, var_r), AccessibleByRef.instance().getInternalQueryRepresentation());
          // 	PrimitiveType(t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          // 	find essentialTypesVoidBool(t, 1)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, 1);
          new PositivePatternCall(body, Tuples.flatTupleOf(var_t, var__virtual_0_), EssentialTypesVoidBool.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_op = body.getOrCreateVariableByName("op");
          PVariable var_t = body.getOrCreateVariableByName("t");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	find binaryAddSubtract(op)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_op), BinaryAddSubtract.instance().getInternalQueryRepresentation());
          // 	find binaryOperand(op, t)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_op, var_t), BinaryOperand.instance().getInternalQueryRepresentation());
          // 	Enum(t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Enum")));
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("targetEditorId", "*");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("op")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "The type is not appropriate for the operator.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }

  private static int evaluateExpression_1_1() {
    return 1;
  }
}
