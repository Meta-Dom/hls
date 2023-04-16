/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/typeUtilQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaArgument;
import hu.metadom.hls.ssamodel.SsaParam;
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
 *         pattern ssaArgumentParam(arg: SsaArgument, param: SsaParam) {
 *         	SsaArgument.param(arg, param);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SsaArgumentParam extends BaseGeneratedEMFQuerySpecification<SsaArgumentParam.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.ssaArgumentParam pattern,
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
    private SsaArgument fArg;

    private SsaParam fParam;

    private static List<String> parameterNames = makeImmutableList("arg", "param");

    private Match(final SsaArgument pArg, final SsaParam pParam) {
      this.fArg = pArg;
      this.fParam = pParam;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "arg": return this.fArg;
          case "param": return this.fParam;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fArg;
          case 1: return this.fParam;
          default: return null;
      }
    }

    public SsaArgument getArg() {
      return this.fArg;
    }

    public SsaParam getParam() {
      return this.fParam;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("arg".equals(parameterName) ) {
          this.fArg = (SsaArgument) newValue;
          return true;
      }
      if ("param".equals(parameterName) ) {
          this.fParam = (SsaParam) newValue;
          return true;
      }
      return false;
    }

    public void setArg(final SsaArgument pArg) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fArg = pArg;
    }

    public void setParam(final SsaParam pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.ssaArgumentParam";
    }

    @Override
    public List<String> parameterNames() {
      return SsaArgumentParam.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fArg, fParam};
    }

    @Override
    public SsaArgumentParam.Match toImmutable() {
      return isMutable() ? newMatch(fArg, fParam) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"arg\"=" + prettyPrintValue(fArg) + ", ");
      result.append("\"param\"=" + prettyPrintValue(fParam));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fArg, fParam);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SsaArgumentParam.Match)) {
          SsaArgumentParam.Match other = (SsaArgumentParam.Match) obj;
          return Objects.equals(fArg, other.fArg) && Objects.equals(fParam, other.fParam);
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
    public SsaArgumentParam specification() {
      return SsaArgumentParam.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SsaArgumentParam.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SsaArgumentParam.Match newMutableMatch(final SsaArgument pArg, final SsaParam pParam) {
      return new Mutable(pArg, pParam);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SsaArgumentParam.Match newMatch(final SsaArgument pArg, final SsaParam pParam) {
      return new Immutable(pArg, pParam);
    }

    private static final class Mutable extends SsaArgumentParam.Match {
      Mutable(final SsaArgument pArg, final SsaParam pParam) {
        super(pArg, pParam);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends SsaArgumentParam.Match {
      Immutable(final SsaArgument pArg, final SsaParam pParam) {
        super(pArg, pParam);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.ssaArgumentParam pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern ssaArgumentParam(arg: SsaArgument, param: SsaParam) {
   * 	SsaArgument.param(arg, param);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SsaArgumentParam
   * 
   */
  public static class Matcher extends BaseMatcher<SsaArgumentParam.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SsaArgumentParam.Matcher on(final ViatraQueryEngine engine) {
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
    public static SsaArgumentParam.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_ARG = 0;

    private static final int POSITION_PARAM = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SsaArgumentParam.Matcher.class);

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
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SsaArgumentParam.Match> getAllMatches(final SsaArgument pArg, final SsaParam pParam) {
      return rawStreamAllMatches(new Object[]{pArg, pParam}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SsaArgumentParam.Match> streamAllMatches(final SsaArgument pArg, final SsaParam pParam) {
      return rawStreamAllMatches(new Object[]{pArg, pParam});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SsaArgumentParam.Match> getOneArbitraryMatch(final SsaArgument pArg, final SsaParam pParam) {
      return rawGetOneArbitraryMatch(new Object[]{pArg, pParam});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaArgument pArg, final SsaParam pParam) {
      return rawHasMatch(new Object[]{pArg, pParam});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaArgument pArg, final SsaParam pParam) {
      return rawCountMatches(new Object[]{pArg, pParam});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaArgument pArg, final SsaParam pParam, final Consumer<? super SsaArgumentParam.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pArg, pParam}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SsaArgumentParam.Match newMatch(final SsaArgument pArg, final SsaParam pParam) {
      return SsaArgumentParam.Match.newMatch(pArg, pParam);
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArgument> rawStreamAllValuesOfarg(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ARG, parameters).map(SsaArgument.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg() {
      return rawStreamAllValuesOfarg(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArgument> streamAllValuesOfarg() {
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
    public Stream<SsaArgument> streamAllValuesOfarg(final SsaArgumentParam.Match partialMatch) {
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
    public Stream<SsaArgument> streamAllValuesOfarg(final SsaParam pParam) {
      return rawStreamAllValuesOfarg(new Object[]{null, pParam});
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg(final SsaArgumentParam.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg(final SsaParam pParam) {
      return rawStreamAllValuesOfarg(new Object[]{null, pParam}).collect(Collectors.toSet());
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
    public Stream<SsaParam> streamAllValuesOfparam(final SsaArgumentParam.Match partialMatch) {
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
    public Stream<SsaParam> streamAllValuesOfparam(final SsaArgument pArg) {
      return rawStreamAllValuesOfparam(new Object[]{pArg, null});
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam(final SsaArgumentParam.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaParam> getAllValuesOfparam(final SsaArgument pArg) {
      return rawStreamAllValuesOfparam(new Object[]{pArg, null}).collect(Collectors.toSet());
    }

    @Override
    protected SsaArgumentParam.Match tupleToMatch(final Tuple t) {
      try {
          return SsaArgumentParam.Match.newMatch((SsaArgument) t.get(POSITION_ARG), (SsaParam) t.get(POSITION_PARAM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SsaArgumentParam.Match arrayToMatch(final Object[] match) {
      try {
          return SsaArgumentParam.Match.newMatch((SsaArgument) match[POSITION_ARG], (SsaParam) match[POSITION_PARAM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SsaArgumentParam.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SsaArgumentParam.Match.newMutableMatch((SsaArgument) match[POSITION_ARG], (SsaParam) match[POSITION_PARAM]);
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
    public static IQuerySpecification<SsaArgumentParam.Matcher> querySpecification() {
      return SsaArgumentParam.instance();
    }
  }

  private SsaArgumentParam() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SsaArgumentParam instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected SsaArgumentParam.Matcher instantiate(final ViatraQueryEngine engine) {
    return SsaArgumentParam.Matcher.on(engine);
  }

  @Override
  public SsaArgumentParam.Matcher instantiate() {
    return SsaArgumentParam.Matcher.create();
  }

  @Override
  public SsaArgumentParam.Match newEmptyMatch() {
    return SsaArgumentParam.Match.newEmptyMatch();
  }

  @Override
  public SsaArgumentParam.Match newMatch(final Object... parameters) {
    return SsaArgumentParam.Match.newMatch((hu.metadom.hls.ssamodel.SsaArgument) parameters[0], (hu.metadom.hls.ssamodel.SsaParam) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link SsaArgumentParam} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SsaArgumentParam#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SsaArgumentParam INSTANCE = new SsaArgumentParam();

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
    private static final SsaArgumentParam.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_arg = new PParameter("arg", "hu.metadom.hls.ssamodel.SsaArgument", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArgument")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaParam")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_arg, parameter_param);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.ssaArgumentParam";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("arg","param");
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
          PVariable var_arg = body.getOrCreateVariableByName("arg");
          PVariable var_param = body.getOrCreateVariableByName("param");
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_arg, parameter_arg),
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	SsaArgument.param(arg, param)
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument", "param")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new Equality(body, var__virtual_0_, var_param);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
