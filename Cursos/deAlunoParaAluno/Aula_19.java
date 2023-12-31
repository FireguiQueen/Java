// CONDICIONAIS: IF & ELSE II

public class Aula_19 {
    public static void main(String[] args) {
        // Anteriormente, na aula 18, vimos e utilizamos apenas uma única condicional (IF).
        // Mas e se precisássemos de mais condições?

        /*
         * Por exemplo, utilizando apenas "if" e 'else' somos capazes de colocar uma
         * mensagem para maiores de 18 e para menores de 18 anos.
         */
        byte idade = 18;

        if (idade >= 18) {
            System.out.println("Você é de maior.");
        } else {
            System.out.println("Você é de menor.");
        }

        // Mas como vamos colocar uma mensagem específica para quem inserir uma idade
        // negativa? Afinal, idade negativa não existe.

        // Para isso, vamos colocar mais uma condição. Mas NÃO DEVEMOS ADICIONAR MAIS UM "IF" AO CÓDIGO
        // Utilizaremos o "else if".
        // O "else if" é como o 'if', porém, sua condição só é avaliada caso a condição anterior seja falsa.

        byte age = 10;
        if (age <= 0) {
            System.out.println("Idade inserida não é válida.");
        } else if (age <= 18) // esta condição é avaliada somente se a anterior for 'false'.
        {
            System.out.println("Você é menor de idade.");
        } else
        {
            System.out.println("Você é maior de idade.");
        }


        // Utilizar o 'else if' tem apenas o intuito de adicionar mais condições.
        // Podemos ver outro exemplo abaixo:
        /*
         -->> Primeiro, definimos como está a temperatura usando uma variável.
         * Depois, utilizando o if, perguntamos se a string é igual a "frio".

         * Caso este 'if' acima seja falso, teremos a próxima condição 'else if':
         * A string é igual a "normal"?

         * Caso o 'else if' acima seja falso, teremos a próxima condição 'else if': A string é
         * igual a "quente"?

         * Caso este 'else if' acima seja falso, só temos uma última hipótese, o dia está
         * muito quente. Sendo assim, usamos apenas o 'else'. >> O bloco 'else' será
         * executado caso nenhuma condição acima seja verdadeira.
         */
        String temperatura = "frio";

        if (temperatura == "frio") {
            System.out.println("Está frio. Não vale a pena sair de casa. Durma ou estude :)");
        } else if (temperatura == "normal") {
            System.out.println("A temperatura está normal.");
        } else if (temperatura == "quente") {
            System.out.println("A temperatura está alta, procure se hidratar mais.");
        } else
        {
            System.out.println("O dia está extremamente quente, se hidrate muito. Procure ficar na sombra ao sair de casa.");
        }

        // POR QUE UTILIZAR "ELSE IF" SE TEMOS O "IF"?
        /*
         * Isto é verdade, a realidade é que, no exemplo dado acima, todos os 'else if'
         * poderiam ser substituídos por 'if'.
         */
        if (temperatura == "frio") {
            System.out.println("Está frio. Não vale a pena sair de casa. Durma ou estude :)");
        }
        if (temperatura == "normal") {
            System.out.println("A temperatura está normal.");
        }
        if (temperatura == "quente") {
            System.out.println("A temperatura está alta, procure se hidratar mais.");
        } else
        {
            System.out.println("O dia está extremamente quente, se hidrate muito. Procure ficar na sombra ao sair de casa.");
        }

        /*
         * Pois bem, por que não fazer assim? Fazer isto não é uma boa prática, eis a
         * explicação: O código tende a funcionar da mesma maneira, mas pode resultar
         * em alguns problemas, principalmente se fazemos o uso do 'else'.

         * Quando colocamos IFs abaixo de IFs (como no exemplo acima), estamos dizendo
         * ao Java que todas essas condições DEVEM ser analisadas. Isso significa que
         * mesmo se a primeira condição for verdadeira, o código continuará a verificar
         * todas as condições subsequentes, o que pode ser ineficiente.

         * E além de ser ineficiente, temos um pequeno problema com o 'else'. Por
         * exemplo, o primeiro "if" foi analisado, e sua condição é verdadeira, logo seu
         * bloco é executado. Como a próxima condicional também é um "if" ela será lida
         * e analisada, e caso ela seja "FALSE", o 'else' que está logo abaixo dela será
         * executado.
         */

        // EXEMPLO:
        int valor = 10;

        // Esta primeira condição é verdadeira. Sendo assim, nosso código DEVERIA
        // parar por aqui.
        // Mas como há outro 'if' logo abaixo, ele será lido.
        if (valor > 2) {
            System.out.println("O valor é maior do que dois.");
        }
        // este if também será lido.. Mas será avaliado como 'false'.
        if (valor < 2) {
            System.out.println("O valor é menor do que dois.");
        }
        // como o 'if' anterior foi avaliado como 'false', este else será executado.
        else
        {
            System.out.println("...");
        }

        /*
         * Por que o Java continua lendo os próximos "if" mesmo se o primeiro já foi
         * verdadeiro? Ora, ele entende que cada "if" faz parte de uma condição
         * separada, e logo, ela precisa ser avaliada.
         *
         * Use "if" para iniciar uma estrutura condicional. Se precisar de mais
         * condições na mesma estrutura, use "else if". Dessa forma, todas as condições
         * pertencem à mesma estrutura.
         *
         * Se usar apenas "if" em estruturas condicionais, elas serão tratadas como
         * estruturas separadas e independentes.
         */
    }
}
