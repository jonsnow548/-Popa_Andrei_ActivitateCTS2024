package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.CUMock;
import teste.categorii.FaraMock;
import teste.dubluri.PersoanaFAke;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(FaraMock.class)
    public void testeazaCorectitudineAplicaDiscount() {

        IPersoana client = new Persoana("Andrei", "5240329170022");
        PachetTuristic pachetTuristic = new PachetTuristic(client, " Destinatie1", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(80.0, pachetTuristic.getPret(), 0.01);


    }

    @Test
    @Category(FaraMock.class)
    public void aplicadiscountBoundery() {
        IPersoana client = new Persoana("Dan", "159020476448933");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.5);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30.15, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CUMock.class)
    public void valoareAplicataDiscountFake() {
        PersoanaFAke client = new PersoanaFAke();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30, pachetTuristic.getPret(), 0.01);


    }

    @Test
    public void valoareAplicataDiscount100() {
        PersoanaFAke client = new PersoanaFAke();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, pachetTuristic.getPret(), 0.01);

    }

    @Test
    public void valoareAplicataDiscount0() {
        PersoanaFAke client = new PersoanaFAke();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(30.0, pachetTuristic.getPret(), 0.01);

    }
    @Test
    public void valoareAplicataDiscount1() {
        PersoanaFAke client = new PersoanaFAke();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(29.7, pachetTuristic.getPret(), 0.01);

    }
}