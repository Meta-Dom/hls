/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query;

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
 *         pattern functionToLocalizeVariables(trace: FunctionToLocalizeVariables) {
 *         	FunctionToLocalizeVariables(trace);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionToLocalizeVariables extends BaseGeneratedEMFQuerySpecification<FunctionToLocalizeVariables.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionToLocalizeVariables pattern,
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
    private hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables fTrace;

    private static List<String> parameterNames = makeImmutableList("trace");

    private Match(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      this.fTrace = pTrace;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "trace": return this.fTrace;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTrace;
          default: return null;
      }
    }

    public hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables getTrace() {
      return this.fTrace;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("trace".equals(parameterName) ) {
          this.fTrace = (hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) newValue;
          return true;
      }
      return false;
    }

    public void setTrace(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionToLocalizeVariables";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionToLocalizeVariables.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fTrace};
    }

    @Override
    public FunctionToLocalizeVariables.Match toImmutable() {
      return isMutable() ? newMatch(fTrace) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fTrace);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionToLocalizeVariables.Match)) {
          FunctionToLocalizeVariables.Match other = (FunctionToLocalizeVariables.Match) obj;
          return Objects.equals(fTrace, other.fTrace);
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
    public FunctionToLocalizeVariables specification() {
      return FunctionToLocalizeVariables.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionToLocalizeVariables.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionToLocalizeVariables.Match newMutableMatch(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return new Mutable(pTrace);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionToLocalizeVariables.Match newMatch(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return new Immutable(pTrace);
    }

    private static final class Mutable extends FunctionToLocalizeVariables.Match {
      Mutable(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
        super(pTrace);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionToLocalizeVariables.Match {
      Immutable(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
        super(pTrace);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionToLocalizeVariables pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionToLocalizeVariables(trace: FunctionToLocalizeVariables) {
   * 	FunctionToLocalizeVariables(trace);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionToLocalizeVariables
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionToLocalizeVariables.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionToLocalizeVariables.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionToLocalizeVariables.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_TRACE = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionToLocalizeVariables.Matcher.class);

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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionToLocalizeVariables.Match> getAllMatches(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return rawStreamAllMatches(new Object[]{pTrace}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionToLocalizeVariables.Match> streamAllMatches(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return rawStreamAllMatches(new Object[]{pTrace});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionToLocalizeVariables.Match> getOneArbitraryMatch(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pTrace});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return rawHasMatch(new Object[]{pTrace});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return rawCountMatches(new Object[]{pTrace});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace, final Consumer<? super FunctionToLocalizeVariables.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTrace}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionToLocalizeVariables.Match newMatch(final hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables pTrace) {
      return FunctionToLocalizeVariables.Match.newMatch(pTrace);
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }

    @Override
    protected FunctionToLocalizeVariables.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionToLocalizeVariables.Match.newMatch((hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionToLocalizeVariables.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionToLocalizeVariables.Match.newMatch((hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionToLocalizeVariables.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionToLocalizeVariables.Match.newMutableMatch((hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) match[POSITION_TRACE]);
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
    public static IQuerySpecification<FunctionToLocalizeVariables.Matcher> querySpecification() {
      return FunctionToLocalizeVariables.instance();
    }
  }

  private FunctionToLocalizeVariables() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionToLocalizeVariables instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionToLocalizeVariables.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionToLocalizeVariables.Matcher.on(engine);
  }

  @Override
  public FunctionToLocalizeVariables.Matcher instantiate() {
    return FunctionToLocalizeVariables.Matcher.create();
  }

  @Override
  public FunctionToLocalizeVariables.Match newEmptyMatch() {
    return FunctionToLocalizeVariables.Match.newEmptyMatch();
  }

  @Override
  public FunctionToLocalizeVariables.Match newMatch(final Object... parameters) {
    return FunctionToLocalizeVariables.Match.newMatch((hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionToLocalizeVariables} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionToLocalizeVariables#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionToLocalizeVariables INSTANCE = new FunctionToLocalizeVariables();

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
    private static final FunctionToLocalizeVariables.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_trace = new PParameter("trace", "hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_trace);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionToLocalizeVariables";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	FunctionToLocalizeVariables(trace)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModelTrace", "FunctionToLocalizeVariables")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
