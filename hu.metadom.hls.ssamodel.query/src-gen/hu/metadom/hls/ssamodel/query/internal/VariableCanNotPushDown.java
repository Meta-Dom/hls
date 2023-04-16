/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesVarLocalization.vql
 */
package hu.metadom.hls.ssamodel.query.internal;

import hu.metadom.hls.ssamodel.query.NodeUseNode;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern variableCanNotPushDown(node: SsaNode, variable: SsaVar, initNode: SsaAbstractInit, callNode: SsaCall) {
 *         	SsaNode.^var(node, variable);
 *         	
 *         	node != initNode;
 *         	
 *         	neg find ssaCallOutputArgument(callNode, node);
 *         	
 *         	// redundant queries for support
 *         	find varStrictInitNode(variable, initNode);
 *         	find nodeUseNode(callNode, initNode);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class VariableCanNotPushDown extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private VariableCanNotPushDown() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VariableCanNotPushDown instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  /**
   * Inner class allowing the singleton instance of {@link VariableCanNotPushDown} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VariableCanNotPushDown#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VariableCanNotPushDown INSTANCE = new VariableCanNotPushDown();

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
    private static final VariableCanNotPushDown.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_node = new PParameter("node", "hu.metadom.hls.ssamodel.SsaNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaNode")), PParameterDirection.INOUT);

    private final PParameter parameter_variable = new PParameter("variable", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final PParameter parameter_initNode = new PParameter("initNode", "hu.metadom.hls.ssamodel.SsaAbstractInit", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaAbstractInit")), PParameterDirection.INOUT);

    private final PParameter parameter_callNode = new PParameter("callNode", "hu.metadom.hls.ssamodel.SsaCall", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaCall")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_node, parameter_variable, parameter_initNode, parameter_callNode);

    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.variableCanNotPushDown";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("node","variable","initNode","callNode");
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
          PVariable var_node = body.getOrCreateVariableByName("node");
          PVariable var_variable = body.getOrCreateVariableByName("variable");
          PVariable var_initNode = body.getOrCreateVariableByName("initNode");
          PVariable var_callNode = body.getOrCreateVariableByName("callNode");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaAbstractInit")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_callNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaCall")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_node, parameter_node),
             new ExportedParameter(body, var_variable, parameter_variable),
             new ExportedParameter(body, var_initNode, parameter_initNode),
             new ExportedParameter(body, var_callNode, parameter_callNode)
          ));
          // 	SsaNode.^var(node, variable)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaNode")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_node, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "var")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          new Equality(body, var__virtual_0_, var_variable);
          // 		node != initNode
          new Inequality(body, var_node, var_initNode);
          // 		neg find ssaCallOutputArgument(callNode, node)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_callNode, var_node), SsaCallOutputArgument.instance().getInternalQueryRepresentation());
          // 		// redundant queries for support	find varStrictInitNode(variable, initNode)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_variable, var_initNode), VarStrictInitNode.instance().getInternalQueryRepresentation());
          // 	find nodeUseNode(callNode, initNode)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_callNode, var_initNode), NodeUseNode.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
