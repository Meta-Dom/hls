/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesHandleControls.vql
 */
package hu.metadom.hls.ssamodel.query;

import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaControl;
import hu.metadom.hls.ssamodel.SsaDowhile;
import hu.metadom.hls.ssamodel.SsaSwitch;
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
 *         pattern findContinueWithFunctionLoopBlock(parentOfDowhile: SsaBlock, dowhile: SsaDowhile, closestSwitchToControl: SsaSwitch, parentOfControl: SsaBlock, control: SsaControl){
 *         	SsaBlock.nodes(parentOfControl, control);
 *         	SsaControl.controlType(control, ::CONTINUE);
 *         	find reachableFromDowhile(dowhile, control);
 *         	SsaBlock.nodes(parentOfDowhile, dowhile);
 *         	find switchInnerBlock(closestSwitchToControl, parentOfControl);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FindContinueWithFunctionLoopBlock extends BaseGeneratedEMFQuerySpecification<FindContinueWithFunctionLoopBlock.Matcher> {
  /**
   * Pattern-specific match representation of the hu.metadom.hls.ssamodel.query.findContinueWithFunctionLoopBlock pattern,
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
    private SsaBlock fParentOfDowhile;

    private SsaDowhile fDowhile;

    private SsaSwitch fClosestSwitchToControl;

    private SsaBlock fParentOfControl;

    private SsaControl fControl;

    private static List<String> parameterNames = makeImmutableList("parentOfDowhile", "dowhile", "closestSwitchToControl", "parentOfControl", "control");

    private Match(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      this.fParentOfDowhile = pParentOfDowhile;
      this.fDowhile = pDowhile;
      this.fClosestSwitchToControl = pClosestSwitchToControl;
      this.fParentOfControl = pParentOfControl;
      this.fControl = pControl;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "parentOfDowhile": return this.fParentOfDowhile;
          case "dowhile": return this.fDowhile;
          case "closestSwitchToControl": return this.fClosestSwitchToControl;
          case "parentOfControl": return this.fParentOfControl;
          case "control": return this.fControl;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fParentOfDowhile;
          case 1: return this.fDowhile;
          case 2: return this.fClosestSwitchToControl;
          case 3: return this.fParentOfControl;
          case 4: return this.fControl;
          default: return null;
      }
    }

    public SsaBlock getParentOfDowhile() {
      return this.fParentOfDowhile;
    }

    public SsaDowhile getDowhile() {
      return this.fDowhile;
    }

    public SsaSwitch getClosestSwitchToControl() {
      return this.fClosestSwitchToControl;
    }

    public SsaBlock getParentOfControl() {
      return this.fParentOfControl;
    }

    public SsaControl getControl() {
      return this.fControl;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("parentOfDowhile".equals(parameterName) ) {
          this.fParentOfDowhile = (SsaBlock) newValue;
          return true;
      }
      if ("dowhile".equals(parameterName) ) {
          this.fDowhile = (SsaDowhile) newValue;
          return true;
      }
      if ("closestSwitchToControl".equals(parameterName) ) {
          this.fClosestSwitchToControl = (SsaSwitch) newValue;
          return true;
      }
      if ("parentOfControl".equals(parameterName) ) {
          this.fParentOfControl = (SsaBlock) newValue;
          return true;
      }
      if ("control".equals(parameterName) ) {
          this.fControl = (SsaControl) newValue;
          return true;
      }
      return false;
    }

    public void setParentOfDowhile(final SsaBlock pParentOfDowhile) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParentOfDowhile = pParentOfDowhile;
    }

    public void setDowhile(final SsaDowhile pDowhile) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDowhile = pDowhile;
    }

    public void setClosestSwitchToControl(final SsaSwitch pClosestSwitchToControl) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClosestSwitchToControl = pClosestSwitchToControl;
    }

    public void setParentOfControl(final SsaBlock pParentOfControl) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParentOfControl = pParentOfControl;
    }

    public void setControl(final SsaControl pControl) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fControl = pControl;
    }

    @Override
    public String patternName() {
      return "hu.metadom.hls.ssamodel.query.findContinueWithFunctionLoopBlock";
    }

    @Override
    public List<String> parameterNames() {
      return FindContinueWithFunctionLoopBlock.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fParentOfDowhile, fDowhile, fClosestSwitchToControl, fParentOfControl, fControl};
    }

    @Override
    public FindContinueWithFunctionLoopBlock.Match toImmutable() {
      return isMutable() ? newMatch(fParentOfDowhile, fDowhile, fClosestSwitchToControl, fParentOfControl, fControl) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"parentOfDowhile\"=" + prettyPrintValue(fParentOfDowhile) + ", ");
      result.append("\"dowhile\"=" + prettyPrintValue(fDowhile) + ", ");
      result.append("\"closestSwitchToControl\"=" + prettyPrintValue(fClosestSwitchToControl) + ", ");
      result.append("\"parentOfControl\"=" + prettyPrintValue(fParentOfControl) + ", ");
      result.append("\"control\"=" + prettyPrintValue(fControl));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fParentOfDowhile, fDowhile, fClosestSwitchToControl, fParentOfControl, fControl);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FindContinueWithFunctionLoopBlock.Match)) {
          FindContinueWithFunctionLoopBlock.Match other = (FindContinueWithFunctionLoopBlock.Match) obj;
          return Objects.equals(fParentOfDowhile, other.fParentOfDowhile) && Objects.equals(fDowhile, other.fDowhile) && Objects.equals(fClosestSwitchToControl, other.fClosestSwitchToControl) && Objects.equals(fParentOfControl, other.fParentOfControl) && Objects.equals(fControl, other.fControl);
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
    public FindContinueWithFunctionLoopBlock specification() {
      return FindContinueWithFunctionLoopBlock.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FindContinueWithFunctionLoopBlock.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FindContinueWithFunctionLoopBlock.Match newMutableMatch(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return new Mutable(pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FindContinueWithFunctionLoopBlock.Match newMatch(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return new Immutable(pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl);
    }

    private static final class Mutable extends FindContinueWithFunctionLoopBlock.Match {
      Mutable(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
        super(pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FindContinueWithFunctionLoopBlock.Match {
      Immutable(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
        super(pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the hu.metadom.hls.ssamodel.query.findContinueWithFunctionLoopBlock pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern findContinueWithFunctionLoopBlock(parentOfDowhile: SsaBlock, dowhile: SsaDowhile, closestSwitchToControl: SsaSwitch, parentOfControl: SsaBlock, control: SsaControl){
   * 	SsaBlock.nodes(parentOfControl, control);
   * 	SsaControl.controlType(control, ::CONTINUE);
   * 	find reachableFromDowhile(dowhile, control);
   * 	SsaBlock.nodes(parentOfDowhile, dowhile);
   * 	find switchInnerBlock(closestSwitchToControl, parentOfControl);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FindContinueWithFunctionLoopBlock
   * 
   */
  public static class Matcher extends BaseMatcher<FindContinueWithFunctionLoopBlock.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FindContinueWithFunctionLoopBlock.Matcher on(final ViatraQueryEngine engine) {
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
    public static FindContinueWithFunctionLoopBlock.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_PARENTOFDOWHILE = 0;

    private static final int POSITION_DOWHILE = 1;

    private static final int POSITION_CLOSESTSWITCHTOCONTROL = 2;

    private static final int POSITION_PARENTOFCONTROL = 3;

    private static final int POSITION_CONTROL = 4;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FindContinueWithFunctionLoopBlock.Matcher.class);

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
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FindContinueWithFunctionLoopBlock.Match> getAllMatches(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllMatches(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FindContinueWithFunctionLoopBlock.Match> streamAllMatches(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllMatches(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FindContinueWithFunctionLoopBlock.Match> getOneArbitraryMatch(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawGetOneArbitraryMatch(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawHasMatch(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawCountMatches(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl});
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl, final Consumer<? super FindContinueWithFunctionLoopBlock.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParentOfDowhile the fixed value of pattern parameter parentOfDowhile, or null if not bound.
     * @param pDowhile the fixed value of pattern parameter dowhile, or null if not bound.
     * @param pClosestSwitchToControl the fixed value of pattern parameter closestSwitchToControl, or null if not bound.
     * @param pParentOfControl the fixed value of pattern parameter parentOfControl, or null if not bound.
     * @param pControl the fixed value of pattern parameter control, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FindContinueWithFunctionLoopBlock.Match newMatch(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return FindContinueWithFunctionLoopBlock.Match.newMatch(pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl);
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBlock> rawStreamAllValuesOfparentOfDowhile(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARENTOFDOWHILE, parameters).map(SsaBlock.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentOfDowhile() {
      return rawStreamAllValuesOfparentOfDowhile(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentOfDowhile() {
      return rawStreamAllValuesOfparentOfDowhile(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentOfDowhile(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfparentOfDowhile(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentOfDowhile(final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllValuesOfparentOfDowhile(new Object[]{null, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl});
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentOfDowhile(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfparentOfDowhile(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfDowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentOfDowhile(final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllValuesOfparentOfDowhile(new Object[]{null, pDowhile, pClosestSwitchToControl, pParentOfControl, pControl}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaDowhile> rawStreamAllValuesOfdowhile(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DOWHILE, parameters).map(SsaDowhile.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaDowhile> getAllValuesOfdowhile() {
      return rawStreamAllValuesOfdowhile(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaDowhile> streamAllValuesOfdowhile() {
      return rawStreamAllValuesOfdowhile(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaDowhile> streamAllValuesOfdowhile(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfdowhile(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaDowhile> streamAllValuesOfdowhile(final SsaBlock pParentOfDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllValuesOfdowhile(new Object[]{pParentOfDowhile, null, pClosestSwitchToControl, pParentOfControl, pControl});
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaDowhile> getAllValuesOfdowhile(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfdowhile(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for dowhile.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaDowhile> getAllValuesOfdowhile(final SsaBlock pParentOfDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllValuesOfdowhile(new Object[]{pParentOfDowhile, null, pClosestSwitchToControl, pParentOfControl, pControl}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaSwitch> rawStreamAllValuesOfclosestSwitchToControl(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLOSESTSWITCHTOCONTROL, parameters).map(SsaSwitch.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaSwitch> getAllValuesOfclosestSwitchToControl() {
      return rawStreamAllValuesOfclosestSwitchToControl(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaSwitch> streamAllValuesOfclosestSwitchToControl() {
      return rawStreamAllValuesOfclosestSwitchToControl(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaSwitch> streamAllValuesOfclosestSwitchToControl(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfclosestSwitchToControl(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaSwitch> streamAllValuesOfclosestSwitchToControl(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllValuesOfclosestSwitchToControl(new Object[]{pParentOfDowhile, pDowhile, null, pParentOfControl, pControl});
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaSwitch> getAllValuesOfclosestSwitchToControl(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfclosestSwitchToControl(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for closestSwitchToControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaSwitch> getAllValuesOfclosestSwitchToControl(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaBlock pParentOfControl, final SsaControl pControl) {
      return rawStreamAllValuesOfclosestSwitchToControl(new Object[]{pParentOfDowhile, pDowhile, null, pParentOfControl, pControl}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaBlock> rawStreamAllValuesOfparentOfControl(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARENTOFCONTROL, parameters).map(SsaBlock.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentOfControl() {
      return rawStreamAllValuesOfparentOfControl(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentOfControl() {
      return rawStreamAllValuesOfparentOfControl(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentOfControl(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfparentOfControl(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaBlock> streamAllValuesOfparentOfControl(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaControl pControl) {
      return rawStreamAllValuesOfparentOfControl(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, null, pControl});
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentOfControl(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfparentOfControl(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for parentOfControl.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaBlock> getAllValuesOfparentOfControl(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaControl pControl) {
      return rawStreamAllValuesOfparentOfControl(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, null, pControl}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SsaControl> rawStreamAllValuesOfcontrol(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CONTROL, parameters).map(SsaControl.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaControl> getAllValuesOfcontrol() {
      return rawStreamAllValuesOfcontrol(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaControl> streamAllValuesOfcontrol() {
      return rawStreamAllValuesOfcontrol(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaControl> streamAllValuesOfcontrol(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfcontrol(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SsaControl> streamAllValuesOfcontrol(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl) {
      return rawStreamAllValuesOfcontrol(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, null});
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaControl> getAllValuesOfcontrol(final FindContinueWithFunctionLoopBlock.Match partialMatch) {
      return rawStreamAllValuesOfcontrol(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for control.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SsaControl> getAllValuesOfcontrol(final SsaBlock pParentOfDowhile, final SsaDowhile pDowhile, final SsaSwitch pClosestSwitchToControl, final SsaBlock pParentOfControl) {
      return rawStreamAllValuesOfcontrol(new Object[]{pParentOfDowhile, pDowhile, pClosestSwitchToControl, pParentOfControl, null}).collect(Collectors.toSet());
    }

    @Override
    protected FindContinueWithFunctionLoopBlock.Match tupleToMatch(final Tuple t) {
      try {
          return FindContinueWithFunctionLoopBlock.Match.newMatch((SsaBlock) t.get(POSITION_PARENTOFDOWHILE), (SsaDowhile) t.get(POSITION_DOWHILE), (SsaSwitch) t.get(POSITION_CLOSESTSWITCHTOCONTROL), (SsaBlock) t.get(POSITION_PARENTOFCONTROL), (SsaControl) t.get(POSITION_CONTROL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FindContinueWithFunctionLoopBlock.Match arrayToMatch(final Object[] match) {
      try {
          return FindContinueWithFunctionLoopBlock.Match.newMatch((SsaBlock) match[POSITION_PARENTOFDOWHILE], (SsaDowhile) match[POSITION_DOWHILE], (SsaSwitch) match[POSITION_CLOSESTSWITCHTOCONTROL], (SsaBlock) match[POSITION_PARENTOFCONTROL], (SsaControl) match[POSITION_CONTROL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FindContinueWithFunctionLoopBlock.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FindContinueWithFunctionLoopBlock.Match.newMutableMatch((SsaBlock) match[POSITION_PARENTOFDOWHILE], (SsaDowhile) match[POSITION_DOWHILE], (SsaSwitch) match[POSITION_CLOSESTSWITCHTOCONTROL], (SsaBlock) match[POSITION_PARENTOFCONTROL], (SsaControl) match[POSITION_CONTROL]);
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
    public static IQuerySpecification<FindContinueWithFunctionLoopBlock.Matcher> querySpecification() {
      return FindContinueWithFunctionLoopBlock.instance();
    }
  }

  private FindContinueWithFunctionLoopBlock() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FindContinueWithFunctionLoopBlock instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FindContinueWithFunctionLoopBlock.Matcher instantiate(final ViatraQueryEngine engine) {
    return FindContinueWithFunctionLoopBlock.Matcher.on(engine);
  }

  @Override
  public FindContinueWithFunctionLoopBlock.Matcher instantiate() {
    return FindContinueWithFunctionLoopBlock.Matcher.create();
  }

  @Override
  public FindContinueWithFunctionLoopBlock.Match newEmptyMatch() {
    return FindContinueWithFunctionLoopBlock.Match.newEmptyMatch();
  }

  @Override
  public FindContinueWithFunctionLoopBlock.Match newMatch(final Object... parameters) {
    return FindContinueWithFunctionLoopBlock.Match.newMatch((hu.metadom.hls.ssamodel.SsaBlock) parameters[0], (hu.metadom.hls.ssamodel.SsaDowhile) parameters[1], (hu.metadom.hls.ssamodel.SsaSwitch) parameters[2], (hu.metadom.hls.ssamodel.SsaBlock) parameters[3], (hu.metadom.hls.ssamodel.SsaControl) parameters[4]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FindContinueWithFunctionLoopBlock} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FindContinueWithFunctionLoopBlock#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FindContinueWithFunctionLoopBlock INSTANCE = new FindContinueWithFunctionLoopBlock();

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
    private static final FindContinueWithFunctionLoopBlock.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_parentOfDowhile = new PParameter("parentOfDowhile", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final PParameter parameter_dowhile = new PParameter("dowhile", "hu.metadom.hls.ssamodel.SsaDowhile", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaDowhile")), PParameterDirection.INOUT);

    private final PParameter parameter_closestSwitchToControl = new PParameter("closestSwitchToControl", "hu.metadom.hls.ssamodel.SsaSwitch", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaSwitch")), PParameterDirection.INOUT);

    private final PParameter parameter_parentOfControl = new PParameter("parentOfControl", "hu.metadom.hls.ssamodel.SsaBlock", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaBlock")), PParameterDirection.INOUT);

    private final PParameter parameter_control = new PParameter("control", "hu.metadom.hls.ssamodel.SsaControl", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaControl")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_parentOfDowhile, parameter_dowhile, parameter_closestSwitchToControl, parameter_parentOfControl, parameter_control);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.findContinueWithFunctionLoopBlock";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentOfDowhile","dowhile","closestSwitchToControl","parentOfControl","control");
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
          PVariable var_parentOfDowhile = body.getOrCreateVariableByName("parentOfDowhile");
          PVariable var_dowhile = body.getOrCreateVariableByName("dowhile");
          PVariable var_closestSwitchToControl = body.getOrCreateVariableByName("closestSwitchToControl");
          PVariable var_parentOfControl = body.getOrCreateVariableByName("parentOfControl");
          PVariable var_control = body.getOrCreateVariableByName("control");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentOfDowhile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_dowhile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaDowhile")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_closestSwitchToControl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaSwitch")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentOfControl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_control), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaControl")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parentOfDowhile, parameter_parentOfDowhile),
             new ExportedParameter(body, var_dowhile, parameter_dowhile),
             new ExportedParameter(body, var_closestSwitchToControl, parameter_closestSwitchToControl),
             new ExportedParameter(body, var_parentOfControl, parameter_parentOfControl),
             new ExportedParameter(body, var_control, parameter_control)
          ));
          // 	SsaBlock.nodes(parentOfControl, control)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentOfControl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentOfControl, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_0_, var_control);
          // 	SsaControl.controlType(control, ::CONTINUE)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://hls.metadom.hu/ssaModel", "ControlType", "CONTINUE").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_control), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaControl")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_control, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaControl", "controlType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "ControlType")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          // 	find reachableFromDowhile(dowhile, control)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_dowhile, var_control), ReachableFromDowhile.instance().getInternalQueryRepresentation());
          // 	SsaBlock.nodes(parentOfDowhile, dowhile)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentOfDowhile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentOfDowhile, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaBlock", "nodes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new Equality(body, var__virtual_3_, var_dowhile);
          // 	find switchInnerBlock(closestSwitchToControl, parentOfControl)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_closestSwitchToControl, var_parentOfControl), SwitchInnerBlock.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
