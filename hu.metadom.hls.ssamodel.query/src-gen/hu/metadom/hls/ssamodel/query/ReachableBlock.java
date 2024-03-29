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
 *         pattern reachableBlock(rootBlock: SsaBlock, block: SsaBlock) {
 *         	find blockInBlock+(rootBlock, block);
 *         } or {
 *         	rootBlock == block;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ReachableBlock extends BaseGeneratedEMFQuerySpecification<ReachableBlock.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.reachableBlock pattern,
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
    private SsaBlock fRootBlock;

    private SsaBlock fBlock;

    private static List<String> parameterNames = makeImmutableList("rootBlock", "block");

    private Match(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      this.fRootBlock = pRootBlock;
      this.fBlock = pBlock;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "rootBlock": return this.fRootBlock;
          case "block": return this.fBlock;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRootBlock;
          case 1: return this.fBlock;
          default: return null;
      }
    }

    public SsaBlock getRootBlock() {
      return this.fRootBlock;
    }

    public SsaBlock getBlock() {
      return this.fBlock;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("rootBlock".equals(parameterName) ) {
          this.fRootBlock = (SsaBlock) newValue;
          return true;
      }
      if ("block".equals(parameterName) ) {
          this.fBlock = (SsaBlock) newValue;
          return true;
      }
      return false;
    }

    public void setRootBlock(final SsaBlock pRootBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRootBlock = pRootBlock;
    }

    public void setBlock(final SsaBlock pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.reachableBlock";
    }

    @Override
    public List<String> parameterNames() {
      return ReachableBlock.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fRootBlock, fBlock};
    }

    @Override
    public ReachableBlock.Match toImmutable() {
      return isMutable() ? newMatch(fRootBlock, fBlock) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"rootBlock\"=" + prettyPrintValue(fRootBlock) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fRootBlock, fBlock);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ReachableBlock.Match)) {
          ReachableBlock.Match other = (ReachableBlock.Match) obj;
          return Objects.equals(fRootBlock, other.fRootBlock) && Objects.equals(fBlock, other.fBlock);
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
    public ReachableBlock specification() {
      return ReachableBlock.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ReachableBlock.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ReachableBlock.Match newMutableMatch(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return new Mutable(pRootBlock, pBlock);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ReachableBlock.Match newMatch(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return new Immutable(pRootBlock, pBlock);
    }

    private static final class Mutable extends ReachableBlock.Match {
      Mutable(final SsaBlock pRootBlock, final SsaBlock pBlock) {
        super(pRootBlock, pBlock);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ReachableBlock.Match {
      Immutable(final SsaBlock pRootBlock, final SsaBlock pBlock) {
        super(pRootBlock, pBlock);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.reachableBlock pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern reachableBlock(rootBlock: SsaBlock, block: SsaBlock) {
   * 	find blockInBlock+(rootBlock, block);
   * } or {
   * 	rootBlock == block;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ReachableBlock
   * 
   */
  public static class Matcher extends BaseMatcher<ReachableBlock.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ReachableBlock.Matcher on(final ViatraQueryEngine engine) {
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
    public static ReachableBlock.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_ROOTBLOCK = 0;

    private static final int POSITION_BLOCK = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ReachableBlock.Matcher.class);

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
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ReachableBlock.Match> getAllMatches(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return rawStreamAllMatches(new Object[]{pRootBlock, pBlock}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ReachableBlock.Match> streamAllMatches(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return rawStreamAllMatches(new Object[]{pRootBlock, pBlock});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ReachableBlock.Match> getOneArbitraryMatch(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pRootBlock, pBlock});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return rawHasMatch(new Object[]{pRootBlock, pBlock});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return rawCountMatches(new Object[]{pRootBlock, pBlock});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBlock pRootBlock, final SsaBlock pBlock, final Consumer<? super ReachableBlock.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRootBlock, pBlock}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRootBlock the fixed value of pattern parameter rootBlock, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ReachableBlock.Match newMatch(final SsaBlock pRootBlock, final SsaBlock pBlock) {
      return ReachableBlock.Match.newMatch(pRootBlock, pBlock);
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBlock> rawStreamAllValuesOfrootBlock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ROOTBLOCK, parameters).map(SsaBlock.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfrootBlock() {
      return rawStreamAllValuesOfrootBlock(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfrootBlock() {
      return rawStreamAllValuesOfrootBlock(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfrootBlock(final ReachableBlock.Match partialMatch) {
      return rawStreamAllValuesOfrootBlock(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfrootBlock(final SsaBlock pBlock) {
      return rawStreamAllValuesOfrootBlock(new Object[]{null, pBlock});
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfrootBlock(final ReachableBlock.Match partialMatch) {
      return rawStreamAllValuesOfrootBlock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for rootBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfrootBlock(final SsaBlock pBlock) {
      return rawStreamAllValuesOfrootBlock(new Object[]{null, pBlock}).collect(Collectors.toSet());
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
    public Stream<SsaBlock> streamAllValuesOfblock(final ReachableBlock.Match partialMatch) {
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
    public Stream<SsaBlock> streamAllValuesOfblock(final SsaBlock pRootBlock) {
      return rawStreamAllValuesOfblock(new Object[]{pRootBlock, null});
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final ReachableBlock.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final SsaBlock pRootBlock) {
      return rawStreamAllValuesOfblock(new Object[]{pRootBlock, null}).collect(Collectors.toSet());
    }

    @Override
    protected ReachableBlock.Match tupleToMatch(final Tuple t) {
      try {
          return ReachableBlock.Match.newMatch((SsaBlock) t.get(POSITION_ROOTBLOCK), (SsaBlock) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReachableBlock.Match arrayToMatch(final Object[] match) {
      try {
          return ReachableBlock.Match.newMatch((SsaBlock) match[POSITION_ROOTBLOCK], (SsaBlock) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ReachableBlock.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ReachableBlock.Match.newMutableMatch((SsaBlock) match[POSITION_ROOTBLOCK], (SsaBlock) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<ReachableBlock.Matcher> querySpecification() {
      return ReachableBlock.instance();
    }
  }

  private ReachableBlock() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ReachableBlock instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ReachableBlock.Matcher instantiate(final ViatraQueryEngine engine) {
    return ReachableBlock.Matcher.on(engine);
  }

  @Override
  public ReachableBlock.Matcher instantiate() {
    return ReachableBlock.Matcher.create();
  }

  @Override
  public ReachableBlock.Match newEmptyMatch() {
    return ReachableBlock.Match.newEmptyMatch();
  }

  @Override
  public ReachableBlock.Match newMatch(final Object... parameters) {
    return ReachableBlock.Match.newMatch((hu.metadom.hls.ssamodel.SsaBlock) parameters[0], (hu.metadom.hls.ssamodel.SsaBlock) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ReachableBlock} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ReachableBlock#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ReachableBlock INSTANCE = new ReachableBlock();

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
    private static final ReachableBlock.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_rootBlock = new PParameter("rootBlock", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final PParameter parameter_block = new PParameter("block", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_rootBlock, parameter_block);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.reachableBlock";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("rootBlock","block");
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
          PVariable var_rootBlock = body.getOrCreateVariableByName("rootBlock");
          PVariable var_block = body.getOrCreateVariableByName("block");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rootBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_rootBlock, parameter_rootBlock),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	find blockInBlock+(rootBlock, block)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_rootBlock, var_block), BlockInBlock.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_rootBlock = body.getOrCreateVariableByName("rootBlock");
          PVariable var_block = body.getOrCreateVariableByName("block");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rootBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_rootBlock, parameter_rootBlock),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	rootBlock == block
          new Equality(body, var_rootBlock, var_block);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
