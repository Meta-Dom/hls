/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesBase.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaInit;
import hu.metadom.hls.ssamodel.SsaNode;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         {@literal @}Constraint(targetEditorId = "hu.metadom.hls.ssamodel.presentation.PromodEditorID",
 *         	severity = "error",
 *         	message = "not defined value is used in $ssaInit$",
 *         	key = {ssaInit, usingNode})
 *         pattern undefIsUsed(ssaInit: SsaInit, usingNode: SsaNode) {
 *         	neg find ssaInitValue(ssaInit, _);
 *         	find nodeUseNode(usingNode, ssaInit);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class UndefIsUsed extends BaseGeneratedEMFQuerySpecification<UndefIsUsed.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.undefIsUsed pattern,
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
    private SsaInit fSsaInit;

    private SsaNode fUsingNode;

    private static List<String> parameterNames = makeImmutableList("ssaInit", "usingNode");

    private Match(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      this.fSsaInit = pSsaInit;
      this.fUsingNode = pUsingNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ssaInit": return this.fSsaInit;
          case "usingNode": return this.fUsingNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fSsaInit;
          case 1: return this.fUsingNode;
          default: return null;
      }
    }

    public SsaInit getSsaInit() {
      return this.fSsaInit;
    }

    public SsaNode getUsingNode() {
      return this.fUsingNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ssaInit".equals(parameterName) ) {
          this.fSsaInit = (SsaInit) newValue;
          return true;
      }
      if ("usingNode".equals(parameterName) ) {
          this.fUsingNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setSsaInit(final SsaInit pSsaInit) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSsaInit = pSsaInit;
    }

    public void setUsingNode(final SsaNode pUsingNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUsingNode = pUsingNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.undefIsUsed";
    }

    @Override
    public List<String> parameterNames() {
      return UndefIsUsed.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fSsaInit, fUsingNode};
    }

    @Override
    public UndefIsUsed.Match toImmutable() {
      return isMutable() ? newMatch(fSsaInit, fUsingNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ssaInit\"=" + prettyPrintValue(fSsaInit) + ", ");
      result.append("\"usingNode\"=" + prettyPrintValue(fUsingNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fSsaInit, fUsingNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof UndefIsUsed.Match)) {
          UndefIsUsed.Match other = (UndefIsUsed.Match) obj;
          return Objects.equals(fSsaInit, other.fSsaInit) && Objects.equals(fUsingNode, other.fUsingNode);
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
    public UndefIsUsed specification() {
      return UndefIsUsed.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static UndefIsUsed.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static UndefIsUsed.Match newMutableMatch(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return new Mutable(pSsaInit, pUsingNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static UndefIsUsed.Match newMatch(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return new Immutable(pSsaInit, pUsingNode);
    }

    private static final class Mutable extends UndefIsUsed.Match {
      Mutable(final SsaInit pSsaInit, final SsaNode pUsingNode) {
        super(pSsaInit, pUsingNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends UndefIsUsed.Match {
      Immutable(final SsaInit pSsaInit, final SsaNode pUsingNode) {
        super(pSsaInit, pUsingNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.undefIsUsed pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(targetEditorId = "hu.metadom.hls.ssamodel.presentation.PromodEditorID",
   * 	severity = "error",
   * 	message = "not defined value is used in $ssaInit$",
   * 	key = {ssaInit, usingNode})
   * pattern undefIsUsed(ssaInit: SsaInit, usingNode: SsaNode) {
   * 	neg find ssaInitValue(ssaInit, _);
   * 	find nodeUseNode(usingNode, ssaInit);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see UndefIsUsed
   * 
   */
  public static class Matcher extends BaseMatcher<UndefIsUsed.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static UndefIsUsed.Matcher on(final ViatraQueryEngine engine) {
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
    public static UndefIsUsed.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_SSAINIT = 0;

    private static final int POSITION_USINGNODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(UndefIsUsed.Matcher.class);

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
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<UndefIsUsed.Match> getAllMatches(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return rawStreamAllMatches(new Object[]{pSsaInit, pUsingNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<UndefIsUsed.Match> streamAllMatches(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return rawStreamAllMatches(new Object[]{pSsaInit, pUsingNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<UndefIsUsed.Match> getOneArbitraryMatch(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return rawGetOneArbitraryMatch(new Object[]{pSsaInit, pUsingNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return rawHasMatch(new Object[]{pSsaInit, pUsingNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return rawCountMatches(new Object[]{pSsaInit, pUsingNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaInit pSsaInit, final SsaNode pUsingNode, final Consumer<? super UndefIsUsed.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSsaInit, pUsingNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSsaInit the fixed value of pattern parameter ssaInit, or null if not bound.
     * @param pUsingNode the fixed value of pattern parameter usingNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public UndefIsUsed.Match newMatch(final SsaInit pSsaInit, final SsaNode pUsingNode) {
      return UndefIsUsed.Match.newMatch(pSsaInit, pUsingNode);
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaInit> rawStreamAllValuesOfssaInit(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SSAINIT, parameters).map(SsaInit.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInit> getAllValuesOfssaInit() {
      return rawStreamAllValuesOfssaInit(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInit> streamAllValuesOfssaInit() {
      return rawStreamAllValuesOfssaInit(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInit> streamAllValuesOfssaInit(final UndefIsUsed.Match partialMatch) {
      return rawStreamAllValuesOfssaInit(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaInit> streamAllValuesOfssaInit(final SsaNode pUsingNode) {
      return rawStreamAllValuesOfssaInit(new Object[]{null, pUsingNode});
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInit> getAllValuesOfssaInit(final UndefIsUsed.Match partialMatch) {
      return rawStreamAllValuesOfssaInit(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ssaInit.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaInit> getAllValuesOfssaInit(final SsaNode pUsingNode) {
      return rawStreamAllValuesOfssaInit(new Object[]{null, pUsingNode}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfusingNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USINGNODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusingNode() {
      return rawStreamAllValuesOfusingNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusingNode() {
      return rawStreamAllValuesOfusingNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusingNode(final UndefIsUsed.Match partialMatch) {
      return rawStreamAllValuesOfusingNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusingNode(final SsaInit pSsaInit) {
      return rawStreamAllValuesOfusingNode(new Object[]{pSsaInit, null});
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusingNode(final UndefIsUsed.Match partialMatch) {
      return rawStreamAllValuesOfusingNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usingNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusingNode(final SsaInit pSsaInit) {
      return rawStreamAllValuesOfusingNode(new Object[]{pSsaInit, null}).collect(Collectors.toSet());
    }

    @Override
    protected UndefIsUsed.Match tupleToMatch(final Tuple t) {
      try {
          return UndefIsUsed.Match.newMatch((SsaInit) t.get(POSITION_SSAINIT), (SsaNode) t.get(POSITION_USINGNODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected UndefIsUsed.Match arrayToMatch(final Object[] match) {
      try {
          return UndefIsUsed.Match.newMatch((SsaInit) match[POSITION_SSAINIT], (SsaNode) match[POSITION_USINGNODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected UndefIsUsed.Match arrayToMatchMutable(final Object[] match) {
      try {
          return UndefIsUsed.Match.newMutableMatch((SsaInit) match[POSITION_SSAINIT], (SsaNode) match[POSITION_USINGNODE]);
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
    public static IQuerySpecification<UndefIsUsed.Matcher> querySpecification() {
      return UndefIsUsed.instance();
    }
  }

  private UndefIsUsed() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static UndefIsUsed instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected UndefIsUsed.Matcher instantiate(final ViatraQueryEngine engine) {
    return UndefIsUsed.Matcher.on(engine);
  }

  @Override
  public UndefIsUsed.Matcher instantiate() {
    return UndefIsUsed.Matcher.create();
  }

  @Override
  public UndefIsUsed.Match newEmptyMatch() {
    return UndefIsUsed.Match.newEmptyMatch();
  }

  @Override
  public UndefIsUsed.Match newMatch(final Object... parameters) {
    return UndefIsUsed.Match.newMatch((hu.metadom.hls.ssamodel.SsaInit) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link UndefIsUsed} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link UndefIsUsed#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final UndefIsUsed INSTANCE = new UndefIsUsed();

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
    private static final UndefIsUsed.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_ssaInit = new PParameter("ssaInit", "hu.metadom.hls.ssamodel.SsaInit", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaInit")), PParameterDirection.INOUT);

    private final PParameter parameter_usingNode = new PParameter("usingNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_ssaInit, parameter_usingNode);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.undefIsUsed";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ssaInit","usingNode");
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
          PVariable var_ssaInit = body.getOrCreateVariableByName("ssaInit");
          PVariable var_usingNode = body.getOrCreateVariableByName("usingNode");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaInit), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInit")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usingNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ssaInit, parameter_ssaInit),
             new ExportedParameter(body, var_usingNode, parameter_usingNode)
          ));
          // 	neg find ssaInitValue(ssaInit, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_ssaInit, var___0_), SsaInitValue.instance().getInternalQueryRepresentation());
          // 	find nodeUseNode(usingNode, ssaInit)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_usingNode, var_ssaInit), NodeUseNode.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("targetEditorId", "hu.metadom.hls.ssamodel.presentation.PromodEditorID");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "not defined value is used in $ssaInit$");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("ssaInit"), 
                              new ParameterReference("usingNode")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
