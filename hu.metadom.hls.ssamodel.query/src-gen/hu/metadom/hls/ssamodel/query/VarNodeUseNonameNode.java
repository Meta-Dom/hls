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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         pattern varNodeUseNonameNode(varNode: SsaNode, nonameNode: SsaNode) {
 *         	find ssaNodeVar(varNode, _);
 *         	neg find ssaNodeVar(nonameNode, _);
 *         	
 *         	find nodeUseNode+(varNode, nonameNode);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class VarNodeUseNonameNode extends BaseGeneratedEMFQuerySpecification<VarNodeUseNonameNode.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.varNodeUseNonameNode pattern,
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
    private SsaNode fVarNode;

    private SsaNode fNonameNode;

    private static List<String> parameterNames = makeImmutableList("varNode", "nonameNode");

    private Match(final SsaNode pVarNode, final SsaNode pNonameNode) {
      this.fVarNode = pVarNode;
      this.fNonameNode = pNonameNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "varNode": return this.fVarNode;
          case "nonameNode": return this.fNonameNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fVarNode;
          case 1: return this.fNonameNode;
          default: return null;
      }
    }

    public SsaNode getVarNode() {
      return this.fVarNode;
    }

    public SsaNode getNonameNode() {
      return this.fNonameNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("varNode".equals(parameterName) ) {
          this.fVarNode = (SsaNode) newValue;
          return true;
      }
      if ("nonameNode".equals(parameterName) ) {
          this.fNonameNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setVarNode(final SsaNode pVarNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVarNode = pVarNode;
    }

    public void setNonameNode(final SsaNode pNonameNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNonameNode = pNonameNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.varNodeUseNonameNode";
    }

    @Override
    public List<String> parameterNames() {
      return VarNodeUseNonameNode.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fVarNode, fNonameNode};
    }

    @Override
    public VarNodeUseNonameNode.Match toImmutable() {
      return isMutable() ? newMatch(fVarNode, fNonameNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"varNode\"=" + prettyPrintValue(fVarNode) + ", ");
      result.append("\"nonameNode\"=" + prettyPrintValue(fNonameNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fVarNode, fNonameNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof VarNodeUseNonameNode.Match)) {
          VarNodeUseNonameNode.Match other = (VarNodeUseNonameNode.Match) obj;
          return Objects.equals(fVarNode, other.fVarNode) && Objects.equals(fNonameNode, other.fNonameNode);
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
    public VarNodeUseNonameNode specification() {
      return VarNodeUseNonameNode.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static VarNodeUseNonameNode.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static VarNodeUseNonameNode.Match newMutableMatch(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return new Mutable(pVarNode, pNonameNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static VarNodeUseNonameNode.Match newMatch(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return new Immutable(pVarNode, pNonameNode);
    }

    private static final class Mutable extends VarNodeUseNonameNode.Match {
      Mutable(final SsaNode pVarNode, final SsaNode pNonameNode) {
        super(pVarNode, pNonameNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends VarNodeUseNonameNode.Match {
      Immutable(final SsaNode pVarNode, final SsaNode pNonameNode) {
        super(pVarNode, pNonameNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.varNodeUseNonameNode pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern varNodeUseNonameNode(varNode: SsaNode, nonameNode: SsaNode) {
   * 	find ssaNodeVar(varNode, _);
   * 	neg find ssaNodeVar(nonameNode, _);
   * 	
   * 	find nodeUseNode+(varNode, nonameNode);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see VarNodeUseNonameNode
   * 
   */
  public static class Matcher extends BaseMatcher<VarNodeUseNonameNode.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static VarNodeUseNonameNode.Matcher on(final ViatraQueryEngine engine) {
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
    public static VarNodeUseNonameNode.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_VARNODE = 0;

    private static final int POSITION_NONAMENODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(VarNodeUseNonameNode.Matcher.class);

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
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<VarNodeUseNonameNode.Match> getAllMatches(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return rawStreamAllMatches(new Object[]{pVarNode, pNonameNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<VarNodeUseNonameNode.Match> streamAllMatches(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return rawStreamAllMatches(new Object[]{pVarNode, pNonameNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<VarNodeUseNonameNode.Match> getOneArbitraryMatch(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return rawGetOneArbitraryMatch(new Object[]{pVarNode, pNonameNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return rawHasMatch(new Object[]{pVarNode, pNonameNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return rawCountMatches(new Object[]{pVarNode, pNonameNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaNode pVarNode, final SsaNode pNonameNode, final Consumer<? super VarNodeUseNonameNode.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pVarNode, pNonameNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVarNode the fixed value of pattern parameter varNode, or null if not bound.
     * @param pNonameNode the fixed value of pattern parameter nonameNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public VarNodeUseNonameNode.Match newMatch(final SsaNode pVarNode, final SsaNode pNonameNode) {
      return VarNodeUseNonameNode.Match.newMatch(pVarNode, pNonameNode);
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfvarNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VARNODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfvarNode() {
      return rawStreamAllValuesOfvarNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfvarNode() {
      return rawStreamAllValuesOfvarNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfvarNode(final VarNodeUseNonameNode.Match partialMatch) {
      return rawStreamAllValuesOfvarNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfvarNode(final SsaNode pNonameNode) {
      return rawStreamAllValuesOfvarNode(new Object[]{null, pNonameNode});
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfvarNode(final VarNodeUseNonameNode.Match partialMatch) {
      return rawStreamAllValuesOfvarNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for varNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfvarNode(final SsaNode pNonameNode) {
      return rawStreamAllValuesOfvarNode(new Object[]{null, pNonameNode}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfnonameNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_NONAMENODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnonameNode() {
      return rawStreamAllValuesOfnonameNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfnonameNode() {
      return rawStreamAllValuesOfnonameNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfnonameNode(final VarNodeUseNonameNode.Match partialMatch) {
      return rawStreamAllValuesOfnonameNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfnonameNode(final SsaNode pVarNode) {
      return rawStreamAllValuesOfnonameNode(new Object[]{pVarNode, null});
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnonameNode(final VarNodeUseNonameNode.Match partialMatch) {
      return rawStreamAllValuesOfnonameNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for nonameNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnonameNode(final SsaNode pVarNode) {
      return rawStreamAllValuesOfnonameNode(new Object[]{pVarNode, null}).collect(Collectors.toSet());
    }

    @Override
    protected VarNodeUseNonameNode.Match tupleToMatch(final Tuple t) {
      try {
          return VarNodeUseNonameNode.Match.newMatch((SsaNode) t.get(POSITION_VARNODE), (SsaNode) t.get(POSITION_NONAMENODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected VarNodeUseNonameNode.Match arrayToMatch(final Object[] match) {
      try {
          return VarNodeUseNonameNode.Match.newMatch((SsaNode) match[POSITION_VARNODE], (SsaNode) match[POSITION_NONAMENODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected VarNodeUseNonameNode.Match arrayToMatchMutable(final Object[] match) {
      try {
          return VarNodeUseNonameNode.Match.newMutableMatch((SsaNode) match[POSITION_VARNODE], (SsaNode) match[POSITION_NONAMENODE]);
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
    public static IQuerySpecification<VarNodeUseNonameNode.Matcher> querySpecification() {
      return VarNodeUseNonameNode.instance();
    }
  }

  private VarNodeUseNonameNode() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VarNodeUseNonameNode instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected VarNodeUseNonameNode.Matcher instantiate(final ViatraQueryEngine engine) {
    return VarNodeUseNonameNode.Matcher.on(engine);
  }

  @Override
  public VarNodeUseNonameNode.Matcher instantiate() {
    return VarNodeUseNonameNode.Matcher.create();
  }

  @Override
  public VarNodeUseNonameNode.Match newEmptyMatch() {
    return VarNodeUseNonameNode.Match.newEmptyMatch();
  }

  @Override
  public VarNodeUseNonameNode.Match newMatch(final Object... parameters) {
    return VarNodeUseNonameNode.Match.newMatch((hu.metadom.hls.ssamodel.SsaNode) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link VarNodeUseNonameNode} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VarNodeUseNonameNode#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VarNodeUseNonameNode INSTANCE = new VarNodeUseNonameNode();

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
    private static final VarNodeUseNonameNode.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_varNode = new PParameter("varNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final PParameter parameter_nonameNode = new PParameter("nonameNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_varNode, parameter_nonameNode);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.varNodeUseNonameNode";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("varNode","nonameNode");
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
          PVariable var_varNode = body.getOrCreateVariableByName("varNode");
          PVariable var_nonameNode = body.getOrCreateVariableByName("nonameNode");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_varNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_nonameNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_varNode, parameter_varNode),
             new ExportedParameter(body, var_nonameNode, parameter_nonameNode)
          ));
          // 	find ssaNodeVar(varNode, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_varNode, var___0_), SsaNodeVar.instance().getInternalQueryRepresentation());
          // 	neg find ssaNodeVar(nonameNode, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_nonameNode, var___1_), SsaNodeVar.instance().getInternalQueryRepresentation());
          // 		find nodeUseNode+(varNode, nonameNode)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_varNode, var_nonameNode), NodeUseNode.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
