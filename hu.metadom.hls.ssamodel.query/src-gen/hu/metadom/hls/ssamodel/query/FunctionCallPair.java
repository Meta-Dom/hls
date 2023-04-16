/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

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
 *         pattern functionCallPair(func: SsaFunction, otherFunc: SsaFunction) {
 *         	find functionCallInFunction(func, _, otherFunc);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionCallPair extends BaseGeneratedEMFQuerySpecification<FunctionCallPair.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionCallPair pattern,
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

    private SsaFunction fOtherFunc;

    private static List<String> parameterNames = makeImmutableList("func", "otherFunc");

    private Match(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      this.fFunc = pFunc;
      this.fOtherFunc = pOtherFunc;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "func": return this.fFunc;
          case "otherFunc": return this.fOtherFunc;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunc;
          case 1: return this.fOtherFunc;
          default: return null;
      }
    }

    public SsaFunction getFunc() {
      return this.fFunc;
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

    public void setOtherFunc(final SsaFunction pOtherFunc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOtherFunc = pOtherFunc;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionCallPair";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionCallPair.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunc, fOtherFunc};
    }

    @Override
    public FunctionCallPair.Match toImmutable() {
      return isMutable() ? newMatch(fFunc, fOtherFunc) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"func\"=" + prettyPrintValue(fFunc) + ", ");
      result.append("\"otherFunc\"=" + prettyPrintValue(fOtherFunc));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunc, fOtherFunc);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionCallPair.Match)) {
          FunctionCallPair.Match other = (FunctionCallPair.Match) obj;
          return Objects.equals(fFunc, other.fFunc) && Objects.equals(fOtherFunc, other.fOtherFunc);
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
    public FunctionCallPair specification() {
      return FunctionCallPair.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionCallPair.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionCallPair.Match newMutableMatch(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return new Mutable(pFunc, pOtherFunc);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionCallPair.Match newMatch(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return new Immutable(pFunc, pOtherFunc);
    }

    private static final class Mutable extends FunctionCallPair.Match {
      Mutable(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
        super(pFunc, pOtherFunc);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionCallPair.Match {
      Immutable(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
        super(pFunc, pOtherFunc);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionCallPair pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionCallPair(func: SsaFunction, otherFunc: SsaFunction) {
   * 	find functionCallInFunction(func, _, otherFunc);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionCallPair
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionCallPair.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionCallPair.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionCallPair.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNC = 0;

    private static final int POSITION_OTHERFUNC = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionCallPair.Matcher.class);

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
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionCallPair.Match> getAllMatches(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawStreamAllMatches(new Object[]{pFunc, pOtherFunc}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionCallPair.Match> streamAllMatches(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawStreamAllMatches(new Object[]{pFunc, pOtherFunc});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionCallPair.Match> getOneArbitraryMatch(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawGetOneArbitraryMatch(new Object[]{pFunc, pOtherFunc});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawHasMatch(new Object[]{pFunc, pOtherFunc});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return rawCountMatches(new Object[]{pFunc, pOtherFunc});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunc, final SsaFunction pOtherFunc, final Consumer<? super FunctionCallPair.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunc, pOtherFunc}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pOtherFunc the fixed value of pattern parameter otherFunc, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionCallPair.Match newMatch(final SsaFunction pFunc, final SsaFunction pOtherFunc) {
      return FunctionCallPair.Match.newMatch(pFunc, pOtherFunc);
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
    public Stream<SsaFunction> streamAllValuesOffunc(final FunctionCallPair.Match partialMatch) {
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
    public Stream<SsaFunction> streamAllValuesOffunc(final SsaFunction pOtherFunc) {
      return rawStreamAllValuesOffunc(new Object[]{null, pOtherFunc});
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final FunctionCallPair.Match partialMatch) {
      return rawStreamAllValuesOffunc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final SsaFunction pOtherFunc) {
      return rawStreamAllValuesOffunc(new Object[]{null, pOtherFunc}).collect(Collectors.toSet());
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
    public Stream<SsaFunction> streamAllValuesOfotherFunc(final FunctionCallPair.Match partialMatch) {
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
    public Stream<SsaFunction> streamAllValuesOfotherFunc(final SsaFunction pFunc) {
      return rawStreamAllValuesOfotherFunc(new Object[]{pFunc, null});
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOfotherFunc(final FunctionCallPair.Match partialMatch) {
      return rawStreamAllValuesOfotherFunc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for otherFunc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOfotherFunc(final SsaFunction pFunc) {
      return rawStreamAllValuesOfotherFunc(new Object[]{pFunc, null}).collect(Collectors.toSet());
    }

    @Override
    protected FunctionCallPair.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionCallPair.Match.newMatch((SsaFunction) t.get(POSITION_FUNC), (SsaFunction) t.get(POSITION_OTHERFUNC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionCallPair.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionCallPair.Match.newMatch((SsaFunction) match[POSITION_FUNC], (SsaFunction) match[POSITION_OTHERFUNC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionCallPair.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionCallPair.Match.newMutableMatch((SsaFunction) match[POSITION_FUNC], (SsaFunction) match[POSITION_OTHERFUNC]);
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
    public static IQuerySpecification<FunctionCallPair.Matcher> querySpecification() {
      return FunctionCallPair.instance();
    }
  }

  private FunctionCallPair() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionCallPair instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionCallPair.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionCallPair.Matcher.on(engine);
  }

  @Override
  public FunctionCallPair.Matcher instantiate() {
    return FunctionCallPair.Matcher.create();
  }

  @Override
  public FunctionCallPair.Match newEmptyMatch() {
    return FunctionCallPair.Match.newEmptyMatch();
  }

  @Override
  public FunctionCallPair.Match newMatch(final Object... parameters) {
    return FunctionCallPair.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaFunction) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionCallPair} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionCallPair#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionCallPair INSTANCE = new FunctionCallPair();

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
    private static final FunctionCallPair.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_func = new PParameter("func", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_otherFunc = new PParameter("otherFunc", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_func, parameter_otherFunc);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionCallPair";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("func","otherFunc");
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
          PVariable var_otherFunc = body.getOrCreateVariableByName("otherFunc");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherFunc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_func, parameter_func),
             new ExportedParameter(body, var_otherFunc, parameter_otherFunc)
          ));
          // 	find functionCallInFunction(func, _, otherFunc)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var___0_, var_otherFunc), FunctionCallInFunction.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
