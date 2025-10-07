# das-1-2025-2-a

## Abstração
Representação de algo do mundo material, sejam de problemas reais, pessoas, etc.  
A abstração consiste em destacar apenas os aspectos essenciais de um objeto, ignorando os detalhes desnecessários.  
Permite focar **no que um objeto faz** e não em **como ele faz**.

---

## Ocultamento de informação (Encapsulamento)
Consiste em esconder os detalhes internos de implementação.  
Protege o estado interno do objeto, permitindo o acesso e modificação apenas por métodos controlados (getters e setters).  
Evita que atributos internos sejam expostos diretamente, reduzindo interferência no funcionamento interno da classe.

---

## Coesão 
Código que faz uma coisa bem feita, seguindo o princípio de responsabilidade única.  
Todos os métodos e atributos de uma classe devem estar voltados para o mesmo objetivo/serviço.

---

## Acoplamento
- **Alto Acoplamento**: Quando mexer em um lugar do código quebra outro lugar.  
- **Acoplamento aceitável**: Uma classe usa apenas métodos públicos estáveis de outra classe.  
- **Acoplamento ruim**: Uso de variáveis globais, acesso direto a arquivos/bancos de dados de outra classe.

---

## UML
Herança, Implementação e Associação.

---

# SOLID

## SOLID é um conjunto de princípios que visam deixar o código limpo e organizado (coeso e desacoplado).  
Cada letra representa um dos princípios.

### S - Single Responsibility Principle
Princípio da responsabilidade única.  
Cada classe deve ter apenas um motivo para mudar.

### O - Open-Closed Principle
Classes devem ser **abertas para extensão** e **fechadas para modificação**.  
Protege a classe de bugs ao mesmo tempo em que permite novas funcionalidades.

### L - Liskov Substitution Principle
Classes derivadas devem conseguir substituir a classe base sem quebrar o código.  

### I - Interface Segregation Principle
Interfaces devem ser pequenas, específicas e coesas.  
Evita obrigar classes a implementar métodos que não utilizam.

### D - Dependency Inversion Principle
Depender de abstrações e não de implementações concretas.  
Exemplo: um Controller deve depender de uma interface de Service, não de uma classe concreta.

---

## Composição e Herança
É preferível usar **composição** em vez de herança.  
A herança deve ser usada apenas quando as subclasses não podem exercer o mesmo papel (ex.: Gato e Cachorro herdam de Animal, mas um não pode ser o outro).

---

## Princípio de Demeter
Também chamado de **Princípio do Menor Conhecimento**.  
Um método deve invocar apenas:
1. Métodos da própria classe.  
2. Métodos de objetos passados como parâmetros.  
3. Métodos de objetos criados pelo próprio método.  
4. Métodos de atributos da classe.  

---

## static 
Significa que o código ou membro é carregado primeiro na memória, pertencendo à classe e não a instâncias específicas.

---

# Arquitetura

## Características Arquiteturais = Requisitos não funcionais
Critérios que definem o sucesso de um sistema, mas que não estão ligados diretamente às funcionalidades.  
Exemplos: desempenho, escalabilidade, segurança.  
Um sistema nunca cumpre 100% dos requisitos não funcionais.

---

## Decisões da Arquitetura
Regras de como o sistema deve ser construído.  
Exemplo: definir se o sistema será monólito, hexagonal, microsserviços etc.  
Também incluem limites, como “camada de apresentação não acessa banco diretamente”.

---

## Princípios do Design
Diretrizes que orientam a construção do sistema, mas não são regras fixas.  
Exemplo: usar comunicação assíncrona em microsserviços para melhorar escalabilidade.

---

## Expectativas de um Arquiteto
- **Tomar decisões de arquitetura**: guiar a equipe em decisões técnicas/arquiteturais.  
- **Analisar continuamente a arquitetura**: avaliar melhorias e saúde do sistema.  
- **Manter-se atualizado com as tendências**: acompanhar novas tecnologias.  
- **Assegurar conformidade**: garantir que os princípios e padrões definidos sejam seguidos.  
- **Exposição e experiências diversificadas**: ter vivência em várias tecnologias e ambientes.  
- **Conhecimento sobre o domínio do negócio**: entender a regra de negócio e dialogar com o PO.  
- **Habilidades interpessoais**: liderar, motivar e comunicar-se com a equipe.  
- **Lidar com questões políticas**: entender hierarquia, negociar prazos e influenciar decisões.

---

## DevOps
Prática de entregar valor ao cliente de forma ágil.  
Processo cíclico com etapas de:
- Planejamento  
- Criação  
- Integração Contínua  
- Implantação  
- Monitoramento  
- Feedback  

---

## Trade-offs
Não é possível atender todos os requisitos ao mesmo tempo.  
É preciso equilibrar atributos como desempenho, escalabilidade, segurança e manutenibilidade.  

---

## Estilos de Comunicação

### Padrão de Tópicos (Publish/Subscribe)
- Publisher envia mensagens para um canal (broker/stream).  
- Canal distribui para múltiplos subscribers.  
- Comunicação assíncrona, desacoplada e escalável.  
- Protocolos: MQTT, AMQP, WebSocket.  
- Exemplos: HiveMQ, RabbitMQ, SNS.  

### Queue (Filas)
- Sender envia mensagem para uma fila.  
- Receiver consome a mensagem da fila.  
- Comunicação assíncrona ponto-a-ponto (1:1).  
- A fila guarda a mensagem caso não haja receiver disponível (buffer).  

---

## Benefício da Extensibilidade Arquitetural
- Em tópicos: fácil desacoplamento (um publisher pode alcançar vários subscribers).  
- Em filas: seria necessário criar novas filas e conectá-las.  
- A escolha depende do requisito não funcional que precisa ser priorizado (ex.: escalabilidade vs. confiabilidade).  

---

# Diferença entre Arquitetura e Design
- **Arquitetura**: amplitude técnica, envolve decisões de alto nível combinando capacidades e restrições técnicas.  
- **Design**: profundidade técnica, foca na implementação prática e detalhada do código.  

---

# Formação do Arquiteto Modelo T
- **Base ampla e diversificada** (parte horizontal do T): conhecimento em várias tecnologias, plataformas e ambientes.  
- **Profundidade em uma área específica** (parte vertical do T): especialização em um domínio técnico.  

---

## Segundo Bimestre

# Circuit Breaker
Padrão criado para resolver um problema muito comum em sistemas distribuídos.

O objetivo é proteger a comunicação entre dois sistemas, utilizando a ideia de Estados para definir em qual momento a comunicação está.

Estado - Closed/Fechado
Quando está tudo bem entre a comunicação.

Estado - Open/Aberto
Quando ocorre alguma falha na comunicação.

Estado - Half-Open/Meio aberto
Quando ele tenta a comunicação novamente e consegue, neste momento podemos colocar um counter para certificar que a comunicação está realmente reestabelecida. 

<img width="651" height="539" alt="image" src="https://github.com/user-attachments/assets/44f924bb-45f3-4c41-881c-81fac20dd495" />

Além disso, a ideia é evitar códigos problematicos que ficam em looping tentando comunicações gastando recursos e "travando" o funcionamento até a comunicação ser reestabelecida.



------------------------------------SEGUNDO BIMESTRE-----------------------------------------------------


## Definições das características arquiteturais


## CQRS Pattern

Em uma aplicação com arquitetura tradicional, um único modelo de dados é utilizado para ler e escrever os dados. A medida que a aplicação cresce fica difícil otimizar as operações de leitura e escrita de dados em um único modelo de dados.
Alguns problemas podem surgir com esta abordagem, como:

1 - Lock de dados: Operações paralelas em uma mesma tabela podem gerar locks no banco.
2 - Problemas de performance: A carga nas camadas acesso e armazenamento do banco somado com a complexidade das queries para obter informações acabam gerando problemas de performance.
3 - Segurança: Pode ser difícil garantir segurança quando as entidades são expostas a leitura e escrita ao mesmo tempo. Essa abordagem pode expor dados em contextos não pensados.


O CQRS surge para resolver esses problemas, a ideia é separar as operações de escrita e de leitura dos dados. Neste modelo seguimos os padrões de commands e queries.

Commands: escrevem/alteram dados de fato.
Queries: acessam dados e retornam DTOs, mas nunca alteram nada.

(DTOs são Data Transfer Objects - utilizados para padronizar os dados em um formato específico e conhecido pelo serviço, que não necessita de lógica de domínio)

<img width="627" height="221" alt="image" src="https://github.com/user-attachments/assets/465cc857-d900-421c-877f-ade6de7da1e0" />

# Alguns benefícios do CQRS.

1 - Esacalabilidade independente: Permite que os modelos de dados de escrita e leitura escalem de forma indepentente. Reduzindo a chance de lock das tabelas.
2 - Segurança: Separando de forma clara entre modelos de escrita e leitura é possível garantir que apenas as entidades de domínio ou operações corretas tenham permissão para manipular dados no banco.
3 - Separação de preocupação: Separar em uma arquitetura de leitura e escrita distintas permite que modelos mais limpos e manuteníveis sejam criados. O lado de escrita foca em lógica de negócio mais complexa, enquanto o lado de leitura foca na eficiência das queries.

# Considerações

Alguns pontos de considerações existem ao tentar implantar o CQRS.

Aumento de complexidade - o conceito core do CQRS pode trazer aumento de complexidade significativa para o design da aplicação.
Consistência - Quando os bancos de leitura e escrita são separados a parte de leitura de dados pode não mostrar as alterações mais recentes de forma imediata.
