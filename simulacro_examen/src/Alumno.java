import java.io.Serializable;

//Para escribir y leer objetos en un archivo.
public class Alumno implements Serializable {

    private String name;
    private int age;
    private double mark;


    public Alumno(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
