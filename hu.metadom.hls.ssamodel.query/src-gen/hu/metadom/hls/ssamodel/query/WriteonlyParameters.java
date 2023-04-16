/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesArgumentSimplifier.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.ParamDirection;
import hu.metadom.hls.ssamodel.SsaFunction;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         pattern writeonlyParameters(function: SsaFunction, param: SsaPassByRefParam) {
 *         	neg find nodeUseNode(_, param);
 *         	
 *         	SsaFunction.parameters(function, param);
 *         	SsaParam.direction(param, dir);
 *         	check(
 *         		switch (dir) {
 *         			case OUT:
 *         				false
 *         			default:
 *         				true
 *         		}
 *         	);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class WriteonlyParameters extends BaseGeneratedEMFQuerySpecification<WriteonlyParameters.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.writeonlyParameters pattern,
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

    private SsaPassByRefParam fParam;

    private static List<String> parameterNames = makeImmutableList("function", "param");

    private Match(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      this.fFunction = pFunction;
      this.fParam = pParam;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "function": return this.fFunction;
          case "param": return this.fParam;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunction;
          case 1: return this.fParam;
          default: return null;
      }
    }

    public SsaFunction getFunction() {
      return this.fFunction;
    }

    public SsaPassByRefParam getParam() {
      return this.fParam;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("function".equals(parameterName) ) {
          this.fFunction = (SsaFunction) newValue;
          return true;
      }
      if ("param".equals(parameterName) ) {
          this.fParam = (SsaPassByRefParam) newValue;
          return true;
      }
      return false;
    }

    public void setFunction(final SsaFunction pFunction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunction = pFunction;
    }

    public void setParam(final SsaPassByRefParam pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.writeonlyParameters";
    }

    @Override
    public List<String> parameterNames() {
      return WriteonlyParameters.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunction, fParam};
    }

    @Override
    public WriteonlyParameters.Match toImmutable() {
      return isMutable() ? newMatch(fFunction, fParam) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"function\"=" + prettyPrintValue(fFunction) + ", ");
      result.append("\"param\"=" + prettyPrintValue(fParam));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunction, fParam);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof WriteonlyParameters.Match)) {
          WriteonlyParameters.Match other = (WriteonlyParameters.Match) obj;
          return Objects.equals(fFunction, other.fFunction) && Objects.equals(fParam, other.fParam);
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
    public WriteonlyParameters specification() {
      return WriteonlyParameters.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static WriteonlyParameters.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static WriteonlyParameters.Match newMutableMatch(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return new Mutable(pFunction, pParam);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static WriteonlyParameters.Match newMatch(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return new Immutable(pFunction, pParam);
    }

    private static final class Mutable extends WriteonlyParameters.Match {
      Mutable(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
        super(pFunction, pParam);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends WriteonlyParameters.Match {
      Immutable(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
        super(pFunction, pParam);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.writeonlyParameters pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern writeonlyParameters(function: SsaFunction, param: SsaPassByRefParam) {
   * 	neg find nodeUseNode(_, param);
   * 	
   * 	SsaFunction.parameters(function, param);
   * 	SsaParam.direction(param, dir);
   * 	check(
   * 		switch (dir) {
   * 			case OUT:
   * 				false
   * 			default:
   * 				true
   * 		}
   * 	);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see WriteonlyParameters
   * 
   */
  public static class Matcher extends BaseMatcher<WriteonlyParameters.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static WriteonlyParameters.Matcher on(final ViatraQueryEngine engine) {
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
    public static WriteonlyParameters.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNCTION = 0;

    private static final int POSITION_PARAM = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(WriteonlyParameters.Matcher.class);

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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<WriteonlyParameters.Match> getAllMatches(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return rawStreamAllMatches(new Object[]{pFunction, pParam}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<WriteonlyParameters.Match> streamAllMatches(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return rawStreamAllMatches(new Object[]{pFunction, pParam});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<WriteonlyParameters.Match> getOneArbitraryMatch(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return rawGetOneArbitraryMatch(new Object[]{pFunction, pParam});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return rawHasMatch(new Object[]{pFunction, pParam});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return rawCountMatches(new Object[]{pFunction, pParam});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunction, final SsaPassByRefParam pParam, final Consumer<? super WriteonlyParameters.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunction, pParam}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunction the fixed value of pattern parameter function, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public WriteonlyParameters.Match newMatch(final SsaFunction pFunction, final SsaPassByRefParam pParam) {
      return WriteonlyParameters.Match.newMatch(pFunction, pParam);
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
    public Stream<SsaFunction> streamAllValuesOffunction(final WriteonlyParameters.Match partialMatch) {
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
    public Stream<SsaFunction> streamAllValuesOffunction(final SsaPassByRefParam pParam) {
      return rawStreamAllValuesOffunction(new Object[]{null, pParam});
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction(final WriteonlyParameters.Match partialMatch) {
      return rawStreamAllValuesOffunction(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for function.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunction(final SsaPassByRefParam pParam) {
      return rawStreamAllValuesOffunction(new Object[]{null, pParam}).collect(Collectors.toSet());
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
    public Stream<SsaPassByRefParam> streamAllValuesOfparam(final WriteonlyParameters.Match partialMatch) {
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
    public Stream<SsaPassByRefParam> streamAllValuesOfparam(final SsaFunction pFunction) {
      return rawStreamAllValuesOfparam(new Object[]{pFunction, null});
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam(final WriteonlyParameters.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam(final SsaFunction pFunction) {
      return rawStreamAllValuesOfparam(new Object[]{pFunction, null}).collect(Collectors.toSet());
    }

    @Override
    protected WriteonlyParameters.Match tupleToMatch(final Tuple t) {
      try {
          return WriteonlyParameters.Match.newMatch((SsaFunction) t.get(POSITION_FUNCTION), (SsaPassByRefParam) t.get(POSITION_PARAM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected WriteonlyParameters.Match arrayToMatch(final Object[] match) {
      try {
          return WriteonlyParameters.Match.newMatch((SsaFunction) match[POSITION_FUNCTION], (SsaPassByRefParam) match[POSITION_PARAM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected WriteonlyParameters.Match arrayToMatchMutable(final Object[] match) {
      try {
          return WriteonlyParameters.Match.newMutableMatch((SsaFunction) match[POSITION_FUNCTION], (SsaPassByRefParam) match[POSITION_PARAM]);
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
    public static IQuerySpecification<WriteonlyParameters.Matcher> querySpecification() {
      return WriteonlyParameters.instance();
    }
  }

  private WriteonlyParameters() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static WriteonlyParameters instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected WriteonlyParameters.Matcher instantiate(final ViatraQueryEngine engine) {
    return WriteonlyParameters.Matcher.on(engine);
  }

  @Override
  public WriteonlyParameters.Matcher instantiate() {
    return WriteonlyParameters.Matcher.create();
  }

  @Override
  public WriteonlyParameters.Match newEmptyMatch() {
    return WriteonlyParameters.Match.newEmptyMatch();
  }

  @Override
  public WriteonlyParameters.Match newMatch(final Object... parameters) {
    return WriteonlyParameters.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaPassByRefParam) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link WriteonlyParameters} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link WriteonlyParameters#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final WriteonlyParameters INSTANCE = new WriteonlyParameters();

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
    private static final WriteonlyParameters.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_function = new PParameter("function", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaPassByRefParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_function, parameter_param);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.writeonlyParameters";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("function","param");
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
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_dir = body.getOrCreateVariableByName("dir");
          new TypeConstraint(body, Tuples.flatTupleOf(var_function), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_function, parameter_function),
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	neg find nodeUseNode(_, param)
          new NegativePatternCall(body, Tuples.flatTupleOf(var___0_, var_param), NodeUseNode.instance().getInternalQueryRepresentation());
          // 		SsaFunction.parameters(function, param)
          new TypeConstraint(body, Tuples.flatTupleOf(var_function), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_function, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction", "parameters")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new Equality(body, var__virtual_0_, var_param);
          // 	SsaParam.direction(param, dir)
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaParam", "direction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "ParamDirection")));
          new Equality(body, var__virtual_1_, var_dir);
          // 	check(		switch (dir) {			case OUT:				false			default:				true		}	)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern writeonlyParameters";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("dir");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  ParamDirection dir = (ParamDirection) provider.getValue("dir");
                  return evaluateExpression_1_1(dir);
              }
          },  null, false);
          bodies.add(body);
      }
      return bodies;
    }
  }

  private static boolean evaluateExpression_1_1(final ParamDirection dir) {
    boolean _switchResult = false;
    if (dir != null) {
      switch (dir) {
        case OUT:
          _switchResult = false;
          break;
        default:
          _switchResult = true;
          break;
      }
    } else {
      _switchResult = true;
    }
    return _switchResult;
  }
}
