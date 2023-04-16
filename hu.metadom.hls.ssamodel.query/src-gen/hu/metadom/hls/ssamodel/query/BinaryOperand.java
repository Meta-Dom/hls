/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationHelperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaBinaryOperator;
import hu.metadom.hls.ssamodel.Type;
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         pattern binaryOperand(op: SsaBinaryOperator, t: Type){
 *         	SsaBinaryOperator.right.type(op, t);
 *         } or {
 *         	SsaBinaryOperator.left.type(op, t);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BinaryOperand extends BaseGeneratedEMFQuerySpecification<BinaryOperand.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.binaryOperand pattern,
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

    private Type fT;

    private static List<String> parameterNames = makeImmutableList("op", "t");

    private Match(final SsaBinaryOperator pOp, final Type pT) {
      this.fOp = pOp;
      this.fT = pT;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "op": return this.fOp;
          case "t": return this.fT;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fOp;
          case 1: return this.fT;
          default: return null;
      }
    }

    public SsaBinaryOperator getOp() {
      return this.fOp;
    }

    public Type getT() {
      return this.fT;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("op".equals(parameterName) ) {
          this.fOp = (SsaBinaryOperator) newValue;
          return true;
      }
      if ("t".equals(parameterName) ) {
          this.fT = (Type) newValue;
          return true;
      }
      return false;
    }

    public void setOp(final SsaBinaryOperator pOp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOp = pOp;
    }

    public void setT(final Type pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.binaryOperand";
    }

    @Override
    public List<String> parameterNames() {
      return BinaryOperand.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fOp, fT};
    }

    @Override
    public BinaryOperand.Match toImmutable() {
      return isMutable() ? newMatch(fOp, fT) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"op\"=" + prettyPrintValue(fOp) + ", ");
      result.append("\"t\"=" + prettyPrintValue(fT));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fOp, fT);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BinaryOperand.Match)) {
          BinaryOperand.Match other = (BinaryOperand.Match) obj;
          return Objects.equals(fOp, other.fOp) && Objects.equals(fT, other.fT);
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
    public BinaryOperand specification() {
      return BinaryOperand.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BinaryOperand.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BinaryOperand.Match newMutableMatch(final SsaBinaryOperator pOp, final Type pT) {
      return new Mutable(pOp, pT);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BinaryOperand.Match newMatch(final SsaBinaryOperator pOp, final Type pT) {
      return new Immutable(pOp, pT);
    }

    private static final class Mutable extends BinaryOperand.Match {
      Mutable(final SsaBinaryOperator pOp, final Type pT) {
        super(pOp, pT);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends BinaryOperand.Match {
      Immutable(final SsaBinaryOperator pOp, final Type pT) {
        super(pOp, pT);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.binaryOperand pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern binaryOperand(op: SsaBinaryOperator, t: Type){
   * 	SsaBinaryOperator.right.type(op, t);
   * } or {
   * 	SsaBinaryOperator.left.type(op, t);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BinaryOperand
   * 
   */
  public static class Matcher extends BaseMatcher<BinaryOperand.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BinaryOperand.Matcher on(final ViatraQueryEngine engine) {
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
    public static BinaryOperand.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_OP = 0;

    private static final int POSITION_T = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BinaryOperand.Matcher.class);

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
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BinaryOperand.Match> getAllMatches(final SsaBinaryOperator pOp, final Type pT) {
      return rawStreamAllMatches(new Object[]{pOp, pT}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BinaryOperand.Match> streamAllMatches(final SsaBinaryOperator pOp, final Type pT) {
      return rawStreamAllMatches(new Object[]{pOp, pT});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BinaryOperand.Match> getOneArbitraryMatch(final SsaBinaryOperator pOp, final Type pT) {
      return rawGetOneArbitraryMatch(new Object[]{pOp, pT});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBinaryOperator pOp, final Type pT) {
      return rawHasMatch(new Object[]{pOp, pT});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBinaryOperator pOp, final Type pT) {
      return rawCountMatches(new Object[]{pOp, pT});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBinaryOperator pOp, final Type pT, final Consumer<? super BinaryOperand.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pOp, pT}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BinaryOperand.Match newMatch(final SsaBinaryOperator pOp, final Type pT) {
      return BinaryOperand.Match.newMatch(pOp, pT);
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

    /**
     * Retrieve the set of values that occur in matches for op.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBinaryOperator> streamAllValuesOfop(final BinaryOperand.Match partialMatch) {
      return rawStreamAllValuesOfop(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBinaryOperator> streamAllValuesOfop(final Type pT) {
      return rawStreamAllValuesOfop(new Object[]{null, pT});
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBinaryOperator> getAllValuesOfop(final BinaryOperand.Match partialMatch) {
      return rawStreamAllValuesOfop(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBinaryOperator> getAllValuesOfop(final Type pT) {
      return rawStreamAllValuesOfop(new Object[]{null, pT}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOft(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Type.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft(final BinaryOperand.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft(final SsaBinaryOperator pOp) {
      return rawStreamAllValuesOft(new Object[]{pOp, null});
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft(final BinaryOperand.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft(final SsaBinaryOperator pOp) {
      return rawStreamAllValuesOft(new Object[]{pOp, null}).collect(Collectors.toSet());
    }

    @Override
    protected BinaryOperand.Match tupleToMatch(final Tuple t) {
      try {
          return BinaryOperand.Match.newMatch((SsaBinaryOperator) t.get(POSITION_OP), (Type) t.get(POSITION_T));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BinaryOperand.Match arrayToMatch(final Object[] match) {
      try {
          return BinaryOperand.Match.newMatch((SsaBinaryOperator) match[POSITION_OP], (Type) match[POSITION_T]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BinaryOperand.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BinaryOperand.Match.newMutableMatch((SsaBinaryOperator) match[POSITION_OP], (Type) match[POSITION_T]);
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
    public static IQuerySpecification<BinaryOperand.Matcher> querySpecification() {
      return BinaryOperand.instance();
    }
  }

  private BinaryOperand() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BinaryOperand instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected BinaryOperand.Matcher instantiate(final ViatraQueryEngine engine) {
    return BinaryOperand.Matcher.on(engine);
  }

  @Override
  public BinaryOperand.Matcher instantiate() {
    return BinaryOperand.Matcher.create();
  }

  @Override
  public BinaryOperand.Match newEmptyMatch() {
    return BinaryOperand.Match.newEmptyMatch();
  }

  @Override
  public BinaryOperand.Match newMatch(final Object... parameters) {
    return BinaryOperand.Match.newMatch((hu.metadom.hls.ssamodel.SsaBinaryOperator) parameters[0], (hu.metadom.hls.ssamodel.Type) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link BinaryOperand} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link BinaryOperand#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BinaryOperand INSTANCE = new BinaryOperand();

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
    private static final BinaryOperand.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_op = new PParameter("op", "hu.metadom.hls.ssamodel.SsaBinaryOperator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")), PParameterDirection.INOUT);

    private final PParameter parameter_t = new PParameter("t", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_op, parameter_t);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.binaryOperand";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("op","t");
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
          PVariable var_t = body.getOrCreateVariableByName("t");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_op, parameter_op),
             new ExportedParameter(body, var_t, parameter_t)
          ));
          // 	SsaBinaryOperator.right.type(op, t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "right")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_1_, var_t);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_op = body.getOrCreateVariableByName("op");
          PVariable var_t = body.getOrCreateVariableByName("t");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_op, parameter_op),
             new ExportedParameter(body, var_t, parameter_t)
          ));
          // 	SsaBinaryOperator.left.type(op, t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "left")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_1_, var_t);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
