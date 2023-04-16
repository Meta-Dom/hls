/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
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
 *         // PointerToArray transformation
 *         
 *         pattern unnamedIndirectOrArrayWrite(node: SsaNode, prevNode: SsaNode) {
 *         	SsaIndirectWrite.pointer(node, prevNode);
 *         	neg find ssaNodeVar(node, _);
 *         } or {
 *         	SsaArrayWrite.array(node, prevNode);
 *         	neg find ssaNodeVar(node, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class UnnamedIndirectOrArrayWrite extends BaseGeneratedEMFQuerySpecification<UnnamedIndirectOrArrayWrite.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.unnamedIndirectOrArrayWrite pattern,
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
    private SsaNode fNode;

    private SsaNode fPrevNode;

    private static List<String> parameterNames = makeImmutableList("node", "prevNode");

    private Match(final SsaNode pNode, final SsaNode pPrevNode) {
      this.fNode = pNode;
      this.fPrevNode = pPrevNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "node": return this.fNode;
          case "prevNode": return this.fPrevNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fNode;
          case 1: return this.fPrevNode;
          default: return null;
      }
    }

    public SsaNode getNode() {
      return this.fNode;
    }

    public SsaNode getPrevNode() {
      return this.fPrevNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("node".equals(parameterName) ) {
          this.fNode = (SsaNode) newValue;
          return true;
      }
      if ("prevNode".equals(parameterName) ) {
          this.fPrevNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setNode(final SsaNode pNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNode = pNode;
    }

    public void setPrevNode(final SsaNode pPrevNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPrevNode = pPrevNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.unnamedIndirectOrArrayWrite";
    }

    @Override
    public List<String> parameterNames() {
      return UnnamedIndirectOrArrayWrite.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fNode, fPrevNode};
    }

    @Override
    public UnnamedIndirectOrArrayWrite.Match toImmutable() {
      return isMutable() ? newMatch(fNode, fPrevNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"node\"=" + prettyPrintValue(fNode) + ", ");
      result.append("\"prevNode\"=" + prettyPrintValue(fPrevNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fNode, fPrevNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof UnnamedIndirectOrArrayWrite.Match)) {
          UnnamedIndirectOrArrayWrite.Match other = (UnnamedIndirectOrArrayWrite.Match) obj;
          return Objects.equals(fNode, other.fNode) && Objects.equals(fPrevNode, other.fPrevNode);
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
    public UnnamedIndirectOrArrayWrite specification() {
      return UnnamedIndirectOrArrayWrite.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static UnnamedIndirectOrArrayWrite.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static UnnamedIndirectOrArrayWrite.Match newMutableMatch(final SsaNode pNode, final SsaNode pPrevNode) {
      return new Mutable(pNode, pPrevNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static UnnamedIndirectOrArrayWrite.Match newMatch(final SsaNode pNode, final SsaNode pPrevNode) {
      return new Immutable(pNode, pPrevNode);
    }

    private static final class Mutable extends UnnamedIndirectOrArrayWrite.Match {
      Mutable(final SsaNode pNode, final SsaNode pPrevNode) {
        super(pNode, pPrevNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends UnnamedIndirectOrArrayWrite.Match {
      Immutable(final SsaNode pNode, final SsaNode pPrevNode) {
        super(pNode, pPrevNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.unnamedIndirectOrArrayWrite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // PointerToArray transformation
   * 
   * pattern unnamedIndirectOrArrayWrite(node: SsaNode, prevNode: SsaNode) {
   * 	SsaIndirectWrite.pointer(node, prevNode);
   * 	neg find ssaNodeVar(node, _);
   * } or {
   * 	SsaArrayWrite.array(node, prevNode);
   * 	neg find ssaNodeVar(node, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see UnnamedIndirectOrArrayWrite
   * 
   */
  public static class Matcher extends BaseMatcher<UnnamedIndirectOrArrayWrite.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static UnnamedIndirectOrArrayWrite.Matcher on(final ViatraQueryEngine engine) {
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
    public static UnnamedIndirectOrArrayWrite.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_NODE = 0;

    private static final int POSITION_PREVNODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(UnnamedIndirectOrArrayWrite.Matcher.class);

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
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<UnnamedIndirectOrArrayWrite.Match> getAllMatches(final SsaNode pNode, final SsaNode pPrevNode) {
      return rawStreamAllMatches(new Object[]{pNode, pPrevNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<UnnamedIndirectOrArrayWrite.Match> streamAllMatches(final SsaNode pNode, final SsaNode pPrevNode) {
      return rawStreamAllMatches(new Object[]{pNode, pPrevNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<UnnamedIndirectOrArrayWrite.Match> getOneArbitraryMatch(final SsaNode pNode, final SsaNode pPrevNode) {
      return rawGetOneArbitraryMatch(new Object[]{pNode, pPrevNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaNode pNode, final SsaNode pPrevNode) {
      return rawHasMatch(new Object[]{pNode, pPrevNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaNode pNode, final SsaNode pPrevNode) {
      return rawCountMatches(new Object[]{pNode, pPrevNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaNode pNode, final SsaNode pPrevNode, final Consumer<? super UnnamedIndirectOrArrayWrite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pNode, pPrevNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pPrevNode the fixed value of pattern parameter prevNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public UnnamedIndirectOrArrayWrite.Match newMatch(final SsaNode pNode, final SsaNode pPrevNode) {
      return UnnamedIndirectOrArrayWrite.Match.newMatch(pNode, pPrevNode);
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfnode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_NODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode() {
      return rawStreamAllValuesOfnode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfnode() {
      return rawStreamAllValuesOfnode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfnode(final UnnamedIndirectOrArrayWrite.Match partialMatch) {
      return rawStreamAllValuesOfnode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfnode(final SsaNode pPrevNode) {
      return rawStreamAllValuesOfnode(new Object[]{null, pPrevNode});
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final UnnamedIndirectOrArrayWrite.Match partialMatch) {
      return rawStreamAllValuesOfnode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final SsaNode pPrevNode) {
      return rawStreamAllValuesOfnode(new Object[]{null, pPrevNode}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfprevNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PREVNODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfprevNode() {
      return rawStreamAllValuesOfprevNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfprevNode() {
      return rawStreamAllValuesOfprevNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfprevNode(final UnnamedIndirectOrArrayWrite.Match partialMatch) {
      return rawStreamAllValuesOfprevNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfprevNode(final SsaNode pNode) {
      return rawStreamAllValuesOfprevNode(new Object[]{pNode, null});
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfprevNode(final UnnamedIndirectOrArrayWrite.Match partialMatch) {
      return rawStreamAllValuesOfprevNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for prevNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfprevNode(final SsaNode pNode) {
      return rawStreamAllValuesOfprevNode(new Object[]{pNode, null}).collect(Collectors.toSet());
    }

    @Override
    protected UnnamedIndirectOrArrayWrite.Match tupleToMatch(final Tuple t) {
      try {
          return UnnamedIndirectOrArrayWrite.Match.newMatch((SsaNode) t.get(POSITION_NODE), (SsaNode) t.get(POSITION_PREVNODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected UnnamedIndirectOrArrayWrite.Match arrayToMatch(final Object[] match) {
      try {
          return UnnamedIndirectOrArrayWrite.Match.newMatch((SsaNode) match[POSITION_NODE], (SsaNode) match[POSITION_PREVNODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected UnnamedIndirectOrArrayWrite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return UnnamedIndirectOrArrayWrite.Match.newMutableMatch((SsaNode) match[POSITION_NODE], (SsaNode) match[POSITION_PREVNODE]);
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
    public static IQuerySpecification<UnnamedIndirectOrArrayWrite.Matcher> querySpecification() {
      return UnnamedIndirectOrArrayWrite.instance();
    }
  }

  private UnnamedIndirectOrArrayWrite() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static UnnamedIndirectOrArrayWrite instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected UnnamedIndirectOrArrayWrite.Matcher instantiate(final ViatraQueryEngine engine) {
    return UnnamedIndirectOrArrayWrite.Matcher.on(engine);
  }

  @Override
  public UnnamedIndirectOrArrayWrite.Matcher instantiate() {
    return UnnamedIndirectOrArrayWrite.Matcher.create();
  }

  @Override
  public UnnamedIndirectOrArrayWrite.Match newEmptyMatch() {
    return UnnamedIndirectOrArrayWrite.Match.newEmptyMatch();
  }

  @Override
  public UnnamedIndirectOrArrayWrite.Match newMatch(final Object... parameters) {
    return UnnamedIndirectOrArrayWrite.Match.newMatch((hu.metadom.hls.ssamodel.SsaNode) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link UnnamedIndirectOrArrayWrite} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link UnnamedIndirectOrArrayWrite#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final UnnamedIndirectOrArrayWrite INSTANCE = new UnnamedIndirectOrArrayWrite();

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
    private static final UnnamedIndirectOrArrayWrite.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_node = new PParameter("node", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final PParameter parameter_prevNode = new PParameter("prevNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_node, parameter_prevNode);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.unnamedIndirectOrArrayWrite";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("node","prevNode");
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
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_prevNode = body.getOrCreateVariableByName("prevNode");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_prevNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_prevNode, parameter_prevNode)
          ));
          // 	SsaIndirectWrite.pointer(node, prevNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectWrite", "pointer")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_prevNode);
          // 	neg find ssaNodeVar(node, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_node, var___0_), SsaNodeVar.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_prevNode = body.getOrCreateVariableByName("prevNode");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_prevNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_prevNode, parameter_prevNode)
          ));
          // 	SsaArrayWrite.array(node, prevNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite", "array")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_prevNode);
          // 	neg find ssaNodeVar(node, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_node, var___0_), SsaNodeVar.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
