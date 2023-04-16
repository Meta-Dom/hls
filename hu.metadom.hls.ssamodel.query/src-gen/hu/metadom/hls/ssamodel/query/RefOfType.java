/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationHelperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.ReferenceType;
import hu.metadom.hls.ssamodel.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
 *         pattern refOfType(t: Type, ref: ReferenceType){
 *         	neg ArrayType(ref);
 *         	neg PointerType(ref);
 *         	ReferenceType.referencedType(ref, t);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RefOfType extends BaseGeneratedEMFQuerySpecification<RefOfType.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.refOfType pattern,
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
    private Type fT;

    private ReferenceType fRef;

    private static List<String> parameterNames = makeImmutableList("t", "ref");

    private Match(final Type pT, final ReferenceType pRef) {
      this.fT = pT;
      this.fRef = pRef;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "t": return this.fT;
          case "ref": return this.fRef;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fT;
          case 1: return this.fRef;
          default: return null;
      }
    }

    public Type getT() {
      return this.fT;
    }

    public ReferenceType getRef() {
      return this.fRef;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("t".equals(parameterName) ) {
          this.fT = (Type) newValue;
          return true;
      }
      if ("ref".equals(parameterName) ) {
          this.fRef = (ReferenceType) newValue;
          return true;
      }
      return false;
    }

    public void setT(final Type pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }

    public void setRef(final ReferenceType pRef) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRef = pRef;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.refOfType";
    }

    @Override
    public List<String> parameterNames() {
      return RefOfType.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fT, fRef};
    }

    @Override
    public RefOfType.Match toImmutable() {
      return isMutable() ? newMatch(fT, fRef) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
      result.append("\"ref\"=" + prettyPrintValue(fRef));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fT, fRef);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RefOfType.Match)) {
          RefOfType.Match other = (RefOfType.Match) obj;
          return Objects.equals(fT, other.fT) && Objects.equals(fRef, other.fRef);
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
    public RefOfType specification() {
      return RefOfType.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RefOfType.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RefOfType.Match newMutableMatch(final Type pT, final ReferenceType pRef) {
      return new Mutable(pT, pRef);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RefOfType.Match newMatch(final Type pT, final ReferenceType pRef) {
      return new Immutable(pT, pRef);
    }

    private static final class Mutable extends RefOfType.Match {
      Mutable(final Type pT, final ReferenceType pRef) {
        super(pT, pRef);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends RefOfType.Match {
      Immutable(final Type pT, final ReferenceType pRef) {
        super(pT, pRef);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.refOfType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern refOfType(t: Type, ref: ReferenceType){
   * 	neg ArrayType(ref);
   * 	neg PointerType(ref);
   * 	ReferenceType.referencedType(ref, t);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RefOfType
   * 
   */
  public static class Matcher extends BaseMatcher<RefOfType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RefOfType.Matcher on(final ViatraQueryEngine engine) {
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
    public static RefOfType.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_T = 0;

    private static final int POSITION_REF = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RefOfType.Matcher.class);

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
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RefOfType.Match> getAllMatches(final Type pT, final ReferenceType pRef) {
      return rawStreamAllMatches(new Object[]{pT, pRef}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RefOfType.Match> streamAllMatches(final Type pT, final ReferenceType pRef) {
      return rawStreamAllMatches(new Object[]{pT, pRef});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RefOfType.Match> getOneArbitraryMatch(final Type pT, final ReferenceType pRef) {
      return rawGetOneArbitraryMatch(new Object[]{pT, pRef});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Type pT, final ReferenceType pRef) {
      return rawHasMatch(new Object[]{pT, pRef});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Type pT, final ReferenceType pRef) {
      return rawCountMatches(new Object[]{pT, pRef});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Type pT, final ReferenceType pRef, final Consumer<? super RefOfType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT, pRef}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pRef the fixed value of pattern parameter ref, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RefOfType.Match newMatch(final Type pT, final ReferenceType pRef) {
      return RefOfType.Match.newMatch(pT, pRef);
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOft(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Type.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft(final RefOfType.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOft(final ReferenceType pRef) {
      return rawStreamAllValuesOft(new Object[]{null, pRef});
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft(final RefOfType.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft(final ReferenceType pRef) {
      return rawStreamAllValuesOft(new Object[]{null, pRef}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ReferenceType> rawStreamAllValuesOfref(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REF, parameters).map(ReferenceType.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ReferenceType> getAllValuesOfref() {
      return rawStreamAllValuesOfref(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ReferenceType> streamAllValuesOfref() {
      return rawStreamAllValuesOfref(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ReferenceType> streamAllValuesOfref(final RefOfType.Match partialMatch) {
      return rawStreamAllValuesOfref(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ReferenceType> streamAllValuesOfref(final Type pT) {
      return rawStreamAllValuesOfref(new Object[]{pT, null});
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ReferenceType> getAllValuesOfref(final RefOfType.Match partialMatch) {
      return rawStreamAllValuesOfref(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for ref.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ReferenceType> getAllValuesOfref(final Type pT) {
      return rawStreamAllValuesOfref(new Object[]{pT, null}).collect(Collectors.toSet());
    }

    @Override
    protected RefOfType.Match tupleToMatch(final Tuple t) {
      try {
          return RefOfType.Match.newMatch((Type) t.get(POSITION_T), (ReferenceType) t.get(POSITION_REF));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected RefOfType.Match arrayToMatch(final Object[] match) {
      try {
          return RefOfType.Match.newMatch((Type) match[POSITION_T], (ReferenceType) match[POSITION_REF]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected RefOfType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RefOfType.Match.newMutableMatch((Type) match[POSITION_T], (ReferenceType) match[POSITION_REF]);
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
    public static IQuerySpecification<RefOfType.Matcher> querySpecification() {
      return RefOfType.instance();
    }
  }

  private RefOfType() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RefOfType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected RefOfType.Matcher instantiate(final ViatraQueryEngine engine) {
    return RefOfType.Matcher.on(engine);
  }

  @Override
  public RefOfType.Matcher instantiate() {
    return RefOfType.Matcher.create();
  }

  @Override
  public RefOfType.Match newEmptyMatch() {
    return RefOfType.Match.newEmptyMatch();
  }

  @Override
  public RefOfType.Match newMatch(final Object... parameters) {
    return RefOfType.Match.newMatch((hu.metadom.hls.ssamodel.Type) parameters[0], (hu.metadom.hls.ssamodel.ReferenceType) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link RefOfType} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RefOfType#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RefOfType INSTANCE = new RefOfType();

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
    private static final RefOfType.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_t = new PParameter("t", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final PParameter parameter_ref = new PParameter("ref", "hu.metadom.hls.ssamodel.ReferenceType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "ReferenceType")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_t, parameter_ref);

    private class Embedded_1_ArrayType extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "hu.metadom.hls.ssamodel.ArrayType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "ArrayType")), PParameterDirection.INOUT);

      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0);

      public Embedded_1_ArrayType() {
        super(PVisibility.EMBEDDED);
      }

      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_2_ArrayType";
      }

      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }

      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0)
        ));
        //  ArrayType(ref)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "ArrayType")));
        return Collections.singleton(body);
      }
    }

    private class Embedded_2_PointerType extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "hu.metadom.hls.ssamodel.PointerType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "PointerType")), PParameterDirection.INOUT);

      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0);

      public Embedded_2_PointerType() {
        super(PVisibility.EMBEDDED);
      }

      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_2_PointerType";
      }

      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }

      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0)
        ));
        //  PointerType(ref)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PointerType")));
        return Collections.singleton(body);
      }
    }

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.refOfType";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t","ref");
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
          PVariable var_t = body.getOrCreateVariableByName("t");
          PVariable var_ref = body.getOrCreateVariableByName("ref");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_ref), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "ReferenceType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t, parameter_t),
             new ExportedParameter(body, var_ref, parameter_ref)
          ));
          // 	neg ArrayType(ref)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_ref), new RefOfType.GeneratedPQuery.Embedded_1_ArrayType());
          // 	neg PointerType(ref)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_ref), new RefOfType.GeneratedPQuery.Embedded_2_PointerType());
          // 	ReferenceType.referencedType(ref, t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ref), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "ReferenceType")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ref, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "ReferenceType", "referencedType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_0_, var_t);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
