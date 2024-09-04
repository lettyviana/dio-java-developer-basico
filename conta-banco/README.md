# **<div style="color:royalblue">Desafio Simulando uma Conta Bancária Através do Terminal/Console</div>**

## **Índice:**

1. [Sobre o projeto](#sobre-o-projeto);
2. [Tecnologias/linguagens utilizadas](#tecnologiaslinguagens-utilizadas);
3. [Instruções](#instruções);
4. [Principais desafios](#principais-desafios);
5. [Status](#status);
6. [Contato](#contato);

## **Sobre o projeto**
Este é o primeiro desafio da Formação Java Developer da DIO.
A proposta é exercitar o conteúdo apresentado no módulo "Aprendendo a Sintaxe", criando o seguinte cenário:

- Criar o projeto que receberá os dados via terminal, contendo as características de conta em banco conforme os seguintes atributos:

<div align="center">

|<div style="color:royalblue">Atributo</div>|<div style="color:royalblue">Tipo</div>|<div style="color:royalblue">Exemplo</div>|
|---|---|---|
|Numero|Inteiro|1021|
|Agencia|Texto|067-8|
|Nome Cliente|Texto|MARIO ANDRADE|
|Saldo|Decimal|237.48|

</div>

- Os dados devem ser inseridos via terminal pelo usuário;
- Depois de todas as informações serem inseridas, o sistema deverá exibir a seguinte mensagem, onde os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários:

<i>"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".</i>

## **Tecnologias/linguagens utilizadas**

<div style="display: inline_block" align="center"><br />
    <img src="https://img.shields.io/badge/Java-FF4500?style=for-the-badge&logo=java&logoColor=white" height="35px" alt="Java" align="center" />
</div><br />

## **Instruções**

Para executar o projeto:

- Escolha o diretório/pasta onde deseja salvar o projeto;
- Dê o comando:

```
git clone https://github.com/lettyviana/dio-java-developer-basico.git
```

- Depois de ter o projeto devidamente clonado, há dois caminhos a seguir:

  1. Acessar a pasta bin pelo terminal;
  2. Já na pasta bin, segurar o SHIFT e clicar com o botão direito e, dependendo do sistema operacional, escolher como deseja abrir (como eu uso Windows, a opção apropriada para mim é "Abrir no terminal" ou "Abrir janela do PowerShell aqui").

- Feito isso, dê o seguinte comando: 
```
java ContaTerminal
``` 
- Siga as instruções.

  <div style="color:crimson"><strong>OBS.: Ao informar o saldo, não use ponto, e sim vírgula para separar os decimais.</strong></div>
- Ao final, o resultado obtido será parecido com este:

```
PS E:\caminho-do-projeto-até-a-pasta-bin> java ContaTerminal
Por favor, informe seu nome sem acento.
Leticia
Por favor, informe o número da agência.
2000
Por favor, informe o número da conta.
95959-6
Por favor, informe o saldo.
100,5
Olá, Leticia. Agradecemos por criar uma conta em nosso banco. Sua agência é: 2000, conta 95959-6 e seu saldo R$ 100,50 já está disponível para saque.
```

## **Principais desafios**

Esse desafio foi tranquilo de ser realizado, pois as aulas foram muito bem explicadas.

Tive que aprender como formatar o saldo para o padrão do Brasil e o jeito mais atual de usar o Locale do Java, pois o aprendido no curso está depreciado.

Também tive que pesquisar um pouco mais a fundo algumas estratégias de Markdown para deixar este ReadMe um pouco mais bonito.

Gostei muito desse desafio e estou animada para continuar aprendendo Java.

## **Status**

- [x] Funcional.


## **Contato**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leticiaviana-trad-dev/)
[![Meu site](https://img.shields.io/badge/Meu%20site-800080?style=for-the-badge&logoColor=white)](https://www.leticiaviana.com/#contato)