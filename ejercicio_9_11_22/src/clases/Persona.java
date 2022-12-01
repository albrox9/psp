package clases;

//la herencia no me obliga a implementar el metodo run
public abstract class Persona extends Thread{

    String nombre;

    @Override
    public void run()//solo obliga a implementar en las hijas los metodos abstractos
    {

    }
}
