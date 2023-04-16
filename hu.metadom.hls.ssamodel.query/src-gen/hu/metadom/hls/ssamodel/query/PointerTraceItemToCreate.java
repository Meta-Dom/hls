/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesPointerEliminate.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaParam;
import hu.metadom.hls.ssamodel.query.internal.FunctionWithPointerParam;
import hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams;
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
 *         pattern pointerTraceItemToCreate(trace: FunctionToDepointerParams, param: SsaParam) {
 *         	FunctionToDepointerParams.function(trace, func);
 *         	find functionWithPointerParam(func, param);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PointerTraceItemToCreate extends BaseGeneratedEMFQuerySpecification<PointerTraceItemToCreate.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.pointerTraceItemToCreate pattern,
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
    private FunctionToDepointerParams fTrace;

    private SsaParam fParam;

    private static List<String> parameterNames = makeImmutableList("trace", "param");

    private Match(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      this.fTrace = pTrace;
      this.fParam = pParam;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "trace": return this.fTrace;
          case "param": return this.fParam;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTrace;
          case 1: return this.fParam;
          default: return null;
      }
    }

    public FunctionToDepointerParams getTrace() {
      return this.fTrace;
    }

    public SsaParam getParam() {
      return this.fParam;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("trace".equals(parameterName) ) {
          this.fTrace = (FunctionToDepointerParams) newValue;
          return true;
      }
      if ("param".equals(parameterName) ) {
          this.fParam = (SsaParam) newValue;
          return true;
      }
      return false;
    }

    public void setTrace(final FunctionToDepointerParams pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }

    public void setParam(final SsaParam pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.pointerTraceItemToCreate";
    }

    @Override
    public List<String> parameterNames() {
      return PointerTraceItemToCreate.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fTrace, fParam};
    }

    @Override
    public PointerTraceItemToCreate.Match toImmutable() {
      return isMutable() ? newMatch(fTrace, fParam) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
      result.append("\"param\"=" + prettyPrintValue(fParam));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fTrace, fParam);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PointerTraceItemToCreate.Match)) {
          PointerTraceItemToCreate.Match other = (PointerTraceItemToCreate.Match) obj;
          return Objects.equals(fTrace, other.fTrace) && Objects.equals(fParam, other.fParam);
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
    public PointerTraceItemToCreate specification() {
      return PointerTraceItemToCreate.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PointerTraceItemToCreate.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PointerTraceItemToCreate.Match newMutableMatch(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return new Mutable(pTrace, pParam);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PointerTraceItemToCreate.Match newMatch(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return new Immutable(pTrace, pParam);
    }

    private static final class Mutable extends PointerTraceItemToCreate.Match {
      Mutable(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
        super(pTrace, pParam);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends PointerTraceItemToCreate.Match {
      Immutable(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
        super(pTrace, pParam);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.pointerTraceItemToCreate pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern pointerTraceItemToCreate(trace: FunctionToDepointerParams, param: SsaParam) {
   * 	FunctionToDepointerParams.function(trace, func);
   * 	find functionWithPointerParam(func, param);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PointerTraceItemToCreate
   * 
   */
  public static class Matcher extends BaseMatcher<PointerTraceItemToCreate.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PointerTraceItemToCreate.Matcher on(final ViatraQueryEngine engine) {
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
    public static PointerTraceItemToCreate.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_TRACE = 0;

    private static final int POSITION_PARAM = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PointerTraceItemToCreate.Matcher.class);

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
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PointerTraceItemToCreate.Match> getAllMatches(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return rawStreamAllMatches(new Object[]{pTrace, pParam}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PointerTraceItemToCreate.Match> streamAllMatches(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return rawStreamAllMatches(new Object[]{pTrace, pParam});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PointerTraceItemToCreate.Match> getOneArbitraryMatch(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return rawGetOneArbitraryMatch(new Object[]{pTrace, pParam});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return rawHasMatch(new Object[]{pTrace, pParam});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return rawCountMatches(new Object[]{pTrace, pParam});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FunctionToDepointerParams pTrace, final SsaParam pParam, final Consumer<? super PointerTraceItemToCreate.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTrace, pParam}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PointerTraceItemToCreate.Match newMatch(final FunctionToDepointerParams pTrace, final SsaParam pParam) {
      return PointerTraceItemToCreate.Match.newMatch(pTrace, pParam);
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FunctionToDepointerParams> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(FunctionToDepointerParams.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToDepointerParams> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToDepointerParams> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToDepointerParams> streamAllValuesOftrace(final PointerTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionToDepointerParams> streamAllValuesOftrace(final SsaParam pParam) {
      return rawStreamAllValuesOftrace(new Object[]{null, pParam});
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToDepointerParams> getAllValuesOftrace(final PointerTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionToDepointerParams> getAllValuesOftrace(final SsaParam pParam) {
      return rawStreamAllValuesOftrace(new Object[]{null, pParam}).collect(Collectors.toSet());
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
    public Stream<SsaParam> streamAllValuesOfparam(final PointerTraceItemToCreate.Match partialMatch) {
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
    public Stream<SsaParam> streamAllValuesOfparam(final FunctionToDepointerParams pTrace) {
      return rawStreamAllValuesOfparam(new Object[]{pTrace, null});
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam(final PointerTraceItemToCreate.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam(final FunctionToDepointerParams pTrace) {
      return rawStreamAllValuesOfparam(new Object[]{pTrace, null}).collect(Collectors.toSet());
    }

    @Override
    protected PointerTraceItemToCreate.Match tupleToMatch(final Tuple t) {
      try {
          return PointerTraceItemToCreate.Match.newMatch((FunctionToDepointerParams) t.get(POSITION_TRACE), (SsaParam) t.get(POSITION_PARAM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected PointerTraceItemToCreate.Match arrayToMatch(final Object[] match) {
      try {
          return PointerTraceItemToCreate.Match.newMatch((FunctionToDepointerParams) match[POSITION_TRACE], (SsaParam) match[POSITION_PARAM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected PointerTraceItemToCreate.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PointerTraceItemToCreate.Match.newMutableMatch((FunctionToDepointerParams) match[POSITION_TRACE], (SsaParam) match[POSITION_PARAM]);
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
    public static IQuerySpecification<PointerTraceItemToCreate.Matcher> querySpecification() {
      return PointerTraceItemToCreate.instance();
    }
  }

  private PointerTraceItemToCreate() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PointerTraceItemToCreate instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected PointerTraceItemToCreate.Matcher instantiate(final ViatraQueryEngine engine) {
    return PointerTraceItemToCreate.Matcher.on(engine);
  }

  @Override
  public PointerTraceItemToCreate.Matcher instantiate() {
    return PointerTraceItemToCreate.Matcher.create();
  }

  @Override
  public PointerTraceItemToCreate.Match newEmptyMatch() {
    return PointerTraceItemToCreate.Match.newEmptyMatch();
  }

  @Override
  public PointerTraceItemToCreate.Match newMatch(final Object... parameters) {
    return PointerTraceItemToCreate.Match.newMatch((hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams) parameters[0], (hu.metadom.hls.ssamodel.SsaParam) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link PointerTraceItemToCreate} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PointerTraceItemToCreate#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PointerTraceItemToCreate INSTANCE = new PointerTraceItemToCreate();

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
    private static final PointerTraceItemToCreate.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_trace = new PParameter("trace", "hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModelTrace", "FunctionToDepointerParams")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaParam")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_trace, parameter_param);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.pointerTraceItemToCreate";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace","param");
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
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var_func = body.getOrCreateVariableByName("func");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToDepointerParams")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_trace, parameter_trace),
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	FunctionToDepointerParams.function(trace, func)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToDepointerParams")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToDepointerParams", "function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new Equality(body, var__virtual_0_, var_func);
          // 	find functionWithPointerParam(func, param)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var_param), FunctionWithPointerParam.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
