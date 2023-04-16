/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationHelperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.PrimitiveType;
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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         pattern essentialTypesVoidBool(pt: PrimitiveType, i: java Integer){
 *         	PrimitiveType.name(pt, name);
 *         	i == eval(
 *         		switch(name) {
 *         			case "void": 1
 *         			case "bool": 1
 *         			case "char": 0
 *         			case "uchar": 0
 *         			case "short": 0
 *         			case "ushort": 0
 *         			case "int": 0
 *         			case "uint": 0
 *         			case "long": 0
 *         			case "ulong": 0
 *         			case "longlong": 0
 *         			case "ulonglong": 0
 *         			case "float": 0
 *         			case "double": 0
 *         			case "longdouble": 0
 *         		}
 *         	);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EssentialTypesVoidBool extends BaseGeneratedEMFQuerySpecification<EssentialTypesVoidBool.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.essentialTypesVoidBool pattern,
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
    private PrimitiveType fPt;

    private Integer fI;

    private static List<String> parameterNames = makeImmutableList("pt", "i");

    private Match(final PrimitiveType pPt, final Integer pI) {
      this.fPt = pPt;
      this.fI = pI;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "pt": return this.fPt;
          case "i": return this.fI;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPt;
          case 1: return this.fI;
          default: return null;
      }
    }

    public PrimitiveType getPt() {
      return this.fPt;
    }

    public Integer getI() {
      return this.fI;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("pt".equals(parameterName) ) {
          this.fPt = (PrimitiveType) newValue;
          return true;
      }
      if ("i".equals(parameterName) ) {
          this.fI = (Integer) newValue;
          return true;
      }
      return false;
    }

    public void setPt(final PrimitiveType pPt) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPt = pPt;
    }

    public void setI(final Integer pI) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fI = pI;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.essentialTypesVoidBool";
    }

    @Override
    public List<String> parameterNames() {
      return EssentialTypesVoidBool.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fPt, fI};
    }

    @Override
    public EssentialTypesVoidBool.Match toImmutable() {
      return isMutable() ? newMatch(fPt, fI) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"pt\"=" + prettyPrintValue(fPt) + ", ");
      result.append("\"i\"=" + prettyPrintValue(fI));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fPt, fI);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EssentialTypesVoidBool.Match)) {
          EssentialTypesVoidBool.Match other = (EssentialTypesVoidBool.Match) obj;
          return Objects.equals(fPt, other.fPt) && Objects.equals(fI, other.fI);
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
    public EssentialTypesVoidBool specification() {
      return EssentialTypesVoidBool.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EssentialTypesVoidBool.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EssentialTypesVoidBool.Match newMutableMatch(final PrimitiveType pPt, final Integer pI) {
      return new Mutable(pPt, pI);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EssentialTypesVoidBool.Match newMatch(final PrimitiveType pPt, final Integer pI) {
      return new Immutable(pPt, pI);
    }

    private static final class Mutable extends EssentialTypesVoidBool.Match {
      Mutable(final PrimitiveType pPt, final Integer pI) {
        super(pPt, pI);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends EssentialTypesVoidBool.Match {
      Immutable(final PrimitiveType pPt, final Integer pI) {
        super(pPt, pI);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.essentialTypesVoidBool pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern essentialTypesVoidBool(pt: PrimitiveType, i: java Integer){
   * 	PrimitiveType.name(pt, name);
   * 	i == eval(
   * 		switch(name) {
   * 			case "void": 1
   * 			case "bool": 1
   * 			case "char": 0
   * 			case "uchar": 0
   * 			case "short": 0
   * 			case "ushort": 0
   * 			case "int": 0
   * 			case "uint": 0
   * 			case "long": 0
   * 			case "ulong": 0
   * 			case "longlong": 0
   * 			case "ulonglong": 0
   * 			case "float": 0
   * 			case "double": 0
   * 			case "longdouble": 0
   * 		}
   * 	);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EssentialTypesVoidBool
   * 
   */
  public static class Matcher extends BaseMatcher<EssentialTypesVoidBool.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EssentialTypesVoidBool.Matcher on(final ViatraQueryEngine engine) {
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
    public static EssentialTypesVoidBool.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_PT = 0;

    private static final int POSITION_I = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EssentialTypesVoidBool.Matcher.class);

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
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EssentialTypesVoidBool.Match> getAllMatches(final PrimitiveType pPt, final Integer pI) {
      return rawStreamAllMatches(new Object[]{pPt, pI}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EssentialTypesVoidBool.Match> streamAllMatches(final PrimitiveType pPt, final Integer pI) {
      return rawStreamAllMatches(new Object[]{pPt, pI});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EssentialTypesVoidBool.Match> getOneArbitraryMatch(final PrimitiveType pPt, final Integer pI) {
      return rawGetOneArbitraryMatch(new Object[]{pPt, pI});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final PrimitiveType pPt, final Integer pI) {
      return rawHasMatch(new Object[]{pPt, pI});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final PrimitiveType pPt, final Integer pI) {
      return rawCountMatches(new Object[]{pPt, pI});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final PrimitiveType pPt, final Integer pI, final Consumer<? super EssentialTypesVoidBool.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPt, pI}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EssentialTypesVoidBool.Match newMatch(final PrimitiveType pPt, final Integer pI) {
      return EssentialTypesVoidBool.Match.newMatch(pPt, pI);
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PrimitiveType> rawStreamAllValuesOfpt(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PT, parameters).map(PrimitiveType.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PrimitiveType> getAllValuesOfpt() {
      return rawStreamAllValuesOfpt(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PrimitiveType> streamAllValuesOfpt() {
      return rawStreamAllValuesOfpt(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PrimitiveType> streamAllValuesOfpt(final EssentialTypesVoidBool.Match partialMatch) {
      return rawStreamAllValuesOfpt(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PrimitiveType> streamAllValuesOfpt(final Integer pI) {
      return rawStreamAllValuesOfpt(new Object[]{null, pI});
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PrimitiveType> getAllValuesOfpt(final EssentialTypesVoidBool.Match partialMatch) {
      return rawStreamAllValuesOfpt(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PrimitiveType> getAllValuesOfpt(final Integer pI) {
      return rawStreamAllValuesOfpt(new Object[]{null, pI}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOfi(final Object[] parameters) {
      return rawStreamAllValues(POSITION_I, parameters).map(Integer.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfi() {
      return rawStreamAllValuesOfi(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfi() {
      return rawStreamAllValuesOfi(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfi(final EssentialTypesVoidBool.Match partialMatch) {
      return rawStreamAllValuesOfi(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfi(final PrimitiveType pPt) {
      return rawStreamAllValuesOfi(new Object[]{pPt, null});
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfi(final EssentialTypesVoidBool.Match partialMatch) {
      return rawStreamAllValuesOfi(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfi(final PrimitiveType pPt) {
      return rawStreamAllValuesOfi(new Object[]{pPt, null}).collect(Collectors.toSet());
    }

    @Override
    protected EssentialTypesVoidBool.Match tupleToMatch(final Tuple t) {
      try {
          return EssentialTypesVoidBool.Match.newMatch((PrimitiveType) t.get(POSITION_PT), (Integer) t.get(POSITION_I));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EssentialTypesVoidBool.Match arrayToMatch(final Object[] match) {
      try {
          return EssentialTypesVoidBool.Match.newMatch((PrimitiveType) match[POSITION_PT], (Integer) match[POSITION_I]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EssentialTypesVoidBool.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EssentialTypesVoidBool.Match.newMutableMatch((PrimitiveType) match[POSITION_PT], (Integer) match[POSITION_I]);
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
    public static IQuerySpecification<EssentialTypesVoidBool.Matcher> querySpecification() {
      return EssentialTypesVoidBool.instance();
    }
  }

  private EssentialTypesVoidBool() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EssentialTypesVoidBool instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected EssentialTypesVoidBool.Matcher instantiate(final ViatraQueryEngine engine) {
    return EssentialTypesVoidBool.Matcher.on(engine);
  }

  @Override
  public EssentialTypesVoidBool.Matcher instantiate() {
    return EssentialTypesVoidBool.Matcher.create();
  }

  @Override
  public EssentialTypesVoidBool.Match newEmptyMatch() {
    return EssentialTypesVoidBool.Match.newEmptyMatch();
  }

  @Override
  public EssentialTypesVoidBool.Match newMatch(final Object... parameters) {
    return EssentialTypesVoidBool.Match.newMatch((hu.metadom.hls.ssamodel.PrimitiveType) parameters[0], (java.lang.Integer) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link EssentialTypesVoidBool} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EssentialTypesVoidBool#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EssentialTypesVoidBool INSTANCE = new EssentialTypesVoidBool();

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
    private static final EssentialTypesVoidBool.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_pt = new PParameter("pt", "hu.metadom.hls.ssamodel.PrimitiveType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "PrimitiveType")), PParameterDirection.INOUT);

    private final PParameter parameter_i = new PParameter("i", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_pt, parameter_i);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.essentialTypesVoidBool";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("pt","i");
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
          PVariable var_pt = body.getOrCreateVariableByName("pt");
          PVariable var_i = body.getOrCreateVariableByName("i");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_i), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_pt, parameter_pt),
             new ExportedParameter(body, var_i, parameter_i)
          ));
          // 	PrimitiveType.name(pt, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pt, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaObject", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_0_, var_name);
          // 	i == eval(		switch(name) {			case "void": 1			case "bool": 1			case "char": 0			case "uchar": 0			case "short": 0			case "ushort": 0			case "int": 0			case "uint": 0			case "long": 0			case "ulong": 0			case "longlong": 0			case "ulonglong": 0			case "float": 0			case "double": 0			case "longdouble": 0		}	)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern essentialTypesVoidBool";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String name = (String) provider.getValue("name");
                  return evaluateExpression_1_1(name);
              }
          },  var__virtual_1_ , false);
          new Equality(body, var_i, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }

  private static int evaluateExpression_1_1(final String name) {
    int _switchResult = (int) 0;
    if (name != null) {
      switch (name) {
        case "void":
          _switchResult = 1;
          break;
        case "bool":
          _switchResult = 1;
          break;
        case "char":
          _switchResult = 0;
          break;
        case "uchar":
          _switchResult = 0;
          break;
        case "short":
          _switchResult = 0;
          break;
        case "ushort":
          _switchResult = 0;
          break;
        case "int":
          _switchResult = 0;
          break;
        case "uint":
          _switchResult = 0;
          break;
        case "long":
          _switchResult = 0;
          break;
        case "ulong":
          _switchResult = 0;
          break;
        case "longlong":
          _switchResult = 0;
          break;
        case "ulonglong":
          _switchResult = 0;
          break;
        case "float":
          _switchResult = 0;
          break;
        case "double":
          _switchResult = 0;
          break;
        case "longdouble":
          _switchResult = 0;
          break;
      }
    }
    return _switchResult;
  }
}
