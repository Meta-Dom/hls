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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         private pattern arrayPointerParamInFunction(function: SsaFunction, param: SsaParam, v: SsaVar) {
 *         	find pointerParamInFunction(function, param, v);
 *         	neg find notArrayPointerVar(v);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class ArrayPointerParamInFunction extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private ArrayPointerParamInFunction() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ArrayPointerParamInFunction instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  /**
   * Inner class allowing the singleton instance of {@link ArrayPointerParamInFunction} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ArrayPointerParamInFunction#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ArrayPointerParamInFunction INSTANCE = new ArrayPointerParamInFunction();

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
    private static final ArrayPointerParamInFunction.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_function = new PParameter("function", "hu.metadom.hls.ssamodel.SsaFunction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaFunction")), PParameterDirection.INOUT);

    private final PParameter parameter_param = new PParameter("param", "hu.metadom.hls.ssamodel.SsaParam", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaParam")), PParameterDirection.INOUT);

    private final PParameter parameter_v = new PParameter("v", "hu.metadom.hls.ssamodel.SsaVar", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hls.metadom.hu/ssaModel", "SsaVar")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_function, parameter_param, parameter_v);

    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }

    @Override
    public String getFullyQualifiedName() {
      return "hu.metadom.hls.ssamodel.query.arrayPointerParamInFunction";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("function","param","v");
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
          PVariable var_function = body.getOrCreateVariableByName("function");
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var_v = body.getOrCreateVariableByName("v");
          new TypeConstraint(body, Tuples.flatTupleOf(var_function), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaFunction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaParam")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hls.metadom.hu/ssaModel", "SsaVar")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_function, parameter_function),
             new ExportedParameter(body, var_param, parameter_param),
             new ExportedParameter(body, var_v, parameter_v)
          ));
          // 	find pointerParamInFunction(function, param, v)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_function, var_param, var_v), PointerParamInFunction.instance().getInternalQueryRepresentation());
          // 	neg find notArrayPointerVar(v)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_v), NotArrayPointerVar.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
