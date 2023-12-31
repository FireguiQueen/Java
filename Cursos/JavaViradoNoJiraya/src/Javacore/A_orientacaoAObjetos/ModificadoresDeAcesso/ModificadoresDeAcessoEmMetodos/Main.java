package Javacore.A_orientacaoAObjetos.ModificadoresDeAcesso.ModificadoresDeAcessoEmMetodos;

public class Main
{
    public static void main(String[] args)
    {

        // Podemos fazer isto porque a classe "Funcionario" está pública.
        Funcionario funcionario001 = new Funcionario();

        // Nós estamos na classe "Main". Estamos acessando um método de um objeto.
        // >> Só podemos acessar este método porque ele é PÚBLICO (PUBLIC).
        funcionario001.mensagemBoasVindas();


        /*
            O método "historiaEmpresa" é privado, ou seja, apenas instruções dentro do objeto herdado poderão
            acessá-lo.

            // Fazer isto retornará erro:
        */
        // >   funcionario001.historiaEmpresa();


        /*
            Para você poder acessar um método privado a partir de outra classe, você precisará ter um método público
            dentro do objeto que invoque (execute) o método privado.
        */
        // Isto é possível porque nosso método "exibirHistoriaEmpresa" é um método público, sendo possível acessá-lo em qualquer classe.
        // Dentro deste método, há um chamado para o método privado "historiaEmpresa".
        funcionario001.exibirHistoriaEmpresa();
    }
}
