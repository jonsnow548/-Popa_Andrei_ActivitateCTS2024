package Clase;

public abstract class Template {

  public final void internare(Pacient pacient)
  {
    analizaSanatate(pacient);
    if(disponibilitate()>0)
        emiteFisa(pacient);
    else refuzare(pacient);
  }
  protected abstract void analizaSanatate(Pacient pacient);
  protected abstract int disponibilitate();
  protected abstract void emiteFisa(Pacient pacient);
  protected abstract void refuzare(Pacient pacient);
}
