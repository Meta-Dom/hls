/**
 * Generated from platform:/resource/hu.metadom.hls.ssamodel.query/src/hu/metadom/hls/ssamodel/query/transformationQueriesPointerEliminate.vql
 */
package hu.metadom.hls.ssamodel.query.internal;

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
 *         private pattern functionWithPointerParam(func: SsaFunction, param: SsaParam) {
 *         	SsaFunction.parameters(func, param);
 *         	SsaParam.type(param, paramType);
 *         	PointerType(paramType);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class FunctionWithPointerParam extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private FunctionWithPointerParam() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FunctionWithPointerParam instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  /**
   * Inner class allowing the singleton instance of {@link FunctionWithPointerParam} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FunctionWithPointerParam#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FunctionWithPointerParam INSTANCE = new FunctionWithPointerParam();

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
    private static final FunctionWithPointerParam.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_func = new PParameter("func", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaParam")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_func, parameter_param);

    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.functionWithPointerParam";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("func","param");
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
          PVariable var_func = body.getOrCreateVariableByName("func");
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var_paramType = body.getOrCreateVariableByName("paramType");
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_func, parameter_func),
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	SsaFunction.parameters(func, param)
          new TypeConstraint(body, Tuples.flatTupleOf(var_func), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_func, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction", "parameters")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new Equality(body, var__virtual_0_, var_param);
          // 	SsaParam.type(param, paramType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hls.metadom.hu/ssaModel", "SsaNode", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "Type")));
          new Equality(body, var__virtual_1_, var_paramType);
          // 	PointerType(paramType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_paramType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "PointerType")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
