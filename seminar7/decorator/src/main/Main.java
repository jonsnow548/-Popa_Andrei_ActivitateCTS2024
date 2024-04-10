package main;

import clase.decorator.AplicatieMobila;
import clase.decorator.Decorator;
import clase.decorator.Website;
import clase.spital.Diagnostic;
import clase.spital.DiagnosticAbstract;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Diagnostic diagnostic=new Diagnostic("Raceala","Tuse, febra si dureri de gat",false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator1=new AplicatieMobila(diagnostic);
        decorator1.afisareOnline();

        Decorator decorator2=new Website(diagnostic);
        decorator2.afisareOnline();
    }
}