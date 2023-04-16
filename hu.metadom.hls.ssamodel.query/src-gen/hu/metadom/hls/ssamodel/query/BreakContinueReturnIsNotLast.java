/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesBase.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaBlock;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
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
 *         {@literal @}Constraint(targetEditorId = "hu.metadom.hls.ssamodel.presentation.PromodEditorID",
 *         	severity = "error",
 *         	message = "break/continue/return is not the last item of the block",
 *         	key = {block, node})
 *         pattern breakContinueReturnIsNotLast(block: SsaBlock, node: SsaNode) {
 *         	SsaBlock.nodes(block, node);
 *         	SsaControl(node);
 *         } or {
 *         	SsaBlock.nodes(block, node);
 *         	SsaReturn(node);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BreakContinueReturnIsNotLast extends BaseGeneratedEMFQuerySpecification<BreakContinueReturnIsNotLast.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.breakContinueReturnIsNotLast pattern,
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
    private SsaBlock fBlock;

    private SsaNode fNode;

    private static List<String> parameterNames = makeImmutableList("block", "node");

    private Match(final SsaBlock pBlock, final SsaNode pNode) {
      this.fBlock = pBlock;
      this.fNode = pNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "block": return this.fBlock;
          case "node": return this.fNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fBlock;
          case 1: return this.fNode;
          default: return null;
      }
    }

    public SsaBlock getBlock() {
      return this.fBlock;
    }

    public SsaNode getNode() {
      return this.fNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("block".equals(parameterName) ) {
          this.fBlock = (SsaBlock) newValue;
          return true;
      }
      if ("node".equals(parameterName) ) {
          this.fNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setBlock(final SsaBlock pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }

    public void setNode(final SsaNode pNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNode = pNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.breakContinueReturnIsNotLast";
    }

    @Override
    public List<String> parameterNames() {
      return BreakContinueReturnIsNotLast.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fBlock, fNode};
    }

    @Override
    public BreakContinueReturnIsNotLast.Match toImmutable() {
      return isMutable() ? newMatch(fBlock, fNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"block\"=" + prettyPrintValue(fBlock) + ", ");
      result.append("\"node\"=" + prettyPrintValue(fNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fBlock, fNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BreakContinueReturnIsNotLast.Match)) {
          BreakContinueReturnIsNotLast.Match other = (BreakContinueReturnIsNotLast.Match) obj;
          return Objects.equals(fBlock, other.fBlock) && Objects.equals(fNode, other.fNode);
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
    public BreakContinueReturnIsNotLast specification() {
      return BreakContinueReturnIsNotLast.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BreakContinueReturnIsNotLast.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BreakContinueReturnIsNotLast.Match newMutableMatch(final SsaBlock pBlock, final SsaNode pNode) {
      return new Mutable(pBlock, pNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BreakContinueReturnIsNotLast.Match newMatch(final SsaBlock pBlock, final SsaNode pNode) {
      return new Immutable(pBlock, pNode);
    }

    private static final class Mutable extends BreakContinueReturnIsNotLast.Match {
      Mutable(final SsaBlock pBlock, final SsaNode pNode) {
        super(pBlock, pNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends BreakContinueReturnIsNotLast.Match {
      Immutable(final SsaBlock pBlock, final SsaNode pNode) {
        super(pBlock, pNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.breakContinueReturnIsNotLast pattern,
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
   * 	message = "break/continue/return is not the last item of the block",
   * 	key = {block, node})
   * pattern breakContinueReturnIsNotLast(block: SsaBlock, node: SsaNode) {
   * 	SsaBlock.nodes(block, node);
   * 	SsaControl(node);
   * } or {
   * 	SsaBlock.nodes(block, node);
   * 	SsaReturn(node);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BreakContinueReturnIsNotLast
   * 
   */
  public static class Matcher extends BaseMatcher<BreakContinueReturnIsNotLast.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BreakContinueReturnIsNotLast.Matcher on(final ViatraQueryEngine engine) {
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
    public static BreakContinueReturnIsNotLast.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_BLOCK = 0;

    private static final int POSITION_NODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BreakContinueReturnIsNotLast.Matcher.class);

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
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BreakContinueReturnIsNotLast.Match> getAllMatches(final SsaBlock pBlock, final SsaNode pNode) {
      return rawStreamAllMatches(new Object[]{pBlock, pNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BreakContinueReturnIsNotLast.Match> streamAllMatches(final SsaBlock pBlock, final SsaNode pNode) {
      return rawStreamAllMatches(new Object[]{pBlock, pNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BreakContinueReturnIsNotLast.Match> getOneArbitraryMatch(final SsaBlock pBlock, final SsaNode pNode) {
      return rawGetOneArbitraryMatch(new Object[]{pBlock, pNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBlock pBlock, final SsaNode pNode) {
      return rawHasMatch(new Object[]{pBlock, pNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBlock pBlock, final SsaNode pNode) {
      return rawCountMatches(new Object[]{pBlock, pNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBlock pBlock, final SsaNode pNode, final Consumer<? super BreakContinueReturnIsNotLast.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pBlock, pNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BreakContinueReturnIsNotLast.Match newMatch(final SsaBlock pBlock, final SsaNode pNode) {
      return BreakContinueReturnIsNotLast.Match.newMatch(pBlock, pNode);
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBlock> rawStreamAllValuesOfblock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_BLOCK, parameters).map(SsaBlock.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock() {
      return rawStreamAllValuesOfblock(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfblock() {
      return rawStreamAllValuesOfblock(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfblock(final BreakContinueReturnIsNotLast.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfblock(final SsaNode pNode) {
      return rawStreamAllValuesOfblock(new Object[]{null, pNode});
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final BreakContinueReturnIsNotLast.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final SsaNode pNode) {
      return rawStreamAllValuesOfblock(new Object[]{null, pNode}).collect(Collectors.toSet());
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
    public Stream<SsaNode> streamAllValuesOfnode(final BreakContinueReturnIsNotLast.Match partialMatch) {
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
    public Stream<SsaNode> streamAllValuesOfnode(final SsaBlock pBlock) {
      return rawStreamAllValuesOfnode(new Object[]{pBlock, null});
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final BreakContinueReturnIsNotLast.Match partialMatch) {
      return rawStreamAllValuesOfnode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final SsaBlock pBlock) {
      return rawStreamAllValuesOfnode(new Object[]{pBlock, null}).collect(Collectors.toSet());
    }

    @Override
    protected BreakContinueReturnIsNotLast.Match tupleToMatch(final Tuple t) {
      try {
          return BreakContinueReturnIsNotLast.Match.newMatch((SsaBlock) t.get(POSITION_BLOCK), (SsaNode) t.get(POSITION_NODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BreakContinueReturnIsNotLast.Match arrayToMatch(final Object[] match) {
      try {
          return BreakContinueReturnIsNotLast.Match.newMatch((SsaBlock) match[POSITION_BLOCK], (SsaNode) match[POSITION_NODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BreakContinueReturnIsNotLast.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BreakContinueReturnIsNotLast.Match.newMutableMatch((SsaBlock) match[POSITION_BLOCK], (SsaNode) match[POSITION_NODE]);
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
    public static IQuerySpecification<BreakContinueReturnIsNotLast.Matcher> querySpecification() {
      return BreakContinueReturnIsNotLast.instance();
    }
  }

  private BreakContinueReturnIsNotLast() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BreakContinueReturnIsNotLast instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected BreakContinueReturnIsNotLast.Matcher instantiate(final ViatraQueryEngine engine) {
    return BreakContinueReturnIsNotLast.Matcher.on(engine);
  }

  @Override
  public BreakContinueReturnIsNotLast.Matcher instantiate() {
    return BreakContinueReturnIsNotLast.Matcher.create();
  }

  @Override
  public BreakContinueReturnIsNotLast.Match newEmptyMatch() {
    return BreakContinueReturnIsNotLast.Match.newEmptyMatch();
  }

  @Override
  public BreakContinueReturnIsNotLast.Match newMatch(final Object... parameters) {
    return BreakContinueReturnIsNotLast.Match.newMatch((hu.metadom.hls.ssamodel.SsaBlock) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link BreakContinueReturnIsNotLast} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link BreakContinueReturnIsNotLast#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BreakContinueReturnIsNotLast INSTANCE = new BreakContinueReturnIsNotLast();

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
    private static final BreakContinueReturnIsNotLast.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_block = new PParameter("block", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final PParameter parameter_node = new PParameter("node", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_block, parameter_node);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.breakContinueReturnIsNotLast";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("block","node");
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
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var_node = body.getOrCreateVariableByName("node");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_block, parameter_block),
             new ExportedParameter(body, var_node, parameter_node)
          ));
          // 	SsaBlock.nodes(block, node)
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_node);
          // 	SsaControl(node)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaControl")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var_node = body.getOrCreateVariableByName("node");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_block, parameter_block),
             new ExportedParameter(body, var_node, parameter_node)
          ));
          // 	SsaBlock.nodes(block, node)
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_node);
          // 	SsaReturn(node)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaReturn")));
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("targetEditorId", "hu.metadom.hls.ssamodel.presentation.PromodEditorID");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "break/continue/return is not the last item of the block");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("block"), 
                              new ParameterReference("node")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
