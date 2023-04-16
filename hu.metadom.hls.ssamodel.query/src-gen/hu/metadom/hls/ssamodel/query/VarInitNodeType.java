/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesIntegrity.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.query.internal.InitOrInitListOrParam;
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
 *         {@literal @}Constraint(targetEditorId = "hu.metadom.hls.ssamodel.presentation.PromodEditorID",
 *         	severity = "error",
 *         	message = "initNode of a variable is not SsaInit, SsaInitList or SsaParam",
 *         	key = {v, initNode})
 *         pattern varInitNodeType(v: SsaVar, initNode: SsaNode) {
 *         	SsaVar.initNode(v, initNode);
 *         	neg find initOrInitListOrParam(initNode);	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class VarInitNodeType extends BaseGeneratedEMFQuerySpecification<VarInitNodeType.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.varInitNodeType pattern,
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
    private SsaVar fV;

    private SsaNode fInitNode;

    private static List<String> parameterNames = makeImmutableList("v", "initNode");

    private Match(final SsaVar pV, final SsaNode pInitNode) {
      this.fV = pV;
      this.fInitNode = pInitNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "v": return this.fV;
          case "initNode": return this.fInitNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fV;
          case 1: return this.fInitNode;
          default: return null;
      }
    }

    public SsaVar getV() {
      return this.fV;
    }

    public SsaNode getInitNode() {
      return this.fInitNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("v".equals(parameterName) ) {
          this.fV = (SsaVar) newValue;
          return true;
      }
      if ("initNode".equals(parameterName) ) {
          this.fInitNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setV(final SsaVar pV) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fV = pV;
    }

    public void setInitNode(final SsaNode pInitNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitNode = pInitNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.varInitNodeType";
    }

    @Override
    public List<String> parameterNames() {
      return VarInitNodeType.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fV, fInitNode};
    }

    @Override
    public VarInitNodeType.Match toImmutable() {
      return isMutable() ? newMatch(fV, fInitNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"v\"=" + prettyPrintValue(fV) + ", ");
      result.append("\"initNode\"=" + prettyPrintValue(fInitNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fV, fInitNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof VarInitNodeType.Match)) {
          VarInitNodeType.Match other = (VarInitNodeType.Match) obj;
          return Objects.equals(fV, other.fV) && Objects.equals(fInitNode, other.fInitNode);
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
    public VarInitNodeType specification() {
      return VarInitNodeType.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static VarInitNodeType.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static VarInitNodeType.Match newMutableMatch(final SsaVar pV, final SsaNode pInitNode) {
      return new Mutable(pV, pInitNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static VarInitNodeType.Match newMatch(final SsaVar pV, final SsaNode pInitNode) {
      return new Immutable(pV, pInitNode);
    }

    private static final class Mutable extends VarInitNodeType.Match {
      Mutable(final SsaVar pV, final SsaNode pInitNode) {
        super(pV, pInitNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends VarInitNodeType.Match {
      Immutable(final SsaVar pV, final SsaNode pInitNode) {
        super(pV, pInitNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.varInitNodeType pattern,
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
   * 	message = "initNode of a variable is not SsaInit, SsaInitList or SsaParam",
   * 	key = {v, initNode})
   * pattern varInitNodeType(v: SsaVar, initNode: SsaNode) {
   * 	SsaVar.initNode(v, initNode);
   * 	neg find initOrInitListOrParam(initNode);	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see VarInitNodeType
   * 
   */
  public static class Matcher extends BaseMatcher<VarInitNodeType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static VarInitNodeType.Matcher on(final ViatraQueryEngine engine) {
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
    public static VarInitNodeType.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_V = 0;

    private static final int POSITION_INITNODE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(VarInitNodeType.Matcher.class);

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
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<VarInitNodeType.Match> getAllMatches(final SsaVar pV, final SsaNode pInitNode) {
      return rawStreamAllMatches(new Object[]{pV, pInitNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<VarInitNodeType.Match> streamAllMatches(final SsaVar pV, final SsaNode pInitNode) {
      return rawStreamAllMatches(new Object[]{pV, pInitNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<VarInitNodeType.Match> getOneArbitraryMatch(final SsaVar pV, final SsaNode pInitNode) {
      return rawGetOneArbitraryMatch(new Object[]{pV, pInitNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaVar pV, final SsaNode pInitNode) {
      return rawHasMatch(new Object[]{pV, pInitNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaVar pV, final SsaNode pInitNode) {
      return rawCountMatches(new Object[]{pV, pInitNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaVar pV, final SsaNode pInitNode, final Consumer<? super VarInitNodeType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pV, pInitNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param pInitNode the fixed value of pattern parameter initNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public VarInitNodeType.Match newMatch(final SsaVar pV, final SsaNode pInitNode) {
      return VarInitNodeType.Match.newMatch(pV, pInitNode);
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaVar> rawStreamAllValuesOfv(final Object[] parameters) {
      return rawStreamAllValues(POSITION_V, parameters).map(SsaVar.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfv(final VarInitNodeType.Match partialMatch) {
      return rawStreamAllValuesOfv(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfv(final SsaNode pInitNode) {
      return rawStreamAllValuesOfv(new Object[]{null, pInitNode});
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfv(final VarInitNodeType.Match partialMatch) {
      return rawStreamAllValuesOfv(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfv(final SsaNode pInitNode) {
      return rawStreamAllValuesOfv(new Object[]{null, pInitNode}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfinitNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INITNODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfinitNode() {
      return rawStreamAllValuesOfinitNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfinitNode() {
      return rawStreamAllValuesOfinitNode(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfinitNode(final VarInitNodeType.Match partialMatch) {
      return rawStreamAllValuesOfinitNode(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfinitNode(final SsaVar pV) {
      return rawStreamAllValuesOfinitNode(new Object[]{pV, null});
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfinitNode(final VarInitNodeType.Match partialMatch) {
      return rawStreamAllValuesOfinitNode(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for initNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfinitNode(final SsaVar pV) {
      return rawStreamAllValuesOfinitNode(new Object[]{pV, null}).collect(Collectors.toSet());
    }

    @Override
    protected VarInitNodeType.Match tupleToMatch(final Tuple t) {
      try {
          return VarInitNodeType.Match.newMatch((SsaVar) t.get(POSITION_V), (SsaNode) t.get(POSITION_INITNODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected VarInitNodeType.Match arrayToMatch(final Object[] match) {
      try {
          return VarInitNodeType.Match.newMatch((SsaVar) match[POSITION_V], (SsaNode) match[POSITION_INITNODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected VarInitNodeType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return VarInitNodeType.Match.newMutableMatch((SsaVar) match[POSITION_V], (SsaNode) match[POSITION_INITNODE]);
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
    public static IQuerySpecification<VarInitNodeType.Matcher> querySpecification() {
      return VarInitNodeType.instance();
    }
  }

  private VarInitNodeType() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VarInitNodeType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected VarInitNodeType.Matcher instantiate(final ViatraQueryEngine engine) {
    return VarInitNodeType.Matcher.on(engine);
  }

  @Override
  public VarInitNodeType.Matcher instantiate() {
    return VarInitNodeType.Matcher.create();
  }

  @Override
  public VarInitNodeType.Match newEmptyMatch() {
    return VarInitNodeType.Match.newEmptyMatch();
  }

  @Override
  public VarInitNodeType.Match newMatch(final Object... parameters) {
    return VarInitNodeType.Match.newMatch((hu.metadom.hls.ssamodel.SsaVar) parameters[0], (hu.metadom.hls.ssamodel.SsaNode) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link VarInitNodeType} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VarInitNodeType#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VarInitNodeType INSTANCE = new VarInitNodeType();

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
    private static final VarInitNodeType.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_v = new PParameter("v", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final PParameter parameter_initNode = new PParameter("initNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_v, parameter_initNode);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.varInitNodeType";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("v","initNode");
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
          PVariable var_v = body.getOrCreateVariableByName("v");
          PVariable var_initNode = body.getOrCreateVariableByName("initNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_v, parameter_v),
             new ExportedParameter(body, var_initNode, parameter_initNode)
          ));
          // 	SsaVar.initNode(v, initNode)
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_v, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaVar", "initNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_initNode);
          // 	neg find initOrInitListOrParam(initNode)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_initNode), InitOrInitListOrParam.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("targetEditorId", "hu.metadom.hls.ssamodel.presentation.PromodEditorID");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "initNode of a variable is not SsaInit, SsaInitList or SsaParam");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("v"), 
                              new ParameterReference("initNode")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
