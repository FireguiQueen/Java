package Javacore.A_orientacaoAObjetos.exercicios.Funcionarios.Domain;

public class Funcionario
{
    // nome idade salario
    private String name;
    private short age;
    private double[] salary;

    // setts
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(short age)
    {
        this.age = age;
    }

    public void setSalary(double[] salary)
    {
        this.salary = salary;
    }

    // getts
    public String getName()
    {
        return name;
    }

    public short getAge()
    {
        return age;
    }

    public double[] getSalary()
    {
        return salary;
    }
}
