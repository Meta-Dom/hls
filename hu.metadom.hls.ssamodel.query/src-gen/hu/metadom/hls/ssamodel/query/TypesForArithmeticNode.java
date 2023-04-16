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
 *         pattern typesForArithmeticNode(r: Type, l: Type, op: SsaBinaryOperator){
 *         	find binaryArithmetic(op);
 *         	SsaBinaryOperator.right.type(op, r);
 *         	SsaBinaryOperator.left.type(op, l);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TypesForArithmeticNode extends BaseGeneratedEMFQuerySpecification<TypesForArithmeticNode.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.typesForArithmeticNode pattern,
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
    private Type fR;

    private Type fL;

    private SsaBinaryOperator fOp;

    private static List<String> parameterNames = makeImmutableList("r", "l", "op");

    private Match(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      this.fR = pR;
      this.fL = pL;
      this.fOp = pOp;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "r": return this.fR;
          case "l": return this.fL;
          case "op": return this.fOp;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fR;
          case 1: return this.fL;
          case 2: return this.fOp;
          default: return null;
      }
    }

    public Type getR() {
      return this.fR;
    }

    public Type getL() {
      return this.fL;
    }

    public SsaBinaryOperator getOp() {
      return this.fOp;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("r".equals(parameterName) ) {
          this.fR = (Type) newValue;
          return true;
      }
      if ("l".equals(parameterName) ) {
          this.fL = (Type) newValue;
          return true;
      }
      if ("op".equals(parameterName) ) {
          this.fOp = (SsaBinaryOperator) newValue;
          return true;
      }
      return false;
    }

    public void setR(final Type pR) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fR = pR;
    }

    public void setL(final Type pL) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fL = pL;
    }

    public void setOp(final SsaBinaryOperator pOp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOp = pOp;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.typesForArithmeticNode";
    }

    @Override
    public List<String> parameterNames() {
      return TypesForArithmeticNode.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fR, fL, fOp};
    }

    @Override
    public TypesForArithmeticNode.Match toImmutable() {
      return isMutable() ? newMatch(fR, fL, fOp) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"r\"=" + prettyPrintValue(fR) + ", ");
      result.append("\"l\"=" + prettyPrintValue(fL) + ", ");
      result.append("\"op\"=" + prettyPrintValue(fOp));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fR, fL, fOp);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TypesForArithmeticNode.Match)) {
          TypesForArithmeticNode.Match other = (TypesForArithmeticNode.Match) obj;
          return Objects.equals(fR, other.fR) && Objects.equals(fL, other.fL) && Objects.equals(fOp, other.fOp);
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
    public TypesForArithmeticNode specification() {
      return TypesForArithmeticNode.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TypesForArithmeticNode.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TypesForArithmeticNode.Match newMutableMatch(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return new Mutable(pR, pL, pOp);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TypesForArithmeticNode.Match newMatch(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return new Immutable(pR, pL, pOp);
    }

    private static final class Mutable extends TypesForArithmeticNode.Match {
      Mutable(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
        super(pR, pL, pOp);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends TypesForArithmeticNode.Match {
      Immutable(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
        super(pR, pL, pOp);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.typesForArithmeticNode pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern typesForArithmeticNode(r: Type, l: Type, op: SsaBinaryOperator){
   * 	find binaryArithmetic(op);
   * 	SsaBinaryOperator.right.type(op, r);
   * 	SsaBinaryOperator.left.type(op, l);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TypesForArithmeticNode
   * 
   */
  public static class Matcher extends BaseMatcher<TypesForArithmeticNode.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TypesForArithmeticNode.Matcher on(final ViatraQueryEngine engine) {
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
    public static TypesForArithmeticNode.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_R = 0;

    private static final int POSITION_L = 1;

    private static final int POSITION_OP = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TypesForArithmeticNode.Matcher.class);

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
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TypesForArithmeticNode.Match> getAllMatches(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return rawStreamAllMatches(new Object[]{pR, pL, pOp}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TypesForArithmeticNode.Match> streamAllMatches(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return rawStreamAllMatches(new Object[]{pR, pL, pOp});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TypesForArithmeticNode.Match> getOneArbitraryMatch(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return rawGetOneArbitraryMatch(new Object[]{pR, pL, pOp});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return rawHasMatch(new Object[]{pR, pL, pOp});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return rawCountMatches(new Object[]{pR, pL, pOp});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Type pR, final Type pL, final SsaBinaryOperator pOp, final Consumer<? super TypesForArithmeticNode.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pR, pL, pOp}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TypesForArithmeticNode.Match newMatch(final Type pR, final Type pL, final SsaBinaryOperator pOp) {
      return TypesForArithmeticNode.Match.newMatch(pR, pL, pOp);
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOfr(final Object[] parameters) {
      return rawStreamAllValues(POSITION_R, parameters).map(Type.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOfr() {
      return rawStreamAllValuesOfr(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOfr() {
      return rawStreamAllValuesOfr(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOfr(final TypesForArithmeticNode.Match partialMatch) {
      return rawStreamAllValuesOfr(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOfr(final Type pL, final SsaBinaryOperator pOp) {
      return rawStreamAllValuesOfr(new Object[]{null, pL, pOp});
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOfr(final TypesForArithmeticNode.Match partialMatch) {
      return rawStreamAllValuesOfr(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOfr(final Type pL, final SsaBinaryOperator pOp) {
      return rawStreamAllValuesOfr(new Object[]{null, pL, pOp}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOfl(final Object[] parameters) {
      return rawStreamAllValues(POSITION_L, parameters).map(Type.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOfl() {
      return rawStreamAllValuesOfl(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOfl() {
      return rawStreamAllValuesOfl(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOfl(final TypesForArithmeticNode.Match partialMatch) {
      return rawStreamAllValuesOfl(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOfl(final Type pR, final SsaBinaryOperator pOp) {
      return rawStreamAllValuesOfl(new Object[]{pR, null, pOp});
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOfl(final TypesForArithmeticNode.Match partialMatch) {
      return rawStreamAllValuesOfl(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOfl(final Type pR, final SsaBinaryOperator pOp) {
      return rawStreamAllValuesOfl(new Object[]{pR, null, pOp}).collect(Collectors.toSet());
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
    public Stream<SsaBinaryOperator> streamAllValuesOfop(final TypesForArithmeticNode.Match partialMatch) {
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
    public Stream<SsaBinaryOperator> streamAllValuesOfop(final Type pR, final Type pL) {
      return rawStreamAllValuesOfop(new Object[]{pR, pL, null});
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBinaryOperator> getAllValuesOfop(final TypesForArithmeticNode.Match partialMatch) {
      return rawStreamAllValuesOfop(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBinaryOperator> getAllValuesOfop(final Type pR, final Type pL) {
      return rawStreamAllValuesOfop(new Object[]{pR, pL, null}).collect(Collectors.toSet());
    }

    @Override
    protected TypesForArithmeticNode.Match tupleToMatch(final Tuple t) {
      try {
          return TypesForArithmeticNode.Match.newMatch((Type) t.get(POSITION_R), (Type) t.get(POSITION_L), (SsaBinaryOperator) t.get(POSITION_OP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected TypesForArithmeticNode.Match arrayToMatch(final Object[] match) {
      try {
          return TypesForArithmeticNode.Match.newMatch((Type) match[POSITION_R], (Type) match[POSITION_L], (SsaBinaryOperator) match[POSITION_OP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected TypesForArithmeticNode.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TypesForArithmeticNode.Match.newMutableMatch((Type) match[POSITION_R], (Type) match[POSITION_L], (SsaBinaryOperator) match[POSITION_OP]);
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
    public static IQuerySpecification<TypesForArithmeticNode.Matcher> querySpecification() {
      return TypesForArithmeticNode.instance();
    }
  }

  private TypesForArithmeticNode() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TypesForArithmeticNode instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected TypesForArithmeticNode.Matcher instantiate(final ViatraQueryEngine engine) {
    return TypesForArithmeticNode.Matcher.on(engine);
  }

  @Override
  public TypesForArithmeticNode.Matcher instantiate() {
    return TypesForArithmeticNode.Matcher.create();
  }

  @Override
  public TypesForArithmeticNode.Match newEmptyMatch() {
    return TypesForArithmeticNode.Match.newEmptyMatch();
  }

  @Override
  public TypesForArithmeticNode.Match newMatch(final Object... parameters) {
    return TypesForArithmeticNode.Match.newMatch((hu.metadom.hls.ssamodel.Type) parameters[0], (hu.metadom.hls.ssamodel.Type) parameters[1], (hu.metadom.hls.ssamodel.SsaBinaryOperator) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link TypesForArithmeticNode} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TypesForArithmeticNode#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TypesForArithmeticNode INSTANCE = new TypesForArithmeticNode();

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
    private static final TypesForArithmeticNode.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_r = new PParameter("r", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final PParameter parameter_l = new PParameter("l", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final PParameter parameter_op = new PParameter("op", "hu.metadom.hls.ssamodel.SsaBinaryOperator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_r, parameter_l, parameter_op);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.typesForArithmeticNode";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r","l","op");
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
          PVariable var_r = body.getOrCreateVariableByName("r");
          PVariable var_l = body.getOrCreateVariableByName("l");
          PVariable var_op = body.getOrCreateVariableByName("op");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_l), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_r, parameter_r),
             new ExportedParameter(body, var_l, parameter_l),
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	find binaryArithmetic(op)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_op), BinaryArithmetic.instance().getInternalQueryRepresentation());
          // 	SsaBinaryOperator.right.type(op, r)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "right")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_1_, var_r);
          // 	SsaBinaryOperator.left.type(op, l)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "left")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_3_, var_l);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
