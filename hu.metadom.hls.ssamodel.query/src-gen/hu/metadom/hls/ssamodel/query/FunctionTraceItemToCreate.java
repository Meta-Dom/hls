/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.query.internal.FunctionWithAllGlobalVar;
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
 *         pattern functionTraceItemToCreate(funcTrace: FunctionToLocalizeVariables, func: SsaFunction, variable: SsaVar) {
 *         	find functionWithAllGlobalVar(func, variable);
 *         	find functionWithTrace(funcTrace, func);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionTraceItemToCreate extends BaseGeneratedEMFQuerySpecification<FunctionTraceItemToCreate.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionTraceItemToCreate pattern,
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

    private SsaFunction fFunc;

    private SsaVar fVariable;

    private static List<String> parameterNames = makeImmutableList("funcTrace", "func", "variable");

    private Match(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      this.fFuncTrace = pFuncTrace;
      this.fFunc = pFunc;
      this.fVariable = pVariable;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "funcTrace": return this.fFuncTrace;
          case "func": return this.fFunc;
          case "variable": return this.fVariable;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFuncTrace;
          case 1: return this.fFunc;
          case 2: return this.fVariable;
          default: return null;
      }
    }

    public FunctionToLocalizeVariables getFuncTrace() {
      return this.fFuncTrace;
    }

    public SsaFunction getFunc() {
      return this.fFunc;
    }

    public SsaVar getVariable() {
      return this.fVariable;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("funcTrace".equals(parameterName) ) {
          this.fFuncTrace = (FunctionToLocalizeVariables) newValue;
          return true;
      }
      if ("func".equals(parameterName) ) {
          this.fFunc = (SsaFunction) newValue;
          return true;
      }
      if ("variable".equals(parameterName) ) {
          this.fVariable = (SsaVar) newValue;
          return true;
      }
      return false;
    }

    public void setFuncTrace(final FunctionToLocalizeVariables pFuncTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFuncTrace = pFuncTrace;
    }

    public void setFunc(final SsaFunction pFunc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunc = pFunc;
    }

    public void setVariable(final SsaVar pVariable) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVariable = pVariable;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionTraceItemToCreate";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionTraceItemToCreate.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFuncTrace, fFunc, fVariable};
    }

    @Override
    public FunctionTraceItemToCreate.Match toImmutable() {
      return isMutable() ? newMatch(fFuncTrace, fFunc, fVariable) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"funcTrace\"=" + prettyPrintValue(fFuncTrace) + ", ");
      result.append("\"func\"=" + prettyPrintValue(fFunc) + ", ");
      result.append("\"variable\"=" + prettyPrintValue(fVariable));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFuncTrace, fFunc, fVariable);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionTraceItemToCreate.Match)) {
          FunctionTraceItemToCreate.Match other = (FunctionTraceItemToCreate.Match) obj;
          return Objects.equals(fFuncTrace, other.fFuncTrace) && Objects.equals(fFunc, other.fFunc) && Objects.equals(fVariable, other.fVariable);
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
    public FunctionTraceItemToCreate specification() {
      return FunctionTraceItemToCreate.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionTraceItemToCreate.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionTraceItemToCreate.Match newMutableMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return new Mutable(pFuncTrace, pFunc, pVariable);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionTraceItemToCreate.Match newMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return new Immutable(pFuncTrace, pFunc, pVariable);
    }

    private static final class Mutable extends FunctionTraceItemToCreate.Match {
      Mutable(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
        super(pFuncTrace, pFunc, pVariable);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionTraceItemToCreate.Match {
      Immutable(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
        super(pFuncTrace, pFunc, pVariable);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionTraceItemToCreate pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionTraceItemToCreate(funcTrace: FunctionToLocalizeVariables, func: SsaFunction, variable: SsaVar) {
   * 	find functionWithAllGlobalVar(func, variable);
   * 	find functionWithTrace(funcTrace, func);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionTraceItemToCreate
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionTraceItemToCreate.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionTraceItemToCreate.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionTraceItemToCreate.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNCTRACE = 0;

    private static final int POSITION_FUNC = 1;

    private static final int POSITION_VARIABLE = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionTraceItemToCreate.Matcher.class);

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
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionTraceItemToCreate.Match> getAllMatches(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return rawStreamAllMatches(new Object[]{pFuncTrace, pFunc, pVariable}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionTraceItemToCreate.Match> streamAllMatches(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return rawStreamAllMatches(new Object[]{pFuncTrace, pFunc, pVariable});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionTraceItemToCreate.Match> getOneArbitraryMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return rawGetOneArbitraryMatch(new Object[]{pFuncTrace, pFunc, pVariable});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return rawHasMatch(new Object[]{pFuncTrace, pFunc, pVariable});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return rawCountMatches(new Object[]{pFuncTrace, pFunc, pVariable});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable, final Consumer<? super FunctionTraceItemToCreate.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFuncTrace, pFunc, pVariable}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFuncTrace the fixed value of pattern parameter funcTrace, or null if not bound.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionTraceItemToCreate.Match newMatch(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc, final SsaVar pVariable) {
      return FunctionTraceItemToCreate.Match.newMatch(pFuncTrace, pFunc, pVariable);
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
    public Stream<FunctionToLocalizeVariables> streamAllValuesOffuncTrace(final FunctionTraceItemToCreate.Match partialMatch) {
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
    public Stream<FunctionToLocalizeVariables> streamAllValuesOffuncTrace(final SsaFunction pFunc, final SsaVar pVariable) {
      return rawStreamAllValuesOffuncTrace(new Object[]{null, pFunc, pVariable});
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOffuncTrace(final FunctionTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOffuncTrace(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for funcTrace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToLocalizeVariables> getAllValuesOffuncTrace(final SsaFunction pFunc, final SsaVar pVariable) {
      return rawStreamAllValuesOffuncTrace(new Object[]{null, pFunc, pVariable}).collect(Collectors.toSet());
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
    public Stream<SsaFunction> streamAllValuesOffunc(final FunctionTraceItemToCreate.Match partialMatch) {
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
    public Stream<SsaFunction> streamAllValuesOffunc(final FunctionToLocalizeVariables pFuncTrace, final SsaVar pVariable) {
      return rawStreamAllValuesOffunc(new Object[]{pFuncTrace, null, pVariable});
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final FunctionTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOffunc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final FunctionToLocalizeVariables pFuncTrace, final SsaVar pVariable) {
      return rawStreamAllValuesOffunc(new Object[]{pFuncTrace, null, pVariable}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaVar> rawStreamAllValuesOfvariable(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VARIABLE, parameters).map(SsaVar.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable(final FunctionTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc) {
      return rawStreamAllValuesOfvariable(new Object[]{pFuncTrace, pFunc, null});
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable(final FunctionTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable(final FunctionToLocalizeVariables pFuncTrace, final SsaFunction pFunc) {
      return rawStreamAllValuesOfvariable(new Object[]{pFuncTrace, pFunc, null}).collect(Collectors.toSet());
    }

    @Override
    protected FunctionTraceItemToCreate.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionTraceItemToCreate.Match.newMatch((FunctionToLocalizeVariables) t.get(POSITION_FUNCTRACE), (SsaFunction) t.get(POSITION_FUNC), (SsaVar) t.get(POSITION_VARIABLE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionTraceItemToCreate.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionTraceItemToCreate.Match.newMatch((FunctionToLocalizeVariables) match[POSITION_FUNCTRACE], (SsaFunction) match[POSITION_FUNC], (SsaVar) match[POSITION_VARIABLE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionTraceItemToCreate.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionTraceItemToCreate.Match.newMutableMatch((FunctionToLocalizeVariables) match[POSITION_FUNCTRACE], (SsaFunction) match[POSITION_FUNC], (SsaVar) match[POSITION_VARIABLE]);
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
    public static IQuerySpecification<FunctionTraceItemToCreate.Matcher> querySpecification() {
      return FunctionTraceItemToCreate.instance();
    }
  }

  private FunctionTraceItemToCreate() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionTraceItemToCreate instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionTraceItemToCreate.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionTraceItemToCreate.Matcher.on(engine);
  }

  @Override
  public FunctionTraceItemToCreate.Matcher instantiate() {
    return FunctionTraceItemToCreate.Matcher.create();
  }

  @Override
  public FunctionTraceItemToCreate.Match newEmptyMatch() {
    return FunctionTraceItemToCreate.Match.newEmptyMatch();
  }

  @Override
  public FunctionTraceItemToCreate.Match newMatch(final Object... parameters) {
    return FunctionTraceItemToCreate.Match.newMatch((hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) parameters[0], (hu.metadom.hls.ssamodel.SsaFunction) parameters[1], (hu.metadom.hls.ssamodel.SsaVar) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionTraceItemToCreate} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionTraceItemToCreate#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionTraceItemToCreate INSTANCE = new FunctionTraceItemToCreate();

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
    private static final FunctionTraceItemToCreate.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_funcTrace = new PParameter("funcTrace", "hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")), PParameterDirection.INOUT);

    private final PParameter parameter_func = new PParameter("func", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_variable = new PParameter("variable", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_funcTrace, parameter_func, parameter_variable);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionTraceItemToCreate";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("funcTrace","func","variable");
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
          PVariable var_func = body.getOrCreateVariableByName("func");
          PVariable var_variable = body.getOrCreateVariableByName("variable");
          new TypeConstraint(body, Tuples.flatTupleOf(var_funcTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_funcTrace, parameter_funcTrace),
             new ExportedParameter(body, var_func, parameter_func),
             new ExportedParameter(body, var_variable, parameter_variable)
          ));
          // 	find functionWithAllGlobalVar(func, variable)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var_variable), FunctionWithAllGlobalVar.instance().getInternalQueryRepresentation());
          // 	find functionWithTrace(funcTrace, func)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_funcTrace, var_func), FunctionWithTrace.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
