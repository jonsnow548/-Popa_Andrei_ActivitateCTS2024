package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PersoanaTest;
import teste.categorii.CUMock;
import teste.categorii.FaraMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
@Categories.IncludeCategory(FaraMock.class)
public class SuitaCustom {
}
