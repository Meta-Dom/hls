/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaArrayRead;
import hu.metadom.hls.ssamodel.SsaUnaryOperator;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         // PointerElim transformation
 *         
 *         pattern redundantAddressOperator(unary: SsaUnaryOperator, arrayRead: SsaArrayRead) {
 *         	SsaUnaryOperator.operand(unary,arrayRead);
 *         	neg find ssaNodeVar(arrayRead,_);
 *         	
 *         	SsaUnaryOperator.operatorKind(unary,::ADDRESS);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RedundantAddressOperator extends BaseGeneratedEMFQuerySpecification<RedundantAddressOperator.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.redundantAddressOperator pattern,
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
    private SsaUnaryOperator fUnary;

    private SsaArrayRead fArrayRead;

    private static List<String> parameterNames = makeImmutableList("unary", "arrayRead");

    private Match(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      this.fUnary = pUnary;
      this.fArrayRead = pArrayRead;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "unary": return this.fUnary;
          case "arrayRead": return this.fArrayRead;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fUnary;
          case 1: return this.fArrayRead;
          default: return null;
      }
    }

    public SsaUnaryOperator getUnary() {
      return this.fUnary;
    }

    public SsaArrayRead getArrayRead() {
      return this.fArrayRead;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("unary".equals(parameterName) ) {
          this.fUnary = (SsaUnaryOperator) newValue;
          return true;
      }
      if ("arrayRead".equals(parameterName) ) {
          this.fArrayRead = (SsaArrayRead) newValue;
          return true;
      }
      return false;
    }

    public void setUnary(final SsaUnaryOperator pUnary) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUnary = pUnary;
    }

    public void setArrayRead(final SsaArrayRead pArrayRead) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fArrayRead = pArrayRead;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.redundantAddressOperator";
    }

    @Override
    public List<String> parameterNames() {
      return RedundantAddressOperator.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fUnary, fArrayRead};
    }

    @Override
    public RedundantAddressOperator.Match toImmutable() {
      return isMutable() ? newMatch(fUnary, fArrayRead) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"unary\"=" + prettyPrintValue(fUnary) + ", ");
      result.append("\"arrayRead\"=" + prettyPrintValue(fArrayRead));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fUnary, fArrayRead);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RedundantAddressOperator.Match)) {
          RedundantAddressOperator.Match other = (RedundantAddressOperator.Match) obj;
          return Objects.equals(fUnary, other.fUnary) && Objects.equals(fArrayRead, other.fArrayRead);
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
    public RedundantAddressOperator specification() {
      return RedundantAddressOperator.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RedundantAddressOperator.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RedundantAddressOperator.Match newMutableMatch(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return new Mutable(pUnary, pArrayRead);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RedundantAddressOperator.Match newMatch(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return new Immutable(pUnary, pArrayRead);
    }

    private static final class Mutable extends RedundantAddressOperator.Match {
      Mutable(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
        super(pUnary, pArrayRead);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends RedundantAddressOperator.Match {
      Immutable(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
        super(pUnary, pArrayRead);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.redundantAddressOperator pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // PointerElim transformation
   * 
   * pattern redundantAddressOperator(unary: SsaUnaryOperator, arrayRead: SsaArrayRead) {
   * 	SsaUnaryOperator.operand(unary,arrayRead);
   * 	neg find ssaNodeVar(arrayRead,_);
   * 	
   * 	SsaUnaryOperator.operatorKind(unary,::ADDRESS);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RedundantAddressOperator
   * 
   */
  public static class Matcher extends BaseMatcher<RedundantAddressOperator.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RedundantAddressOperator.Matcher on(final ViatraQueryEngine engine) {
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
    public static RedundantAddressOperator.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_UNARY = 0;

    private static final int POSITION_ARRAYREAD = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RedundantAddressOperator.Matcher.class);

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
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RedundantAddressOperator.Match> getAllMatches(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return rawStreamAllMatches(new Object[]{pUnary, pArrayRead}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RedundantAddressOperator.Match> streamAllMatches(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return rawStreamAllMatches(new Object[]{pUnary, pArrayRead});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RedundantAddressOperator.Match> getOneArbitraryMatch(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return rawGetOneArbitraryMatch(new Object[]{pUnary, pArrayRead});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return rawHasMatch(new Object[]{pUnary, pArrayRead});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return rawCountMatches(new Object[]{pUnary, pArrayRead});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead, final Consumer<? super RedundantAddressOperator.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pUnary, pArrayRead}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pUnary the fixed value of pattern parameter unary, or null if not bound.
     * @param pArrayRead the fixed value of pattern parameter arrayRead, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RedundantAddressOperator.Match newMatch(final SsaUnaryOperator pUnary, final SsaArrayRead pArrayRead) {
      return RedundantAddressOperator.Match.newMatch(pUnary, pArrayRead);
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaUnaryOperator> rawStreamAllValuesOfunary(final Object[] parameters) {
      return rawStreamAllValues(POSITION_UNARY, parameters).map(SsaUnaryOperator.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaUnaryOperator> getAllValuesOfunary() {
      return rawStreamAllValuesOfunary(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaUnaryOperator> streamAllValuesOfunary() {
      return rawStreamAllValuesOfunary(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaUnaryOperator> streamAllValuesOfunary(final RedundantAddressOperator.Match partialMatch) {
      return rawStreamAllValuesOfunary(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaUnaryOperator> streamAllValuesOfunary(final SsaArrayRead pArrayRead) {
      return rawStreamAllValuesOfunary(new Object[]{null, pArrayRead});
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaUnaryOperator> getAllValuesOfunary(final RedundantAddressOperator.Match partialMatch) {
      return rawStreamAllValuesOfunary(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for unary.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaUnaryOperator> getAllValuesOfunary(final SsaArrayRead pArrayRead) {
      return rawStreamAllValuesOfunary(new Object[]{null, pArrayRead}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArrayRead> rawStreamAllValuesOfarrayRead(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ARRAYREAD, parameters).map(SsaArrayRead.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfarrayRead() {
      return rawStreamAllValuesOfarrayRead(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfarrayRead() {
      return rawStreamAllValuesOfarrayRead(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfarrayRead(final RedundantAddressOperator.Match partialMatch) {
      return rawStreamAllValuesOfarrayRead(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfarrayRead(final SsaUnaryOperator pUnary) {
      return rawStreamAllValuesOfarrayRead(new Object[]{pUnary, null});
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfarrayRead(final RedundantAddressOperator.Match partialMatch) {
      return rawStreamAllValuesOfarrayRead(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arrayRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfarrayRead(final SsaUnaryOperator pUnary) {
      return rawStreamAllValuesOfarrayRead(new Object[]{pUnary, null}).collect(Collectors.toSet());
    }

    @Override
    protected RedundantAddressOperator.Match tupleToMatch(final Tuple t) {
      try {
          return RedundantAddressOperator.Match.newMatch((SsaUnaryOperator) t.get(POSITION_UNARY), (SsaArrayRead) t.get(POSITION_ARRAYREAD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected RedundantAddressOperator.Match arrayToMatch(final Object[] match) {
      try {
          return RedundantAddressOperator.Match.newMatch((SsaUnaryOperator) match[POSITION_UNARY], (SsaArrayRead) match[POSITION_ARRAYREAD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected RedundantAddressOperator.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RedundantAddressOperator.Match.newMutableMatch((SsaUnaryOperator) match[POSITION_UNARY], (SsaArrayRead) match[POSITION_ARRAYREAD]);
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
    public static IQuerySpecification<RedundantAddressOperator.Matcher> querySpecification() {
      return RedundantAddressOperator.instance();
    }
  }

  private RedundantAddressOperator() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RedundantAddressOperator instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected RedundantAddressOperator.Matcher instantiate(final ViatraQueryEngine engine) {
    return RedundantAddressOperator.Matcher.on(engine);
  }

  @Override
  public RedundantAddressOperator.Matcher instantiate() {
    return RedundantAddressOperator.Matcher.create();
  }

  @Override
  public RedundantAddressOperator.Match newEmptyMatch() {
    return RedundantAddressOperator.Match.newEmptyMatch();
  }

  @Override
  public RedundantAddressOperator.Match newMatch(final Object... parameters) {
    return RedundantAddressOperator.Match.newMatch((hu.metadom.hls.ssamodel.SsaUnaryOperator) parameters[0], (hu.metadom.hls.ssamodel.SsaArrayRead) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link RedundantAddressOperator} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RedundantAddressOperator#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RedundantAddressOperator INSTANCE = new RedundantAddressOperator();

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
    private static final RedundantAddressOperator.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_unary = new PParameter("unary", "hu.metadom.hls.ssamodel.SsaUnaryOperator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")), PParameterDirection.INOUT);

    private final PParameter parameter_arrayRead = new PParameter("arrayRead", "hu.metadom.hls.ssamodel.SsaArrayRead", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArrayRead")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_unary, parameter_arrayRead);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.redundantAddressOperator";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("unary","arrayRead");
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
          PVariable var_unary = body.getOrCreateVariableByName("unary");
          PVariable var_arrayRead = body.getOrCreateVariableByName("arrayRead");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_unary), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_arrayRead), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_unary, parameter_unary),
             new ExportedParameter(body, var_arrayRead, parameter_arrayRead)
          ));
          // 	SsaUnaryOperator.operand(unary,arrayRead)
          new TypeConstraint(body, Tuples.flatTupleOf(var_unary), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_unary, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator", "operand")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_arrayRead);
          // 	neg find ssaNodeVar(arrayRead,_)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_arrayRead, var___0_), SsaNodeVar.instance().getInternalQueryRepresentation());
          // 		SsaUnaryOperator.operatorKind(unary,::ADDRESS)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperatorKind", "ADDRESS").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_unary), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_unary, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator", "operatorKind")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperatorKind")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
