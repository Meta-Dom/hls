/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationHelperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.Type;
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
 *         pattern bothPrimitive(t1: Type, t2: Type){
 *         	PrimitiveType(t1);
 *         	PrimitiveType(t2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BothPrimitive extends BaseGeneratedEMFQuerySpecification<BothPrimitive.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.bothPrimitive pattern,
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
    private Type fT1;

    private Type fT2;

    private static List<String> parameterNames = makeImmutableList("t1", "t2");

    private Match(final Type pT1, final Type pT2) {
      this.fT1 = pT1;
      this.fT2 = pT2;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "t1": return this.fT1;
          case "t2": return this.fT2;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fT1;
          case 1: return this.fT2;
          default: return null;
      }
    }

    public Type getT1() {
      return this.fT1;
    }

    public Type getT2() {
      return this.fT2;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("t1".equals(parameterName) ) {
          this.fT1 = (Type) newValue;
          return true;
      }
      if ("t2".equals(parameterName) ) {
          this.fT2 = (Type) newValue;
          return true;
      }
      return false;
    }

    public void setT1(final Type pT1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT1 = pT1;
    }

    public void setT2(final Type pT2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT2 = pT2;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.bothPrimitive";
    }

    @Override
    public List<String> parameterNames() {
      return BothPrimitive.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fT1, fT2};
    }

    @Override
    public BothPrimitive.Match toImmutable() {
      return isMutable() ? newMatch(fT1, fT2) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t1\"=" + prettyPrintValue(fT1) + ", ");
      result.append("\"t2\"=" + prettyPrintValue(fT2));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fT1, fT2);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BothPrimitive.Match)) {
          BothPrimitive.Match other = (BothPrimitive.Match) obj;
          return Objects.equals(fT1, other.fT1) && Objects.equals(fT2, other.fT2);
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
    public BothPrimitive specification() {
      return BothPrimitive.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BothPrimitive.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BothPrimitive.Match newMutableMatch(final Type pT1, final Type pT2) {
      return new Mutable(pT1, pT2);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BothPrimitive.Match newMatch(final Type pT1, final Type pT2) {
      return new Immutable(pT1, pT2);
    }

    private static final class Mutable extends BothPrimitive.Match {
      Mutable(final Type pT1, final Type pT2) {
        super(pT1, pT2);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends BothPrimitive.Match {
      Immutable(final Type pT1, final Type pT2) {
        super(pT1, pT2);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.bothPrimitive pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern bothPrimitive(t1: Type, t2: Type){
   * 	PrimitiveType(t1);
   * 	PrimitiveType(t2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BothPrimitive
   * 
   */
  public static class Matcher extends BaseMatcher<BothPrimitive.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BothPrimitive.Matcher on(final ViatraQueryEngine engine) {
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
    public static BothPrimitive.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_T1 = 0;

    private static final int POSITION_T2 = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BothPrimitive.Matcher.class);

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
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BothPrimitive.Match> getAllMatches(final Type pT1, final Type pT2) {
      return rawStreamAllMatches(new Object[]{pT1, pT2}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BothPrimitive.Match> streamAllMatches(final Type pT1, final Type pT2) {
      return rawStreamAllMatches(new Object[]{pT1, pT2});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BothPrimitive.Match> getOneArbitraryMatch(final Type pT1, final Type pT2) {
      return rawGetOneArbitraryMatch(new Object[]{pT1, pT2});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Type pT1, final Type pT2) {
      return rawHasMatch(new Object[]{pT1, pT2});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Type pT1, final Type pT2) {
      return rawCountMatches(new Object[]{pT1, pT2});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Type pT1, final Type pT2, final Consumer<? super BothPrimitive.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT1, pT2}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BothPrimitive.Match newMatch(final Type pT1, final Type pT2) {
      return BothPrimitive.Match.newMatch(pT1, pT2);
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOft1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T1, parameters).map(Type.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft1() {
      return rawStreamAllValuesOft1(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft1() {
      return rawStreamAllValuesOft1(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft1(final BothPrimitive.Match partialMatch) {
      return rawStreamAllValuesOft1(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft1(final Type pT2) {
      return rawStreamAllValuesOft1(new Object[]{null, pT2});
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft1(final BothPrimitive.Match partialMatch) {
      return rawStreamAllValuesOft1(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft1(final Type pT2) {
      return rawStreamAllValuesOft1(new Object[]{null, pT2}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOft2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T2, parameters).map(Type.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft2() {
      return rawStreamAllValuesOft2(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft2() {
      return rawStreamAllValuesOft2(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft2(final BothPrimitive.Match partialMatch) {
      return rawStreamAllValuesOft2(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft2(final Type pT1) {
      return rawStreamAllValuesOft2(new Object[]{pT1, null});
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft2(final BothPrimitive.Match partialMatch) {
      return rawStreamAllValuesOft2(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft2(final Type pT1) {
      return rawStreamAllValuesOft2(new Object[]{pT1, null}).collect(Collectors.toSet());
    }

    @Override
    protected BothPrimitive.Match tupleToMatch(final Tuple t) {
      try {
          return BothPrimitive.Match.newMatch((Type) t.get(POSITION_T1), (Type) t.get(POSITION_T2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BothPrimitive.Match arrayToMatch(final Object[] match) {
      try {
          return BothPrimitive.Match.newMatch((Type) match[POSITION_T1], (Type) match[POSITION_T2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected BothPrimitive.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BothPrimitive.Match.newMutableMatch((Type) match[POSITION_T1], (Type) match[POSITION_T2]);
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
    public static IQuerySpecification<BothPrimitive.Matcher> querySpecification() {
      return BothPrimitive.instance();
    }
  }

  private BothPrimitive() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BothPrimitive instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected BothPrimitive.Matcher instantiate(final ViatraQueryEngine engine) {
    return BothPrimitive.Matcher.on(engine);
  }

  @Override
  public BothPrimitive.Matcher instantiate() {
    return BothPrimitive.Matcher.create();
  }

  @Override
  public BothPrimitive.Match newEmptyMatch() {
    return BothPrimitive.Match.newEmptyMatch();
  }

  @Override
  public BothPrimitive.Match newMatch(final Object... parameters) {
    return BothPrimitive.Match.newMatch((hu.metadom.hls.ssamodel.Type) parameters[0], (hu.metadom.hls.ssamodel.Type) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link BothPrimitive} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link BothPrimitive#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BothPrimitive INSTANCE = new BothPrimitive();

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
    private static final BothPrimitive.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_t1 = new PParameter("t1", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final PParameter parameter_t2 = new PParameter("t2", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_t1, parameter_t2);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.bothPrimitive";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t1","t2");
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
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2)
          ));
          // 	PrimitiveType(t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          // 	PrimitiveType(t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
