/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/typeUtilQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

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
 *         pattern ssaIndirectRead(read: SsaIndirectRead) {
 *         	SsaIndirectRead(read);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SsaIndirectRead extends BaseGeneratedEMFQuerySpecification<SsaIndirectRead.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.ssaIndirectRead pattern,
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
    private hu.metadom.hls.ssamodel.SsaIndirectRead fRead;

    private static List<String> parameterNames = makeImmutableList("read");

    private Match(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      this.fRead = pRead;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "read": return this.fRead;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRead;
          default: return null;
      }
    }

    public hu.metadom.hls.ssamodel.SsaIndirectRead getRead() {
      return this.fRead;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("read".equals(parameterName) ) {
          this.fRead = (hu.metadom.hls.ssamodel.SsaIndirectRead) newValue;
          return true;
      }
      return false;
    }

    public void setRead(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRead = pRead;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.ssaIndirectRead";
    }

    @Override
    public List<String> parameterNames() {
      return SsaIndirectRead.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fRead};
    }

    @Override
    public SsaIndirectRead.Match toImmutable() {
      return isMutable() ? newMatch(fRead) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"read\"=" + prettyPrintValue(fRead));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fRead);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SsaIndirectRead.Match)) {
          SsaIndirectRead.Match other = (SsaIndirectRead.Match) obj;
          return Objects.equals(fRead, other.fRead);
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
    public SsaIndirectRead specification() {
      return SsaIndirectRead.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SsaIndirectRead.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SsaIndirectRead.Match newMutableMatch(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return new Mutable(pRead);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SsaIndirectRead.Match newMatch(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return new Immutable(pRead);
    }

    private static final class Mutable extends SsaIndirectRead.Match {
      Mutable(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
        super(pRead);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends SsaIndirectRead.Match {
      Immutable(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
        super(pRead);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.ssaIndirectRead pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern ssaIndirectRead(read: SsaIndirectRead) {
   * 	SsaIndirectRead(read);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SsaIndirectRead
   * 
   */
  public static class Matcher extends BaseMatcher<SsaIndirectRead.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SsaIndirectRead.Matcher on(final ViatraQueryEngine engine) {
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
    public static SsaIndirectRead.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_READ = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SsaIndirectRead.Matcher.class);

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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SsaIndirectRead.Match> getAllMatches(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return rawStreamAllMatches(new Object[]{pRead}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SsaIndirectRead.Match> streamAllMatches(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return rawStreamAllMatches(new Object[]{pRead});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SsaIndirectRead.Match> getOneArbitraryMatch(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return rawGetOneArbitraryMatch(new Object[]{pRead});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return rawHasMatch(new Object[]{pRead});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return rawCountMatches(new Object[]{pRead});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead, final Consumer<? super SsaIndirectRead.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRead}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRead the fixed value of pattern parameter read, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SsaIndirectRead.Match newMatch(final hu.metadom.hls.ssamodel.SsaIndirectRead pRead) {
      return SsaIndirectRead.Match.newMatch(pRead);
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<hu.metadom.hls.ssamodel.SsaIndirectRead> rawStreamAllValuesOfread(final Object[] parameters) {
      return rawStreamAllValues(POSITION_READ, parameters).map(hu.metadom.hls.ssamodel.SsaIndirectRead.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<hu.metadom.hls.ssamodel.SsaIndirectRead> getAllValuesOfread() {
      return rawStreamAllValuesOfread(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for read.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<hu.metadom.hls.ssamodel.SsaIndirectRead> streamAllValuesOfread() {
      return rawStreamAllValuesOfread(emptyArray());
    }

    @Override
    protected SsaIndirectRead.Match tupleToMatch(final Tuple t) {
      try {
          return SsaIndirectRead.Match.newMatch((hu.metadom.hls.ssamodel.SsaIndirectRead) t.get(POSITION_READ));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SsaIndirectRead.Match arrayToMatch(final Object[] match) {
      try {
          return SsaIndirectRead.Match.newMatch((hu.metadom.hls.ssamodel.SsaIndirectRead) match[POSITION_READ]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected SsaIndirectRead.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SsaIndirectRead.Match.newMutableMatch((hu.metadom.hls.ssamodel.SsaIndirectRead) match[POSITION_READ]);
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
    public static IQuerySpecification<SsaIndirectRead.Matcher> querySpecification() {
      return SsaIndirectRead.instance();
    }
  }

  private SsaIndirectRead() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SsaIndirectRead instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected SsaIndirectRead.Matcher instantiate(final ViatraQueryEngine engine) {
    return SsaIndirectRead.Matcher.on(engine);
  }

  @Override
  public SsaIndirectRead.Matcher instantiate() {
    return SsaIndirectRead.Matcher.create();
  }

  @Override
  public SsaIndirectRead.Match newEmptyMatch() {
    return SsaIndirectRead.Match.newEmptyMatch();
  }

  @Override
  public SsaIndirectRead.Match newMatch(final Object... parameters) {
    return SsaIndirectRead.Match.newMatch((hu.metadom.hls.ssamodel.SsaIndirectRead) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link SsaIndirectRead} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SsaIndirectRead#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SsaIndirectRead INSTANCE = new SsaIndirectRead();

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
    private static final SsaIndirectRead.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_read = new PParameter("read", "hu.metadom.hls.ssamodel.SsaIndirectRead", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaIndirectRead")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_read);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.ssaIndirectRead";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("read");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_read), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectRead")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_read, parameter_read)
          ));
          // 	SsaIndirectRead(read)
          new TypeConstraint(body, Tuples.flatTupleOf(var_read), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaIndirectRead")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
