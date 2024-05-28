package teste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {

}
