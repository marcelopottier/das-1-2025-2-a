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



## Características Arquiteturais = Requisitos não funcionais
Um sistema nunca vai cumprir 100% dos requisitos não funcionais

## Decisões da Arquitetura
Definição da arquitetura que será utilizada, por exemplo: Monolito, Hexagonal, etc.

## Princípios do Design
Regras que devem ser seguidas durante a construção e a manutenção do sistema.

## Expectativas de um Arquiteto
 - Tomar decisões de arquitetura
    Deve guiar a equipe tomando deciões técnicas ou arquiteturais por ter mais experiência.
 - Analisar continuamente a arquitetura
    A vitalidade da arquitetura é fundamental, o arquiteto deve sempre analisar.

 - Manter-se atualizado com as últimas tendências
    
 - Assegurar a conformidade com as decisões
    Garantir que os Design Patterns sejam seguidos, eles foram sugeridos pelo arquiteto porque precisam ser seguidos durante a construção da aplicação para garantir algum atributo.

 - Exposição e experiências diversificadas
    
 - Conhecimento sobre o domínio do negócio
   Entender como funciona a regra de negócio e saber como se comunicar com o PO
   
 - Habilidades interpessoais
   Deve ser capaz de fazer uma parte de gestor, conseguir se comunicar e liderar a equipe
   
 - Entender e lidar bem com questões políticas
    Conseguir entender a parte política dentro das empresas e conseguir negociar e influenciar as pessoas nas decisões
   
## DevOps
Maneira de entregar valor de forma mais ágil ao cliente.



## Trade Offs


##Utilizam transmissão de mensagens por Brokers, por exemplo: HiveMQ, RabbitMQ, SNS.
Esses brokers podem utilizar alguns protocolos de comunicação como: MQTT, AMQP ou ate mesmo Web Socket.


##Filas Queues
Temos os senders e os receivers que irão enviar e receber mensagens da fila. A fila diferentemente dos brokers salva a mensagem caso o receiver não esteja disponível, servindo como um buffer.


## O beneficio da extensabilidade arquitetural
No estilo de tópicos existe um desacoplamento que ajuda a arquitetura de certa forma. Já na estrutura de filas precisariamos criar uma nova fila e conectar ao servidor.
A resposta sempre será o item que voce precisa priorizar, 1 tópico pode ter o mesmo valor que 2 ou 3 filas. O ponto é que dependendo da sua regra de negócio um dos tipos de arquitetura pode funcionar melhor, garantindo o requisito não funcional que voce precisa priorizar.

