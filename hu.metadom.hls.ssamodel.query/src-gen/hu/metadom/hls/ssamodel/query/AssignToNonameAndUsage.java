/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaAssign;
import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaVar;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         // PostIncDecReorder transformation
 *         
 *          
 *         { // -{@literal >} block
 *           assign int _0 = a_0 // -{@literal >} assign, variable=a
 *           ...
 *           binaryOp int i_i = _0 SUBTRACT _1 // -{@literal >} usageNode
 *         }
 *         
 *         pattern assignToNonameAndUsage(block: SsaBlock, assign: SsaAssign, usageNode: SsaNode, variable: SsaVar) {
 *         	find assignToNoname(assign);
 *         	
 *         	find varNodeUseNonameNode(usageNode, assign);
 *         	1 == count find varNodeUseNonameNode(_, assign);
 *         	
 *         	SsaBlock.nodes(block, assign);
 *         	SsaBlock.nodes(block, usageNode);
 *         	
 *         	SsaAssign.value.^var(assign, variable);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AssignToNonameAndUsage extends BaseGeneratedEMFQuerySpecification<AssignToNonameAndUsage.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.assignToNonameAndUsage pattern,
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

    private SsaAssign fAssign;

    private SsaNode fUsageNode;

    private SsaVar fVariable;

    private static List<String> parameterNames = makeImmutableList("block", "assign", "usageNode", "variable");

    private Match(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      this.fBlock = pBlock;
      this.fAssign = pAssign;
      this.fUsageNode = pUsageNode;
      this.fVariable = pVariable;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "block": return this.fBlock;
          case "assign": return this.fAssign;
          case "usageNode": return this.fUsageNode;
          case "variable": return this.fVariable;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fBlock;
          case 1: return this.fAssign;
          case 2: return this.fUsageNode;
          case 3: return this.fVariable;
          default: return null;
      }
    }

    public SsaBlock getBlock() {
      return this.fBlock;
    }

    public SsaAssign getAssign() {
      return this.fAssign;
    }

    public SsaNode getUsageNode() {
      return this.fUsageNode;
    }

    public SsaVar getVariable() {
      return this.fVariable;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("block".equals(parameterName) ) {
          this.fBlock = (SsaBlock) newValue;
          return true;
      }
      if ("assign".equals(parameterName) ) {
          this.fAssign = (SsaAssign) newValue;
          return true;
      }
      if ("usageNode".equals(parameterName) ) {
          this.fUsageNode = (SsaNode) newValue;
          return true;
      }
      if ("variable".equals(parameterName) ) {
          this.fVariable = (SsaVar) newValue;
          return true;
      }
      return false;
    }

    public void setBlock(final SsaBlock pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }

    public void setAssign(final SsaAssign pAssign) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAssign = pAssign;
    }

    public void setUsageNode(final SsaNode pUsageNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUsageNode = pUsageNode;
    }

    public void setVariable(final SsaVar pVariable) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVariable = pVariable;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.assignToNonameAndUsage";
    }

    @Override
    public List<String> parameterNames() {
      return AssignToNonameAndUsage.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fBlock, fAssign, fUsageNode, fVariable};
    }

    @Override
    public AssignToNonameAndUsage.Match toImmutable() {
      return isMutable() ? newMatch(fBlock, fAssign, fUsageNode, fVariable) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"block\"=" + prettyPrintValue(fBlock) + ", ");
      result.append("\"assign\"=" + prettyPrintValue(fAssign) + ", ");
      result.append("\"usageNode\"=" + prettyPrintValue(fUsageNode) + ", ");
      result.append("\"variable\"=" + prettyPrintValue(fVariable));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fBlock, fAssign, fUsageNode, fVariable);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AssignToNonameAndUsage.Match)) {
          AssignToNonameAndUsage.Match other = (AssignToNonameAndUsage.Match) obj;
          return Objects.equals(fBlock, other.fBlock) && Objects.equals(fAssign, other.fAssign) && Objects.equals(fUsageNode, other.fUsageNode) && Objects.equals(fVariable, other.fVariable);
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
    public AssignToNonameAndUsage specification() {
      return AssignToNonameAndUsage.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AssignToNonameAndUsage.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AssignToNonameAndUsage.Match newMutableMatch(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return new Mutable(pBlock, pAssign, pUsageNode, pVariable);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AssignToNonameAndUsage.Match newMatch(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return new Immutable(pBlock, pAssign, pUsageNode, pVariable);
    }

    private static final class Mutable extends AssignToNonameAndUsage.Match {
      Mutable(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
        super(pBlock, pAssign, pUsageNode, pVariable);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends AssignToNonameAndUsage.Match {
      Immutable(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
        super(pBlock, pAssign, pUsageNode, pVariable);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.assignToNonameAndUsage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // PostIncDecReorder transformation
   * 
   *  
   * { // -{@literal >} block
   *   assign int _0 = a_0 // -{@literal >} assign, variable=a
   *   ...
   *   binaryOp int i_i = _0 SUBTRACT _1 // -{@literal >} usageNode
   * }
   * 
   * pattern assignToNonameAndUsage(block: SsaBlock, assign: SsaAssign, usageNode: SsaNode, variable: SsaVar) {
   * 	find assignToNoname(assign);
   * 	
   * 	find varNodeUseNonameNode(usageNode, assign);
   * 	1 == count find varNodeUseNonameNode(_, assign);
   * 	
   * 	SsaBlock.nodes(block, assign);
   * 	SsaBlock.nodes(block, usageNode);
   * 	
   * 	SsaAssign.value.^var(assign, variable);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AssignToNonameAndUsage
   * 
   */
  public static class Matcher extends BaseMatcher<AssignToNonameAndUsage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AssignToNonameAndUsage.Matcher on(final ViatraQueryEngine engine) {
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
    public static AssignToNonameAndUsage.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_BLOCK = 0;

    private static final int POSITION_ASSIGN = 1;

    private static final int POSITION_USAGENODE = 2;

    private static final int POSITION_VARIABLE = 3;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AssignToNonameAndUsage.Matcher.class);

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
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AssignToNonameAndUsage.Match> getAllMatches(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawStreamAllMatches(new Object[]{pBlock, pAssign, pUsageNode, pVariable}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AssignToNonameAndUsage.Match> streamAllMatches(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawStreamAllMatches(new Object[]{pBlock, pAssign, pUsageNode, pVariable});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AssignToNonameAndUsage.Match> getOneArbitraryMatch(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawGetOneArbitraryMatch(new Object[]{pBlock, pAssign, pUsageNode, pVariable});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawHasMatch(new Object[]{pBlock, pAssign, pUsageNode, pVariable});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawCountMatches(new Object[]{pBlock, pAssign, pUsageNode, pVariable});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable, final Consumer<? super AssignToNonameAndUsage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pBlock, pAssign, pUsageNode, pVariable}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pAssign the fixed value of pattern parameter assign, or null if not bound.
     * @param pUsageNode the fixed value of pattern parameter usageNode, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AssignToNonameAndUsage.Match newMatch(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return AssignToNonameAndUsage.Match.newMatch(pBlock, pAssign, pUsageNode, pVariable);
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
    public Stream<SsaBlock> streamAllValuesOfblock(final AssignToNonameAndUsage.Match partialMatch) {
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
    public Stream<SsaBlock> streamAllValuesOfblock(final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawStreamAllValuesOfblock(new Object[]{null, pAssign, pUsageNode, pVariable});
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfblock(final SsaAssign pAssign, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawStreamAllValuesOfblock(new Object[]{null, pAssign, pUsageNode, pVariable}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaAssign> rawStreamAllValuesOfassign(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ASSIGN, parameters).map(SsaAssign.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaAssign> getAllValuesOfassign() {
      return rawStreamAllValuesOfassign(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaAssign> streamAllValuesOfassign() {
      return rawStreamAllValuesOfassign(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaAssign> streamAllValuesOfassign(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfassign(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaAssign> streamAllValuesOfassign(final SsaBlock pBlock, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawStreamAllValuesOfassign(new Object[]{pBlock, null, pUsageNode, pVariable});
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaAssign> getAllValuesOfassign(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfassign(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for assign.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaAssign> getAllValuesOfassign(final SsaBlock pBlock, final SsaNode pUsageNode, final SsaVar pVariable) {
      return rawStreamAllValuesOfassign(new Object[]{pBlock, null, pUsageNode, pVariable}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfusageNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USAGENODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusageNode() {
      return rawStreamAllValuesOfusageNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusageNode() {
      return rawStreamAllValuesOfusageNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusageNode(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfusageNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusageNode(final SsaBlock pBlock, final SsaAssign pAssign, final SsaVar pVariable) {
      return rawStreamAllValuesOfusageNode(new Object[]{pBlock, pAssign, null, pVariable});
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusageNode(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfusageNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usageNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusageNode(final SsaBlock pBlock, final SsaAssign pAssign, final SsaVar pVariable) {
      return rawStreamAllValuesOfusageNode(new Object[]{pBlock, pAssign, null, pVariable}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaVar> rawStreamAllValuesOfvariable(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VARIABLE, parameters).map(SsaVar.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode) {
      return rawStreamAllValuesOfvariable(new Object[]{pBlock, pAssign, pUsageNode, null});
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable(final AssignToNonameAndUsage.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable(final SsaBlock pBlock, final SsaAssign pAssign, final SsaNode pUsageNode) {
      return rawStreamAllValuesOfvariable(new Object[]{pBlock, pAssign, pUsageNode, null}).collect(Collectors.toSet());
    }

    @Override
    protected AssignToNonameAndUsage.Match tupleToMatch(final Tuple t) {
      try {
          return AssignToNonameAndUsage.Match.newMatch((SsaBlock) t.get(POSITION_BLOCK), (SsaAssign) t.get(POSITION_ASSIGN), (SsaNode) t.get(POSITION_USAGENODE), (SsaVar) t.get(POSITION_VARIABLE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AssignToNonameAndUsage.Match arrayToMatch(final Object[] match) {
      try {
          return AssignToNonameAndUsage.Match.newMatch((SsaBlock) match[POSITION_BLOCK], (SsaAssign) match[POSITION_ASSIGN], (SsaNode) match[POSITION_USAGENODE], (SsaVar) match[POSITION_VARIABLE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AssignToNonameAndUsage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AssignToNonameAndUsage.Match.newMutableMatch((SsaBlock) match[POSITION_BLOCK], (SsaAssign) match[POSITION_ASSIGN], (SsaNode) match[POSITION_USAGENODE], (SsaVar) match[POSITION_VARIABLE]);
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
    public static IQuerySpecification<AssignToNonameAndUsage.Matcher> querySpecification() {
      return AssignToNonameAndUsage.instance();
    }
  }

  private AssignToNonameAndUsage() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AssignToNonameAndUsage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected AssignToNonameAndUsage.Matcher instantiate(final ViatraQueryEngine engine) {
    return AssignToNonameAndUsage.Matcher.on(engine);
  }

  @Override
  public AssignToNonameAndUsage.Matcher instantiate() {
    return AssignToNonameAndUsage.Matcher.create();
  }

  @Override
  public AssignToNonameAndUsage.Match newEmptyMatch() {
    return AssignToNonameAndUsage.Match.newEmptyMatch();
  }

  @Override
  public AssignToNonameAndUsage.Match newMatch(final Object... parameters) {
    return AssignToNonameAndUsage.Match.newMatch((hu.metadom.hls.ssamodel.SsaBlock) parameters[0], (hu.metadom.hls.ssamodel.SsaAssign) parameters[1], (hu.metadom.hls.ssamodel.SsaNode) parameters[2], (hu.metadom.hls.ssamodel.SsaVar) parameters[3]);
  }

  /**
   * Inner class allowing the singleton instance of {@link AssignToNonameAndUsage} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AssignToNonameAndUsage#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AssignToNonameAndUsage INSTANCE = new AssignToNonameAndUsage();

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
    private static final AssignToNonameAndUsage.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_block = new PParameter("block", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final PParameter parameter_assign = new PParameter("assign", "hu.metadom.hls.ssamodel.SsaAssign", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaAssign")), PParameterDirection.INOUT);

    private final PParameter parameter_usageNode = new PParameter("usageNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final PParameter parameter_variable = new PParameter("variable", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_block, parameter_assign, parameter_usageNode, parameter_variable);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.assignToNonameAndUsage";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("block","assign","usageNode","variable");
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
          PVariable var_assign = body.getOrCreateVariableByName("assign");
          PVariable var_usageNode = body.getOrCreateVariableByName("usageNode");
          PVariable var_variable = body.getOrCreateVariableByName("variable");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_assign), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usageNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_block, parameter_block),
             new ExportedParameter(body, var_assign, parameter_assign),
             new ExportedParameter(body, var_usageNode, parameter_usageNode),
             new ExportedParameter(body, var_variable, parameter_variable)
          ));
          // 	find assignToNoname(assign)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_assign), AssignToNoname.instance().getInternalQueryRepresentation());
          // 		find varNodeUseNonameNode(usageNode, assign)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_usageNode, var_assign), VarNodeUseNonameNode.instance().getInternalQueryRepresentation());
          // 	1 == count find varNodeUseNonameNode(_, assign)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, 1);
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_, var_assign), VarNodeUseNonameNode.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var__virtual_0_, var__virtual_1_);
          // 		SsaBlock.nodes(block, assign)
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_2_, var_assign);
          // 	SsaBlock.nodes(block, usageNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_3_, var_usageNode);
          // 		SsaAssign.value.^var(assign, variable)
          new TypeConstraint(body, Tuples.flatTupleOf(var_assign), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_assign, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "var")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          new Equality(body, var__virtual_5_, var_variable);
          bodies.add(body);
      }
      return bodies;
    }
  }

  private static int evaluateExpression_1_1() {
    return 1;
  }
}
