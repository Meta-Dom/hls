/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaArrayWrite;
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
 *         pattern arrayWriteCascade(write: SsaArrayWrite, subWrite: SsaArrayWrite) {
 *         	SsaArrayWrite.value(write, subWrite);
 *         	neg find ssaNodeVar(subWrite, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ArrayWriteCascade extends BaseGeneratedEMFQuerySpecification<ArrayWriteCascade.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.arrayWriteCascade pattern,
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
    private SsaArrayWrite fWrite;

    private SsaArrayWrite fSubWrite;

    private static List<String> parameterNames = makeImmutableList("write", "subWrite");

    private Match(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      this.fWrite = pWrite;
      this.fSubWrite = pSubWrite;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "write": return this.fWrite;
          case "subWrite": return this.fSubWrite;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fWrite;
          case 1: return this.fSubWrite;
          default: return null;
      }
    }

    public SsaArrayWrite getWrite() {
      return this.fWrite;
    }

    public SsaArrayWrite getSubWrite() {
      return this.fSubWrite;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("write".equals(parameterName) ) {
          this.fWrite = (SsaArrayWrite) newValue;
          return true;
      }
      if ("subWrite".equals(parameterName) ) {
          this.fSubWrite = (SsaArrayWrite) newValue;
          return true;
      }
      return false;
    }

    public void setWrite(final SsaArrayWrite pWrite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fWrite = pWrite;
    }

    public void setSubWrite(final SsaArrayWrite pSubWrite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubWrite = pSubWrite;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.arrayWriteCascade";
    }

    @Override
    public List<String> parameterNames() {
      return ArrayWriteCascade.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fWrite, fSubWrite};
    }

    @Override
    public ArrayWriteCascade.Match toImmutable() {
      return isMutable() ? newMatch(fWrite, fSubWrite) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"write\"=" + prettyPrintValue(fWrite) + ", ");
      result.append("\"subWrite\"=" + prettyPrintValue(fSubWrite));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fWrite, fSubWrite);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ArrayWriteCascade.Match)) {
          ArrayWriteCascade.Match other = (ArrayWriteCascade.Match) obj;
          return Objects.equals(fWrite, other.fWrite) && Objects.equals(fSubWrite, other.fSubWrite);
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
    public ArrayWriteCascade specification() {
      return ArrayWriteCascade.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ArrayWriteCascade.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ArrayWriteCascade.Match newMutableMatch(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return new Mutable(pWrite, pSubWrite);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ArrayWriteCascade.Match newMatch(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return new Immutable(pWrite, pSubWrite);
    }

    private static final class Mutable extends ArrayWriteCascade.Match {
      Mutable(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
        super(pWrite, pSubWrite);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends ArrayWriteCascade.Match {
      Immutable(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
        super(pWrite, pSubWrite);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.arrayWriteCascade pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern arrayWriteCascade(write: SsaArrayWrite, subWrite: SsaArrayWrite) {
   * 	SsaArrayWrite.value(write, subWrite);
   * 	neg find ssaNodeVar(subWrite, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ArrayWriteCascade
   * 
   */
  public static class Matcher extends BaseMatcher<ArrayWriteCascade.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ArrayWriteCascade.Matcher on(final ViatraQueryEngine engine) {
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
    public static ArrayWriteCascade.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_WRITE = 0;

    private static final int POSITION_SUBWRITE = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ArrayWriteCascade.Matcher.class);

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
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ArrayWriteCascade.Match> getAllMatches(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return rawStreamAllMatches(new Object[]{pWrite, pSubWrite}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ArrayWriteCascade.Match> streamAllMatches(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return rawStreamAllMatches(new Object[]{pWrite, pSubWrite});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ArrayWriteCascade.Match> getOneArbitraryMatch(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return rawGetOneArbitraryMatch(new Object[]{pWrite, pSubWrite});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return rawHasMatch(new Object[]{pWrite, pSubWrite});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return rawCountMatches(new Object[]{pWrite, pSubWrite});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite, final Consumer<? super ArrayWriteCascade.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pWrite, pSubWrite}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pWrite the fixed value of pattern parameter write, or null if not bound.
     * @param pSubWrite the fixed value of pattern parameter subWrite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ArrayWriteCascade.Match newMatch(final SsaArrayWrite pWrite, final SsaArrayWrite pSubWrite) {
      return ArrayWriteCascade.Match.newMatch(pWrite, pSubWrite);
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArrayWrite> rawStreamAllValuesOfwrite(final Object[] parameters) {
      return rawStreamAllValues(POSITION_WRITE, parameters).map(SsaArrayWrite.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayWrite> getAllValuesOfwrite() {
      return rawStreamAllValuesOfwrite(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayWrite> streamAllValuesOfwrite() {
      return rawStreamAllValuesOfwrite(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayWrite> streamAllValuesOfwrite(final ArrayWriteCascade.Match partialMatch) {
      return rawStreamAllValuesOfwrite(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayWrite> streamAllValuesOfwrite(final SsaArrayWrite pSubWrite) {
      return rawStreamAllValuesOfwrite(new Object[]{null, pSubWrite});
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayWrite> getAllValuesOfwrite(final ArrayWriteCascade.Match partialMatch) {
      return rawStreamAllValuesOfwrite(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for write.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayWrite> getAllValuesOfwrite(final SsaArrayWrite pSubWrite) {
      return rawStreamAllValuesOfwrite(new Object[]{null, pSubWrite}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArrayWrite> rawStreamAllValuesOfsubWrite(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SUBWRITE, parameters).map(SsaArrayWrite.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayWrite> getAllValuesOfsubWrite() {
      return rawStreamAllValuesOfsubWrite(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayWrite> streamAllValuesOfsubWrite() {
      return rawStreamAllValuesOfsubWrite(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayWrite> streamAllValuesOfsubWrite(final ArrayWriteCascade.Match partialMatch) {
      return rawStreamAllValuesOfsubWrite(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArrayWrite> streamAllValuesOfsubWrite(final SsaArrayWrite pWrite) {
      return rawStreamAllValuesOfsubWrite(new Object[]{pWrite, null});
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayWrite> getAllValuesOfsubWrite(final ArrayWriteCascade.Match partialMatch) {
      return rawStreamAllValuesOfsubWrite(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for subWrite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArrayWrite> getAllValuesOfsubWrite(final SsaArrayWrite pWrite) {
      return rawStreamAllValuesOfsubWrite(new Object[]{pWrite, null}).collect(Collectors.toSet());
    }

    @Override
    protected ArrayWriteCascade.Match tupleToMatch(final Tuple t) {
      try {
          return ArrayWriteCascade.Match.newMatch((SsaArrayWrite) t.get(POSITION_WRITE), (SsaArrayWrite) t.get(POSITION_SUBWRITE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArrayWriteCascade.Match arrayToMatch(final Object[] match) {
      try {
          return ArrayWriteCascade.Match.newMatch((SsaArrayWrite) match[POSITION_WRITE], (SsaArrayWrite) match[POSITION_SUBWRITE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected ArrayWriteCascade.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ArrayWriteCascade.Match.newMutableMatch((SsaArrayWrite) match[POSITION_WRITE], (SsaArrayWrite) match[POSITION_SUBWRITE]);
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
    public static IQuerySpecification<ArrayWriteCascade.Matcher> querySpecification() {
      return ArrayWriteCascade.instance();
    }
  }

  private ArrayWriteCascade() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ArrayWriteCascade instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected ArrayWriteCascade.Matcher instantiate(final ViatraQueryEngine engine) {
    return ArrayWriteCascade.Matcher.on(engine);
  }

  @Override
  public ArrayWriteCascade.Matcher instantiate() {
    return ArrayWriteCascade.Matcher.create();
  }

  @Override
  public ArrayWriteCascade.Match newEmptyMatch() {
    return ArrayWriteCascade.Match.newEmptyMatch();
  }

  @Override
  public ArrayWriteCascade.Match newMatch(final Object... parameters) {
    return ArrayWriteCascade.Match.newMatch((hu.metadom.hls.ssamodel.SsaArrayWrite) parameters[0], (hu.metadom.hls.ssamodel.SsaArrayWrite) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link ArrayWriteCascade} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ArrayWriteCascade#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ArrayWriteCascade INSTANCE = new ArrayWriteCascade();

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
    private static final ArrayWriteCascade.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_write = new PParameter("write", "hu.metadom.hls.ssamodel.SsaArrayWrite", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")), PParameterDirection.INOUT);

    private final PParameter parameter_subWrite = new PParameter("subWrite", "hu.metadom.hls.ssamodel.SsaArrayWrite", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_write, parameter_subWrite);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.arrayWriteCascade";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("write","subWrite");
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
          PVariable var_write = body.getOrCreateVariableByName("write");
          PVariable var_subWrite = body.getOrCreateVariableByName("subWrite");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_write), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subWrite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_write, parameter_write),
             new ExportedParameter(body, var_subWrite, parameter_subWrite)
          ));
          // 	SsaArrayWrite.value(write, subWrite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_write), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_write, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaArrayWrite", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_subWrite);
          // 	neg find ssaNodeVar(subWrite, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_subWrite, var___0_), SsaNodeVar.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
