/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaCall;
import hu.metadom.hls.ssamodel.query.internal.FunctionWithTrace;
import hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables;
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
 *         pattern functionCalls(funcTrace: FunctionToLocalizeVariables, funcCall: SsaCall, otherFuncTrace: FunctionToLocalizeVariables) {
 *         	find functionWithTrace(funcTrace, func);
 *         	find functionCallInFunction(func, funcCall, _);
 *         	
 *         	SsaCall.function(funcCall, otherFunc);
 *         	FunctionToLocalizeVariables.function(otherFuncTrace, otherFunc);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionCalls extends BaseGeneratedEMFQuerySpecification<FunctionCalls.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionCalls pattern,
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
    private FunctionToLocalizeVariables fFuncTrace;

    private SsaCall fFuncCall;

    private FunctionToLocalizeVariables fOtherFuncTrace;

    private static List<String> parameterNames = makeImmutableList("funcTrace", "funcCall", "otherFuncTrace");

    private Match(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      this.fFuncTrace = pFuncTrace;
      this.fFuncCall = pFuncCall;
      this.fOtherFuncTrace = pOtherFuncTrace;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "funcTrace": return this.fFuncTrace;
          case "funcCall": return this.fFuncCall;
          case "otherFuncTrace": return this.fOtherFuncTrace;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFuncTrace;
          case 1: return this.fFuncCall;
          case 2: return this.fOtherFuncTrace;
          default: return null;
      }
    }

    public FunctionToLocalizeVariables getFuncTrace() {
      return this.fFuncTrace;
    }

    public SsaCall getFuncCall() {
      return this.fFuncCall;
    }

    public FunctionToLocalizeVariables getOtherFuncTrace() {
      return this.fOtherFuncTrace;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("funcTrace".equals(parameterName) ) {
          this.fFuncTrace = (FunctionToLocalizeVariables) newValue;
          return true;
      }
      if ("funcCall".equals(parameterName) ) {
          this.fFuncCall = (SsaCall) newValue;
          return true;
      }
      if ("otherFuncTrace".equals(parameterName) ) {
          this.fOtherFuncTrace = (FunctionToLocalizeVariables) newValue;
          return true;
      }
      return false;
    }

    public void setFuncTrace(final FunctionToLocalizeVariables pFuncTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFuncTrace = pFuncTrace;
    }

    public void setFuncCall(final SsaCall pFuncCall) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFuncCall = pFuncCall;
    }

    public void setOtherFuncTrace(final FunctionToLocalizeVariables pOtherFuncTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOtherFuncTrace = pOtherFuncTrace;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionCalls";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionCalls.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFuncTrace, fFuncCall, fOtherFuncTrace};
    }

    @Override
    public FunctionCalls.Match toImmutable() {
      return isMutable() ? newMatch(fFuncTrace, fFuncCall, fOtherFuncTrace) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"funcTrace\"=" + prettyPrintValue(fFuncTrace) + ", ");
      result.append("\"funcCall\"=" + prettyPrintValue(fFuncCall) + ", ");
      result.append("\"otherFuncTrace\"=" + prettyPrintValue(fOtherFuncTrace));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFuncTrace, fFuncCall, fOtherFuncTrace);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionCalls.Match)) {
          FunctionCalls.Match other = (FunctionCalls.Match) obj;
          return Objects.equals(fFuncTrace, other.fFuncTrace) && Objects.equals(fFuncCall, other.fFuncCall) && Objects.equals(fOtherFuncTrace, other.fOtherFuncTrace);
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
    public FunctionCalls specification() {
      return FunctionCalls.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionCalls.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionCalls.Match newMutableMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return new Mutable(pFuncTrace, pFuncCall, pOtherFuncTrace);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionCalls.Match newMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return new Immutable(pFuncTrace, pFuncCall, pOtherFuncTrace);
    }

    private static final class Mutable extends FunctionCalls.Match {
      Mutable(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
        super(pFuncTrace, pFuncCall, pOtherFuncTrace);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionCalls.Match {
      Immutable(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
        super(pFuncTrace, pFuncCall, pOtherFuncTrace);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionCalls pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionCalls(funcTrace: FunctionToLocalizeVariables, funcCall: SsaCall, otherFuncTrace: FunctionToLocalizeVariables) {
   * 	find functionWithTrace(funcTrace, func);
   * 	find functionCallInFunction(func, funcCall, _);
   * 	
   * 	SsaCall.function(funcCall, otherFunc);
   * 	FunctionToLocalizeVariables.function(otherFuncTrace, otherFunc);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionCalls
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionCalls.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionCalls.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionCalls.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNCTRACE = 0;

    private static final int POSITION_FUNCCALL = 1;

    private static final int POSITION_OTHERFUNCTRACE = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionCalls.Matcher.class);

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
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionCalls.Match> getAllMatches(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawStreamAllMatches(new Object[]{pFuncTrace, pFuncCall, pOtherFuncTrace}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionCalls.Match> streamAllMatches(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawStreamAllMatches(new Object[]{pFuncTrace, pFuncCall, pOtherFuncTrace});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionCalls.Match> getOneArbitraryMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pFuncTrace, pFuncCall, pOtherFuncTrace});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawHasMatch(new Object[]{pFuncTrace, pFuncCall, pOtherFuncTrace});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawCountMatches(new Object[]{pFuncTrace, pFuncCall, pOtherFuncTrace});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace, final Consumer<? super FunctionCalls.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFuncTrace, pFuncCall, pOtherFuncTrace}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFuncCall the fixed value of pattern parameter funcCall, or null if not bound.
     * @param pOtherFuncTrace the fixed value of pattern parameter otherFuncTrace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionCalls.Match newMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return FunctionCalls.Match.newMatch(pFuncTrace, pFuncCall, pOtherFuncTrace);
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FunctionToLocalizeVariables> rawStreamAllValuesOffuncTrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FUNCTRACE, parameters).map(FunctionToLocalizeVariables.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOffuncTrace() {
      return rawStreamAllValuesOffuncTrace(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToLocalizeVariables> streamAllValuesOffuncTrace() {
      return rawStreamAllValuesOffuncTrace(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToLocalizeVariables> streamAllValuesOffuncTrace(final FunctionCalls.Match partialMatch) {
      return rawStreamAllValuesOffuncTrace(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToLocalizeVariables> streamAllValuesOffuncTrace(final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawStreamAllValuesOffuncTrace(new Object[]{null, pFuncCall, pOtherFuncTrace});
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOffuncTrace(final FunctionCalls.Match partialMatch) {
      return rawStreamAllValuesOffuncTrace(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOffuncTrace(final SsaCall pFuncCall, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawStreamAllValuesOffuncTrace(new Object[]{null, pFuncCall, pOtherFuncTrace}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaCall> rawStreamAllValuesOffuncCall(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FUNCCALL, parameters).map(SsaCall.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOffuncCall() {
      return rawStreamAllValuesOffuncCall(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaCall> streamAllValuesOffuncCall() {
      return rawStreamAllValuesOffuncCall(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaCall> streamAllValuesOffuncCall(final FunctionCalls.Match partialMatch) {
      return rawStreamAllValuesOffuncCall(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaCall> streamAllValuesOffuncCall(final FunctionToLocalizeVariables pFuncTrace, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawStreamAllValuesOffuncCall(new Object[]{pFuncTrace, null, pOtherFuncTrace});
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOffuncCall(final FunctionCalls.Match partialMatch) {
      return rawStreamAllValuesOffuncCall(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for funcCall.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOffuncCall(final FunctionToLocalizeVariables pFuncTrace, final FunctionToLocalizeVariables pOtherFuncTrace) {
      return rawStreamAllValuesOffuncCall(new Object[]{pFuncTrace, null, pOtherFuncTrace}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FunctionToLocalizeVariables> rawStreamAllValuesOfotherFuncTrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OTHERFUNCTRACE, parameters).map(FunctionToLocalizeVariables.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOfotherFuncTrace() {
      return rawStreamAllValuesOfotherFuncTrace(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToLocalizeVariables> streamAllValuesOfotherFuncTrace() {
      return rawStreamAllValuesOfotherFuncTrace(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToLocalizeVariables> streamAllValuesOfotherFuncTrace(final FunctionCalls.Match partialMatch) {
      return rawStreamAllValuesOfotherFuncTrace(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToLocalizeVariables> streamAllValuesOfotherFuncTrace(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall) {
      return rawStreamAllValuesOfotherFuncTrace(new Object[]{pFuncTrace, pFuncCall, null});
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOfotherFuncTrace(final FunctionCalls.Match partialMatch) {
      return rawStreamAllValuesOfotherFuncTrace(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFuncTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOfotherFuncTrace(final FunctionToLocalizeVariables pFuncTrace, final SsaCall pFuncCall) {
      return rawStreamAllValuesOfotherFuncTrace(new Object[]{pFuncTrace, pFuncCall, null}).collect(Collectors.toSet());
    }

    @Override
    protected FunctionCalls.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionCalls.Match.newMatch((FunctionToLocalizeVariables) t.get(POSITION_FUNCTRACE), (SsaCall) t.get(POSITION_FUNCCALL), (FunctionToLocalizeVariables) t.get(POSITION_OTHERFUNCTRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionCalls.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionCalls.Match.newMatch((FunctionToLocalizeVariables) match[POSITION_FUNCTRACE], (SsaCall) match[POSITION_FUNCCALL], (FunctionToLocalizeVariables) match[POSITION_OTHERFUNCTRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionCalls.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionCalls.Match.newMutableMatch((FunctionToLocalizeVariables) match[POSITION_FUNCTRACE], (SsaCall) match[POSITION_FUNCCALL], (FunctionToLocalizeVariables) match[POSITION_OTHERFUNCTRACE]);
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
    public static IQuerySpecification<FunctionCalls.Matcher> querySpecification() {
      return FunctionCalls.instance();
    }
  }

  private FunctionCalls() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionCalls instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionCalls.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionCalls.Matcher.on(engine);
  }

  @Override
  public FunctionCalls.Matcher instantiate() {
    return FunctionCalls.Matcher.create();
  }

  @Override
  public FunctionCalls.Match newEmptyMatch() {
    return FunctionCalls.Match.newEmptyMatch();
  }

  @Override
  public FunctionCalls.Match newMatch(final Object... parameters) {
    return FunctionCalls.Match.newMatch((hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) parameters[0], (hu.metadom.hls.ssamodel.SsaCall) parameters[1], (hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionCalls} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionCalls#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionCalls INSTANCE = new FunctionCalls();

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
    private static final FunctionCalls.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_funcTrace = new PParameter("funcTrace", "hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")), PParameterDirection.INOUT);

    private final PParameter parameter_funcCall = new PParameter("funcCall", "hu.metadom.hls.ssamodel.SsaCall", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaCall")), PParameterDirection.INOUT);

    private final PParameter parameter_otherFuncTrace = new PParameter("otherFuncTrace", "hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_funcTrace, parameter_funcCall, parameter_otherFuncTrace);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionCalls";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("funcTrace","funcCall","otherFuncTrace");
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
          PVariable var_funcTrace = body.getOrCreateVariableByName("funcTrace");
          PVariable var_funcCall = body.getOrCreateVariableByName("funcCall");
          PVariable var_otherFuncTrace = body.getOrCreateVariableByName("otherFuncTrace");
          PVariable var_func = body.getOrCreateVariableByName("func");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_otherFunc = body.getOrCreateVariableByName("otherFunc");
          new TypeConstraint(body, Tuples.flatTupleOf(var_funcTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_funcCall), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherFuncTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_funcTrace, parameter_funcTrace),
             new ExportedParameter(body, var_funcCall, parameter_funcCall),
             new ExportedParameter(body, var_otherFuncTrace, parameter_otherFuncTrace)
          ));
          // 	find functionWithTrace(funcTrace, func)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_funcTrace, var_func), FunctionWithTrace.instance().getInternalQueryRepresentation());
          // 	find functionCallInFunction(func, funcCall, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var_funcCall, var___0_), FunctionCallInFunction.instance().getInternalQueryRepresentation());
          // 		SsaCall.function(funcCall, otherFunc)
          new TypeConstraint(body, Tuples.flatTupleOf(var_funcCall), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_funcCall, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCall", "function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_otherFunc);
          // 	FunctionToLocalizeVariables.function(otherFuncTrace, otherFunc)
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherFuncTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherFuncTrace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables", "function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new Equality(body, var__virtual_1_, var_otherFunc);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
