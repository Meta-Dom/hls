/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationQueriesBase.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         {@literal @}Constraint(targetEditorId = "hu.metadom.hls.ssamodel.presentation.PromodEditorID",
 *         	severity = "error",
 *         	message = "value is not used",
 *         	key = {ssaNode})
 *         pattern valueNotUsed(ssaNode: SsaNode) {
 *         	neg find nodeUseNode(_, ssaNode);
 *         	find produceNode(ssaNode);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ValueNotUsed extends BaseGeneratedEMFQuerySpecification<ValueNotUsed.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.valueNotUsed pattern,
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
    private SsaNode fSsaNode;

    private static List<String> parameterNames = makeImmutableList("ssaNode");

    private Match(final SsaNode pSsaNode) {
      this.fSsaNode = pSsaNode;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ssaNode": return this.fSsaNode;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fSsaNode;
          default: return null;
      }
    }

    public SsaNode getSsaNode() {
      return this.fSsaNode;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ssaNode".equals(parameterName) ) {
          this.fSsaNode = (SsaNode) newValue;
          return true;
      }
      return false;
    }

    public void setSsaNode(final SsaNode pSsaNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSsaNode = pSsaNode;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.valueNotUsed";
    }

    @Override
    public List<String> parameterNames() {
      return ValueNotUsed.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fSsaNode};
    }

    @Override
    public ValueNotUsed.Match toImmutable() {
      return isMutable() ? newMatch(fSsaNode) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ssaNode\"=" + prettyPrintValue(fSsaNode));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fSsaNode);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ValueNotUsed.Match)) {
          ValueNotUsed.Match other = (ValueNotUsed.Match) obj;
          return Objects.equals(fSsaNode, other.fSsaNode);
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
    public ValueNotUsed specification() {
      return ValueNotUsed.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ValueNotUsed.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ValueNotUsed.Match newMutableMatch(final SsaNode pSsaNode) {
      return new Mutable(pSsaNode);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ValueNotUsed.Match newMatch(final SsaNode pSsaNode) {
      return new Immutable(pSsaNode);
    }

    private static final class Mutable extends ValueNotUsed.Match {
      Mutable(final SsaNode pSsaNode) {
        super(pSsaNode);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ValueNotUsed.Match {
      Immutable(final SsaNode pSsaNode) {
        super(pSsaNode);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.valueNotUsed pattern,
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
   * 	message = "value is not used",
   * 	key = {ssaNode})
   * pattern valueNotUsed(ssaNode: SsaNode) {
   * 	neg find nodeUseNode(_, ssaNode);
   * 	find produceNode(ssaNode);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ValueNotUsed
   * 
   */
  public static class Matcher extends BaseMatcher<ValueNotUsed.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ValueNotUsed.Matcher on(final ViatraQueryEngine engine) {
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
    public static ValueNotUsed.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_SSANODE = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ValueNotUsed.Matcher.class);

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
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ValueNotUsed.Match> getAllMatches(final SsaNode pSsaNode) {
      return rawStreamAllMatches(new Object[]{pSsaNode}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ValueNotUsed.Match> streamAllMatches(final SsaNode pSsaNode) {
      return rawStreamAllMatches(new Object[]{pSsaNode});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ValueNotUsed.Match> getOneArbitraryMatch(final SsaNode pSsaNode) {
      return rawGetOneArbitraryMatch(new Object[]{pSsaNode});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaNode pSsaNode) {
      return rawHasMatch(new Object[]{pSsaNode});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaNode pSsaNode) {
      return rawCountMatches(new Object[]{pSsaNode});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaNode pSsaNode, final Consumer<? super ValueNotUsed.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSsaNode}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSsaNode the fixed value of pattern parameter ssaNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ValueNotUsed.Match newMatch(final SsaNode pSsaNode) {
      return ValueNotUsed.Match.newMatch(pSsaNode);
    }

    /**
     * Retrieve the set of values that occur in matches for ssaNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfssaNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SSANODE, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for ssaNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfssaNode() {
      return rawStreamAllValuesOfssaNode(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ssaNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfssaNode() {
      return rawStreamAllValuesOfssaNode(emptyArray());
    }

    @Override
    protected ValueNotUsed.Match tupleToMatch(final Tuple t) {
      try {
          return ValueNotUsed.Match.newMatch((SsaNode) t.get(POSITION_SSANODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ValueNotUsed.Match arrayToMatch(final Object[] match) {
      try {
          return ValueNotUsed.Match.newMatch((SsaNode) match[POSITION_SSANODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ValueNotUsed.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ValueNotUsed.Match.newMutableMatch((SsaNode) match[POSITION_SSANODE]);
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
    public static IQuerySpecification<ValueNotUsed.Matcher> querySpecification() {
      return ValueNotUsed.instance();
    }
  }

  private ValueNotUsed() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ValueNotUsed instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ValueNotUsed.Matcher instantiate(final ViatraQueryEngine engine) {
    return ValueNotUsed.Matcher.on(engine);
  }

  @Override
  public ValueNotUsed.Matcher instantiate() {
    return ValueNotUsed.Matcher.create();
  }

  @Override
  public ValueNotUsed.Match newEmptyMatch() {
    return ValueNotUsed.Match.newEmptyMatch();
  }

  @Override
  public ValueNotUsed.Match newMatch(final Object... parameters) {
    return ValueNotUsed.Match.newMatch((hu.metadom.hls.ssamodel.SsaNode) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ValueNotUsed} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ValueNotUsed#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ValueNotUsed INSTANCE = new ValueNotUsed();

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
    private static final ValueNotUsed.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_ssaNode = new PParameter("ssaNode", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_ssaNode);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.valueNotUsed";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ssaNode");
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
          PVariable var_ssaNode = body.getOrCreateVariableByName("ssaNode");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ssaNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ssaNode, parameter_ssaNode)
          ));
          // 	neg find nodeUseNode(_, ssaNode)
          new NegativePatternCall(body, Tuples.flatTupleOf(var___0_, var_ssaNode), NodeUseNode.instance().getInternalQueryRepresentation());
          // 	find produceNode(ssaNode)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_ssaNode), ProduceNode.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("targetEditorId", "hu.metadom.hls.ssamodel.presentation.PromodEditorID");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "value is not used");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("ssaNode")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
