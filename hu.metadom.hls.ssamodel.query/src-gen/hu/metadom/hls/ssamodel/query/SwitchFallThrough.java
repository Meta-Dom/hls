/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesBase.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaSwitch;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         	message = "switch fall through",
 *         	key = {sw,block})
 *         pattern switchFallThrough(sw: SsaSwitch, block: SsaBlock) {
 *         	SsaSwitch.switchType(sw, ::SWITCH);
 *         	SsaSwitch.cases.node(sw, block);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SwitchFallThrough extends BaseGeneratedEMFQuerySpecification<SwitchFallThrough.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.switchFallThrough pattern,
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
    private SsaSwitch fSw;

    private SsaBlock fBlock;

    private static List<String> parameterNames = makeImmutableList("sw", "block");

    private Match(final SsaSwitch pSw, final SsaBlock pBlock) {
      this.fSw = pSw;
      this.fBlock = pBlock;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "sw": return this.fSw;
          case "block": return this.fBlock;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fSw;
          case 1: return this.fBlock;
          default: return null;
      }
    }

    public SsaSwitch getSw() {
      return this.fSw;
    }

    public SsaBlock getBlock() {
      return this.fBlock;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("sw".equals(parameterName) ) {
          this.fSw = (SsaSwitch) newValue;
          return true;
      }
      if ("block".equals(parameterName) ) {
          this.fBlock = (SsaBlock) newValue;
          return true;
      }
      return false;
    }

    public void setSw(final SsaSwitch pSw) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSw = pSw;
    }

    public void setBlock(final SsaBlock pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.switchFallThrough";
    }

    @Override
    public List<String> parameterNames() {
      return SwitchFallThrough.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fSw, fBlock};
    }

    @Override
    public SwitchFallThrough.Match toImmutable() {
      return isMutable() ? newMatch(fSw, fBlock) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"sw\"=" + prettyPrintValue(fSw) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fSw, fBlock);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SwitchFallThrough.Match)) {
          SwitchFallThrough.Match other = (SwitchFallThrough.Match) obj;
          return Objects.equals(fSw, other.fSw) && Objects.equals(fBlock, other.fBlock);
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
    public SwitchFallThrough specification() {
      return SwitchFallThrough.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SwitchFallThrough.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SwitchFallThrough.Match newMutableMatch(final SsaSwitch pSw, final SsaBlock pBlock) {
      return new Mutable(pSw, pBlock);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SwitchFallThrough.Match newMatch(final SsaSwitch pSw, final SsaBlock pBlock) {
      return new Immutable(pSw, pBlock);
    }

    private static final class Mutable extends SwitchFallThrough.Match {
      Mutable(final SsaSwitch pSw, final SsaBlock pBlock) {
        super(pSw, pBlock);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends SwitchFallThrough.Match {
      Immutable(final SsaSwitch pSw, final SsaBlock pBlock) {
        super(pSw, pBlock);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.switchFallThrough pattern,
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
   * 	message = "switch fall through",
   * 	key = {sw,block})
   * pattern switchFallThrough(sw: SsaSwitch, block: SsaBlock) {
   * 	SsaSwitch.switchType(sw, ::SWITCH);
   * 	SsaSwitch.cases.node(sw, block);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SwitchFallThrough
   * 
   */
  public static class Matcher extends BaseMatcher<SwitchFallThrough.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SwitchFallThrough.Matcher on(final ViatraQueryEngine engine) {
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
    public static SwitchFallThrough.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_SW = 0;

    private static final int POSITION_BLOCK = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SwitchFallThrough.Matcher.class);

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
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SwitchFallThrough.Match> getAllMatches(final SsaSwitch pSw, final SsaBlock pBlock) {
      return rawStreamAllMatches(new Object[]{pSw, pBlock}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SwitchFallThrough.Match> streamAllMatches(final SsaSwitch pSw, final SsaBlock pBlock) {
      return rawStreamAllMatches(new Object[]{pSw, pBlock});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SwitchFallThrough.Match> getOneArbitraryMatch(final SsaSwitch pSw, final SsaBlock pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pSw, pBlock});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaSwitch pSw, final SsaBlock pBlock) {
      return rawHasMatch(new Object[]{pSw, pBlock});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaSwitch pSw, final SsaBlock pBlock) {
      return rawCountMatches(new Object[]{pSw, pBlock});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaSwitch pSw, final SsaBlock pBlock, final Consumer<? super SwitchFallThrough.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSw, pBlock}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSw the fixed value of pattern parameter sw, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SwitchFallThrough.Match newMatch(final SsaSwitch pSw, final SsaBlock pBlock) {
      return SwitchFallThrough.Match.newMatch(pSw, pBlock);
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaSwitch> rawStreamAllValuesOfsw(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SW, parameters).map(SsaSwitch.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaSwitch> getAllValuesOfsw() {
      return rawStreamAllValuesOfsw(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaSwitch> streamAllValuesOfsw() {
      return rawStreamAllValuesOfsw(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaSwitch> streamAllValuesOfsw(final SwitchFallThrough.Match partialMatch) {
      return rawStreamAllValuesOfsw(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaSwitch> streamAllValuesOfsw(final SsaBlock pBlock) {
      return rawStreamAllValuesOfsw(new Object[]{null, pBlock});
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaSwitch> getAllValuesOfsw(final SwitchFallThrough.Match partialMatch) {
      return rawStreamAllValuesOfsw(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for sw.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaSwitch> getAllValuesOfsw(final SsaBlock pBlock) {
      return rawStreamAllValuesOfsw(new Object[]{null, pBlock}).collect(Collectors.toSet());
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
    public Stream<SsaBlock> streamAllValuesOfblock(final SwitchFallThrough.Match partialMatch) {
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
    public Stream<SsaBlock> streamAllValuesOfblock(final SsaSwitch pSw) {
      return rawStreamAllValuesOfblock(new Object[]{pSw, null});
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final SwitchFallThrough.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final SsaSwitch pSw) {
      return rawStreamAllValuesOfblock(new Object[]{pSw, null}).collect(Collectors.toSet());
    }

    @Override
    protected SwitchFallThrough.Match tupleToMatch(final Tuple t) {
      try {
          return SwitchFallThrough.Match.newMatch((SsaSwitch) t.get(POSITION_SW), (SsaBlock) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SwitchFallThrough.Match arrayToMatch(final Object[] match) {
      try {
          return SwitchFallThrough.Match.newMatch((SsaSwitch) match[POSITION_SW], (SsaBlock) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SwitchFallThrough.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SwitchFallThrough.Match.newMutableMatch((SsaSwitch) match[POSITION_SW], (SsaBlock) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<SwitchFallThrough.Matcher> querySpecification() {
      return SwitchFallThrough.instance();
    }
  }

  private SwitchFallThrough() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SwitchFallThrough instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected SwitchFallThrough.Matcher instantiate(final ViatraQueryEngine engine) {
    return SwitchFallThrough.Matcher.on(engine);
  }

  @Override
  public SwitchFallThrough.Matcher instantiate() {
    return SwitchFallThrough.Matcher.create();
  }

  @Override
  public SwitchFallThrough.Match newEmptyMatch() {
    return SwitchFallThrough.Match.newEmptyMatch();
  }

  @Override
  public SwitchFallThrough.Match newMatch(final Object... parameters) {
    return SwitchFallThrough.Match.newMatch((hu.metadom.hls.ssamodel.SsaSwitch) parameters[0], (hu.metadom.hls.ssamodel.SsaBlock) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link SwitchFallThrough} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SwitchFallThrough#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SwitchFallThrough INSTANCE = new SwitchFallThrough();

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
    private static final SwitchFallThrough.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_sw = new PParameter("sw", "hu.metadom.hls.ssamodel.SsaSwitch", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaSwitch")), PParameterDirection.INOUT);

    private final PParameter parameter_block = new PParameter("block", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_sw, parameter_block);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.switchFallThrough";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sw","block");
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
          PVariable var_sw = body.getOrCreateVariableByName("sw");
          PVariable var_block = body.getOrCreateVariableByName("block");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sw), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_sw, parameter_sw),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	SsaSwitch.switchType(sw, ::SWITCH)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://hls.metadom.hu/ssaModel", "SwitchType", "SWITCH").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_sw), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sw, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "switchType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SwitchType")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	SsaSwitch.cases.node(sw, block)
          new TypeConstraint(body, Tuples.flatTupleOf(var_sw), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sw, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "cases")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCase")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCase", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_3_, var_block);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("targetEditorId", "hu.metadom.hls.ssamodel.presentation.PromodEditorID");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "switch fall through");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("sw"), 
                              new ParameterReference("block")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
