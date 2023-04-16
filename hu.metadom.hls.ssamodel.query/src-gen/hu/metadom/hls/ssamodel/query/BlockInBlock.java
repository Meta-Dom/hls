/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaBlock;
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
 *         pattern blockInBlock(parentBlock: SsaBlock, childBlock: SsaBlock) {
 *         	SsaBlock.nodes(parentBlock, childBlock);
 *         
 *         } or {
 *         	SsaBlock.nodes(parentBlock, ssaSwitch);
 *         	SsaSwitch.cases.node(ssaSwitch, childBlock);
 *         } or {
 *         	SsaBlock.nodes(parentBlock, ssaSwitch);
 *         	SsaSwitch.^default(ssaSwitch, childBlock);
 *         } or {
 *         	SsaBlock.nodes(parentBlock, ssaSwitch);
 *         	SsaSwitch.merge(ssaSwitch, childBlock);
 *         
 *         } or {
 *         	SsaBlock.nodes(parentBlock, ssaDowhile);
 *         	SsaDowhile.body(ssaDowhile, childBlock);
 *         } or {
 *         	SsaBlock.nodes(parentBlock, ssaDowhile);
 *         	SsaDowhile.cond(ssaDowhile, childBlock);
 *         } or {
 *         	SsaBlock.nodes(parentBlock, ssaDowhile);
 *         	SsaDowhile.merge(ssaDowhile, childBlock);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BlockInBlock extends BaseGeneratedEMFQuerySpecification<BlockInBlock.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.blockInBlock pattern,
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
    private SsaBlock fParentBlock;

    private SsaBlock fChildBlock;

    private static List<String> parameterNames = makeImmutableList("parentBlock", "childBlock");

    private Match(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      this.fParentBlock = pParentBlock;
      this.fChildBlock = pChildBlock;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "parentBlock": return this.fParentBlock;
          case "childBlock": return this.fChildBlock;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fParentBlock;
          case 1: return this.fChildBlock;
          default: return null;
      }
    }

    public SsaBlock getParentBlock() {
      return this.fParentBlock;
    }

    public SsaBlock getChildBlock() {
      return this.fChildBlock;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("parentBlock".equals(parameterName) ) {
          this.fParentBlock = (SsaBlock) newValue;
          return true;
      }
      if ("childBlock".equals(parameterName) ) {
          this.fChildBlock = (SsaBlock) newValue;
          return true;
      }
      return false;
    }

    public void setParentBlock(final SsaBlock pParentBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParentBlock = pParentBlock;
    }

    public void setChildBlock(final SsaBlock pChildBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fChildBlock = pChildBlock;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.blockInBlock";
    }

    @Override
    public List<String> parameterNames() {
      return BlockInBlock.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fParentBlock, fChildBlock};
    }

    @Override
    public BlockInBlock.Match toImmutable() {
      return isMutable() ? newMatch(fParentBlock, fChildBlock) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"parentBlock\"=" + prettyPrintValue(fParentBlock) + ", ");
      result.append("\"childBlock\"=" + prettyPrintValue(fChildBlock));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fParentBlock, fChildBlock);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BlockInBlock.Match)) {
          BlockInBlock.Match other = (BlockInBlock.Match) obj;
          return Objects.equals(fParentBlock, other.fParentBlock) && Objects.equals(fChildBlock, other.fChildBlock);
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
    public BlockInBlock specification() {
      return BlockInBlock.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BlockInBlock.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BlockInBlock.Match newMutableMatch(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return new Mutable(pParentBlock, pChildBlock);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BlockInBlock.Match newMatch(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return new Immutable(pParentBlock, pChildBlock);
    }

    private static final class Mutable extends BlockInBlock.Match {
      Mutable(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
        super(pParentBlock, pChildBlock);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends BlockInBlock.Match {
      Immutable(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
        super(pParentBlock, pChildBlock);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.blockInBlock pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern blockInBlock(parentBlock: SsaBlock, childBlock: SsaBlock) {
   * 	SsaBlock.nodes(parentBlock, childBlock);
   * 
   * } or {
   * 	SsaBlock.nodes(parentBlock, ssaSwitch);
   * 	SsaSwitch.cases.node(ssaSwitch, childBlock);
   * } or {
   * 	SsaBlock.nodes(parentBlock, ssaSwitch);
   * 	SsaSwitch.^default(ssaSwitch, childBlock);
   * } or {
   * 	SsaBlock.nodes(parentBlock, ssaSwitch);
   * 	SsaSwitch.merge(ssaSwitch, childBlock);
   * 
   * } or {
   * 	SsaBlock.nodes(parentBlock, ssaDowhile);
   * 	SsaDowhile.body(ssaDowhile, childBlock);
   * } or {
   * 	SsaBlock.nodes(parentBlock, ssaDowhile);
   * 	SsaDowhile.cond(ssaDowhile, childBlock);
   * } or {
   * 	SsaBlock.nodes(parentBlock, ssaDowhile);
   * 	SsaDowhile.merge(ssaDowhile, childBlock);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BlockInBlock
   * 
   */
  public static class Matcher extends BaseMatcher<BlockInBlock.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BlockInBlock.Matcher on(final ViatraQueryEngine engine) {
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
    public static BlockInBlock.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_PARENTBLOCK = 0;

    private static final int POSITION_CHILDBLOCK = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlockInBlock.Matcher.class);

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
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BlockInBlock.Match> getAllMatches(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return rawStreamAllMatches(new Object[]{pParentBlock, pChildBlock}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BlockInBlock.Match> streamAllMatches(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return rawStreamAllMatches(new Object[]{pParentBlock, pChildBlock});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BlockInBlock.Match> getOneArbitraryMatch(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pParentBlock, pChildBlock});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return rawHasMatch(new Object[]{pParentBlock, pChildBlock});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return rawCountMatches(new Object[]{pParentBlock, pChildBlock});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBlock pParentBlock, final SsaBlock pChildBlock, final Consumer<? super BlockInBlock.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pParentBlock, pChildBlock}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParentBlock the fixed value of pattern parameter parentBlock, or null if not bound.
     * @param pChildBlock the fixed value of pattern parameter childBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BlockInBlock.Match newMatch(final SsaBlock pParentBlock, final SsaBlock pChildBlock) {
      return BlockInBlock.Match.newMatch(pParentBlock, pChildBlock);
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBlock> rawStreamAllValuesOfparentBlock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARENTBLOCK, parameters).map(SsaBlock.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentBlock() {
      return rawStreamAllValuesOfparentBlock(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentBlock() {
      return rawStreamAllValuesOfparentBlock(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentBlock(final BlockInBlock.Match partialMatch) {
      return rawStreamAllValuesOfparentBlock(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentBlock(final SsaBlock pChildBlock) {
      return rawStreamAllValuesOfparentBlock(new Object[]{null, pChildBlock});
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentBlock(final BlockInBlock.Match partialMatch) {
      return rawStreamAllValuesOfparentBlock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentBlock(final SsaBlock pChildBlock) {
      return rawStreamAllValuesOfparentBlock(new Object[]{null, pChildBlock}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBlock> rawStreamAllValuesOfchildBlock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CHILDBLOCK, parameters).map(SsaBlock.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfchildBlock() {
      return rawStreamAllValuesOfchildBlock(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfchildBlock() {
      return rawStreamAllValuesOfchildBlock(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfchildBlock(final BlockInBlock.Match partialMatch) {
      return rawStreamAllValuesOfchildBlock(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfchildBlock(final SsaBlock pParentBlock) {
      return rawStreamAllValuesOfchildBlock(new Object[]{pParentBlock, null});
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfchildBlock(final BlockInBlock.Match partialMatch) {
      return rawStreamAllValuesOfchildBlock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for childBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfchildBlock(final SsaBlock pParentBlock) {
      return rawStreamAllValuesOfchildBlock(new Object[]{pParentBlock, null}).collect(Collectors.toSet());
    }

    @Override
    protected BlockInBlock.Match tupleToMatch(final Tuple t) {
      try {
          return BlockInBlock.Match.newMatch((SsaBlock) t.get(POSITION_PARENTBLOCK), (SsaBlock) t.get(POSITION_CHILDBLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BlockInBlock.Match arrayToMatch(final Object[] match) {
      try {
          return BlockInBlock.Match.newMatch((SsaBlock) match[POSITION_PARENTBLOCK], (SsaBlock) match[POSITION_CHILDBLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BlockInBlock.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BlockInBlock.Match.newMutableMatch((SsaBlock) match[POSITION_PARENTBLOCK], (SsaBlock) match[POSITION_CHILDBLOCK]);
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
    public static IQuerySpecification<BlockInBlock.Matcher> querySpecification() {
      return BlockInBlock.instance();
    }
  }

  private BlockInBlock() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BlockInBlock instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected BlockInBlock.Matcher instantiate(final ViatraQueryEngine engine) {
    return BlockInBlock.Matcher.on(engine);
  }

  @Override
  public BlockInBlock.Matcher instantiate() {
    return BlockInBlock.Matcher.create();
  }

  @Override
  public BlockInBlock.Match newEmptyMatch() {
    return BlockInBlock.Match.newEmptyMatch();
  }

  @Override
  public BlockInBlock.Match newMatch(final Object... parameters) {
    return BlockInBlock.Match.newMatch((hu.metadom.hls.ssamodel.SsaBlock) parameters[0], (hu.metadom.hls.ssamodel.SsaBlock) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link BlockInBlock} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link BlockInBlock#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BlockInBlock INSTANCE = new BlockInBlock();

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
    private static final BlockInBlock.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_parentBlock = new PParameter("parentBlock", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final PParameter parameter_childBlock = new PParameter("childBlock", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_parentBlock, parameter_childBlock);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.blockInBlock";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentBlock","childBlock");
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
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_childBlock);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          PVariable var_ssaSwitch = body.getOrCreateVariableByName("ssaSwitch");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, ssaSwitch)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ssaSwitch);
          // 	SsaSwitch.cases.node(ssaSwitch, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaSwitch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaSwitch, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "cases")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCase")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCase", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_2_, var_childBlock);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          PVariable var_ssaSwitch = body.getOrCreateVariableByName("ssaSwitch");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, ssaSwitch)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ssaSwitch);
          // 	SsaSwitch.^default(ssaSwitch, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaSwitch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaSwitch, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "default")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_childBlock);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          PVariable var_ssaSwitch = body.getOrCreateVariableByName("ssaSwitch");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, ssaSwitch)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ssaSwitch);
          // 	SsaSwitch.merge(ssaSwitch, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaSwitch), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaSwitch, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "merge")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_childBlock);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          PVariable var_ssaDowhile = body.getOrCreateVariableByName("ssaDowhile");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, ssaDowhile)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ssaDowhile);
          // 	SsaDowhile.body(ssaDowhile, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaDowhile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaDowhile, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile", "body")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_childBlock);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          PVariable var_ssaDowhile = body.getOrCreateVariableByName("ssaDowhile");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, ssaDowhile)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ssaDowhile);
          // 	SsaDowhile.cond(ssaDowhile, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaDowhile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaDowhile, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile", "cond")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_childBlock);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parentBlock = body.getOrCreateVariableByName("parentBlock");
          PVariable var_childBlock = body.getOrCreateVariableByName("childBlock");
          PVariable var_ssaDowhile = body.getOrCreateVariableByName("ssaDowhile");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_childBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentBlock, parameter_parentBlock),
             new ExportedParameter(body, var_childBlock, parameter_childBlock)
          ));
          // 	SsaBlock.nodes(parentBlock, ssaDowhile)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_ssaDowhile);
          // 	SsaDowhile.merge(ssaDowhile, childBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaDowhile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaDowhile, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile", "merge")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_childBlock);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
