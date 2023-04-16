/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesHandleControls.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaReturn;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         pattern returnInFunction(function: SsaFunction, ret: SsaReturn){
 *         	SsaBlock.nodes(b, ret);
 *         	find blockInBlockWithDoWhile+(function, b);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ReturnInFunction extends BaseGeneratedEMFQuerySpecification<ReturnInFunction.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.returnInFunction pattern,
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

    private SsaReturn fRet;

    private static List<String> parameterNames = makeImmutableList("function", "ret");

    private Match(final SsaFunction pFunction, final SsaReturn pRet) {
      this.fFunction = pFunction;
      this.fRet = pRet;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "function": return this.fFunction;
          case "ret": return this.fRet;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunction;
          case 1: return this.fRet;
          default: return null;
      }
    }

    public SsaFunction getFunction() {
      return this.fFunction;
    }

    public SsaReturn getRet() {
      return this.fRet;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("function".equals(parameterName) ) {
          this.fFunction = (SsaFunction) newValue;
          return true;
      }
      if ("ret".equals(parameterName) ) {
          this.fRet = (SsaReturn) newValue;
          return true;
      }
      return false;
    }

    public void setFunction(final SsaFunction pFunction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunction = pFunction;
    }

    public void setRet(final SsaReturn pRet) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRet = pRet;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.returnInFunction";
    }

    @Override
    public List<String> parameterNames() {
      return ReturnInFunction.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunction, fRet};
    }

    @Override
    public ReturnInFunction.Match toImmutable() {
      return isMutable() ? newMatch(fFunction, fRet) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"function\"=" + prettyPrintValue(fFunction) + ", ");
      result.append("\"ret\"=" + prettyPrintValue(fRet));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunction, fRet);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ReturnInFunction.Match)) {
          ReturnInFunction.Match other = (ReturnInFunction.Match) obj;
          return Objects.equals(fFunction, other.fFunction) && Objects.equals(fRet, other.fRet);
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
    public ReturnInFunction specification() {
      return ReturnInFunction.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ReturnInFunction.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ReturnInFunction.Match newMutableMatch(final SsaFunction pFunction, final SsaReturn pRet) {
      return new Mutable(pFunction, pRet);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ReturnInFunction.Match newMatch(final SsaFunction pFunction, final SsaReturn pRet) {
      return new Immutable(pFunction, pRet);
    }

    private static final class Mutable extends ReturnInFunction.Match {
      Mutable(final SsaFunction pFunction, final SsaReturn pRet) {
        super(pFunction, pRet);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ReturnInFunction.Match {
      Immutable(final SsaFunction pFunction, final SsaReturn pRet) {
        super(pFunction, pRet);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.returnInFunction pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern returnInFunction(function: SsaFunction, ret: SsaReturn){
   * 	SsaBlock.nodes(b, ret);
   * 	find blockInBlockWithDoWhile+(function, b);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ReturnInFunction
   * 
   */
  public static class Matcher extends BaseMatcher<ReturnInFunction.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ReturnInFunction.Matcher on(final ViatraQueryEngine engine) {
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
    public static ReturnInFunction.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNCTION = 0;

    private static final int POSITION_RET = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReturnInFunction.Matcher.class);

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
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ReturnInFunction.Match> getAllMatches(final SsaFunction pFunction, final SsaReturn pRet) {
      return rawStreamAllMatches(new Object[]{pFunction, pRet}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ReturnInFunction.Match> streamAllMatches(final SsaFunction pFunction, final SsaReturn pRet) {
      return rawStreamAllMatches(new Object[]{pFunction, pRet});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ReturnInFunction.Match> getOneArbitraryMatch(final SsaFunction pFunction, final SsaReturn pRet) {
      return rawGetOneArbitraryMatch(new Object[]{pFunction, pRet});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunction, final SsaReturn pRet) {
      return rawHasMatch(new Object[]{pFunction, pRet});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunction, final SsaReturn pRet) {
      return rawCountMatches(new Object[]{pFunction, pRet});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunction, final SsaReturn pRet, final Consumer<? super ReturnInFunction.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunction, pRet}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ReturnInFunction.Match newMatch(final SsaFunction pFunction, final SsaReturn pRet) {
      return ReturnInFunction.Match.newMatch(pFunction, pRet);
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
    public Stream<SsaFunction> streamAllValuesOffunction(final ReturnInFunction.Match partialMatch) {
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
    public Stream<SsaFunction> streamAllValuesOffunction(final SsaReturn pRet) {
      return rawStreamAllValuesOffunction(new Object[]{null, pRet});
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction(final ReturnInFunction.Match partialMatch) {
      return rawStreamAllValuesOffunction(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction(final SsaReturn pRet) {
      return rawStreamAllValuesOffunction(new Object[]{null, pRet}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaReturn> rawStreamAllValuesOfret(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RET, parameters).map(SsaReturn.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaReturn> getAllValuesOfret() {
      return rawStreamAllValuesOfret(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaReturn> streamAllValuesOfret() {
      return rawStreamAllValuesOfret(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaReturn> streamAllValuesOfret(final ReturnInFunction.Match partialMatch) {
      return rawStreamAllValuesOfret(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaReturn> streamAllValuesOfret(final SsaFunction pFunction) {
      return rawStreamAllValuesOfret(new Object[]{pFunction, null});
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaReturn> getAllValuesOfret(final ReturnInFunction.Match partialMatch) {
      return rawStreamAllValuesOfret(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ret.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaReturn> getAllValuesOfret(final SsaFunction pFunction) {
      return rawStreamAllValuesOfret(new Object[]{pFunction, null}).collect(Collectors.toSet());
    }

    @Override
    protected ReturnInFunction.Match tupleToMatch(final Tuple t) {
      try {
          return ReturnInFunction.Match.newMatch((SsaFunction) t.get(POSITION_FUNCTION), (SsaReturn) t.get(POSITION_RET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReturnInFunction.Match arrayToMatch(final Object[] match) {
      try {
          return ReturnInFunction.Match.newMatch((SsaFunction) match[POSITION_FUNCTION], (SsaReturn) match[POSITION_RET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReturnInFunction.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ReturnInFunction.Match.newMutableMatch((SsaFunction) match[POSITION_FUNCTION], (SsaReturn) match[POSITION_RET]);
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
    public static IQuerySpecification<ReturnInFunction.Matcher> querySpecification() {
      return ReturnInFunction.instance();
    }
  }

  private ReturnInFunction() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ReturnInFunction instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ReturnInFunction.Matcher instantiate(final ViatraQueryEngine engine) {
    return ReturnInFunction.Matcher.on(engine);
  }

  @Override
  public ReturnInFunction.Matcher instantiate() {
    return ReturnInFunction.Matcher.create();
  }

  @Override
  public ReturnInFunction.Match newEmptyMatch() {
    return ReturnInFunction.Match.newEmptyMatch();
  }

  @Override
  public ReturnInFunction.Match newMatch(final Object... parameters) {
    return ReturnInFunction.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaReturn) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ReturnInFunction} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ReturnInFunction#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ReturnInFunction INSTANCE = new ReturnInFunction();

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
    private static final ReturnInFunction.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_function = new PParameter("function", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_ret = new PParameter("ret", "hu.metadom.hls.ssamodel.SsaReturn", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaReturn")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_function, parameter_ret);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.returnInFunction";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("function","ret");
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
          PVariable var_ret = body.getOrCreateVariableByName("ret");
          PVariable var_b = body.getOrCreateVariableByName("b");
          new TypeConstraint(body, Tuples.flatTupleOf(var_function), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_ret), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaReturn")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_function, parameter_function),
             new ExportedParameter(body, var_ret, parameter_ret)
          ));
          // 	SsaBlock.nodes(b, ret)
          new TypeConstraint(body, Tuples.flatTupleOf(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_b, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ret);
          // 	find blockInBlockWithDoWhile+(function, b)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_function, var_b), BlockInBlockWithDoWhile.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
