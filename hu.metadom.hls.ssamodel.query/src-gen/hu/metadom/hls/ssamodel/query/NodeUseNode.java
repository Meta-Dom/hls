/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
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
 *         pattern nodeUseNode(node: SsaNode, usedNode: SsaNode) {
 *         	SsaCall.function(node, usedNode);
 *         } or {
 *         	SsaCall.arguments.node(node, usedNode);
 *         } or {
 *         	SsaReturn.expression(node, usedNode);
 *         } or {
 *         	SsaPhi.previous.node(node, usedNode);
 *         	
 *         } or {
 *         	SsaInit.value(node, usedNode);
 *         } or {
 *         	find allInitList(node, innerInitList);
 *         	SsaInitList.inits(innerInitList, initNode);
 *         	SsaInit.value(initNode, usedNode);
 *         } or {
 *         	SsaUnaryOperator.operand(node, usedNode);
 *         } or {
 *         	SsaBinaryOperator.left(node, usedNode);
 *         } or {
 *         	SsaBinaryOperator.right(node, usedNode);
 *         } or {
 *         	SsaAssign.value(node, usedNode);
 *         } or {
 *         	SsaCast.from(node, usedNode);
 *         
 *         } or {
 *         	SsaDowhile.condNode(node, usedNode);
 *         } or {
 *         	SsaSwitch.selector(node, usedNode);
 *         	
 *         } or {
 *         	SsaIndirectRead.pointer(node, usedNode);
 *         } or {
 *         	SsaArrayRead.indices.node(node, usedNode);
 *         } or {
 *         	SsaArrayRead.array(node, usedNode);
 *         } or {
 *         	SsaStructRead.struct(node, usedNode);
 *         	
 *         } or {
 *         	SsaIndirectWrite.pointer(node, usedNode);
 *         } or {
 *         	SsaIndirectWrite.value(node, usedNode);
 *         } or {
 *         	SsaArrayWrite.indices.node(node, usedNode);
 *         } or {
 *         	SsaArrayWrite.array(node, usedNode);
 *         } or {
 *         	SsaArrayWrite.value(node, usedNode);
 *         } or {
 *         	SsaStructWrite.struct(node, usedNode);
 *         } or {
 *         	SsaStructWrite.value(node, usedNode);
 *         
 *         } or {
 *         	SsaPassByRefParam.outNode(node, usedNode);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NodeUseNode extends BaseGeneratedEMFQuerySpecification<NodeUseNode.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.nodeUseNode pattern,
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

    private SsaNode fUsedNode;

    private static List<String> parameterNames = makeImmutableList("node", "usedNode");

    private Match(final SsaNode pNode, final SsaNode pUsedNode) {
      this.fNode = pNode;
      this.fUsedNode = pUsedNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "node": return this.fNode;
          case "usedNode": return this.fUsedNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fNode;
          case 1: return this.fUsedNode;
          default: return null;
      }
    }

    public SsaNode getNode() {
      return this.fNode;
    }

    public SsaNode getUsedNode() {
      return this.fUsedNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("node".equals(parameterName) ) {
          this.fNode = (SsaNode) newValue;
          return true;
      }
      if ("usedNode".equals(parameterName) ) {
          this.fUsedNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setNode(final SsaNode pNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNode = pNode;
    }

    public void setUsedNode(final SsaNode pUsedNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUsedNode = pUsedNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.nodeUseNode";
    }

    @Override
    public List<String> parameterNames() {
      return NodeUseNode.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fNode, fUsedNode};
    }

    @Override
    public NodeUseNode.Match toImmutable() {
      return isMutable() ? newMatch(fNode, fUsedNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"node\"=" + prettyPrintValue(fNode) + ", ");
      result.append("\"usedNode\"=" + prettyPrintValue(fUsedNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fNode, fUsedNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NodeUseNode.Match)) {
          NodeUseNode.Match other = (NodeUseNode.Match) obj;
          return Objects.equals(fNode, other.fNode) && Objects.equals(fUsedNode, other.fUsedNode);
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
    public NodeUseNode specification() {
      return NodeUseNode.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NodeUseNode.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NodeUseNode.Match newMutableMatch(final SsaNode pNode, final SsaNode pUsedNode) {
      return new Mutable(pNode, pUsedNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NodeUseNode.Match newMatch(final SsaNode pNode, final SsaNode pUsedNode) {
      return new Immutable(pNode, pUsedNode);
    }

    private static final class Mutable extends NodeUseNode.Match {
      Mutable(final SsaNode pNode, final SsaNode pUsedNode) {
        super(pNode, pUsedNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends NodeUseNode.Match {
      Immutable(final SsaNode pNode, final SsaNode pUsedNode) {
        super(pNode, pUsedNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.nodeUseNode pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern nodeUseNode(node: SsaNode, usedNode: SsaNode) {
   * 	SsaCall.function(node, usedNode);
   * } or {
   * 	SsaCall.arguments.node(node, usedNode);
   * } or {
   * 	SsaReturn.expression(node, usedNode);
   * } or {
   * 	SsaPhi.previous.node(node, usedNode);
   * 	
   * } or {
   * 	SsaInit.value(node, usedNode);
   * } or {
   * 	find allInitList(node, innerInitList);
   * 	SsaInitList.inits(innerInitList, initNode);
   * 	SsaInit.value(initNode, usedNode);
   * } or {
   * 	SsaUnaryOperator.operand(node, usedNode);
   * } or {
   * 	SsaBinaryOperator.left(node, usedNode);
   * } or {
   * 	SsaBinaryOperator.right(node, usedNode);
   * } or {
   * 	SsaAssign.value(node, usedNode);
   * } or {
   * 	SsaCast.from(node, usedNode);
   * 
   * } or {
   * 	SsaDowhile.condNode(node, usedNode);
   * } or {
   * 	SsaSwitch.selector(node, usedNode);
   * 	
   * } or {
   * 	SsaIndirectRead.pointer(node, usedNode);
   * } or {
   * 	SsaArrayRead.indices.node(node, usedNode);
   * } or {
   * 	SsaArrayRead.array(node, usedNode);
   * } or {
   * 	SsaStructRead.struct(node, usedNode);
   * 	
   * } or {
   * 	SsaIndirectWrite.pointer(node, usedNode);
   * } or {
   * 	SsaIndirectWrite.value(node, usedNode);
   * } or {
   * 	SsaArrayWrite.indices.node(node, usedNode);
   * } or {
   * 	SsaArrayWrite.array(node, usedNode);
   * } or {
   * 	SsaArrayWrite.value(node, usedNode);
   * } or {
   * 	SsaStructWrite.struct(node, usedNode);
   * } or {
   * 	SsaStructWrite.value(node, usedNode);
   * 
   * } or {
   * 	SsaPassByRefParam.outNode(node, usedNode);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NodeUseNode
   * 
   */
  public static class Matcher extends BaseMatcher<NodeUseNode.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NodeUseNode.Matcher on(final ViatraQueryEngine engine) {
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
    public static NodeUseNode.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_NODE = 0;

    private static final int POSITION_USEDNODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NodeUseNode.Matcher.class);

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
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NodeUseNode.Match> getAllMatches(final SsaNode pNode, final SsaNode pUsedNode) {
      return rawStreamAllMatches(new Object[]{pNode, pUsedNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NodeUseNode.Match> streamAllMatches(final SsaNode pNode, final SsaNode pUsedNode) {
      return rawStreamAllMatches(new Object[]{pNode, pUsedNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NodeUseNode.Match> getOneArbitraryMatch(final SsaNode pNode, final SsaNode pUsedNode) {
      return rawGetOneArbitraryMatch(new Object[]{pNode, pUsedNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaNode pNode, final SsaNode pUsedNode) {
      return rawHasMatch(new Object[]{pNode, pUsedNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaNode pNode, final SsaNode pUsedNode) {
      return rawCountMatches(new Object[]{pNode, pUsedNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaNode pNode, final SsaNode pUsedNode, final Consumer<? super NodeUseNode.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pNode, pUsedNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param pUsedNode the fixed value of pattern parameter usedNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NodeUseNode.Match newMatch(final SsaNode pNode, final SsaNode pUsedNode) {
      return NodeUseNode.Match.newMatch(pNode, pUsedNode);
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
    public Stream<SsaNode> streamAllValuesOfnode(final NodeUseNode.Match partialMatch) {
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
    public Stream<SsaNode> streamAllValuesOfnode(final SsaNode pUsedNode) {
      return rawStreamAllValuesOfnode(new Object[]{null, pUsedNode});
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final NodeUseNode.Match partialMatch) {
      return rawStreamAllValuesOfnode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final SsaNode pUsedNode) {
      return rawStreamAllValuesOfnode(new Object[]{null, pUsedNode}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfusedNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USEDNODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusedNode() {
      return rawStreamAllValuesOfusedNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusedNode() {
      return rawStreamAllValuesOfusedNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusedNode(final NodeUseNode.Match partialMatch) {
      return rawStreamAllValuesOfusedNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfusedNode(final SsaNode pNode) {
      return rawStreamAllValuesOfusedNode(new Object[]{pNode, null});
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusedNode(final NodeUseNode.Match partialMatch) {
      return rawStreamAllValuesOfusedNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for usedNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfusedNode(final SsaNode pNode) {
      return rawStreamAllValuesOfusedNode(new Object[]{pNode, null}).collect(Collectors.toSet());
    }

    @Override
    protected NodeUseNode.Match tupleToMatch(final Tuple t) {
      try {
          return NodeUseNode.Match.newMatch((SsaNode) t.get(POSITION_NODE), (SsaNode) t.get(POSITION_USEDNODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected NodeUseNode.Match arrayToMatch(final Object[] match) {
      try {
          return NodeUseNode.Match.newMatch((SsaNode) match[POSITION_NODE], (SsaNode) match[POSITION_USEDNODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected NodeUseNode.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NodeUseNode.Match.newMutableMatch((SsaNode) match[POSITION_NODE], (SsaNode) match[POSITION_USEDNODE]);
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
    public static IQuerySpecification<NodeUseNode.Matcher> querySpecification() {
      return NodeUseNode.instance();
    }
  }

  private NodeUseNode() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NodeUseNode instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected NodeUseNode.Matcher instantiate(final ViatraQueryEngine engine) {
    return NodeUseNode.Matcher.on(engine);
  }

  @Override
  public NodeUseNode.Matcher instantiate() {
    return NodeUseNode.Matcher.create();
  }

  @Override
  public NodeUseNode.Match newEmptyMatch() {
    return NodeUseNode.Match.newEmptyMatch();
  }

  @Override
  public NodeUseNode.Match newMatch(final Object... parameters) {
    return NodeUseNode.Match.newMatch((hu.metadom.hls.ssamodel.SsaNode) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link NodeUseNode} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NodeUseNode#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NodeUseNode INSTANCE = new NodeUseNode();

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
    private static final NodeUseNode.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_node = new PParameter("node", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final PParameter parameter_usedNode = new PParameter("usedNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_node, parameter_usedNode);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.nodeUseNode";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("node","usedNode");
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
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaCall.function(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCall", "function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaCall.arguments.node(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCall", "arguments")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaReturn.expression(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaReturn")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaReturn", "expression")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaPhi.previous.node(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPhi")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaPhi", "previous")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaInit.value(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInit")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaInit", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          PVariable var_innerInitList = body.getOrCreateVariableByName("innerInitList");
          PVariable var_initNode = body.getOrCreateVariableByName("initNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	find allInitList(node, innerInitList)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_node, var_innerInitList), AllInitList.instance().getInternalQueryRepresentation());
          // 	SsaInitList.inits(innerInitList, initNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_innerInitList), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInitList")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_innerInitList, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaInitList", "inits")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAbstractInit")));
          new Equality(body, var__virtual_0_, var_initNode);
          // 	SsaInit.value(initNode, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInit")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initNode, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaInit", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaUnaryOperator.operand(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator", "operand")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaBinaryOperator.left(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "left")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaBinaryOperator.right(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "right")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaAssign.value(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaCast.from(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCast")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaCast", "from")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaDowhile.condNode(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile", "condNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaSwitch.selector(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch", "selector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaIndirectRead.pointer(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectRead")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectRead", "pointer")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaArrayRead.indices.node(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead", "indices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaArrayRead.array(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead", "array")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaStructRead.struct(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaStructRead")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaStructRead", "struct")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaIndirectWrite.pointer(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectWrite", "pointer")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaIndirectWrite.value(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectWrite", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaArrayWrite.indices.node(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite", "indices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaArrayWrite.array(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite", "array")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaArrayWrite.value(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaStructWrite.struct(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaStructWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaStructWrite", "struct")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaStructWrite.value(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaStructWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaStructWrite", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_usedNode = body.getOrCreateVariableByName("usedNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_usedNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_usedNode, parameter_usedNode)
          ));
          // 	SsaPassByRefParam.outNode(node, usedNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaPassByRefParam", "outNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_usedNode);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
