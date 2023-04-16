/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaCall;
import hu.metadom.hls.ssamodel.SsaFunction;
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
 *         pattern functionCallInFunction(func: SsaFunction, call: SsaCall, otherFunc: SsaFunction) {
 *         	find functionNode(func, call);
 *         	SsaCall.function(call, otherFunc);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionCallInFunction extends BaseGeneratedEMFQuerySpecification<FunctionCallInFunction.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionCallInFunction pattern,
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
    private SsaFunction fFunc;

    private SsaCall fCall;

    private SsaFunction fOtherFunc;

    private static List<String> parameterNames = makeImmutableList("func", "call", "otherFunc");

    private Match(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      this.fFunc = pFunc;
      this.fCall = pCall;
      this.fOtherFunc = pOtherFunc;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "func": return this.fFunc;
          case "call": return this.fCall;
          case "otherFunc": return this.fOtherFunc;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunc;
          case 1: return this.fCall;
          case 2: return this.fOtherFunc;
          default: return null;
      }
    }

    public SsaFunction getFunc() {
      return this.fFunc;
    }

    public SsaCall getCall() {
      return this.fCall;
    }

    public SsaFunction getOtherFunc() {
      return this.fOtherFunc;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("func".equals(parameterName) ) {
          this.fFunc = (SsaFunction) newValue;
          return true;
      }
      if ("call".equals(parameterName) ) {
          this.fCall = (SsaCall) newValue;
          return true;
      }
      if ("otherFunc".equals(parameterName) ) {
          this.fOtherFunc = (SsaFunction) newValue;
          return true;
      }
      return false;
    }

    public void setFunc(final SsaFunction pFunc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunc = pFunc;
    }

    public void setCall(final SsaCall pCall) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCall = pCall;
    }

    public void setOtherFunc(final SsaFunction pOtherFunc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOtherFunc = pOtherFunc;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionCallInFunction";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionCallInFunction.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunc, fCall, fOtherFunc};
    }

    @Override
    public FunctionCallInFunction.Match toImmutable() {
      return isMutable() ? newMatch(fFunc, fCall, fOtherFunc) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"func\"=" + prettyPrintValue(fFunc) + ", ");
      result.append("\"call\"=" + prettyPrintValue(fCall) + ", ");
      result.append("\"otherFunc\"=" + prettyPrintValue(fOtherFunc));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunc, fCall, fOtherFunc);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionCallInFunction.Match)) {
          FunctionCallInFunction.Match other = (FunctionCallInFunction.Match) obj;
          return Objects.equals(fFunc, other.fFunc) && Objects.equals(fCall, other.fCall) && Objects.equals(fOtherFunc, other.fOtherFunc);
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
    public FunctionCallInFunction specification() {
      return FunctionCallInFunction.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionCallInFunction.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionCallInFunction.Match newMutableMatch(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return new Mutable(pFunc, pCall, pOtherFunc);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionCallInFunction.Match newMatch(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return new Immutable(pFunc, pCall, pOtherFunc);
    }

    private static final class Mutable extends FunctionCallInFunction.Match {
      Mutable(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
        super(pFunc, pCall, pOtherFunc);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionCallInFunction.Match {
      Immutable(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
        super(pFunc, pCall, pOtherFunc);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionCallInFunction pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionCallInFunction(func: SsaFunction, call: SsaCall, otherFunc: SsaFunction) {
   * 	find functionNode(func, call);
   * 	SsaCall.function(call, otherFunc);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionCallInFunction
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionCallInFunction.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionCallInFunction.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionCallInFunction.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNC = 0;

    private static final int POSITION_CALL = 1;

    private static final int POSITION_OTHERFUNC = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionCallInFunction.Matcher.class);

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
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionCallInFunction.Match> getAllMatches(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawStreamAllMatches(new Object[]{pFunc, pCall, pOtherFunc}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionCallInFunction.Match> streamAllMatches(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawStreamAllMatches(new Object[]{pFunc, pCall, pOtherFunc});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionCallInFunction.Match> getOneArbitraryMatch(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawGetOneArbitraryMatch(new Object[]{pFunc, pCall, pOtherFunc});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawHasMatch(new Object[]{pFunc, pCall, pOtherFunc});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawCountMatches(new Object[]{pFunc, pCall, pOtherFunc});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc, final Consumer<? super FunctionCallInFunction.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunc, pCall, pOtherFunc}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionCallInFunction.Match newMatch(final SsaFunction pFunc, final SsaCall pCall, final SsaFunction pOtherFunc) {
      return FunctionCallInFunction.Match.newMatch(pFunc, pCall, pOtherFunc);
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaFunction> rawStreamAllValuesOffunc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FUNC, parameters).map(SsaFunction.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc() {
      return rawStreamAllValuesOffunc(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunc() {
      return rawStreamAllValuesOffunc(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunc(final FunctionCallInFunction.Match partialMatch) {
      return rawStreamAllValuesOffunc(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunc(final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawStreamAllValuesOffunc(new Object[]{null, pCall, pOtherFunc});
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final FunctionCallInFunction.Match partialMatch) {
      return rawStreamAllValuesOffunc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final SsaCall pCall, final SsaFunction pOtherFunc) {
      return rawStreamAllValuesOffunc(new Object[]{null, pCall, pOtherFunc}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaCall> rawStreamAllValuesOfcall(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CALL, parameters).map(SsaCall.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall() {
      return rawStreamAllValuesOfcall(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaCall> streamAllValuesOfcall() {
      return rawStreamAllValuesOfcall(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaCall> streamAllValuesOfcall(final FunctionCallInFunction.Match partialMatch) {
      return rawStreamAllValuesOfcall(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaCall> streamAllValuesOfcall(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawStreamAllValuesOfcall(new Object[]{pFunc, null, pOtherFunc});
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall(final FunctionCallInFunction.Match partialMatch) {
      return rawStreamAllValuesOfcall(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawStreamAllValuesOfcall(new Object[]{pFunc, null, pOtherFunc}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaFunction> rawStreamAllValuesOfotherFunc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OTHERFUNC, parameters).map(SsaFunction.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOfotherFunc() {
      return rawStreamAllValuesOfotherFunc(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOfotherFunc() {
      return rawStreamAllValuesOfotherFunc(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOfotherFunc(final FunctionCallInFunction.Match partialMatch) {
      return rawStreamAllValuesOfotherFunc(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOfotherFunc(final SsaFunction pFunc, final SsaCall pCall) {
      return rawStreamAllValuesOfotherFunc(new Object[]{pFunc, pCall, null});
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOfotherFunc(final FunctionCallInFunction.Match partialMatch) {
      return rawStreamAllValuesOfotherFunc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOfotherFunc(final SsaFunction pFunc, final SsaCall pCall) {
      return rawStreamAllValuesOfotherFunc(new Object[]{pFunc, pCall, null}).collect(Collectors.toSet());
    }

    @Override
    protected FunctionCallInFunction.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionCallInFunction.Match.newMatch((SsaFunction) t.get(POSITION_FUNC), (SsaCall) t.get(POSITION_CALL), (SsaFunction) t.get(POSITION_OTHERFUNC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionCallInFunction.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionCallInFunction.Match.newMatch((SsaFunction) match[POSITION_FUNC], (SsaCall) match[POSITION_CALL], (SsaFunction) match[POSITION_OTHERFUNC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionCallInFunction.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionCallInFunction.Match.newMutableMatch((SsaFunction) match[POSITION_FUNC], (SsaCall) match[POSITION_CALL], (SsaFunction) match[POSITION_OTHERFUNC]);
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
    public static IQuerySpecification<FunctionCallInFunction.Matcher> querySpecification() {
      return FunctionCallInFunction.instance();
    }
  }

  private FunctionCallInFunction() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionCallInFunction instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionCallInFunction.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionCallInFunction.Matcher.on(engine);
  }

  @Override
  public FunctionCallInFunction.Matcher instantiate() {
    return FunctionCallInFunction.Matcher.create();
  }

  @Override
  public FunctionCallInFunction.Match newEmptyMatch() {
    return FunctionCallInFunction.Match.newEmptyMatch();
  }

  @Override
  public FunctionCallInFunction.Match newMatch(final Object... parameters) {
    return FunctionCallInFunction.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaCall) parameters[1], (hu.metadom.hls.ssamodel.SsaFunction) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionCallInFunction} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionCallInFunction#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionCallInFunction INSTANCE = new FunctionCallInFunction();

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
    private static final FunctionCallInFunction.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_func = new PParameter("func", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_call = new PParameter("call", "hu.metadom.hls.ssamodel.SsaCall", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaCall")), PParameterDirection.INOUT);

    private final PParameter parameter_otherFunc = new PParameter("otherFunc", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_func, parameter_call, parameter_otherFunc);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionCallInFunction";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("func","call","otherFunc");
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
          PVariable var_func = body.getOrCreateVariableByName("func");
          PVariable var_call = body.getOrCreateVariableByName("call");
          PVariable var_otherFunc = body.getOrCreateVariableByName("otherFunc");
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_call), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherFunc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_func, parameter_func),
             new ExportedParameter(body, var_call, parameter_call),
             new ExportedParameter(body, var_otherFunc, parameter_otherFunc)
          ));
          // 	find functionNode(func, call)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var_call), FunctionNode.instance().getInternalQueryRepresentation());
          // 	SsaCall.function(call, otherFunc)
          new TypeConstraint(body, Tuples.flatTupleOf(var_call), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_call, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCall", "function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_otherFunc);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
