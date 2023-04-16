/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaInitList;
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
 *         pattern allInitList(initList: SsaInitList, innerInitList: SsaInitList) {
 *         	initList == innerInitList;
 *         } or {
 *         	find innerInitList+(initList, innerInitList);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AllInitList extends BaseGeneratedEMFQuerySpecification<AllInitList.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.allInitList pattern,
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
    private SsaInitList fInitList;

    private SsaInitList fInnerInitList;

    private static List<String> parameterNames = makeImmutableList("initList", "innerInitList");

    private Match(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      this.fInitList = pInitList;
      this.fInnerInitList = pInnerInitList;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "initList": return this.fInitList;
          case "innerInitList": return this.fInnerInitList;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fInitList;
          case 1: return this.fInnerInitList;
          default: return null;
      }
    }

    public SsaInitList getInitList() {
      return this.fInitList;
    }

    public SsaInitList getInnerInitList() {
      return this.fInnerInitList;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initList".equals(parameterName) ) {
          this.fInitList = (SsaInitList) newValue;
          return true;
      }
      if ("innerInitList".equals(parameterName) ) {
          this.fInnerInitList = (SsaInitList) newValue;
          return true;
      }
      return false;
    }

    public void setInitList(final SsaInitList pInitList) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitList = pInitList;
    }

    public void setInnerInitList(final SsaInitList pInnerInitList) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInnerInitList = pInnerInitList;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.allInitList";
    }

    @Override
    public List<String> parameterNames() {
      return AllInitList.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fInitList, fInnerInitList};
    }

    @Override
    public AllInitList.Match toImmutable() {
      return isMutable() ? newMatch(fInitList, fInnerInitList) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initList\"=" + prettyPrintValue(fInitList) + ", ");
      result.append("\"innerInitList\"=" + prettyPrintValue(fInnerInitList));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fInitList, fInnerInitList);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AllInitList.Match)) {
          AllInitList.Match other = (AllInitList.Match) obj;
          return Objects.equals(fInitList, other.fInitList) && Objects.equals(fInnerInitList, other.fInnerInitList);
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
    public AllInitList specification() {
      return AllInitList.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AllInitList.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AllInitList.Match newMutableMatch(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return new Mutable(pInitList, pInnerInitList);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AllInitList.Match newMatch(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return new Immutable(pInitList, pInnerInitList);
    }

    private static final class Mutable extends AllInitList.Match {
      Mutable(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
        super(pInitList, pInnerInitList);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends AllInitList.Match {
      Immutable(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
        super(pInitList, pInnerInitList);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.allInitList pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern allInitList(initList: SsaInitList, innerInitList: SsaInitList) {
   * 	initList == innerInitList;
   * } or {
   * 	find innerInitList+(initList, innerInitList);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AllInitList
   * 
   */
  public static class Matcher extends BaseMatcher<AllInitList.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AllInitList.Matcher on(final ViatraQueryEngine engine) {
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
    public static AllInitList.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_INITLIST = 0;

    private static final int POSITION_INNERINITLIST = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllInitList.Matcher.class);

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
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AllInitList.Match> getAllMatches(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return rawStreamAllMatches(new Object[]{pInitList, pInnerInitList}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AllInitList.Match> streamAllMatches(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return rawStreamAllMatches(new Object[]{pInitList, pInnerInitList});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AllInitList.Match> getOneArbitraryMatch(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return rawGetOneArbitraryMatch(new Object[]{pInitList, pInnerInitList});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return rawHasMatch(new Object[]{pInitList, pInnerInitList});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return rawCountMatches(new Object[]{pInitList, pInnerInitList});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaInitList pInitList, final SsaInitList pInnerInitList, final Consumer<? super AllInitList.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitList, pInnerInitList}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitList the fixed value of pattern parameter initList, or null if not bound.
     * @param pInnerInitList the fixed value of pattern parameter innerInitList, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AllInitList.Match newMatch(final SsaInitList pInitList, final SsaInitList pInnerInitList) {
      return AllInitList.Match.newMatch(pInitList, pInnerInitList);
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaInitList> rawStreamAllValuesOfinitList(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INITLIST, parameters).map(SsaInitList.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInitList> getAllValuesOfinitList() {
      return rawStreamAllValuesOfinitList(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInitList> streamAllValuesOfinitList() {
      return rawStreamAllValuesOfinitList(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInitList> streamAllValuesOfinitList(final AllInitList.Match partialMatch) {
      return rawStreamAllValuesOfinitList(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInitList> streamAllValuesOfinitList(final SsaInitList pInnerInitList) {
      return rawStreamAllValuesOfinitList(new Object[]{null, pInnerInitList});
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInitList> getAllValuesOfinitList(final AllInitList.Match partialMatch) {
      return rawStreamAllValuesOfinitList(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for initList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInitList> getAllValuesOfinitList(final SsaInitList pInnerInitList) {
      return rawStreamAllValuesOfinitList(new Object[]{null, pInnerInitList}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaInitList> rawStreamAllValuesOfinnerInitList(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INNERINITLIST, parameters).map(SsaInitList.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInitList> getAllValuesOfinnerInitList() {
      return rawStreamAllValuesOfinnerInitList(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInitList> streamAllValuesOfinnerInitList() {
      return rawStreamAllValuesOfinnerInitList(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInitList> streamAllValuesOfinnerInitList(final AllInitList.Match partialMatch) {
      return rawStreamAllValuesOfinnerInitList(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInitList> streamAllValuesOfinnerInitList(final SsaInitList pInitList) {
      return rawStreamAllValuesOfinnerInitList(new Object[]{pInitList, null});
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInitList> getAllValuesOfinnerInitList(final AllInitList.Match partialMatch) {
      return rawStreamAllValuesOfinnerInitList(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for innerInitList.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInitList> getAllValuesOfinnerInitList(final SsaInitList pInitList) {
      return rawStreamAllValuesOfinnerInitList(new Object[]{pInitList, null}).collect(Collectors.toSet());
    }

    @Override
    protected AllInitList.Match tupleToMatch(final Tuple t) {
      try {
          return AllInitList.Match.newMatch((SsaInitList) t.get(POSITION_INITLIST), (SsaInitList) t.get(POSITION_INNERINITLIST));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AllInitList.Match arrayToMatch(final Object[] match) {
      try {
          return AllInitList.Match.newMatch((SsaInitList) match[POSITION_INITLIST], (SsaInitList) match[POSITION_INNERINITLIST]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AllInitList.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AllInitList.Match.newMutableMatch((SsaInitList) match[POSITION_INITLIST], (SsaInitList) match[POSITION_INNERINITLIST]);
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
    public static IQuerySpecification<AllInitList.Matcher> querySpecification() {
      return AllInitList.instance();
    }
  }

  private AllInitList() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AllInitList instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected AllInitList.Matcher instantiate(final ViatraQueryEngine engine) {
    return AllInitList.Matcher.on(engine);
  }

  @Override
  public AllInitList.Matcher instantiate() {
    return AllInitList.Matcher.create();
  }

  @Override
  public AllInitList.Match newEmptyMatch() {
    return AllInitList.Match.newEmptyMatch();
  }

  @Override
  public AllInitList.Match newMatch(final Object... parameters) {
    return AllInitList.Match.newMatch((hu.metadom.hls.ssamodel.SsaInitList) parameters[0], (hu.metadom.hls.ssamodel.SsaInitList) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link AllInitList} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AllInitList#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AllInitList INSTANCE = new AllInitList();

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
    private static final AllInitList.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_initList = new PParameter("initList", "hu.metadom.hls.ssamodel.SsaInitList", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaInitList")), PParameterDirection.INOUT);

    private final PParameter parameter_innerInitList = new PParameter("innerInitList", "hu.metadom.hls.ssamodel.SsaInitList", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaInitList")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_initList, parameter_innerInitList);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.allInitList";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initList","innerInitList");
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
          PVariable var_initList = body.getOrCreateVariableByName("initList");
          PVariable var_innerInitList = body.getOrCreateVariableByName("innerInitList");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initList), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInitList")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_innerInitList), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInitList")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initList, parameter_initList),
             new ExportedParameter(body, var_innerInitList, parameter_innerInitList)
          ));
          // 	initList == innerInitList
          new Equality(body, var_initList, var_innerInitList);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_initList = body.getOrCreateVariableByName("initList");
          PVariable var_innerInitList = body.getOrCreateVariableByName("innerInitList");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initList), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInitList")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_innerInitList), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInitList")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initList, parameter_initList),
             new ExportedParameter(body, var_innerInitList, parameter_innerInitList)
          ));
          // 	find innerInitList+(initList, innerInitList)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_initList, var_innerInitList), InnerInitList.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
