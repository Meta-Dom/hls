/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

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
 *         pattern functionReturn(ret: SsaReturn) {
 *         	SsaFunction.nodes(_, ret);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionReturn extends BaseGeneratedEMFQuerySpecification<FunctionReturn.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionReturn pattern,
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
    private SsaReturn fRet;

    private static List<String> parameterNames = makeImmutableList("ret");

    private Match(final SsaReturn pRet) {
      this.fRet = pRet;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ret": return this.fRet;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRet;
          default: return null;
      }
    }

    public SsaReturn getRet() {
      return this.fRet;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ret".equals(parameterName) ) {
          this.fRet = (SsaReturn) newValue;
          return true;
      }
      return false;
    }

    public void setRet(final SsaReturn pRet) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRet = pRet;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionReturn";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionReturn.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fRet};
    }

    @Override
    public FunctionReturn.Match toImmutable() {
      return isMutable() ? newMatch(fRet) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ret\"=" + prettyPrintValue(fRet));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fRet);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionReturn.Match)) {
          FunctionReturn.Match other = (FunctionReturn.Match) obj;
          return Objects.equals(fRet, other.fRet);
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
    public FunctionReturn specification() {
      return FunctionReturn.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionReturn.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionReturn.Match newMutableMatch(final SsaReturn pRet) {
      return new Mutable(pRet);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionReturn.Match newMatch(final SsaReturn pRet) {
      return new Immutable(pRet);
    }

    private static final class Mutable extends FunctionReturn.Match {
      Mutable(final SsaReturn pRet) {
        super(pRet);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionReturn.Match {
      Immutable(final SsaReturn pRet) {
        super(pRet);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionReturn pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionReturn(ret: SsaReturn) {
   * 	SsaFunction.nodes(_, ret);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionReturn
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionReturn.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionReturn.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionReturn.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_RET = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionReturn.Matcher.class);

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
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionReturn.Match> getAllMatches(final SsaReturn pRet) {
      return rawStreamAllMatches(new Object[]{pRet}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionReturn.Match> streamAllMatches(final SsaReturn pRet) {
      return rawStreamAllMatches(new Object[]{pRet});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionReturn.Match> getOneArbitraryMatch(final SsaReturn pRet) {
      return rawGetOneArbitraryMatch(new Object[]{pRet});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaReturn pRet) {
      return rawHasMatch(new Object[]{pRet});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaReturn pRet) {
      return rawCountMatches(new Object[]{pRet});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaReturn pRet, final Consumer<? super FunctionReturn.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRet}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRet the fixed value of pattern parameter ret, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionReturn.Match newMatch(final SsaReturn pRet) {
      return FunctionReturn.Match.newMatch(pRet);
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

    @Override
    protected FunctionReturn.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionReturn.Match.newMatch((SsaReturn) t.get(POSITION_RET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionReturn.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionReturn.Match.newMatch((SsaReturn) match[POSITION_RET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionReturn.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionReturn.Match.newMutableMatch((SsaReturn) match[POSITION_RET]);
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
    public static IQuerySpecification<FunctionReturn.Matcher> querySpecification() {
      return FunctionReturn.instance();
    }
  }

  private FunctionReturn() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionReturn instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionReturn.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionReturn.Matcher.on(engine);
  }

  @Override
  public FunctionReturn.Matcher instantiate() {
    return FunctionReturn.Matcher.create();
  }

  @Override
  public FunctionReturn.Match newEmptyMatch() {
    return FunctionReturn.Match.newEmptyMatch();
  }

  @Override
  public FunctionReturn.Match newMatch(final Object... parameters) {
    return FunctionReturn.Match.newMatch((hu.metadom.hls.ssamodel.SsaReturn) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionReturn} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionReturn#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionReturn INSTANCE = new FunctionReturn();

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
    private static final FunctionReturn.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_ret = new PParameter("ret", "hu.metadom.hls.ssamodel.SsaReturn", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaReturn")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_ret);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionReturn";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ret");
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
          PVariable var_ret = body.getOrCreateVariableByName("ret");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ret), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaReturn")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ret, parameter_ret)
          ));
          // 	SsaFunction.nodes(_, ret)
          new TypeConstraint(body, Tuples.flatTupleOf(var___0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var___0_, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ret);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
