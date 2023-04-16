/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesPointerEliminate.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.query.internal.FunctionWithPointerParam;
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
 *         pattern pointerTraceToCreate(func: SsaFunction) {
 *         	find functionWithPointerParam(func, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PointerTraceToCreate extends BaseGeneratedEMFQuerySpecification<PointerTraceToCreate.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.pointerTraceToCreate pattern,
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

    private static List<String> parameterNames = makeImmutableList("func");

    private Match(final SsaFunction pFunc) {
      this.fFunc = pFunc;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "func": return this.fFunc;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunc;
          default: return null;
      }
    }

    public SsaFunction getFunc() {
      return this.fFunc;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("func".equals(parameterName) ) {
          this.fFunc = (SsaFunction) newValue;
          return true;
      }
      return false;
    }

    public void setFunc(final SsaFunction pFunc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunc = pFunc;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.pointerTraceToCreate";
    }

    @Override
    public List<String> parameterNames() {
      return PointerTraceToCreate.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunc};
    }

    @Override
    public PointerTraceToCreate.Match toImmutable() {
      return isMutable() ? newMatch(fFunc) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"func\"=" + prettyPrintValue(fFunc));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunc);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PointerTraceToCreate.Match)) {
          PointerTraceToCreate.Match other = (PointerTraceToCreate.Match) obj;
          return Objects.equals(fFunc, other.fFunc);
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
    public PointerTraceToCreate specification() {
      return PointerTraceToCreate.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PointerTraceToCreate.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PointerTraceToCreate.Match newMutableMatch(final SsaFunction pFunc) {
      return new Mutable(pFunc);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PointerTraceToCreate.Match newMatch(final SsaFunction pFunc) {
      return new Immutable(pFunc);
    }

    private static final class Mutable extends PointerTraceToCreate.Match {
      Mutable(final SsaFunction pFunc) {
        super(pFunc);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends PointerTraceToCreate.Match {
      Immutable(final SsaFunction pFunc) {
        super(pFunc);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.pointerTraceToCreate pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern pointerTraceToCreate(func: SsaFunction) {
   * 	find functionWithPointerParam(func, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PointerTraceToCreate
   * 
   */
  public static class Matcher extends BaseMatcher<PointerTraceToCreate.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PointerTraceToCreate.Matcher on(final ViatraQueryEngine engine) {
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
    public static PointerTraceToCreate.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNC = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PointerTraceToCreate.Matcher.class);

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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PointerTraceToCreate.Match> getAllMatches(final SsaFunction pFunc) {
      return rawStreamAllMatches(new Object[]{pFunc}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PointerTraceToCreate.Match> streamAllMatches(final SsaFunction pFunc) {
      return rawStreamAllMatches(new Object[]{pFunc});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PointerTraceToCreate.Match> getOneArbitraryMatch(final SsaFunction pFunc) {
      return rawGetOneArbitraryMatch(new Object[]{pFunc});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunc) {
      return rawHasMatch(new Object[]{pFunc});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunc) {
      return rawCountMatches(new Object[]{pFunc});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunc, final Consumer<? super PointerTraceToCreate.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunc}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PointerTraceToCreate.Match newMatch(final SsaFunction pFunc) {
      return PointerTraceToCreate.Match.newMatch(pFunc);
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

    @Override
    protected PointerTraceToCreate.Match tupleToMatch(final Tuple t) {
      try {
          return PointerTraceToCreate.Match.newMatch((SsaFunction) t.get(POSITION_FUNC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected PointerTraceToCreate.Match arrayToMatch(final Object[] match) {
      try {
          return PointerTraceToCreate.Match.newMatch((SsaFunction) match[POSITION_FUNC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected PointerTraceToCreate.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PointerTraceToCreate.Match.newMutableMatch((SsaFunction) match[POSITION_FUNC]);
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
    public static IQuerySpecification<PointerTraceToCreate.Matcher> querySpecification() {
      return PointerTraceToCreate.instance();
    }
  }

  private PointerTraceToCreate() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PointerTraceToCreate instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected PointerTraceToCreate.Matcher instantiate(final ViatraQueryEngine engine) {
    return PointerTraceToCreate.Matcher.on(engine);
  }

  @Override
  public PointerTraceToCreate.Matcher instantiate() {
    return PointerTraceToCreate.Matcher.create();
  }

  @Override
  public PointerTraceToCreate.Match newEmptyMatch() {
    return PointerTraceToCreate.Match.newEmptyMatch();
  }

  @Override
  public PointerTraceToCreate.Match newMatch(final Object... parameters) {
    return PointerTraceToCreate.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link PointerTraceToCreate} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PointerTraceToCreate#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PointerTraceToCreate INSTANCE = new PointerTraceToCreate();

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
    private static final PointerTraceToCreate.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_func = new PParameter("func", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_func);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.pointerTraceToCreate";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("func");
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
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_func, parameter_func)
          ));
          // 	find functionWithPointerParam(func, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var___0_), FunctionWithPointerParam.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
