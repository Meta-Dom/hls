/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/ssaUtil.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaFunction;
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
 *         pattern functionNode(func: SsaFunction, node: SsaNode) {
 *         	find reachableBlock(func, childrenBlock);
 *         	SsaBlock.nodes(childrenBlock, blockNode);
 *         	find nodeOrInnerNode(blockNode, node);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FunctionNode extends BaseGeneratedEMFQuerySpecification<FunctionNode.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.functionNode pattern,
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
    private SsaFunction fFunc;

    private SsaNode fNode;

    private static List<String> parameterNames = makeImmutableList("func", "node");

    private Match(final SsaFunction pFunc, final SsaNode pNode) {
      this.fFunc = pFunc;
      this.fNode = pNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "func": return this.fFunc;
          case "node": return this.fNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFunc;
          case 1: return this.fNode;
          default: return null;
      }
    }

    public SsaFunction getFunc() {
      return this.fFunc;
    }

    public SsaNode getNode() {
      return this.fNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("func".equals(parameterName) ) {
          this.fFunc = (SsaFunction) newValue;
          return true;
      }
      if ("node".equals(parameterName) ) {
          this.fNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setFunc(final SsaFunction pFunc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFunc = pFunc;
    }

    public void setNode(final SsaNode pNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNode = pNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.functionNode";
    }

    @Override
    public List<String> parameterNames() {
      return FunctionNode.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFunc, fNode};
    }

    @Override
    public FunctionNode.Match toImmutable() {
      return isMutable() ? newMatch(fFunc, fNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"func\"=" + prettyPrintValue(fFunc) + ", ");
      result.append("\"node\"=" + prettyPrintValue(fNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFunc, fNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FunctionNode.Match)) {
          FunctionNode.Match other = (FunctionNode.Match) obj;
          return Objects.equals(fFunc, other.fFunc) && Objects.equals(fNode, other.fNode);
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
    public FunctionNode specification() {
      return FunctionNode.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FunctionNode.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FunctionNode.Match newMutableMatch(final SsaFunction pFunc, final SsaNode pNode) {
      return new Mutable(pFunc, pNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FunctionNode.Match newMatch(final SsaFunction pFunc, final SsaNode pNode) {
      return new Immutable(pFunc, pNode);
    }

    private static final class Mutable extends FunctionNode.Match {
      Mutable(final SsaFunction pFunc, final SsaNode pNode) {
        super(pFunc, pNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FunctionNode.Match {
      Immutable(final SsaFunction pFunc, final SsaNode pNode) {
        super(pFunc, pNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.functionNode pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern functionNode(func: SsaFunction, node: SsaNode) {
   * 	find reachableBlock(func, childrenBlock);
   * 	SsaBlock.nodes(childrenBlock, blockNode);
   * 	find nodeOrInnerNode(blockNode, node);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FunctionNode
   * 
   */
  public static class Matcher extends BaseMatcher<FunctionNode.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FunctionNode.Matcher on(final ViatraQueryEngine engine) {
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
    public static FunctionNode.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FUNC = 0;

    private static final int POSITION_NODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FunctionNode.Matcher.class);

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
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FunctionNode.Match> getAllMatches(final SsaFunction pFunc, final SsaNode pNode) {
      return rawStreamAllMatches(new Object[]{pFunc, pNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FunctionNode.Match> streamAllMatches(final SsaFunction pFunc, final SsaNode pNode) {
      return rawStreamAllMatches(new Object[]{pFunc, pNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FunctionNode.Match> getOneArbitraryMatch(final SsaFunction pFunc, final SsaNode pNode) {
      return rawGetOneArbitraryMatch(new Object[]{pFunc, pNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pFunc, final SsaNode pNode) {
      return rawHasMatch(new Object[]{pFunc, pNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pFunc, final SsaNode pNode) {
      return rawCountMatches(new Object[]{pFunc, pNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pFunc, final SsaNode pNode, final Consumer<? super FunctionNode.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFunc, pNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFunc the fixed value of pattern parameter func, or null if not bound.
     * @param pNode the fixed value of pattern parameter node, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FunctionNode.Match newMatch(final SsaFunction pFunc, final SsaNode pNode) {
      return FunctionNode.Match.newMatch(pFunc, pNode);
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaFunction> rawStreamAllValuesOffunc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FUNC, parameters).map(SsaFunction.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc() {
      return rawStreamAllValuesOffunc(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunc() {
      return rawStreamAllValuesOffunc(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunc(final FunctionNode.Match partialMatch) {
      return rawStreamAllValuesOffunc(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOffunc(final SsaNode pNode) {
      return rawStreamAllValuesOffunc(new Object[]{null, pNode});
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final FunctionNode.Match partialMatch) {
      return rawStreamAllValuesOffunc(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for func.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOffunc(final SsaNode pNode) {
      return rawStreamAllValuesOffunc(new Object[]{null, pNode}).collect(Collectors.toSet());
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
    public Stream<SsaNode> streamAllValuesOfnode(final FunctionNode.Match partialMatch) {
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
    public Stream<SsaNode> streamAllValuesOfnode(final SsaFunction pFunc) {
      return rawStreamAllValuesOfnode(new Object[]{pFunc, null});
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final FunctionNode.Match partialMatch) {
      return rawStreamAllValuesOfnode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for node.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfnode(final SsaFunction pFunc) {
      return rawStreamAllValuesOfnode(new Object[]{pFunc, null}).collect(Collectors.toSet());
    }

    @Override
    protected FunctionNode.Match tupleToMatch(final Tuple t) {
      try {
          return FunctionNode.Match.newMatch((SsaFunction) t.get(POSITION_FUNC), (SsaNode) t.get(POSITION_NODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionNode.Match arrayToMatch(final Object[] match) {
      try {
          return FunctionNode.Match.newMatch((SsaFunction) match[POSITION_FUNC], (SsaNode) match[POSITION_NODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FunctionNode.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FunctionNode.Match.newMutableMatch((SsaFunction) match[POSITION_FUNC], (SsaNode) match[POSITION_NODE]);
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
    public static IQuerySpecification<FunctionNode.Matcher> querySpecification() {
      return FunctionNode.instance();
    }
  }

  private FunctionNode() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionNode instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FunctionNode.Matcher instantiate(final ViatraQueryEngine engine) {
    return FunctionNode.Matcher.on(engine);
  }

  @Override
  public FunctionNode.Matcher instantiate() {
    return FunctionNode.Matcher.create();
  }

  @Override
  public FunctionNode.Match newEmptyMatch() {
    return FunctionNode.Match.newEmptyMatch();
  }

  @Override
  public FunctionNode.Match newMatch(final Object... parameters) {
    return FunctionNode.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionNode} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionNode#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionNode INSTANCE = new FunctionNode();

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
    private static final FunctionNode.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_func = new PParameter("func", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_node = new PParameter("node", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_func, parameter_node);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionNode";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("func","node");
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
          PVariable var_func = body.getOrCreateVariableByName("func");
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_childrenBlock = body.getOrCreateVariableByName("childrenBlock");
          PVariable var_blockNode = body.getOrCreateVariableByName("blockNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_func, parameter_func),
             new ExportedParameter(body, var_node, parameter_node)
          ));
          // 	find reachableBlock(func, childrenBlock)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_func, var_childrenBlock), ReachableBlock.instance().getInternalQueryRepresentation());
          // 	SsaBlock.nodes(childrenBlock, blockNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_childrenBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_childrenBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_blockNode);
          // 	find nodeOrInnerNode(blockNode, node)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_blockNode, var_node), NodeOrInnerNode.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
