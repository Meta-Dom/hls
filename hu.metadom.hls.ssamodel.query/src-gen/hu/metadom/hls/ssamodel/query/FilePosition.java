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
 *         pattern filePosition(filePos: FilePosition) {
 *         	FilePosition(filePos);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FilePosition extends BaseGeneratedEMFQuerySpecification<FilePosition.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.filePosition pattern,
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
    private hu.metadom.hls.ssamodel.FilePosition fFilePos;

    private static List<String> parameterNames = makeImmutableList("filePos");

    private Match(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      this.fFilePos = pFilePos;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "filePos": return this.fFilePos;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFilePos;
          default: return null;
      }
    }

    public hu.metadom.hls.ssamodel.FilePosition getFilePos() {
      return this.fFilePos;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("filePos".equals(parameterName) ) {
          this.fFilePos = (hu.metadom.hls.ssamodel.FilePosition) newValue;
          return true;
      }
      return false;
    }

    public void setFilePos(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFilePos = pFilePos;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.filePosition";
    }

    @Override
    public List<String> parameterNames() {
      return FilePosition.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fFilePos};
    }

    @Override
    public FilePosition.Match toImmutable() {
      return isMutable() ? newMatch(fFilePos) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"filePos\"=" + prettyPrintValue(fFilePos));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fFilePos);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FilePosition.Match)) {
          FilePosition.Match other = (FilePosition.Match) obj;
          return Objects.equals(fFilePos, other.fFilePos);
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
    public FilePosition specification() {
      return FilePosition.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FilePosition.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FilePosition.Match newMutableMatch(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return new Mutable(pFilePos);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FilePosition.Match newMatch(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return new Immutable(pFilePos);
    }

    private static final class Mutable extends FilePosition.Match {
      Mutable(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
        super(pFilePos);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FilePosition.Match {
      Immutable(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
        super(pFilePos);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.filePosition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern filePosition(filePos: FilePosition) {
   * 	FilePosition(filePos);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FilePosition
   * 
   */
  public static class Matcher extends BaseMatcher<FilePosition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FilePosition.Matcher on(final ViatraQueryEngine engine) {
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
    public static FilePosition.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_FILEPOS = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FilePosition.Matcher.class);

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
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FilePosition.Match> getAllMatches(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return rawStreamAllMatches(new Object[]{pFilePos}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FilePosition.Match> streamAllMatches(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return rawStreamAllMatches(new Object[]{pFilePos});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FilePosition.Match> getOneArbitraryMatch(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return rawGetOneArbitraryMatch(new Object[]{pFilePos});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return rawHasMatch(new Object[]{pFilePos});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return rawCountMatches(new Object[]{pFilePos});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final hu.metadom.hls.ssamodel.FilePosition pFilePos, final Consumer<? super FilePosition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFilePos}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFilePos the fixed value of pattern parameter filePos, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FilePosition.Match newMatch(final hu.metadom.hls.ssamodel.FilePosition pFilePos) {
      return FilePosition.Match.newMatch(pFilePos);
    }

    /**
     * Retrieve the set of values that occur in matches for filePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<hu.metadom.hls.ssamodel.FilePosition> rawStreamAllValuesOffilePos(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FILEPOS, parameters).map(hu.metadom.hls.ssamodel.FilePosition.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for filePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<hu.metadom.hls.ssamodel.FilePosition> getAllValuesOffilePos() {
      return rawStreamAllValuesOffilePos(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for filePos.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<hu.metadom.hls.ssamodel.FilePosition> streamAllValuesOffilePos() {
      return rawStreamAllValuesOffilePos(emptyArray());
    }

    @Override
    protected FilePosition.Match tupleToMatch(final Tuple t) {
      try {
          return FilePosition.Match.newMatch((hu.metadom.hls.ssamodel.FilePosition) t.get(POSITION_FILEPOS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FilePosition.Match arrayToMatch(final Object[] match) {
      try {
          return FilePosition.Match.newMatch((hu.metadom.hls.ssamodel.FilePosition) match[POSITION_FILEPOS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FilePosition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FilePosition.Match.newMutableMatch((hu.metadom.hls.ssamodel.FilePosition) match[POSITION_FILEPOS]);
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
    public static IQuerySpecification<FilePosition.Matcher> querySpecification() {
      return FilePosition.instance();
    }
  }

  private FilePosition() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FilePosition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FilePosition.Matcher instantiate(final ViatraQueryEngine engine) {
    return FilePosition.Matcher.on(engine);
  }

  @Override
  public FilePosition.Matcher instantiate() {
    return FilePosition.Matcher.create();
  }

  @Override
  public FilePosition.Match newEmptyMatch() {
    return FilePosition.Match.newEmptyMatch();
  }

  @Override
  public FilePosition.Match newMatch(final Object... parameters) {
    return FilePosition.Match.newMatch((hu.metadom.hls.ssamodel.FilePosition) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FilePosition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FilePosition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FilePosition INSTANCE = new FilePosition();

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
    private static final FilePosition.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_filePos = new PParameter("filePos", "hu.metadom.hls.ssamodel.FilePosition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "FilePosition")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_filePos);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.filePosition";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("filePos");
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
          PVariable var_filePos = body.getOrCreateVariableByName("filePos");
          new TypeConstraint(body, Tuples.flatTupleOf(var_filePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "FilePosition")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_filePos, parameter_filePos)
          ));
          // 	FilePosition(filePos)
          new TypeConstraint(body, Tuples.flatTupleOf(var_filePos), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "FilePosition")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
