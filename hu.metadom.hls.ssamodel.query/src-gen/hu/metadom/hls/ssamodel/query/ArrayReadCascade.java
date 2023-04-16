/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaArrayRead;
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
 *         pattern arrayReadCascade(read: SsaArrayRead, subRead: SsaArrayRead) {
 *         	SsaArrayRead.array(read, subRead);
 *         	neg find ssaNodeVar(subRead, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ArrayReadCascade extends BaseGeneratedEMFQuerySpecification<ArrayReadCascade.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.arrayReadCascade pattern,
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
    private SsaArrayRead fRead;

    private SsaArrayRead fSubRead;

    private static List<String> parameterNames = makeImmutableList("read", "subRead");

    private Match(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      this.fRead = pRead;
      this.fSubRead = pSubRead;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "read": return this.fRead;
          case "subRead": return this.fSubRead;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRead;
          case 1: return this.fSubRead;
          default: return null;
      }
    }

    public SsaArrayRead getRead() {
      return this.fRead;
    }

    public SsaArrayRead getSubRead() {
      return this.fSubRead;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("read".equals(parameterName) ) {
          this.fRead = (SsaArrayRead) newValue;
          return true;
      }
      if ("subRead".equals(parameterName) ) {
          this.fSubRead = (SsaArrayRead) newValue;
          return true;
      }
      return false;
    }

    public void setRead(final SsaArrayRead pRead) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRead = pRead;
    }

    public void setSubRead(final SsaArrayRead pSubRead) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubRead = pSubRead;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.arrayReadCascade";
    }

    @Override
    public List<String> parameterNames() {
      return ArrayReadCascade.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fRead, fSubRead};
    }

    @Override
    public ArrayReadCascade.Match toImmutable() {
      return isMutable() ? newMatch(fRead, fSubRead) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"read\"=" + prettyPrintValue(fRead) + ", ");
      result.append("\"subRead\"=" + prettyPrintValue(fSubRead));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fRead, fSubRead);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ArrayReadCascade.Match)) {
          ArrayReadCascade.Match other = (ArrayReadCascade.Match) obj;
          return Objects.equals(fRead, other.fRead) && Objects.equals(fSubRead, other.fSubRead);
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
    public ArrayReadCascade specification() {
      return ArrayReadCascade.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ArrayReadCascade.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ArrayReadCascade.Match newMutableMatch(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return new Mutable(pRead, pSubRead);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ArrayReadCascade.Match newMatch(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return new Immutable(pRead, pSubRead);
    }

    private static final class Mutable extends ArrayReadCascade.Match {
      Mutable(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
        super(pRead, pSubRead);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ArrayReadCascade.Match {
      Immutable(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
        super(pRead, pSubRead);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.arrayReadCascade pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern arrayReadCascade(read: SsaArrayRead, subRead: SsaArrayRead) {
   * 	SsaArrayRead.array(read, subRead);
   * 	neg find ssaNodeVar(subRead, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ArrayReadCascade
   * 
   */
  public static class Matcher extends BaseMatcher<ArrayReadCascade.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ArrayReadCascade.Matcher on(final ViatraQueryEngine engine) {
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
    public static ArrayReadCascade.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_READ = 0;

    private static final int POSITION_SUBREAD = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ArrayReadCascade.Matcher.class);

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
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ArrayReadCascade.Match> getAllMatches(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return rawStreamAllMatches(new Object[]{pRead, pSubRead}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ArrayReadCascade.Match> streamAllMatches(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return rawStreamAllMatches(new Object[]{pRead, pSubRead});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ArrayReadCascade.Match> getOneArbitraryMatch(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return rawGetOneArbitraryMatch(new Object[]{pRead, pSubRead});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return rawHasMatch(new Object[]{pRead, pSubRead});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return rawCountMatches(new Object[]{pRead, pSubRead});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaArrayRead pRead, final SsaArrayRead pSubRead, final Consumer<? super ArrayReadCascade.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRead, pSubRead}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param pSubRead the fixed value of pattern parameter subRead, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ArrayReadCascade.Match newMatch(final SsaArrayRead pRead, final SsaArrayRead pSubRead) {
      return ArrayReadCascade.Match.newMatch(pRead, pSubRead);
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArrayRead> rawStreamAllValuesOfread(final Object[] parameters) {
      return rawStreamAllValues(POSITION_READ, parameters).map(SsaArrayRead.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfread() {
      return rawStreamAllValuesOfread(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfread() {
      return rawStreamAllValuesOfread(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfread(final ArrayReadCascade.Match partialMatch) {
      return rawStreamAllValuesOfread(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfread(final SsaArrayRead pSubRead) {
      return rawStreamAllValuesOfread(new Object[]{null, pSubRead});
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfread(final ArrayReadCascade.Match partialMatch) {
      return rawStreamAllValuesOfread(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfread(final SsaArrayRead pSubRead) {
      return rawStreamAllValuesOfread(new Object[]{null, pSubRead}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArrayRead> rawStreamAllValuesOfsubRead(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SUBREAD, parameters).map(SsaArrayRead.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfsubRead() {
      return rawStreamAllValuesOfsubRead(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfsubRead() {
      return rawStreamAllValuesOfsubRead(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfsubRead(final ArrayReadCascade.Match partialMatch) {
      return rawStreamAllValuesOfsubRead(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayRead> streamAllValuesOfsubRead(final SsaArrayRead pRead) {
      return rawStreamAllValuesOfsubRead(new Object[]{pRead, null});
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfsubRead(final ArrayReadCascade.Match partialMatch) {
      return rawStreamAllValuesOfsubRead(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for subRead.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayRead> getAllValuesOfsubRead(final SsaArrayRead pRead) {
      return rawStreamAllValuesOfsubRead(new Object[]{pRead, null}).collect(Collectors.toSet());
    }

    @Override
    protected ArrayReadCascade.Match tupleToMatch(final Tuple t) {
      try {
          return ArrayReadCascade.Match.newMatch((SsaArrayRead) t.get(POSITION_READ), (SsaArrayRead) t.get(POSITION_SUBREAD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArrayReadCascade.Match arrayToMatch(final Object[] match) {
      try {
          return ArrayReadCascade.Match.newMatch((SsaArrayRead) match[POSITION_READ], (SsaArrayRead) match[POSITION_SUBREAD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArrayReadCascade.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ArrayReadCascade.Match.newMutableMatch((SsaArrayRead) match[POSITION_READ], (SsaArrayRead) match[POSITION_SUBREAD]);
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
    public static IQuerySpecification<ArrayReadCascade.Matcher> querySpecification() {
      return ArrayReadCascade.instance();
    }
  }

  private ArrayReadCascade() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ArrayReadCascade instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ArrayReadCascade.Matcher instantiate(final ViatraQueryEngine engine) {
    return ArrayReadCascade.Matcher.on(engine);
  }

  @Override
  public ArrayReadCascade.Matcher instantiate() {
    return ArrayReadCascade.Matcher.create();
  }

  @Override
  public ArrayReadCascade.Match newEmptyMatch() {
    return ArrayReadCascade.Match.newEmptyMatch();
  }

  @Override
  public ArrayReadCascade.Match newMatch(final Object... parameters) {
    return ArrayReadCascade.Match.newMatch((hu.metadom.hls.ssamodel.SsaArrayRead) parameters[0], (hu.metadom.hls.ssamodel.SsaArrayRead) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ArrayReadCascade} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ArrayReadCascade#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ArrayReadCascade INSTANCE = new ArrayReadCascade();

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
    private static final ArrayReadCascade.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_read = new PParameter("read", "hu.metadom.hls.ssamodel.SsaArrayRead", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArrayRead")), PParameterDirection.INOUT);

    private final PParameter parameter_subRead = new PParameter("subRead", "hu.metadom.hls.ssamodel.SsaArrayRead", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArrayRead")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_read, parameter_subRead);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.arrayReadCascade";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("read","subRead");
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
          PVariable var_read = body.getOrCreateVariableByName("read");
          PVariable var_subRead = body.getOrCreateVariableByName("subRead");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_read), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subRead), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_read, parameter_read),
             new ExportedParameter(body, var_subRead, parameter_subRead)
          ));
          // 	SsaArrayRead.array(read, subRead)
          new TypeConstraint(body, Tuples.flatTupleOf(var_read), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_read, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayRead", "array")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_subRead);
          // 	neg find ssaNodeVar(subRead, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_subRead, var___0_), SsaNodeVar.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
