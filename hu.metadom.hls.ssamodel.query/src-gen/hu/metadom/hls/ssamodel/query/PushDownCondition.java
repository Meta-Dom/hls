/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaArgument;
import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.query.internal.CallArgumentNode;
import hu.metadom.hls.ssamodel.query.internal.UnderDowhile;
import hu.metadom.hls.ssamodel.query.internal.VarStrictInitNode;
import hu.metadom.hls.ssamodel.query.internal.VariableCanNotPushDown;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
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
 *         pattern pushDownCondition(targetFunction: SsaFunction, variable: SsaVar, arg: SsaArgument) {
 *         	
 *         	1 == count find ssaCallFunction(_, targetFunction);
 *         	find ssaCallFunction(targetCall, targetFunction);
 *         	
 *         	find varStrictInitNode(variable, initNode);
 *         	
 *         	1 == count find nodeUseNode(_, initNode);
 *         	find nodeUseNode(targetCall, initNode);
 *         	
 *         	1 == count find callArgumentNode(targetCall, _, initNode);
 *         	find callArgumentNode(targetCall, arg, initNode);
 *         	
 *         	neg find variableCanNotPushDown(_, variable, initNode, targetCall);
 *         	
 *         	neg find underDowhile(_, targetCall);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PushDownCondition extends BaseGeneratedEMFQuerySpecification<PushDownCondition.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.pushDownCondition pattern,
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
    private SsaFunction fTargetFunction;

    private SsaVar fVariable;

    private SsaArgument fArg;

    private static List<String> parameterNames = makeImmutableList("targetFunction", "variable", "arg");

    private Match(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      this.fTargetFunction = pTargetFunction;
      this.fVariable = pVariable;
      this.fArg = pArg;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "targetFunction": return this.fTargetFunction;
          case "variable": return this.fVariable;
          case "arg": return this.fArg;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTargetFunction;
          case 1: return this.fVariable;
          case 2: return this.fArg;
          default: return null;
      }
    }

    public SsaFunction getTargetFunction() {
      return this.fTargetFunction;
    }

    public SsaVar getVariable() {
      return this.fVariable;
    }

    public SsaArgument getArg() {
      return this.fArg;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("targetFunction".equals(parameterName) ) {
          this.fTargetFunction = (SsaFunction) newValue;
          return true;
      }
      if ("variable".equals(parameterName) ) {
          this.fVariable = (SsaVar) newValue;
          return true;
      }
      if ("arg".equals(parameterName) ) {
          this.fArg = (SsaArgument) newValue;
          return true;
      }
      return false;
    }

    public void setTargetFunction(final SsaFunction pTargetFunction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTargetFunction = pTargetFunction;
    }

    public void setVariable(final SsaVar pVariable) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVariable = pVariable;
    }

    public void setArg(final SsaArgument pArg) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fArg = pArg;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.pushDownCondition";
    }

    @Override
    public List<String> parameterNames() {
      return PushDownCondition.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fTargetFunction, fVariable, fArg};
    }

    @Override
    public PushDownCondition.Match toImmutable() {
      return isMutable() ? newMatch(fTargetFunction, fVariable, fArg) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"targetFunction\"=" + prettyPrintValue(fTargetFunction) + ", ");
      result.append("\"variable\"=" + prettyPrintValue(fVariable) + ", ");
      result.append("\"arg\"=" + prettyPrintValue(fArg));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fTargetFunction, fVariable, fArg);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PushDownCondition.Match)) {
          PushDownCondition.Match other = (PushDownCondition.Match) obj;
          return Objects.equals(fTargetFunction, other.fTargetFunction) && Objects.equals(fVariable, other.fVariable) && Objects.equals(fArg, other.fArg);
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
    public PushDownCondition specification() {
      return PushDownCondition.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PushDownCondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PushDownCondition.Match newMutableMatch(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return new Mutable(pTargetFunction, pVariable, pArg);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PushDownCondition.Match newMatch(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return new Immutable(pTargetFunction, pVariable, pArg);
    }

    private static final class Mutable extends PushDownCondition.Match {
      Mutable(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
        super(pTargetFunction, pVariable, pArg);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends PushDownCondition.Match {
      Immutable(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
        super(pTargetFunction, pVariable, pArg);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.pushDownCondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern pushDownCondition(targetFunction: SsaFunction, variable: SsaVar, arg: SsaArgument) {
   * 	
   * 	1 == count find ssaCallFunction(_, targetFunction);
   * 	find ssaCallFunction(targetCall, targetFunction);
   * 	
   * 	find varStrictInitNode(variable, initNode);
   * 	
   * 	1 == count find nodeUseNode(_, initNode);
   * 	find nodeUseNode(targetCall, initNode);
   * 	
   * 	1 == count find callArgumentNode(targetCall, _, initNode);
   * 	find callArgumentNode(targetCall, arg, initNode);
   * 	
   * 	neg find variableCanNotPushDown(_, variable, initNode, targetCall);
   * 	
   * 	neg find underDowhile(_, targetCall);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PushDownCondition
   * 
   */
  public static class Matcher extends BaseMatcher<PushDownCondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PushDownCondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static PushDownCondition.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_TARGETFUNCTION = 0;

    private static final int POSITION_VARIABLE = 1;

    private static final int POSITION_ARG = 2;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PushDownCondition.Matcher.class);

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
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PushDownCondition.Match> getAllMatches(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return rawStreamAllMatches(new Object[]{pTargetFunction, pVariable, pArg}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PushDownCondition.Match> streamAllMatches(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return rawStreamAllMatches(new Object[]{pTargetFunction, pVariable, pArg});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PushDownCondition.Match> getOneArbitraryMatch(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return rawGetOneArbitraryMatch(new Object[]{pTargetFunction, pVariable, pArg});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return rawHasMatch(new Object[]{pTargetFunction, pVariable, pArg});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return rawCountMatches(new Object[]{pTargetFunction, pVariable, pArg});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg, final Consumer<? super PushDownCondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTargetFunction, pVariable, pArg}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTargetFunction the fixed value of pattern parameter targetFunction, or null if not bound.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pArg the fixed value of pattern parameter arg, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PushDownCondition.Match newMatch(final SsaFunction pTargetFunction, final SsaVar pVariable, final SsaArgument pArg) {
      return PushDownCondition.Match.newMatch(pTargetFunction, pVariable, pArg);
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaFunction> rawStreamAllValuesOftargetFunction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGETFUNCTION, parameters).map(SsaFunction.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOftargetFunction() {
      return rawStreamAllValuesOftargetFunction(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOftargetFunction() {
      return rawStreamAllValuesOftargetFunction(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOftargetFunction(final PushDownCondition.Match partialMatch) {
      return rawStreamAllValuesOftargetFunction(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaFunction> streamAllValuesOftargetFunction(final SsaVar pVariable, final SsaArgument pArg) {
      return rawStreamAllValuesOftargetFunction(new Object[]{null, pVariable, pArg});
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOftargetFunction(final PushDownCondition.Match partialMatch) {
      return rawStreamAllValuesOftargetFunction(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for targetFunction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaFunction> getAllValuesOftargetFunction(final SsaVar pVariable, final SsaArgument pArg) {
      return rawStreamAllValuesOftargetFunction(new Object[]{null, pVariable, pArg}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaVar> rawStreamAllValuesOfvariable(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VARIABLE, parameters).map(SsaVar.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable(final PushDownCondition.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaVar> streamAllValuesOfvariable(final SsaFunction pTargetFunction, final SsaArgument pArg) {
      return rawStreamAllValuesOfvariable(new Object[]{pTargetFunction, null, pArg});
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable(final PushDownCondition.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaVar> getAllValuesOfvariable(final SsaFunction pTargetFunction, final SsaArgument pArg) {
      return rawStreamAllValuesOfvariable(new Object[]{pTargetFunction, null, pArg}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaArgument> rawStreamAllValuesOfarg(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ARG, parameters).map(SsaArgument.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg() {
      return rawStreamAllValuesOfarg(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArgument> streamAllValuesOfarg() {
      return rawStreamAllValuesOfarg(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArgument> streamAllValuesOfarg(final PushDownCondition.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaArgument> streamAllValuesOfarg(final SsaFunction pTargetFunction, final SsaVar pVariable) {
      return rawStreamAllValuesOfarg(new Object[]{pTargetFunction, pVariable, null});
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg(final PushDownCondition.Match partialMatch) {
      return rawStreamAllValuesOfarg(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for arg.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaArgument> getAllValuesOfarg(final SsaFunction pTargetFunction, final SsaVar pVariable) {
      return rawStreamAllValuesOfarg(new Object[]{pTargetFunction, pVariable, null}).collect(Collectors.toSet());
    }

    @Override
    protected PushDownCondition.Match tupleToMatch(final Tuple t) {
      try {
          return PushDownCondition.Match.newMatch((SsaFunction) t.get(POSITION_TARGETFUNCTION), (SsaVar) t.get(POSITION_VARIABLE), (SsaArgument) t.get(POSITION_ARG));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected PushDownCondition.Match arrayToMatch(final Object[] match) {
      try {
          return PushDownCondition.Match.newMatch((SsaFunction) match[POSITION_TARGETFUNCTION], (SsaVar) match[POSITION_VARIABLE], (SsaArgument) match[POSITION_ARG]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected PushDownCondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PushDownCondition.Match.newMutableMatch((SsaFunction) match[POSITION_TARGETFUNCTION], (SsaVar) match[POSITION_VARIABLE], (SsaArgument) match[POSITION_ARG]);
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
    public static IQuerySpecification<PushDownCondition.Matcher> querySpecification() {
      return PushDownCondition.instance();
    }
  }

  private PushDownCondition() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PushDownCondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected PushDownCondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return PushDownCondition.Matcher.on(engine);
  }

  @Override
  public PushDownCondition.Matcher instantiate() {
    return PushDownCondition.Matcher.create();
  }

  @Override
  public PushDownCondition.Match newEmptyMatch() {
    return PushDownCondition.Match.newEmptyMatch();
  }

  @Override
  public PushDownCondition.Match newMatch(final Object... parameters) {
    return PushDownCondition.Match.newMatch((hu.metadom.hls.ssamodel.SsaFunction) parameters[0], (hu.metadom.hls.ssamodel.SsaVar) parameters[1], (hu.metadom.hls.ssamodel.SsaArgument) parameters[2]);
  }

  /**
   * Inner class allowing the singleton instance of {@link PushDownCondition} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PushDownCondition#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PushDownCondition INSTANCE = new PushDownCondition();

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
    private static final PushDownCondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_targetFunction = new PParameter("targetFunction", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_variable = new PParameter("variable", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final PParameter parameter_arg = new PParameter("arg", "hu.metadom.hls.ssamodel.SsaArgument", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaArgument")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_targetFunction, parameter_variable, parameter_arg);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.pushDownCondition";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("targetFunction","variable","arg");
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
          PVariable var_targetFunction = body.getOrCreateVariableByName("targetFunction");
          PVariable var_variable = body.getOrCreateVariableByName("variable");
          PVariable var_arg = body.getOrCreateVariableByName("arg");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_targetCall = body.getOrCreateVariableByName("targetCall");
          PVariable var_initNode = body.getOrCreateVariableByName("initNode");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
          PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_targetFunction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_arg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaArgument")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_targetFunction, parameter_targetFunction),
             new ExportedParameter(body, var_variable, parameter_variable),
             new ExportedParameter(body, var_arg, parameter_arg)
          ));
          // 		1 == count find ssaCallFunction(_, targetFunction)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, 1);
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_, var_targetFunction), SsaCallFunction.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var__virtual_0_, var__virtual_1_);
          // 	find ssaCallFunction(targetCall, targetFunction)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_targetCall, var_targetFunction), SsaCallFunction.instance().getInternalQueryRepresentation());
          // 		find varStrictInitNode(variable, initNode)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_variable, var_initNode), VarStrictInitNode.instance().getInternalQueryRepresentation());
          // 		1 == count find nodeUseNode(_, initNode)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, 1);
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___1_, var_initNode), NodeUseNode.instance().getInternalQueryRepresentation(), var__virtual_3_);
          new Equality(body, var__virtual_2_, var__virtual_3_);
          // 	find nodeUseNode(targetCall, initNode)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_targetCall, var_initNode), NodeUseNode.instance().getInternalQueryRepresentation());
          // 		1 == count find callArgumentNode(targetCall, _, initNode)
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new ConstantValue(body, var__virtual_4_, 1);
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_targetCall, var___2_, var_initNode), CallArgumentNode.instance().getInternalQueryRepresentation(), var__virtual_5_);
          new Equality(body, var__virtual_4_, var__virtual_5_);
          // 	find callArgumentNode(targetCall, arg, initNode)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_targetCall, var_arg, var_initNode), CallArgumentNode.instance().getInternalQueryRepresentation());
          // 		neg find variableCanNotPushDown(_, variable, initNode, targetCall)
          new NegativePatternCall(body, Tuples.flatTupleOf(var___3_, var_variable, var_initNode, var_targetCall), VariableCanNotPushDown.instance().getInternalQueryRepresentation());
          // 		neg find underDowhile(_, targetCall)
          new NegativePatternCall(body, Tuples.flatTupleOf(var___4_, var_targetCall), UnderDowhile.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }

  private static int evaluateExpression_1_1() {
    return 1;
  }

  private static int evaluateExpression_1_2() {
    return 1;
  }

  private static int evaluateExpression_1_3() {
    return 1;
  }
}
