/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/typeUtilQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

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
 *         pattern ssaPassByRefArgumentParam(arg: SsaPassByRefArgument, param: SsaPassByRefParam) {
 *         	SsaPassByRefArgument.param(arg, param);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SsaPassByRefArgumentParam extends BaseGeneratedEMFQuerySpecification<SsaPassByRefArgumentParam.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.ssaPassByRefArgumentParam pattern,
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
    private SsaPassByRefArgument fArg;

    private SsaPassByRefParam fParam;

    private static List<String> parameterNames = makeImmutableList("arg", "param");

    private Match(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
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

    public SsaPassByRefArgument getArg() {
      return this.fArg;
    }

    public SsaPassByRefParam getParam() {
      return this.fParam;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("arg".equals(parameterName) ) {
          this.fArg = (SsaPassByRefArgument) newValue;
          return true;
      }
      if ("param".equals(parameterName) ) {
          this.fParam = (SsaPassByRefParam) newValue;
          return true;
      }
      return false;
    }

    public void setArg(final SsaPassByRefArgument pArg) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fArg = pArg;
    }

    public void setParam(final SsaPassByRefParam pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.ssaPassByRefArgumentParam";
    }

    @Override
    public List<String> parameterNames() {
      return SsaPassByRefArgumentParam.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fArg, fParam};
    }

    @Override
    public SsaPassByRefArgumentParam.Match toImmutable() {
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
      if ((obj instanceof SsaPassByRefArgumentParam.Match)) {
          SsaPassByRefArgumentParam.Match other = (SsaPassByRefArgumentParam.Match) obj;
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
    public SsaPassByRefArgumentParam specification() {
      return SsaPassByRefArgumentParam.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SsaPassByRefArgumentParam.Match newEmptyMatch() {
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
    public static SsaPassByRefArgumentParam.Match newMutableMatch(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
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
    public static SsaPassByRefArgumentParam.Match newMatch(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
      return new Immutable(pArg, pParam);
    }

    private static final class Mutable extends SsaPassByRefArgumentParam.Match {
      Mutable(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
        super(pArg, pParam);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends SsaPassByRefArgumentParam.Match {
      Immutable(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
        super(pArg, pParam);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.ssaPassByRefArgumentParam pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern ssaPassByRefArgumentParam(arg: SsaPassByRefArgument, param: SsaPassByRefParam) {
   * 	SsaPassByRefArgument.param(arg, param);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SsaPassByRefArgumentParam
   * 
   */
  public static class Matcher extends BaseMatcher<SsaPassByRefArgumentParam.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SsaPassByRefArgumentParam.Matcher on(final ViatraQueryEngine engine) {
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
    public static SsaPassByRefArgumentParam.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_ARG = 0;

    private static final int POSITION_PARAM = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SsaPassByRefArgumentParam.Matcher.class);

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
    public Collection<SsaPassByRefArgumentParam.Match> getAllMatches(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
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
    public Stream<SsaPassByRefArgumentParam.Match> streamAllMatches(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
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
    public Optional<SsaPassByRefArgumentParam.Match> getOneArbitraryMatch(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
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
    public boolean hasMatch(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
      return rawHasMatch(new Object[]{pArg, pParam});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
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
    public boolean forOneArbitraryMatch(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam, final Consumer<? super SsaPassByRefArgumentParam.Match> processor) {
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
    public SsaPassByRefArgumentParam.Match newMatch(final SsaPassByRefArgument pArg, final SsaPassByRefParam pParam) {
      return SsaPassByRefArgumentParam.Match.newMatch(pArg, pParam);
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
    public Stream<SsaPassByRefArgument> streamAllValuesOfarg(final SsaPassByRefArgumentParam.Match partialMatch) {
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
    public Stream<SsaPassByRefArgument> streamAllValuesOfarg(final SsaPassByRefParam pParam) {
      return rawStreamAllValuesOfarg(new Object[]{null, pParam});
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefArgument> getAllValuesOfarg(final SsaPassByRefArgumentParam.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefArgument> getAllValuesOfarg(final SsaPassByRefParam pParam) {
      return rawStreamAllValuesOfarg(new Object[]{null, pParam}).collect(Collectors.toSet());
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
    public Stream<SsaPassByRefParam> streamAllValuesOfparam(final SsaPassByRefArgumentParam.Match partialMatch) {
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
    public Stream<SsaPassByRefParam> streamAllValuesOfparam(final SsaPassByRefArgument pArg) {
      return rawStreamAllValuesOfparam(new Object[]{pArg, null});
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam(final SsaPassByRefArgumentParam.Match partialMatch) {
      return rawStreamAllValuesOfparam(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPassByRefParam> getAllValuesOfparam(final SsaPassByRefArgument pArg) {
      return rawStreamAllValuesOfparam(new Object[]{pArg, null}).collect(Collectors.toSet());
    }

    @Override
    protected SsaPassByRefArgumentParam.Match tupleToMatch(final Tuple t) {
      try {
          return SsaPassByRefArgumentParam.Match.newMatch((SsaPassByRefArgument) t.get(POSITION_ARG), (SsaPassByRefParam) t.get(POSITION_PARAM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SsaPassByRefArgumentParam.Match arrayToMatch(final Object[] match) {
      try {
          return SsaPassByRefArgumentParam.Match.newMatch((SsaPassByRefArgument) match[POSITION_ARG], (SsaPassByRefParam) match[POSITION_PARAM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SsaPassByRefArgumentParam.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SsaPassByRefArgumentParam.Match.newMutableMatch((SsaPassByRefArgument) match[POSITION_ARG], (SsaPassByRefParam) match[POSITION_PARAM]);
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
    public static IQuerySpecification<SsaPassByRefArgumentParam.Matcher> querySpecification() {
      return SsaPassByRefArgumentParam.instance();
    }
  }

  private SsaPassByRefArgumentParam() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SsaPassByRefArgumentParam instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected SsaPassByRefArgumentParam.Matcher instantiate(final ViatraQueryEngine engine) {
    return SsaPassByRefArgumentParam.Matcher.on(engine);
  }

  @Override
  public SsaPassByRefArgumentParam.Matcher instantiate() {
    return SsaPassByRefArgumentParam.Matcher.create();
  }

  @Override
  public SsaPassByRefArgumentParam.Match newEmptyMatch() {
    return SsaPassByRefArgumentParam.Match.newEmptyMatch();
  }

  @Override
  public SsaPassByRefArgumentParam.Match newMatch(final Object... parameters) {
    return SsaPassByRefArgumentParam.Match.newMatch((hu.metadom.hls.ssamodel.SsaPassByRefArgument) parameters[0], (hu.metadom.hls.ssamodel.SsaPassByRefParam) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link SsaPassByRefArgumentParam} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SsaPassByRefArgumentParam#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SsaPassByRefArgumentParam INSTANCE = new SsaPassByRefArgumentParam();

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
    private static final SsaPassByRefArgumentParam.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_arg = new PParameter("arg", "hu.metadom.hls.ssamodel.SsaPassByRefArgument", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaPassByRefArgument")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaPassByRefParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_arg, parameter_param);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.ssaPassByRefArgumentParam";
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefArgument")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_arg, parameter_arg),
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	SsaPassByRefArgument.param(arg, param)
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefArgument")));
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
