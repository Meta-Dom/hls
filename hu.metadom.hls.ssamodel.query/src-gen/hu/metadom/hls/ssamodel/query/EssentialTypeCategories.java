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
 *         //Helper Queries For Validation
 *         
 *         // essential types according to Misra C 8.10.2.
 *         pattern essentialTypeCategories(pt: PrimitiveType, s: java String){
 *         	PrimitiveType.name(pt, name);
 *         	s == eval(
 *         		switch(name) {
 *         			case "void": "void"	
 *         			case "bool": "boolean"
 *         			case "char": "signed"
 *         			case "uchar": "unsigned"
 *         			case "short": "signed"
 *         			case "ushort": "unsigned"
 *         			case "int": "signed"
 *         			case "uint": "unsigned"
 *         			case "long": "signed"
 *         			case "ulong": "unsigned"
 *         			case "longlong": "signed"
 *         			case "ulonglong": "unsigned"
 *         			case "float": "floating"
 *         			case "double": "floating"
 *         			case "longdouble": "floating"
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
public final class EssentialTypeCategories extends BaseGeneratedEMFQuerySpecification<EssentialTypeCategories.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.essentialTypeCategories pattern,
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

    private String fS;

    private static List<String> parameterNames = makeImmutableList("pt", "s");

    private Match(final PrimitiveType pPt, final String pS) {
      this.fPt = pPt;
      this.fS = pS;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "pt": return this.fPt;
          case "s": return this.fS;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPt;
          case 1: return this.fS;
          default: return null;
      }
    }

    public PrimitiveType getPt() {
      return this.fPt;
    }

    public String getS() {
      return this.fS;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("pt".equals(parameterName) ) {
          this.fPt = (PrimitiveType) newValue;
          return true;
      }
      if ("s".equals(parameterName) ) {
          this.fS = (String) newValue;
          return true;
      }
      return false;
    }

    public void setPt(final PrimitiveType pPt) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPt = pPt;
    }

    public void setS(final String pS) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS = pS;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.essentialTypeCategories";
    }

    @Override
    public List<String> parameterNames() {
      return EssentialTypeCategories.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fPt, fS};
    }

    @Override
    public EssentialTypeCategories.Match toImmutable() {
      return isMutable() ? newMatch(fPt, fS) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"pt\"=" + prettyPrintValue(fPt) + ", ");
      result.append("\"s\"=" + prettyPrintValue(fS));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fPt, fS);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EssentialTypeCategories.Match)) {
          EssentialTypeCategories.Match other = (EssentialTypeCategories.Match) obj;
          return Objects.equals(fPt, other.fPt) && Objects.equals(fS, other.fS);
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
    public EssentialTypeCategories specification() {
      return EssentialTypeCategories.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EssentialTypeCategories.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EssentialTypeCategories.Match newMutableMatch(final PrimitiveType pPt, final String pS) {
      return new Mutable(pPt, pS);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EssentialTypeCategories.Match newMatch(final PrimitiveType pPt, final String pS) {
      return new Immutable(pPt, pS);
    }

    private static final class Mutable extends EssentialTypeCategories.Match {
      Mutable(final PrimitiveType pPt, final String pS) {
        super(pPt, pS);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends EssentialTypeCategories.Match {
      Immutable(final PrimitiveType pPt, final String pS) {
        super(pPt, pS);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.essentialTypeCategories pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Helper Queries For Validation
   * 
   * // essential types according to Misra C 8.10.2.
   * pattern essentialTypeCategories(pt: PrimitiveType, s: java String){
   * 	PrimitiveType.name(pt, name);
   * 	s == eval(
   * 		switch(name) {
   * 			case "void": "void"	
   * 			case "bool": "boolean"
   * 			case "char": "signed"
   * 			case "uchar": "unsigned"
   * 			case "short": "signed"
   * 			case "ushort": "unsigned"
   * 			case "int": "signed"
   * 			case "uint": "unsigned"
   * 			case "long": "signed"
   * 			case "ulong": "unsigned"
   * 			case "longlong": "signed"
   * 			case "ulonglong": "unsigned"
   * 			case "float": "floating"
   * 			case "double": "floating"
   * 			case "longdouble": "floating"
   * 		}
   * 	);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EssentialTypeCategories
   * 
   */
  public static class Matcher extends BaseMatcher<EssentialTypeCategories.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EssentialTypeCategories.Matcher on(final ViatraQueryEngine engine) {
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
    public static EssentialTypeCategories.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_PT = 0;

    private static final int POSITION_S = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EssentialTypeCategories.Matcher.class);

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
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EssentialTypeCategories.Match> getAllMatches(final PrimitiveType pPt, final String pS) {
      return rawStreamAllMatches(new Object[]{pPt, pS}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EssentialTypeCategories.Match> streamAllMatches(final PrimitiveType pPt, final String pS) {
      return rawStreamAllMatches(new Object[]{pPt, pS});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EssentialTypeCategories.Match> getOneArbitraryMatch(final PrimitiveType pPt, final String pS) {
      return rawGetOneArbitraryMatch(new Object[]{pPt, pS});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final PrimitiveType pPt, final String pS) {
      return rawHasMatch(new Object[]{pPt, pS});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final PrimitiveType pPt, final String pS) {
      return rawCountMatches(new Object[]{pPt, pS});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final PrimitiveType pPt, final String pS, final Consumer<? super EssentialTypeCategories.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPt, pS}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPt the fixed value of pattern parameter pt, or null if not bound.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EssentialTypeCategories.Match newMatch(final PrimitiveType pPt, final String pS) {
      return EssentialTypeCategories.Match.newMatch(pPt, pS);
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
    public Stream<PrimitiveType> streamAllValuesOfpt(final EssentialTypeCategories.Match partialMatch) {
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
    public Stream<PrimitiveType> streamAllValuesOfpt(final String pS) {
      return rawStreamAllValuesOfpt(new Object[]{null, pS});
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PrimitiveType> getAllValuesOfpt(final EssentialTypeCategories.Match partialMatch) {
      return rawStreamAllValuesOfpt(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for pt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PrimitiveType> getAllValuesOfpt(final String pS) {
      return rawStreamAllValuesOfpt(new Object[]{null, pS}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfs(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S, parameters).map(String.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfs() {
      return rawStreamAllValuesOfs(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfs() {
      return rawStreamAllValuesOfs(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfs(final EssentialTypeCategories.Match partialMatch) {
      return rawStreamAllValuesOfs(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfs(final PrimitiveType pPt) {
      return rawStreamAllValuesOfs(new Object[]{pPt, null});
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfs(final EssentialTypeCategories.Match partialMatch) {
      return rawStreamAllValuesOfs(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfs(final PrimitiveType pPt) {
      return rawStreamAllValuesOfs(new Object[]{pPt, null}).collect(Collectors.toSet());
    }

    @Override
    protected EssentialTypeCategories.Match tupleToMatch(final Tuple t) {
      try {
          return EssentialTypeCategories.Match.newMatch((PrimitiveType) t.get(POSITION_PT), (String) t.get(POSITION_S));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EssentialTypeCategories.Match arrayToMatch(final Object[] match) {
      try {
          return EssentialTypeCategories.Match.newMatch((PrimitiveType) match[POSITION_PT], (String) match[POSITION_S]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EssentialTypeCategories.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EssentialTypeCategories.Match.newMutableMatch((PrimitiveType) match[POSITION_PT], (String) match[POSITION_S]);
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
    public static IQuerySpecification<EssentialTypeCategories.Matcher> querySpecification() {
      return EssentialTypeCategories.instance();
    }
  }

  private EssentialTypeCategories() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EssentialTypeCategories instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected EssentialTypeCategories.Matcher instantiate(final ViatraQueryEngine engine) {
    return EssentialTypeCategories.Matcher.on(engine);
  }

  @Override
  public EssentialTypeCategories.Matcher instantiate() {
    return EssentialTypeCategories.Matcher.create();
  }

  @Override
  public EssentialTypeCategories.Match newEmptyMatch() {
    return EssentialTypeCategories.Match.newEmptyMatch();
  }

  @Override
  public EssentialTypeCategories.Match newMatch(final Object... parameters) {
    return EssentialTypeCategories.Match.newMatch((hu.metadom.hls.ssamodel.PrimitiveType) parameters[0], (java.lang.String) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link EssentialTypeCategories} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EssentialTypeCategories#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EssentialTypeCategories INSTANCE = new EssentialTypeCategories();

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
    private static final EssentialTypeCategories.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_pt = new PParameter("pt", "hu.metadom.hls.ssamodel.PrimitiveType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "PrimitiveType")), PParameterDirection.INOUT);

    private final PParameter parameter_s = new PParameter("s", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_pt, parameter_s);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.essentialTypeCategories";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("pt","s");
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
          PVariable var_s = body.getOrCreateVariableByName("s");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_s), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_pt, parameter_pt),
             new ExportedParameter(body, var_s, parameter_s)
          ));
          // 	PrimitiveType.name(pt, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PrimitiveType")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pt, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaObject", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_0_, var_name);
          // 	s == eval(		switch(name) {			case "void": "void"				case "bool": "boolean"			case "char": "signed"			case "uchar": "unsigned"			case "short": "signed"			case "ushort": "unsigned"			case "int": "signed"			case "uint": "unsigned"			case "long": "signed"			case "ulong": "unsigned"			case "longlong": "signed"			case "ulonglong": "unsigned"			case "float": "floating"			case "double": "floating"			case "longdouble": "floating"		}	)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern essentialTypeCategories";
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
          new Equality(body, var_s, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }

  private static String evaluateExpression_1_1(final String name) {
    String _switchResult = null;
    if (name != null) {
      switch (name) {
        case "void":
          _switchResult = "void";
          break;
        case "bool":
          _switchResult = "boolean";
          break;
        case "char":
          _switchResult = "signed";
          break;
        case "uchar":
          _switchResult = "unsigned";
          break;
        case "short":
          _switchResult = "signed";
          break;
        case "ushort":
          _switchResult = "unsigned";
          break;
        case "int":
          _switchResult = "signed";
          break;
        case "uint":
          _switchResult = "unsigned";
          break;
        case "long":
          _switchResult = "signed";
          break;
        case "ulong":
          _switchResult = "unsigned";
          break;
        case "longlong":
          _switchResult = "signed";
          break;
        case "ulonglong":
          _switchResult = "unsigned";
          break;
        case "float":
          _switchResult = "floating";
          break;
        case "double":
          _switchResult = "floating";
          break;
        case "longdouble":
          _switchResult = "floating";
          break;
      }
    }
    return _switchResult;
  }
}
