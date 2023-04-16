/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/helperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

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
 *         pattern reachableNodesNoDowhile2(p: SsaNode, c: SsaNode){
 *         	SsaBlock.nodes(p, c);
 *         } or {
 *         	SsaSwitch.cases.node(p, b);
 *         	find reachableNodesNoDowhile+(b, c);
 *         } or {
 *         	SsaSwitch.^default(p, b);
 *         	find reachableNodesNoDowhile+(b, c);
 *         } or {
 *         	SsaBlock.nodes(p, b);
 *         	find reachableNodesNoDowhile+(b, c);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ReachableNodesNoDowhile2 extends BaseGeneratedEMFQuerySpecification<ReachableNodesNoDowhile2.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.reachableNodesNoDowhile2 pattern,
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
    private SsaNode fP;

    private SsaNode fC;

    private static List<String> parameterNames = makeImmutableList("p", "c");

    private Match(final SsaNode pP, final SsaNode pC) {
      this.fP = pP;
      this.fC = pC;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "p": return this.fP;
          case "c": return this.fC;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fP;
          case 1: return this.fC;
          default: return null;
      }
    }

    public SsaNode getP() {
      return this.fP;
    }

    public SsaNode getC() {
      return this.fC;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("p".equals(parameterName) ) {
          this.fP = (SsaNode) newValue;
          return true;
      }
      if ("c".equals(parameterName) ) {
          this.fC = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setP(final SsaNode pP) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fP = pP;
    }

    public void setC(final SsaNode pC) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC = pC;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.reachableNodesNoDowhile2";
    }

    @Override
    public List<String> parameterNames() {
      return ReachableNodesNoDowhile2.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fP, fC};
    }

    @Override
    public ReachableNodesNoDowhile2.Match toImmutable() {
      return isMutable() ? newMatch(fP, fC) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"p\"=" + prettyPrintValue(fP) + ", ");
      result.append("\"c\"=" + prettyPrintValue(fC));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fP, fC);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ReachableNodesNoDowhile2.Match)) {
          ReachableNodesNoDowhile2.Match other = (ReachableNodesNoDowhile2.Match) obj;
          return Objects.equals(fP, other.fP) && Objects.equals(fC, other.fC);
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
    public ReachableNodesNoDowhile2 specification() {
      return ReachableNodesNoDowhile2.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ReachableNodesNoDowhile2.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ReachableNodesNoDowhile2.Match newMutableMatch(final SsaNode pP, final SsaNode pC) {
      return new Mutable(pP, pC);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ReachableNodesNoDowhile2.Match newMatch(final SsaNode pP, final SsaNode pC) {
      return new Immutable(pP, pC);
    }

    private static final class Mutable extends ReachableNodesNoDowhile2.Match {
      Mutable(final SsaNode pP, final SsaNode pC) {
        super(pP, pC);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ReachableNodesNoDowhile2.Match {
      Immutable(final SsaNode pP, final SsaNode pC) {
        super(pP, pC);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.reachableNodesNoDowhile2 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern reachableNodesNoDowhile2(p: SsaNode, c: SsaNode){
   * 	SsaBlock.nodes(p, c);
   * } or {
   * 	SsaSwitch.cases.node(p, b);
   * 	find reachableNodesNoDowhile+(b, c);
   * } or {
   * 	SsaSwitch.^default(p, b);
   * 	find reachableNodesNoDowhile+(b, c);
   * } or {
   * 	SsaBlock.nodes(p, b);
   * 	find reachableNodesNoDowhile+(b, c);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ReachableNodesNoDowhile2
   * 
   */
  public static class Matcher extends BaseMatcher<ReachableNodesNoDowhile2.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ReachableNodesNoDowhile2.Matcher on(final ViatraQueryEngine engine) {
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
    public static ReachableNodesNoDowhile2.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_P = 0;

    private static final int POSITION_C = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReachableNodesNoDowhile2.Matcher.class);

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
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ReachableNodesNoDowhile2.Match> getAllMatches(final SsaNode pP, final SsaNode pC) {
      return rawStreamAllMatches(new Object[]{pP, pC}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ReachableNodesNoDowhile2.Match> streamAllMatches(final SsaNode pP, final SsaNode pC) {
      return rawStreamAllMatches(new Object[]{pP, pC});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ReachableNodesNoDowhile2.Match> getOneArbitraryMatch(final SsaNode pP, final SsaNode pC) {
      return rawGetOneArbitraryMatch(new Object[]{pP, pC});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaNode pP, final SsaNode pC) {
      return rawHasMatch(new Object[]{pP, pC});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaNode pP, final SsaNode pC) {
      return rawCountMatches(new Object[]{pP, pC});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaNode pP, final SsaNode pC, final Consumer<? super ReachableNodesNoDowhile2.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pP, pC}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pP the fixed value of pattern parameter p, or null if not bound.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ReachableNodesNoDowhile2.Match newMatch(final SsaNode pP, final SsaNode pC) {
      return ReachableNodesNoDowhile2.Match.newMatch(pP, pC);
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_P, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfp() {
      return rawStreamAllValuesOfp(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfp(final ReachableNodesNoDowhile2.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfp(final SsaNode pC) {
      return rawStreamAllValuesOfp(new Object[]{null, pC});
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfp(final ReachableNodesNoDowhile2.Match partialMatch) {
      return rawStreamAllValuesOfp(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for p.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfp(final SsaNode pC) {
      return rawStreamAllValuesOfp(new Object[]{null, pC}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfc() {
      return rawStreamAllValuesOfc(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfc() {
      return rawStreamAllValuesOfc(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfc(final ReachableNodesNoDowhile2.Match partialMatch) {
      return rawStreamAllValuesOfc(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfc(final SsaNode pP) {
      return rawStreamAllValuesOfc(new Object[]{pP, null});
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfc(final ReachableNodesNoDowhile2.Match partialMatch) {
      return rawStreamAllValuesOfc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfc(final SsaNode pP) {
      return rawStreamAllValuesOfc(new Object[]{pP, null}).collect(Collectors.toSet());
    }

    @Override
    protected ReachableNodesNoDowhile2.Match tupleToMatch(final Tuple t) {
      try {
          return ReachableNodesNoDowhile2.Match.newMatch((SsaNode) t.get(POSITION_P), (SsaNode) t.get(POSITION_C));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReachableNodesNoDowhile2.Match arrayToMatch(final Object[] match) {
      try {
          return ReachableNodesNoDowhile2.Match.newMatch((SsaNode) match[POSITION_P], (SsaNode) match[POSITION_C]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReachableNodesNoDowhile2.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ReachableNodesNoDowhile2.Match.newMutableMatch((SsaNode) match[POSITION_P], (SsaNode) match[POSITION_C]);
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
    public static IQuerySpecification<ReachableNodesNoDowhile2.Matcher> querySpecification() {
      return ReachableNodesNoDowhile2.instance();
    }
  }

  private ReachableNodesNoDowhile2() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ReachableNodesNoDowhile2 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ReachableNodesNoDowhile2.Matcher instantiate(final ViatraQueryEngine engine) {
    return ReachableNodesNoDowhile2.Matcher.on(engine);
  }

  @Override
  public ReachableNodesNoDowhile2.Matcher instantiate() {
    return ReachableNodesNoDowhile2.Matcher.create();
  }

  @Override
  public ReachableNodesNoDowhile2.Match newEmptyMatch() {
    return ReachableNodesNoDowhile2.Match.newEmptyMatch();
  }

  @Override
  public ReachableNodesNoDowhile2.Match newMatch(final Object... parameters) {
    return ReachableNodesNoDowhile2.Match.newMatch((hu.metadom.hls.ssamodel.SsaNode) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ReachableNodesNoDowhile2} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ReachableNodesNoDowhile2#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ReachableNodesNoDowhile2 INSTANCE = new ReachableNodesNoDowhile2();

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
    private static final ReachableNodesNoDowhile2.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_p = new PParameter("p", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final PParameter parameter_c = new PParameter("c", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_p, parameter_c);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.reachableNodesNoDowhile2";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("p","c");
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
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_c = body.getOrCreateVariableByName("c");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_p, parameter_p),
             new ExportedParameter(body, var_c, parameter_c)
          ));
          // 	SsaBlock.nodes(p, c)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_c);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_c = body.getOrCreateVariableByName("c");
          PVariable var_b = body.getOrCreateVariableByName("b");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_p, parameter_p),
             new ExportedParameter(body, var_c, parameter_c)
          ));
          // 	SsaSwitch.cases.node(p, b)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "cases")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCase")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCase", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_b);
          // 	find reachableNodesNoDowhile+(b, c)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_b, var_c), ReachableNodesNoDowhile.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_c = body.getOrCreateVariableByName("c");
          PVariable var_b = body.getOrCreateVariableByName("b");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_p, parameter_p),
             new ExportedParameter(body, var_c, parameter_c)
          ));
          // 	SsaSwitch.^default(p, b)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "default")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_b);
          // 	find reachableNodesNoDowhile+(b, c)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_b, var_c), ReachableNodesNoDowhile.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_p = body.getOrCreateVariableByName("p");
          PVariable var_c = body.getOrCreateVariableByName("c");
          PVariable var_b = body.getOrCreateVariableByName("b");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_p, parameter_p),
             new ExportedParameter(body, var_c, parameter_c)
          ));
          // 	SsaBlock.nodes(p, b)
          new TypeConstraint(body, Tuples.flatTupleOf(var_p), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_p, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_b);
          // 	find reachableNodesNoDowhile+(b, c)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_b, var_c), ReachableNodesNoDowhile.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
