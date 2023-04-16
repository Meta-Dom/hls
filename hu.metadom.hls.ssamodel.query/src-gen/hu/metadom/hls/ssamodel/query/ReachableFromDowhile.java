/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/helperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaDowhile;
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
 *         pattern reachableFromDowhile(l: SsaDowhile, n: SsaNode){
 *         	SsaDowhile.body(l, c1);
 *         	SsaBlock(c1); 
 *         	find reachableNodesNoDowhile(c1, n);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ReachableFromDowhile extends BaseGeneratedEMFQuerySpecification<ReachableFromDowhile.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.reachableFromDowhile pattern,
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
    private SsaDowhile fL;

    private SsaNode fN;

    private static List<String> parameterNames = makeImmutableList("l", "n");

    private Match(final SsaDowhile pL, final SsaNode pN) {
      this.fL = pL;
      this.fN = pN;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "l": return this.fL;
          case "n": return this.fN;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fL;
          case 1: return this.fN;
          default: return null;
      }
    }

    public SsaDowhile getL() {
      return this.fL;
    }

    public SsaNode getN() {
      return this.fN;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("l".equals(parameterName) ) {
          this.fL = (SsaDowhile) newValue;
          return true;
      }
      if ("n".equals(parameterName) ) {
          this.fN = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setL(final SsaDowhile pL) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fL = pL;
    }

    public void setN(final SsaNode pN) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fN = pN;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.reachableFromDowhile";
    }

    @Override
    public List<String> parameterNames() {
      return ReachableFromDowhile.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fL, fN};
    }

    @Override
    public ReachableFromDowhile.Match toImmutable() {
      return isMutable() ? newMatch(fL, fN) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"l\"=" + prettyPrintValue(fL) + ", ");
      result.append("\"n\"=" + prettyPrintValue(fN));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fL, fN);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ReachableFromDowhile.Match)) {
          ReachableFromDowhile.Match other = (ReachableFromDowhile.Match) obj;
          return Objects.equals(fL, other.fL) && Objects.equals(fN, other.fN);
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
    public ReachableFromDowhile specification() {
      return ReachableFromDowhile.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ReachableFromDowhile.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ReachableFromDowhile.Match newMutableMatch(final SsaDowhile pL, final SsaNode pN) {
      return new Mutable(pL, pN);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ReachableFromDowhile.Match newMatch(final SsaDowhile pL, final SsaNode pN) {
      return new Immutable(pL, pN);
    }

    private static final class Mutable extends ReachableFromDowhile.Match {
      Mutable(final SsaDowhile pL, final SsaNode pN) {
        super(pL, pN);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ReachableFromDowhile.Match {
      Immutable(final SsaDowhile pL, final SsaNode pN) {
        super(pL, pN);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.reachableFromDowhile pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern reachableFromDowhile(l: SsaDowhile, n: SsaNode){
   * 	SsaDowhile.body(l, c1);
   * 	SsaBlock(c1); 
   * 	find reachableNodesNoDowhile(c1, n);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ReachableFromDowhile
   * 
   */
  public static class Matcher extends BaseMatcher<ReachableFromDowhile.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ReachableFromDowhile.Matcher on(final ViatraQueryEngine engine) {
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
    public static ReachableFromDowhile.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_L = 0;

    private static final int POSITION_N = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReachableFromDowhile.Matcher.class);

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
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ReachableFromDowhile.Match> getAllMatches(final SsaDowhile pL, final SsaNode pN) {
      return rawStreamAllMatches(new Object[]{pL, pN}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ReachableFromDowhile.Match> streamAllMatches(final SsaDowhile pL, final SsaNode pN) {
      return rawStreamAllMatches(new Object[]{pL, pN});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ReachableFromDowhile.Match> getOneArbitraryMatch(final SsaDowhile pL, final SsaNode pN) {
      return rawGetOneArbitraryMatch(new Object[]{pL, pN});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaDowhile pL, final SsaNode pN) {
      return rawHasMatch(new Object[]{pL, pN});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaDowhile pL, final SsaNode pN) {
      return rawCountMatches(new Object[]{pL, pN});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaDowhile pL, final SsaNode pN, final Consumer<? super ReachableFromDowhile.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pL, pN}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ReachableFromDowhile.Match newMatch(final SsaDowhile pL, final SsaNode pN) {
      return ReachableFromDowhile.Match.newMatch(pL, pN);
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaDowhile> rawStreamAllValuesOfl(final Object[] parameters) {
      return rawStreamAllValues(POSITION_L, parameters).map(SsaDowhile.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaDowhile> getAllValuesOfl() {
      return rawStreamAllValuesOfl(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaDowhile> streamAllValuesOfl() {
      return rawStreamAllValuesOfl(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaDowhile> streamAllValuesOfl(final ReachableFromDowhile.Match partialMatch) {
      return rawStreamAllValuesOfl(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaDowhile> streamAllValuesOfl(final SsaNode pN) {
      return rawStreamAllValuesOfl(new Object[]{null, pN});
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaDowhile> getAllValuesOfl(final ReachableFromDowhile.Match partialMatch) {
      return rawStreamAllValuesOfl(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaDowhile> getAllValuesOfl(final SsaNode pN) {
      return rawStreamAllValuesOfl(new Object[]{null, pN}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfn(final Object[] parameters) {
      return rawStreamAllValues(POSITION_N, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfn() {
      return rawStreamAllValuesOfn(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfn() {
      return rawStreamAllValuesOfn(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfn(final ReachableFromDowhile.Match partialMatch) {
      return rawStreamAllValuesOfn(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfn(final SsaDowhile pL) {
      return rawStreamAllValuesOfn(new Object[]{pL, null});
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfn(final ReachableFromDowhile.Match partialMatch) {
      return rawStreamAllValuesOfn(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfn(final SsaDowhile pL) {
      return rawStreamAllValuesOfn(new Object[]{pL, null}).collect(Collectors.toSet());
    }

    @Override
    protected ReachableFromDowhile.Match tupleToMatch(final Tuple t) {
      try {
          return ReachableFromDowhile.Match.newMatch((SsaDowhile) t.get(POSITION_L), (SsaNode) t.get(POSITION_N));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReachableFromDowhile.Match arrayToMatch(final Object[] match) {
      try {
          return ReachableFromDowhile.Match.newMatch((SsaDowhile) match[POSITION_L], (SsaNode) match[POSITION_N]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReachableFromDowhile.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ReachableFromDowhile.Match.newMutableMatch((SsaDowhile) match[POSITION_L], (SsaNode) match[POSITION_N]);
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
    public static IQuerySpecification<ReachableFromDowhile.Matcher> querySpecification() {
      return ReachableFromDowhile.instance();
    }
  }

  private ReachableFromDowhile() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ReachableFromDowhile instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ReachableFromDowhile.Matcher instantiate(final ViatraQueryEngine engine) {
    return ReachableFromDowhile.Matcher.on(engine);
  }

  @Override
  public ReachableFromDowhile.Matcher instantiate() {
    return ReachableFromDowhile.Matcher.create();
  }

  @Override
  public ReachableFromDowhile.Match newEmptyMatch() {
    return ReachableFromDowhile.Match.newEmptyMatch();
  }

  @Override
  public ReachableFromDowhile.Match newMatch(final Object... parameters) {
    return ReachableFromDowhile.Match.newMatch((hu.metadom.hls.ssamodel.SsaDowhile) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ReachableFromDowhile} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ReachableFromDowhile#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ReachableFromDowhile INSTANCE = new ReachableFromDowhile();

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
    private static final ReachableFromDowhile.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_l = new PParameter("l", "hu.metadom.hls.ssamodel.SsaDowhile", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaDowhile")), PParameterDirection.INOUT);

    private final PParameter parameter_n = new PParameter("n", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_l, parameter_n);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.reachableFromDowhile";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("l","n");
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
          PVariable var_l = body.getOrCreateVariableByName("l");
          PVariable var_n = body.getOrCreateVariableByName("n");
          PVariable var_c1 = body.getOrCreateVariableByName("c1");
          new TypeConstraint(body, Tuples.flatTupleOf(var_l), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_n), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_l, parameter_l),
             new ExportedParameter(body, var_n, parameter_n)
          ));
          // 	SsaDowhile.body(l, c1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_l), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_l, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile", "body")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_c1);
          // 	SsaBlock(c1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          //  	find reachableNodesNoDowhile(c1, n)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_c1, var_n), ReachableNodesNoDowhile.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
