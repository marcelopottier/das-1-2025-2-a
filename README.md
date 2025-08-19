# das-1-2025-2-a


## Abstração
Representação de algo do mundo material, sejam de problemas reais, pessoas, etc. A abstração 


## Ocultamento de informação

## Coesão 
Código que faz uma coisa bem feita, seguindo o princípio de responsabilidade única.


# Acoplamento
Alto Acomplamento - Quando eu mexo em um lugar do código quebra outro lugar.


UML
Herança, Implementação e Associação.


# SOLID

## SOLID é um conjunto de princípios que visam deixar o código limpo e organizado (coeso e desaclopado). Cada letra representa um dos princípios.

## S - Single Responsability Principle
É o principio da responsabilidade única, tem a mesma ideia da coesão citada anteriormente, cada componente de software deve ter um, e apenas um, único motivo para ser modificado.

## O - Open-Closed
Principio que diz que as classes devem ser abertas para extensão e fechadas para modificação.

## L - Liskov Substituition
Princípio que sugere que as classes derivadas devem conseguir substituir a classe base sem que o código quebre.

## I - Interface Segregation
Princípio que sugere que as interfaces devem ser bem segmentadas e com responsabilidade únicas.

## D - Dependency Inversion
Principio que diz que as classes devem depender de abstrações e não de implementações reais.

##Composição e Herança
É preferivel a utilização da composição do que a herança pois a herança é dificil de ser aplicada em bancos de dados relacionais.
Fazendo sentido de ser aplicada apenas caso as classes derivadas nunca irão assumir o mesmo papel.

##Princípio de Demeter
Princípio que defende que a implementação de um metodo deve conhecer e interagir apenas com outros metódos de escopo local. Ou seja, eles devem ser instânciados ou trazidos até ele por meio da implementação.


static - é a anotação que significa que aquele pedaço de código vai ser carregado primeiro na memória