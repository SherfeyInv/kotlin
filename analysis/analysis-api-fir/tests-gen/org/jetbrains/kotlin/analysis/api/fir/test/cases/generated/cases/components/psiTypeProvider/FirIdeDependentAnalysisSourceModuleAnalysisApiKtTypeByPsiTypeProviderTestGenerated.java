/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.psiTypeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.psiTypeProvider.AbstractAnalysisApiKtTypeByPsiTypeProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleAnalysisApiKtTypeByPsiTypeProviderTestGenerated extends AbstractAnalysisApiKtTypeByPsiTypeProviderTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Dependent,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInAsKtType() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("anonym.kt")
  public void testAnonym() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/anonym.kt");
  }

  @Test
  @TestMetadata("extends.kt")
  public void testExtends() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/extends.kt");
  }

  @Test
  @TestMetadata("methodTypeParameterWithKotlinUseSite.kt")
  public void testMethodTypeParameterWithKotlinUseSite() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/methodTypeParameterWithKotlinUseSite.kt");
  }

  @Test
  @TestMetadata("methodTypeParameterWithMethodUseSite.kt")
  public void testMethodTypeParameterWithMethodUseSite() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/methodTypeParameterWithMethodUseSite.kt");
  }

  @Test
  @TestMetadata("methodTypeParameterWithTypeParameterUseSite.kt")
  public void testMethodTypeParameterWithTypeParameterUseSite() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/methodTypeParameterWithTypeParameterUseSite.kt");
  }

  @Test
  @TestMetadata("methodTypeParameters.kt")
  public void testMethodTypeParameters() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/methodTypeParameters.kt");
  }

  @Test
  @TestMetadata("nestedGenerics.kt")
  public void testNestedGenerics() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/nestedGenerics.kt");
  }

  @Test
  @TestMetadata("nullableString.kt")
  public void testNullableString() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/nullableString.kt");
  }

  @Test
  @TestMetadata("primitive.kt")
  public void testPrimitive() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/primitive.kt");
  }

  @Test
  @TestMetadata("typeAnnotation.kt")
  public void testTypeAnnotation() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeAnnotation.kt");
  }

  @Test
  @TestMetadata("typeAnnotationOnString.kt")
  public void testTypeAnnotationOnString() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeAnnotationOnString.kt");
  }

  @Test
  @TestMetadata("typeParameterWithKotlinUseSite.kt")
  public void testTypeParameterWithKotlinUseSite() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeParameterWithKotlinUseSite.kt");
  }

  @Test
  @TestMetadata("typeParameterWithMethodUseSite.kt")
  public void testTypeParameterWithMethodUseSite() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeParameterWithMethodUseSite.kt");
  }

  @Test
  @TestMetadata("typeParameters.kt")
  public void testTypeParameters() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeParameters.kt");
  }

  @Test
  @TestMetadata("typeParameters2.kt")
  public void testTypeParameters2() {
    runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeParameters2.kt");
  }
}
