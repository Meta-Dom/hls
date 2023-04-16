/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/validationHelperQueries.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaNode;
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
 *         pattern typesForNode(t1: Type, t2: Type, op: SsaNode){
 *         	SsaBinaryOperator.right.type(op, t1);
 *         	SsaBinaryOperator.left.type(op, t2);
 *         } or {
 *         	SsaUnaryOperator.type(op, t1);
 *         	SsaUnaryOperator.operand.type(op, t2);
 *         } or {
 *         	SsaAssign.type(op, t1);
 *         	SsaAssign.value.type(op, t2);
 *         } or {
 *         	SsaPhi.type(op, t1);
 *         	SsaPhi.previous.node.type(op, t2);
 *         } or {
 *         	SsaInit.type(op, t1);
 *         	SsaInit.value.type(op, t2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TypesForNode extends BaseGeneratedEMFQuerySpecification<TypesForNode.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.typesForNode pattern,
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

    private SsaNode fOp;

    private static List<String> parameterNames = makeImmutableList("t1", "t2", "op");

    private Match(final Type pT1, final Type pT2, final SsaNode pOp) {
      this.fT1 = pT1;
      this.fT2 = pT2;
      this.fOp = pOp;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "t1": return this.fT1;
          case "t2": return this.fT2;
          case "op": return this.fOp;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fT1;
          case 1: return this.fT2;
          case 2: return this.fOp;
          default: return null;
      }
    }

    public Type getT1() {
      return this.fT1;
    }

    public Type getT2() {
      return this.fT2;
    }

    public SsaNode getOp() {
      return this.fOp;
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
      if ("op".equals(parameterName) ) {
          this.fOp = (SsaNode) newValue;
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

    public void setOp(final SsaNode pOp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOp = pOp;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.typesForNode";
    }

    @Override
    public List<String> parameterNames() {
      return TypesForNode.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fT1, fT2, fOp};
    }

    @Override
    public TypesForNode.Match toImmutable() {
      return isMutable() ? newMatch(fT1, fT2, fOp) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t1\"=" + prettyPrintValue(fT1) + ", ");
      result.append("\"t2\"=" + prettyPrintValue(fT2) + ", ");
      result.append("\"op\"=" + prettyPrintValue(fOp));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fT1, fT2, fOp);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TypesForNode.Match)) {
          TypesForNode.Match other = (TypesForNode.Match) obj;
          return Objects.equals(fT1, other.fT1) && Objects.equals(fT2, other.fT2) && Objects.equals(fOp, other.fOp);
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
    public TypesForNode specification() {
      return TypesForNode.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TypesForNode.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TypesForNode.Match newMutableMatch(final Type pT1, final Type pT2, final SsaNode pOp) {
      return new Mutable(pT1, pT2, pOp);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TypesForNode.Match newMatch(final Type pT1, final Type pT2, final SsaNode pOp) {
      return new Immutable(pT1, pT2, pOp);
    }

    private static final class Mutable extends TypesForNode.Match {
      Mutable(final Type pT1, final Type pT2, final SsaNode pOp) {
        super(pT1, pT2, pOp);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends TypesForNode.Match {
      Immutable(final Type pT1, final Type pT2, final SsaNode pOp) {
        super(pT1, pT2, pOp);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.typesForNode pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern typesForNode(t1: Type, t2: Type, op: SsaNode){
   * 	SsaBinaryOperator.right.type(op, t1);
   * 	SsaBinaryOperator.left.type(op, t2);
   * } or {
   * 	SsaUnaryOperator.type(op, t1);
   * 	SsaUnaryOperator.operand.type(op, t2);
   * } or {
   * 	SsaAssign.type(op, t1);
   * 	SsaAssign.value.type(op, t2);
   * } or {
   * 	SsaPhi.type(op, t1);
   * 	SsaPhi.previous.node.type(op, t2);
   * } or {
   * 	SsaInit.type(op, t1);
   * 	SsaInit.value.type(op, t2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TypesForNode
   * 
   */
  public static class Matcher extends BaseMatcher<TypesForNode.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TypesForNode.Matcher on(final ViatraQueryEngine engine) {
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
    public static TypesForNode.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_T1 = 0;

    private static final int POSITION_T2 = 1;

    private static final int POSITION_OP = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TypesForNode.Matcher.class);

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
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TypesForNode.Match> getAllMatches(final Type pT1, final Type pT2, final SsaNode pOp) {
      return rawStreamAllMatches(new Object[]{pT1, pT2, pOp}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TypesForNode.Match> streamAllMatches(final Type pT1, final Type pT2, final SsaNode pOp) {
      return rawStreamAllMatches(new Object[]{pT1, pT2, pOp});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TypesForNode.Match> getOneArbitraryMatch(final Type pT1, final Type pT2, final SsaNode pOp) {
      return rawGetOneArbitraryMatch(new Object[]{pT1, pT2, pOp});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Type pT1, final Type pT2, final SsaNode pOp) {
      return rawHasMatch(new Object[]{pT1, pT2, pOp});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Type pT1, final Type pT2, final SsaNode pOp) {
      return rawCountMatches(new Object[]{pT1, pT2, pOp});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Type pT1, final Type pT2, final SsaNode pOp, final Consumer<? super TypesForNode.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT1, pT2, pOp}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param pOp the fixed value of pattern parameter op, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TypesForNode.Match newMatch(final Type pT1, final Type pT2, final SsaNode pOp) {
      return TypesForNode.Match.newMatch(pT1, pT2, pOp);
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
    public Stream<Type> streamAllValuesOft1(final TypesForNode.Match partialMatch) {
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
    public Stream<Type> streamAllValuesOft1(final Type pT2, final SsaNode pOp) {
      return rawStreamAllValuesOft1(new Object[]{null, pT2, pOp});
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft1(final TypesForNode.Match partialMatch) {
      return rawStreamAllValuesOft1(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft1(final Type pT2, final SsaNode pOp) {
      return rawStreamAllValuesOft1(new Object[]{null, pT2, pOp}).collect(Collectors.toSet());
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
    public Stream<Type> streamAllValuesOft2(final TypesForNode.Match partialMatch) {
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
    public Stream<Type> streamAllValuesOft2(final Type pT1, final SsaNode pOp) {
      return rawStreamAllValuesOft2(new Object[]{pT1, null, pOp});
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft2(final TypesForNode.Match partialMatch) {
      return rawStreamAllValuesOft2(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOft2(final Type pT1, final SsaNode pOp) {
      return rawStreamAllValuesOft2(new Object[]{pT1, null, pOp}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaNode> rawStreamAllValuesOfop(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OP, parameters).map(SsaNode.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfop() {
      return rawStreamAllValuesOfop(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfop() {
      return rawStreamAllValuesOfop(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfop(final TypesForNode.Match partialMatch) {
      return rawStreamAllValuesOfop(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaNode> streamAllValuesOfop(final Type pT1, final Type pT2) {
      return rawStreamAllValuesOfop(new Object[]{pT1, pT2, null});
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfop(final TypesForNode.Match partialMatch) {
      return rawStreamAllValuesOfop(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for op.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaNode> getAllValuesOfop(final Type pT1, final Type pT2) {
      return rawStreamAllValuesOfop(new Object[]{pT1, pT2, null}).collect(Collectors.toSet());
    }

    @Override
    protected TypesForNode.Match tupleToMatch(final Tuple t) {
      try {
          return TypesForNode.Match.newMatch((Type) t.get(POSITION_T1), (Type) t.get(POSITION_T2), (SsaNode) t.get(POSITION_OP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected TypesForNode.Match arrayToMatch(final Object[] match) {
      try {
          return TypesForNode.Match.newMatch((Type) match[POSITION_T1], (Type) match[POSITION_T2], (SsaNode) match[POSITION_OP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected TypesForNode.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TypesForNode.Match.newMutableMatch((Type) match[POSITION_T1], (Type) match[POSITION_T2], (SsaNode) match[POSITION_OP]);
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
    public static IQuerySpecification<TypesForNode.Matcher> querySpecification() {
      return TypesForNode.instance();
    }
  }

  private TypesForNode() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TypesForNode instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected TypesForNode.Matcher instantiate(final ViatraQueryEngine engine) {
    return TypesForNode.Matcher.on(engine);
  }

  @Override
  public TypesForNode.Matcher instantiate() {
    return TypesForNode.Matcher.create();
  }

  @Override
  public TypesForNode.Match newEmptyMatch() {
    return TypesForNode.Match.newEmptyMatch();
  }

  @Override
  public TypesForNode.Match newMatch(final Object... parameters) {
    return TypesForNode.Match.newMatch((hu.metadom.hls.ssamodel.Type) parameters[0], (hu.metadom.hls.ssamodel.Type) parameters[1], (hu.metadom.hls.ssamodel.SsaNode) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link TypesForNode} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TypesForNode#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TypesForNode INSTANCE = new TypesForNode();

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
    private static final TypesForNode.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_t1 = new PParameter("t1", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final PParameter parameter_t2 = new PParameter("t2", "hu.metadom.hls.ssamodel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "Type")), PParameterDirection.INOUT);

    private final PParameter parameter_op = new PParameter("op", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_t1, parameter_t2, parameter_op);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.typesForNode";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t1","t2","op");
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
          PVariable var_op = body.getOrCreateVariableByName("op");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2),
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	SsaBinaryOperator.right.type(op, t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "right")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_1_, var_t1);
          // 	SsaBinaryOperator.left.type(op, t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBinaryOperator", "left")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_3_, var_t2);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          PVariable var_op = body.getOrCreateVariableByName("op");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2),
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	SsaUnaryOperator.type(op, t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_0_, var_t1);
          // 	SsaUnaryOperator.operand.type(op, t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaUnaryOperator", "operand")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_2_, var_t2);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          PVariable var_op = body.getOrCreateVariableByName("op");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2),
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	SsaAssign.type(op, t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_0_, var_t1);
          // 	SsaAssign.value.type(op, t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaAssign", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_2_, var_t2);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          PVariable var_op = body.getOrCreateVariableByName("op");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2),
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	SsaPhi.type(op, t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPhi")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_0_, var_t1);
          // 	SsaPhi.previous.node.type(op, t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaPhi")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaPhi", "previous")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNodeRef", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_3_, var_t2);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          PVariable var_op = body.getOrCreateVariableByName("op");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2),
             new ExportedParameter(body, var_op, parameter_op)
          ));
          // 	SsaInit.type(op, t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInit")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_0_, var_t1);
          // 	SsaInit.value.type(op, t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaInit")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaInit", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_2_, var_t2);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
