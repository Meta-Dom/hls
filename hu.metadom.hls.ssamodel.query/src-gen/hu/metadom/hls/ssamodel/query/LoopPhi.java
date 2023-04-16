/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaPhi;
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
 *         pattern loopPhi(phi: SsaPhi) {
 *         	SsaDowhile.merge(_,merge);
 *         	SsaBlock.nodes(merge,phi);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class LoopPhi extends BaseGeneratedEMFQuerySpecification<LoopPhi.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.loopPhi pattern,
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
    private SsaPhi fPhi;

    private static List<String> parameterNames = makeImmutableList("phi");

    private Match(final SsaPhi pPhi) {
      this.fPhi = pPhi;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "phi": return this.fPhi;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPhi;
          default: return null;
      }
    }

    public SsaPhi getPhi() {
      return this.fPhi;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("phi".equals(parameterName) ) {
          this.fPhi = (SsaPhi) newValue;
          return true;
      }
      return false;
    }

    public void setPhi(final SsaPhi pPhi) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPhi = pPhi;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.loopPhi";
    }

    @Override
    public List<String> parameterNames() {
      return LoopPhi.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fPhi};
    }

    @Override
    public LoopPhi.Match toImmutable() {
      return isMutable() ? newMatch(fPhi) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"phi\"=" + prettyPrintValue(fPhi));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fPhi);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof LoopPhi.Match)) {
          LoopPhi.Match other = (LoopPhi.Match) obj;
          return Objects.equals(fPhi, other.fPhi);
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
    public LoopPhi specification() {
      return LoopPhi.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static LoopPhi.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static LoopPhi.Match newMutableMatch(final SsaPhi pPhi) {
      return new Mutable(pPhi);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static LoopPhi.Match newMatch(final SsaPhi pPhi) {
      return new Immutable(pPhi);
    }

    private static final class Mutable extends LoopPhi.Match {
      Mutable(final SsaPhi pPhi) {
        super(pPhi);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends LoopPhi.Match {
      Immutable(final SsaPhi pPhi) {
        super(pPhi);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.loopPhi pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern loopPhi(phi: SsaPhi) {
   * 	SsaDowhile.merge(_,merge);
   * 	SsaBlock.nodes(merge,phi);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see LoopPhi
   * 
   */
  public static class Matcher extends BaseMatcher<LoopPhi.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static LoopPhi.Matcher on(final ViatraQueryEngine engine) {
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
    public static LoopPhi.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_PHI = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(LoopPhi.Matcher.class);

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
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<LoopPhi.Match> getAllMatches(final SsaPhi pPhi) {
      return rawStreamAllMatches(new Object[]{pPhi}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<LoopPhi.Match> streamAllMatches(final SsaPhi pPhi) {
      return rawStreamAllMatches(new Object[]{pPhi});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<LoopPhi.Match> getOneArbitraryMatch(final SsaPhi pPhi) {
      return rawGetOneArbitraryMatch(new Object[]{pPhi});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaPhi pPhi) {
      return rawHasMatch(new Object[]{pPhi});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaPhi pPhi) {
      return rawCountMatches(new Object[]{pPhi});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaPhi pPhi, final Consumer<? super LoopPhi.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPhi}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPhi the fixed value of pattern parameter phi, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public LoopPhi.Match newMatch(final SsaPhi pPhi) {
      return LoopPhi.Match.newMatch(pPhi);
    }

    /**
     * Retrieve the set of values that occur in matches for phi.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaPhi> rawStreamAllValuesOfphi(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PHI, parameters).map(SsaPhi.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for phi.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaPhi> getAllValuesOfphi() {
      return rawStreamAllValuesOfphi(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for phi.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaPhi> streamAllValuesOfphi() {
      return rawStreamAllValuesOfphi(emptyArray());
    }

    @Override
    protected LoopPhi.Match tupleToMatch(final Tuple t) {
      try {
          return LoopPhi.Match.newMatch((SsaPhi) t.get(POSITION_PHI));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected LoopPhi.Match arrayToMatch(final Object[] match) {
      try {
          return LoopPhi.Match.newMatch((SsaPhi) match[POSITION_PHI]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected LoopPhi.Match arrayToMatchMutable(final Object[] match) {
      try {
          return LoopPhi.Match.newMutableMatch((SsaPhi) match[POSITION_PHI]);
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
    public static IQuerySpecification<LoopPhi.Matcher> querySpecification() {
      return LoopPhi.instance();
    }
  }

  private LoopPhi() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static LoopPhi instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected LoopPhi.Matcher instantiate(final ViatraQueryEngine engine) {
    return LoopPhi.Matcher.on(engine);
  }

  @Override
  public LoopPhi.Matcher instantiate() {
    return LoopPhi.Matcher.create();
  }

  @Override
  public LoopPhi.Match newEmptyMatch() {
    return LoopPhi.Match.newEmptyMatch();
  }

  @Override
  public LoopPhi.Match newMatch(final Object... parameters) {
    return LoopPhi.Match.newMatch((hu.metadom.hls.ssamodel.SsaPhi) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link LoopPhi} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link LoopPhi#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final LoopPhi INSTANCE = new LoopPhi();

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
    private static final LoopPhi.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_phi = new PParameter("phi", "hu.metadom.hls.ssamodel.SsaPhi", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaPhi")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_phi);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.loopPhi";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("phi");
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
          PVariable var_phi = body.getOrCreateVariableByName("phi");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_merge = body.getOrCreateVariableByName("merge");
          new TypeConstraint(body, Tuples.flatTupleOf(var_phi), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPhi")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_phi, parameter_phi)
          ));
          // 	SsaDowhile.merge(_,merge)
          new TypeConstraint(body, Tuples.flatTupleOf(var___0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var___0_, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile", "merge")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_merge);
          // 	SsaBlock.nodes(merge,phi)
          new TypeConstraint(body, Tuples.flatTupleOf(var_merge), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_merge, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_1_, var_phi);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
