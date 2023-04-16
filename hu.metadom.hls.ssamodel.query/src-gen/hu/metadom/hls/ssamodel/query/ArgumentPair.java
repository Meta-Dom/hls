/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesArgumentSimplifier.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaCall;
import hu.metadom.hls.ssamodel.SsaPassByRefArgument;
import hu.metadom.hls.ssamodel.SsaPassByRefParam;
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
 *         // ArgumentSimplifier transformation
 *         
 *         pattern argumentPair(param: SsaPassByRefParam, call: SsaCall, arg: SsaPassByRefArgument) {
 *         	SsaCall.arguments(call, arg);
 *         	SsaPassByRefArgument.param(arg, param);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ArgumentPair extends BaseGeneratedEMFQuerySpecification<ArgumentPair.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.argumentPair pattern,
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
    private SsaPassByRefParam fParam;

    private SsaCall fCall;

    private SsaPassByRefArgument fArg;

    private static List<String> parameterNames = makeImmutableList("param", "call", "arg");

    private Match(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      this.fParam = pParam;
      this.fCall = pCall;
      this.fArg = pArg;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "param": return this.fParam;
          case "call": return this.fCall;
          case "arg": return this.fArg;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fParam;
          case 1: return this.fCall;
          case 2: return this.fArg;
          default: return null;
      }
    }

    public SsaPassByRefParam getParam() {
      return this.fParam;
    }

    public SsaCall getCall() {
      return this.fCall;
    }

    public SsaPassByRefArgument getArg() {
      return this.fArg;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("param".equals(parameterName) ) {
          this.fParam = (SsaPassByRefParam) newValue;
          return true;
      }
      if ("call".equals(parameterName) ) {
          this.fCall = (SsaCall) newValue;
          return true;
      }
      if ("arg".equals(parameterName) ) {
          this.fArg = (SsaPassByRefArgument) newValue;
          return true;
      }
      return false;
    }

    public void setParam(final SsaPassByRefParam pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }

    public void setCall(final SsaCall pCall) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCall = pCall;
    }

    public void setArg(final SsaPassByRefArgument pArg) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fArg = pArg;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.argumentPair";
    }

    @Override
    public List<String> parameterNames() {
      return ArgumentPair.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fParam, fCall, fArg};
    }

    @Override
    public ArgumentPair.Match toImmutable() {
      return isMutable() ? newMatch(fParam, fCall, fArg) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"param\"=" + prettyPrintValue(fParam) + ", ");
      result.append("\"call\"=" + prettyPrintValue(fCall) + ", ");
      result.append("\"arg\"=" + prettyPrintValue(fArg));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fParam, fCall, fArg);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ArgumentPair.Match)) {
          ArgumentPair.Match other = (ArgumentPair.Match) obj;
          return Objects.equals(fParam, other.fParam) && Objects.equals(fCall, other.fCall) && Objects.equals(fArg, other.fArg);
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
    public ArgumentPair specification() {
      return ArgumentPair.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ArgumentPair.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ArgumentPair.Match newMutableMatch(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return new Mutable(pParam, pCall, pArg);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ArgumentPair.Match newMatch(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return new Immutable(pParam, pCall, pArg);
    }

    private static final class Mutable extends ArgumentPair.Match {
      Mutable(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
        super(pParam, pCall, pArg);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ArgumentPair.Match {
      Immutable(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
        super(pParam, pCall, pArg);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.argumentPair pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ArgumentSimplifier transformation
   * 
   * pattern argumentPair(param: SsaPassByRefParam, call: SsaCall, arg: SsaPassByRefArgument) {
   * 	SsaCall.arguments(call, arg);
   * 	SsaPassByRefArgument.param(arg, param);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ArgumentPair
   * 
   */
  public static class Matcher extends BaseMatcher<ArgumentPair.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ArgumentPair.Matcher on(final ViatraQueryEngine engine) {
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
    public static ArgumentPair.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_PARAM = 0;

    private static final int POSITION_CALL = 1;

    private static final int POSITION_ARG = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ArgumentPair.Matcher.class);

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
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ArgumentPair.Match> getAllMatches(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawStreamAllMatches(new Object[]{pParam, pCall, pArg}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ArgumentPair.Match> streamAllMatches(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawStreamAllMatches(new Object[]{pParam, pCall, pArg});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ArgumentPair.Match> getOneArbitraryMatch(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawGetOneArbitraryMatch(new Object[]{pParam, pCall, pArg});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawHasMatch(new Object[]{pParam, pCall, pArg});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawCountMatches(new Object[]{pParam, pCall, pArg});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg, final Consumer<? super ArgumentPair.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pParam, pCall, pArg}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ArgumentPair.Match newMatch(final SsaPassByRefParam pParam, final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return ArgumentPair.Match.newMatch(pParam, pCall, pArg);
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaPassByRefParam> rawStreamAllValuesOfparam(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARAM, parameters).map(SsaPassByRefParam.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam() {
      return rawStreamAllValuesOfparam(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaPassByRefParam> streamAllValuesOfparam() {
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
    public Stream<SsaPassByRefParam> streamAllValuesOfparam(final ArgumentPair.Match partialMatch) {
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
    public Stream<SsaPassByRefParam> streamAllValuesOfparam(final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawStreamAllValuesOfparam(new Object[]{null, pCall, pArg});
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam(final ArgumentPair.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam(final SsaCall pCall, final SsaPassByRefArgument pArg) {
      return rawStreamAllValuesOfparam(new Object[]{null, pCall, pArg}).collect(Collectors.toSet());
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
    public Stream<SsaCall> streamAllValuesOfcall(final ArgumentPair.Match partialMatch) {
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
    public Stream<SsaCall> streamAllValuesOfcall(final SsaPassByRefParam pParam, final SsaPassByRefArgument pArg) {
      return rawStreamAllValuesOfcall(new Object[]{pParam, null, pArg});
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall(final ArgumentPair.Match partialMatch) {
      return rawStreamAllValuesOfcall(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall(final SsaPassByRefParam pParam, final SsaPassByRefArgument pArg) {
      return rawStreamAllValuesOfcall(new Object[]{pParam, null, pArg}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaPassByRefArgument> rawStreamAllValuesOfarg(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ARG, parameters).map(SsaPassByRefArgument.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefArgument> getAllValuesOfarg() {
      return rawStreamAllValuesOfarg(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaPassByRefArgument> streamAllValuesOfarg() {
      return rawStreamAllValuesOfarg(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaPassByRefArgument> streamAllValuesOfarg(final ArgumentPair.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaPassByRefArgument> streamAllValuesOfarg(final SsaPassByRefParam pParam, final SsaCall pCall) {
      return rawStreamAllValuesOfarg(new Object[]{pParam, pCall, null});
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefArgument> getAllValuesOfarg(final ArgumentPair.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefArgument> getAllValuesOfarg(final SsaPassByRefParam pParam, final SsaCall pCall) {
      return rawStreamAllValuesOfarg(new Object[]{pParam, pCall, null}).collect(Collectors.toSet());
    }

    @Override
    protected ArgumentPair.Match tupleToMatch(final Tuple t) {
      try {
          return ArgumentPair.Match.newMatch((SsaPassByRefParam) t.get(POSITION_PARAM), (SsaCall) t.get(POSITION_CALL), (SsaPassByRefArgument) t.get(POSITION_ARG));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArgumentPair.Match arrayToMatch(final Object[] match) {
      try {
          return ArgumentPair.Match.newMatch((SsaPassByRefParam) match[POSITION_PARAM], (SsaCall) match[POSITION_CALL], (SsaPassByRefArgument) match[POSITION_ARG]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArgumentPair.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ArgumentPair.Match.newMutableMatch((SsaPassByRefParam) match[POSITION_PARAM], (SsaCall) match[POSITION_CALL], (SsaPassByRefArgument) match[POSITION_ARG]);
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
    public static IQuerySpecification<ArgumentPair.Matcher> querySpecification() {
      return ArgumentPair.instance();
    }
  }

  private ArgumentPair() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ArgumentPair instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ArgumentPair.Matcher instantiate(final ViatraQueryEngine engine) {
    return ArgumentPair.Matcher.on(engine);
  }

  @Override
  public ArgumentPair.Matcher instantiate() {
    return ArgumentPair.Matcher.create();
  }

  @Override
  public ArgumentPair.Match newEmptyMatch() {
    return ArgumentPair.Match.newEmptyMatch();
  }

  @Override
  public ArgumentPair.Match newMatch(final Object... parameters) {
    return ArgumentPair.Match.newMatch((hu.metadom.hls.ssamodel.SsaPassByRefParam) parameters[0], (hu.metadom.hls.ssamodel.SsaCall) parameters[1], (hu.metadom.hls.ssamodel.SsaPassByRefArgument) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ArgumentPair} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ArgumentPair#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ArgumentPair INSTANCE = new ArgumentPair();

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
    private static final ArgumentPair.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaPassByRefParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")), PParameterDirection.INOUT);

    private final PParameter parameter_call = new PParameter("call", "hu.metadom.hls.ssamodel.SsaCall", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaCall")), PParameterDirection.INOUT);

    private final PParameter parameter_arg = new PParameter("arg", "hu.metadom.hls.ssamodel.SsaPassByRefArgument", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaPassByRefArgument")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_param, parameter_call, parameter_arg);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.argumentPair";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("param","call","arg");
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
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var_call = body.getOrCreateVariableByName("call");
          PVariable var_arg = body.getOrCreateVariableByName("arg");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_call), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefArgument")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param),
             new ExportedParameter(body, var_call, parameter_call),
             new ExportedParameter(body, var_arg, parameter_arg)
          ));
          // 	SsaCall.arguments(call, arg)
          new TypeConstraint(body, Tuples.flatTupleOf(var_call), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_call, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCall", "arguments")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          new Equality(body, var__virtual_0_, var_arg);
          // 	SsaPassByRefArgument.param(arg, param)
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefArgument")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument", "param")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new Equality(body, var__virtual_1_, var_param);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
