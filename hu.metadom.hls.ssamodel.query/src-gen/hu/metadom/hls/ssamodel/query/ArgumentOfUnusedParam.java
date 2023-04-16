/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesArgumentSimplifier.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaArgument;
import hu.metadom.hls.ssamodel.SsaCall;
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
 *         pattern argumentOfUnusedParam(call: SsaCall, arg: SsaArgument) {
 *         	SsaCall.arguments(call, arg);
 *         	
 *         	SsaArgument.param(arg, param);
 *         	find unusedParam(_, param);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ArgumentOfUnusedParam extends BaseGeneratedEMFQuerySpecification<ArgumentOfUnusedParam.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.argumentOfUnusedParam pattern,
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
    private SsaCall fCall;

    private SsaArgument fArg;

    private static List<String> parameterNames = makeImmutableList("call", "arg");

    private Match(final SsaCall pCall, final SsaArgument pArg) {
      this.fCall = pCall;
      this.fArg = pArg;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "call": return this.fCall;
          case "arg": return this.fArg;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fCall;
          case 1: return this.fArg;
          default: return null;
      }
    }

    public SsaCall getCall() {
      return this.fCall;
    }

    public SsaArgument getArg() {
      return this.fArg;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("call".equals(parameterName) ) {
          this.fCall = (SsaCall) newValue;
          return true;
      }
      if ("arg".equals(parameterName) ) {
          this.fArg = (SsaArgument) newValue;
          return true;
      }
      return false;
    }

    public void setCall(final SsaCall pCall) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCall = pCall;
    }

    public void setArg(final SsaArgument pArg) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fArg = pArg;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.argumentOfUnusedParam";
    }

    @Override
    public List<String> parameterNames() {
      return ArgumentOfUnusedParam.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fCall, fArg};
    }

    @Override
    public ArgumentOfUnusedParam.Match toImmutable() {
      return isMutable() ? newMatch(fCall, fArg) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"call\"=" + prettyPrintValue(fCall) + ", ");
      result.append("\"arg\"=" + prettyPrintValue(fArg));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fCall, fArg);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ArgumentOfUnusedParam.Match)) {
          ArgumentOfUnusedParam.Match other = (ArgumentOfUnusedParam.Match) obj;
          return Objects.equals(fCall, other.fCall) && Objects.equals(fArg, other.fArg);
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
    public ArgumentOfUnusedParam specification() {
      return ArgumentOfUnusedParam.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ArgumentOfUnusedParam.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ArgumentOfUnusedParam.Match newMutableMatch(final SsaCall pCall, final SsaArgument pArg) {
      return new Mutable(pCall, pArg);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ArgumentOfUnusedParam.Match newMatch(final SsaCall pCall, final SsaArgument pArg) {
      return new Immutable(pCall, pArg);
    }

    private static final class Mutable extends ArgumentOfUnusedParam.Match {
      Mutable(final SsaCall pCall, final SsaArgument pArg) {
        super(pCall, pArg);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ArgumentOfUnusedParam.Match {
      Immutable(final SsaCall pCall, final SsaArgument pArg) {
        super(pCall, pArg);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.argumentOfUnusedParam pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern argumentOfUnusedParam(call: SsaCall, arg: SsaArgument) {
   * 	SsaCall.arguments(call, arg);
   * 	
   * 	SsaArgument.param(arg, param);
   * 	find unusedParam(_, param);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ArgumentOfUnusedParam
   * 
   */
  public static class Matcher extends BaseMatcher<ArgumentOfUnusedParam.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ArgumentOfUnusedParam.Matcher on(final ViatraQueryEngine engine) {
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
    public static ArgumentOfUnusedParam.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_CALL = 0;

    private static final int POSITION_ARG = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ArgumentOfUnusedParam.Matcher.class);

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
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ArgumentOfUnusedParam.Match> getAllMatches(final SsaCall pCall, final SsaArgument pArg) {
      return rawStreamAllMatches(new Object[]{pCall, pArg}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ArgumentOfUnusedParam.Match> streamAllMatches(final SsaCall pCall, final SsaArgument pArg) {
      return rawStreamAllMatches(new Object[]{pCall, pArg});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ArgumentOfUnusedParam.Match> getOneArbitraryMatch(final SsaCall pCall, final SsaArgument pArg) {
      return rawGetOneArbitraryMatch(new Object[]{pCall, pArg});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaCall pCall, final SsaArgument pArg) {
      return rawHasMatch(new Object[]{pCall, pArg});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaCall pCall, final SsaArgument pArg) {
      return rawCountMatches(new Object[]{pCall, pArg});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaCall pCall, final SsaArgument pArg, final Consumer<? super ArgumentOfUnusedParam.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCall, pArg}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCall the fixed value of pattern parameter call, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ArgumentOfUnusedParam.Match newMatch(final SsaCall pCall, final SsaArgument pArg) {
      return ArgumentOfUnusedParam.Match.newMatch(pCall, pArg);
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
    public Stream<SsaCall> streamAllValuesOfcall(final ArgumentOfUnusedParam.Match partialMatch) {
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
    public Stream<SsaCall> streamAllValuesOfcall(final SsaArgument pArg) {
      return rawStreamAllValuesOfcall(new Object[]{null, pArg});
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall(final ArgumentOfUnusedParam.Match partialMatch) {
      return rawStreamAllValuesOfcall(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for call.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaCall> getAllValuesOfcall(final SsaArgument pArg) {
      return rawStreamAllValuesOfcall(new Object[]{null, pArg}).collect(Collectors.toSet());
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
    public Stream<SsaArgument> streamAllValuesOfarg(final ArgumentOfUnusedParam.Match partialMatch) {
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
    public Stream<SsaArgument> streamAllValuesOfarg(final SsaCall pCall) {
      return rawStreamAllValuesOfarg(new Object[]{pCall, null});
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg(final ArgumentOfUnusedParam.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg(final SsaCall pCall) {
      return rawStreamAllValuesOfarg(new Object[]{pCall, null}).collect(Collectors.toSet());
    }

    @Override
    protected ArgumentOfUnusedParam.Match tupleToMatch(final Tuple t) {
      try {
          return ArgumentOfUnusedParam.Match.newMatch((SsaCall) t.get(POSITION_CALL), (SsaArgument) t.get(POSITION_ARG));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArgumentOfUnusedParam.Match arrayToMatch(final Object[] match) {
      try {
          return ArgumentOfUnusedParam.Match.newMatch((SsaCall) match[POSITION_CALL], (SsaArgument) match[POSITION_ARG]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArgumentOfUnusedParam.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ArgumentOfUnusedParam.Match.newMutableMatch((SsaCall) match[POSITION_CALL], (SsaArgument) match[POSITION_ARG]);
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
    public static IQuerySpecification<ArgumentOfUnusedParam.Matcher> querySpecification() {
      return ArgumentOfUnusedParam.instance();
    }
  }

  private ArgumentOfUnusedParam() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ArgumentOfUnusedParam instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ArgumentOfUnusedParam.Matcher instantiate(final ViatraQueryEngine engine) {
    return ArgumentOfUnusedParam.Matcher.on(engine);
  }

  @Override
  public ArgumentOfUnusedParam.Matcher instantiate() {
    return ArgumentOfUnusedParam.Matcher.create();
  }

  @Override
  public ArgumentOfUnusedParam.Match newEmptyMatch() {
    return ArgumentOfUnusedParam.Match.newEmptyMatch();
  }

  @Override
  public ArgumentOfUnusedParam.Match newMatch(final Object... parameters) {
    return ArgumentOfUnusedParam.Match.newMatch((hu.metadom.hls.ssamodel.SsaCall) parameters[0], (hu.metadom.hls.ssamodel.SsaArgument) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ArgumentOfUnusedParam} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ArgumentOfUnusedParam#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ArgumentOfUnusedParam INSTANCE = new ArgumentOfUnusedParam();

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
    private static final ArgumentOfUnusedParam.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_call = new PParameter("call", "hu.metadom.hls.ssamodel.SsaCall", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaCall")), PParameterDirection.INOUT);

    private final PParameter parameter_arg = new PParameter("arg", "hu.metadom.hls.ssamodel.SsaArgument", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArgument")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_call, parameter_arg);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.argumentOfUnusedParam";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("call","arg");
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
          PVariable var_call = body.getOrCreateVariableByName("call");
          PVariable var_arg = body.getOrCreateVariableByName("arg");
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_call), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_call, parameter_call),
             new ExportedParameter(body, var_arg, parameter_arg)
          ));
          // 	SsaCall.arguments(call, arg)
          new TypeConstraint(body, Tuples.flatTupleOf(var_call), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_call, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCall", "arguments")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          new Equality(body, var__virtual_0_, var_arg);
          // 		SsaArgument.param(arg, param)
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument", "param")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new Equality(body, var__virtual_1_, var_param);
          // 	find unusedParam(_, param)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___0_, var_param), UnusedParam.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
