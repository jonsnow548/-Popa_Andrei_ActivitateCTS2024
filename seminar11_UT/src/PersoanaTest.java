import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @Test
    public void getSexReturnF() {
        Persoana pers1= new Persoana("Andrei","5030329170022");
        assertEquals("M",pers1.getSex());


    }

    @Test
    public void getSexReturnM()
    {
        Persoana pers2= new Persoana("Simona","6021118170022");
        assertEquals("F",pers2.getSex());
    }
    @Test
    public void getSexReturnLimitaInferioara_Bound()
    {
        Persoana pers2=new Persoana("Simona","6021118170022");
        assertEquals(pers2.getSex(),"F");
    }
    @Test
    public void getSexParitate_CrossCheck()
    {
        String cnp="1030329170022";
        Persoana persoana= new Persoana("Andrei",cnp);
        String sex;
        if (Integer.valueOf(cnp.charAt(0))%2==0)
        {
            sex=String.valueOf('F');
        }
        else {
            sex=String.valueOf('M');
        }
        assertEquals(persoana.getSex(),sex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorwithNumberOutside()
    {
        Persoana persoana=new Persoana("Andrei","9030329170022");
        persoana.getSex();
    }
    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorwithInvalidCharac()
    {
        Persoana persoana=new Persoana("Andrei","-0030329170022");
        persoana.getSex();
    }

    @Test(expected = NullPointerException.class)
    public void getSexErrorEmptyString()
    {
        Persoana persoana=new Persoana("Andrei","");
        persoana.getSex();
    }

    @Test(timeout =200)
    public void getSexPerformance()
    {
        Persoana persoana= new Persoana("Andrei","5030329170022");
        persoana.getSex();
    }

    @Test
    public void getSexCorrect()
    {
        Persoana persoana= new Persoana("Andrei","5030329170022");
        assertEquals(1,persoana.getSex().length());

    }
    @Test
    public void getSexCorrectByLetter()
    {
        Persoana persoana= new Persoana("Andrei","103032917002");
        boolean isCorrect=persoana.getSex().toLowerCase().equals('m') || persoana.getSex().equals('f');
        assertTrue(isCorrect);

    }
    @Test
    public void getSexOrder()
    {
        Persoana persoana = new Persoana("Andrei","5030329170022");
        Persoana persoana1=new Persoana("Simona", "60211180022");
        assertTrue( persoana.getSex().compareTo(persoana1.getSex())>0);
    }

@Test
public void getSexRange()
{
    Persoana persoana=new Persoana("Simona","8030329170022");
    assertTrue(persoana.getSex().equals("F"));
}
@Test
public void getSexExistance()
{
        Persoana persoana =new Persoana("Simona",null);
        persoana.getSex();
}
@Test
public void getSexCardinality()
{
    Persoana persoana1=new Persoana("Simona","000000000000");
    persoana1.getSex();
}
    @Test
    public void getVarsta() {

    }

    @Test
    public void checkCNP() {
    }
}