/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesPointerEliminate.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaParam;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.query.internal.ArrayPointerParam;
import hu.metadom.hls.ssamodel.query.internal.ModifiedArrayBase;
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
 *         pattern arrayPointerParamWR(function: SsaFunction, param: SsaParam, v: SsaVar) {
 *         	find arrayPointerParam(function, param, v);
 *         	find modifiedArrayBase(param);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ArrayPointerParamWR extends BaseGeneratedEMFQuerySpecification<ArrayPointerParamWR.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.arrayPointerParamWR pattern,
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
    private SsaFunction fFunction;

    private SsaParam fParam;

    private SsaVar fV;

    private static List<String> parameterNames = makeImmutableList("function", "param", "v");

    private Match(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      this.fFunction = pFunction;
      this.fParam = pParam;
      this.fV = pV;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "function": return this.fFunction;
          case "param": return this.fParam;
          case "v": return this.fV;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunction;
          case 1: return this.fParam;
          case 2: return this.fV;
          default: return null;
      }
    }

    public SsaFunction getFunction() {
      return this.fFunction;
    }

    public SsaParam getParam() {
      return this.fParam;
    }

    public SsaVar getV() {
      return this.fV;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("function".equals(parameterName) ) {
          this.fFunction = (SsaFunction) newValue;
          return true;
      }
      if ("param".equals(parameterName) ) {
          this.fParam = (SsaParam) newValue;
          return true;
      }
      if ("v".equals(parameterName) ) {
          this.fV = (SsaVar) newValue;
          return true;
      }
      return false;
    }

    public void setFunction(final SsaFunction pFunction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunction = pFunction;
    }

    public void setParam(final SsaParam pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }

    public void setV(final SsaVar pV) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fV = pV;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.arrayPointerParamWR";
    }

    @Override
    public List<String> parameterNames() {
      return ArrayPointerParamWR.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunction, fParam, fV};
    }

    @Override
    public ArrayPointerParamWR.Match toImmutable() {
      return isMutable() ? newMatch(fFunction, fParam, fV) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"function\"=" + prettyPrintValue(fFunction) + ", ");
      result.append("\"param\"=" + prettyPrintValue(fParam) + ", ");
      result.append("\"v\"=" + prettyPrintValue(fV));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunction, fParam, fV);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ArrayPointerParamWR.Match)) {
          ArrayPointerParamWR.Match other = (ArrayPointerParamWR.Match) obj;
          return Objects.equals(fFunction, other.fFunction) && Objects.equals(fParam, other.fParam) && Objects.equals(fV, other.fV);
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
    public ArrayPointerParamWR specification() {
      return ArrayPointerParamWR.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ArrayPointerParamWR.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ArrayPointerParamWR.Match newMutableMatch(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return new Mutable(pFunction, pParam, pV);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ArrayPointerParamWR.Match newMatch(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return new Immutable(pFunction, pParam, pV);
    }

    private static final class Mutable extends ArrayPointerParamWR.Match {
      Mutable(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
        super(pFunction, pParam, pV);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ArrayPointerParamWR.Match {
      Immutable(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
        super(pFunction, pParam, pV);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.arrayPointerParamWR pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern arrayPointerParamWR(function: SsaFunction, param: SsaParam, v: SsaVar) {
   * 	find arrayPointerParam(function, param, v);
   * 	find modifiedArrayBase(param);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ArrayPointerParamWR
   * 
   */
  public static class Matcher extends BaseMatcher<ArrayPointerParamWR.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ArrayPointerParamWR.Matcher on(final ViatraQueryEngine engine) {
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
    public static ArrayPointerParamWR.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNCTION = 0;

    private static final int POSITION_PARAM = 1;

    private static final int POSITION_V = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ArrayPointerParamWR.Matcher.class);

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
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ArrayPointerParamWR.Match> getAllMatches(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return rawStreamAllMatches(new Object[]{pFunction, pParam, pV}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ArrayPointerParamWR.Match> streamAllMatches(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return rawStreamAllMatches(new Object[]{pFunction, pParam, pV});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ArrayPointerParamWR.Match> getOneArbitraryMatch(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return rawGetOneArbitraryMatch(new Object[]{pFunction, pParam, pV});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return rawHasMatch(new Object[]{pFunction, pParam, pV});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return rawCountMatches(new Object[]{pFunction, pParam, pV});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV, final Consumer<? super ArrayPointerParamWR.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunction, pParam, pV}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ArrayPointerParamWR.Match newMatch(final SsaFunction pFunction, final SsaParam pParam, final SsaVar pV) {
      return ArrayPointerParamWR.Match.newMatch(pFunction, pParam, pV);
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaFunction> rawStreamAllValuesOffunction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FUNCTION, parameters).map(SsaFunction.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction() {
      return rawStreamAllValuesOffunction(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunction() {
      return rawStreamAllValuesOffunction(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunction(final ArrayPointerParamWR.Match partialMatch) {
      return rawStreamAllValuesOffunction(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunction(final SsaParam pParam, final SsaVar pV) {
      return rawStreamAllValuesOffunction(new Object[]{null, pParam, pV});
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction(final ArrayPointerParamWR.Match partialMatch) {
      return rawStreamAllValuesOffunction(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction(final SsaParam pParam, final SsaVar pV) {
      return rawStreamAllValuesOffunction(new Object[]{null, pParam, pV}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaParam> rawStreamAllValuesOfparam(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARAM, parameters).map(SsaParam.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam() {
      return rawStreamAllValuesOfparam(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaParam> streamAllValuesOfparam() {
      return rawStreamAllValuesOfparam(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaParam> streamAllValuesOfparam(final ArrayPointerParamWR.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaParam> streamAllValuesOfparam(final SsaFunction pFunction, final SsaVar pV) {
      return rawStreamAllValuesOfparam(new Object[]{pFunction, null, pV});
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam(final ArrayPointerParamWR.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam(final SsaFunction pFunction, final SsaVar pV) {
      return rawStreamAllValuesOfparam(new Object[]{pFunction, null, pV}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaVar> rawStreamAllValuesOfv(final Object[] parameters) {
      return rawStreamAllValues(POSITION_V, parameters).map(SsaVar.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfv(final ArrayPointerParamWR.Match partialMatch) {
      return rawStreamAllValuesOfv(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfv(final SsaFunction pFunction, final SsaParam pParam) {
      return rawStreamAllValuesOfv(new Object[]{pFunction, pParam, null});
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfv(final ArrayPointerParamWR.Match partialMatch) {
      return rawStreamAllValuesOfv(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfv(final SsaFunction pFunction, final SsaParam pParam) {
      return rawStreamAllValuesOfv(new Object[]{pFunction, pParam, null}).collect(Collectors.toSet());
    }

    @Override
    protected ArrayPointerParamWR.Match tupleToMatch(final Tuple t) {
      try {
          return ArrayPointerParamWR.Match.newMatch((SsaFunction) t.get(POSITION_FUNCTION), (SsaParam) t.get(POSITION_PARAM), (SsaVar) t.get(POSITION_V));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArrayPointerParamWR.Match arrayToMatch(final Object[] match) {
      try {
          return ArrayPointerParamWR.Match.newMatch((SsaFunction) match[POSITION_FUNCTION], (SsaParam) match[POSITION_PARAM], (SsaVar) match[POSITION_V]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArrayPointerParamWR.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ArrayPointerParamWR.Match.newMutableMatch((SsaFunction) match[POSITION_FUNCTION], (SsaParam) match[POSITION_PARAM], (SsaVar) match[POSITION_V]);
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
    public static IQuerySpecification<ArrayPointerParamWR.Matcher> querySpecification() {
      return ArrayPointerParamWR.instance();
    }
  }

  private ArrayPointerParamWR() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ArrayPointerParamWR instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ArrayPointerParamWR.Matcher instantiate(final ViatraQueryEngine engine) {
    return ArrayPointerParamWR.Matcher.on(engine);
  }

  @Override
  public ArrayPointerParamWR.Matcher instantiate() {
    return ArrayPointerParamWR.Matcher.create();
  }

  @Override
  public ArrayPointerParamWR.Match newEmptyMatch() {
    return ArrayPointerParamWR.Match.newEmptyMatch();
  }

  @Override
  public ArrayPointerParamWR.Match newMatch(final Object... parameters) {
    return ArrayPointerParamWR.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaParam) parameters[1], (hu.metadom.hls.ssamodel.SsaVar) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ArrayPointerParamWR} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ArrayPointerParamWR#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ArrayPointerParamWR INSTANCE = new ArrayPointerParamWR();

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
    private static final ArrayPointerParamWR.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_function = new PParameter("function", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaParam")), PParameterDirection.INOUT);

    private final PParameter parameter_v = new PParameter("v", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_function, parameter_param, parameter_v);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.arrayPointerParamWR";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("function","param","v");
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
          PVariable var_function = body.getOrCreateVariableByName("function");
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var_v = body.getOrCreateVariableByName("v");
          new TypeConstraint(body, Tuples.flatTupleOf(var_function), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_function, parameter_function),
             new ExportedParameter(body, var_param, parameter_param),
             new ExportedParameter(body, var_v, parameter_v)
          ));
          // 	find arrayPointerParam(function, param, v)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_function, var_param, var_v), ArrayPointerParam.instance().getInternalQueryRepresentation());
          // 	find modifiedArrayBase(param)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param), ModifiedArrayBase.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
