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

---

## Circuit Breaker
Padrão criado para resolver um problema muito comum em sistemas distribuídos.

O objetivo é proteger a comunicação entre dois sistemas, utilizando a ideia de Estados para definir em qual momento a comunicação está.

Estado - Closed/Fechado
Quando está tudo bem entre a comunicação.

Estado - Open/Aberto
Quando ocorre alguma falha na comunicação.

Estado - Half-Open/Meio aberto
Quando ele tenta a comunicação novamente e consegue, neste momento podemos colocar um counter para certificar que a comunicação está realmente reestabelecida. 

<img width="651" height="539" alt="image" src="https://github.com/user-attachments/assets/44f924bb-45f3-4c41-881c-81fac20dd495" />

Além disso, a ideia é evitar códigos problemáticos que ficam em looping tentando comunicações gastando recursos e "travando" o funcionamento até a comunicação ser reestabelecida.

---

## Definições das Características Arquiteturais

Basicamente, é o conjunto de qualidades e decisões de design que torna um software único e funcional. Uma característica da arquitetura atende a três critérios:

- Especifica uma consideração de design fora do domínio
- Influencia algum aspecto estrutural de design
- É essencial ou importante para o sucesso da aplicação

### Características Operacionais da Arquitetura
Relacionadas à operação e execução do sistema no dia a dia.

- **Disponibilidade**: Quanto tempo o sistema fica no ar (uptime).
- **Continuidade**: Capacidade de se recuperar de desastres.
- **Desempenho**: Velocidade de resposta, throughput, latência.
- **Recuperabilidade**: Rapidez para voltar após falhas.
- **Confiabilidade/Segurança**: Tolerância a falhas, criticidade do sistema.
- **Robustez**: Resistência a erros externos e situações inesperadas.
- **Escalabilidade**: Capacidade de crescer conforme a demanda aumenta.

### Características Estruturais da Arquitetura
Relacionadas à qualidade interna do código e estrutura do sistema.

- **Configuração**: Facilidade de ajustar configurações sem rebuild.
- **Extensibilidade**: Facilidade de adicionar novas funcionalidades.
- **Instalabilidade**: Facilidade de instalar em diferentes ambientes.
- **Reutilização**: Capacidade de reaproveitar componentes em outros sistemas.
- **Localização**: Suporte a múltiplos idiomas e formatos regionais (i18n).
- **Manutenibilidade**: Facilidade de fazer alterações e correções.
- **Portabilidade**: Capacidade de rodar em diferentes plataformas/dispositivos.
- **Suporte**: Facilidade de diagnosticar erros e dar suporte técnico.
- **Atualização**: Facilidade de migrar versões sem quebrar o sistema.

### Características Transversais da Arquitetura
Aspectos que atravessam todo o sistema e não se encaixam nas categorias anteriores.

- **Acessibilidade**: Garantir acesso a usuários com deficiências (daltonismo, surdez, etc.).
- **Armazenamento**: Definir políticas de retenção e exclusão de dados.
- **Autenticação**: Verificar a identidade do usuário.
- **Autorização**: Controlar o que cada usuário pode acessar.
- **Legalidade**: Conformidade com leis e regulamentações (LGPD, GDPR).
- **Privacidade**: Proteger dados sensíveis de acessos indevidos.
- **Segurança**: Criptografia, proteção contra ataques.
- **Usabilidade**: Facilidade de uso, curva de aprendizado.

---

## A Arquitetura Menos Pior

Não existe "arquitetura perfeita" - sempre há trade-offs.

Melhorar um atributo quase sempre prejudica outro (ex.: segurança vs. desempenho).

O papel do arquiteto é criar a "arquitetura menos pior" = aquela que faz o melhor equilíbrio entre características conflitantes para atender ao negócio.

---

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

### Alguns benefícios do CQRS

1 - Escalabilidade independente: Permite que os modelos de dados de escrita e leitura escalem de forma independente. Reduzindo a chance de lock das tabelas.
2 - Segurança: Separando de forma clara entre modelos de escrita e leitura é possível garantir que apenas as entidades de domínio ou operações corretas tenham permissão para manipular dados no banco.
3 - Separação de preocupação: Separar em uma arquitetura de leitura e escrita distintas permite que modelos mais limpos e manuteníveis sejam criados. O lado de escrita foca em lógica de negócio mais complexa, enquanto o lado de leitura foca na eficiência das queries.

### Considerações

Alguns pontos de considerações existem ao tentar implantar o CQRS.

Aumento de complexidade - o conceito core do CQRS pode trazer aumento de complexidade significativa para o design da aplicação.
Consistência - Quando os bancos de leitura e escrita são separados a parte de leitura de dados pode não mostrar as alterações mais recentes de forma imediata.

---

## Retry Pattern

Padrão que permite que uma aplicação tente novamente uma operação que falhou, de forma controlada e inteligente.

Em ambientes de nuvem, falhas transitórias são comuns (rede instável, serviço temporariamente indisponível, timeouts por sobrecarga).

### Estratégias de repetição:

**Cancelar**: Quando a falha não é transitória (ex.: credenciais inválidas). Não adianta tentar novamente.

**Tentar imediatamente**: Para falhas raras e isoladas (ex.: pacote de rede corrompido).

**Tentar após atraso**: Para falhas causadas por sobrecarga ou problemas de conectividade. O serviço precisa de tempo para se recuperar.

### Tipos de atraso:
- **Incremental**: Aumenta linearmente (2s, 4s, 6s...).
- **Exponencial (Exponential Backoff)**: Aumenta exponencialmente (1s, 2s, 4s, 8s...). Evita sobrecarregar um serviço que já está sofrendo.

---

## Fundamentos dos Padrões de Arquitetura

Os estilos de arquitetura, por vezes chamados de padrões de arquitetura, descrevem uma relação nomeada de componentes que cobrem várias características da arquitetura.

---

## Grande Bola de Lama (Big Ball of Mud)

Anti-padrão arquitetural.

Sistema mal estruturado, código espaguete, sem organização clara.

Resultado de crescimento descontrolado e "gambiarras" acumuladas ao longo do tempo.

Difícil de manter, testar e evoluir.

---

## Arquitetura Unitária

Modelo mais antigo: software e hardware como uma entidade única.

Tudo rodava em um único computador, sem separação de responsabilidades.

Conforme a complexidade cresceu, surgiu a necessidade de dividir o sistema.

---

## Arquitetura Cliente/Servidor

Divide funcionalidade em duas partes lógicas:
- **Cliente (Front-end)**: Interface do usuário, apresentação.
- **Servidor (Back-end)**: Processamento, lógica de negócio, dados.

### Variantes:

**Desktop + Servidor de Banco de Dados**
- Cliente: aplicação desktop (interface + lógica de apresentação).
- Servidor: banco de dados robusto.
- Comunicação via protocolos de rede.

**Navegador + Servidor Web**
- Cliente: navegador (ainda mais leve que desktop).
- Servidor: servidor web + banco de dados.
- Permitiu distribuição ampla (intranet e internet).

---

## Estilo de Arquitetura em Camadas (N-Tier)

Estilo mais comum e tradicional.

### Por que é popular?
- Simples e barato.
- Familiar para desenvolvedores.
- Alinha com estrutura de equipes (Lei de Conway).

### Estrutura:
Componentes agrupados em camadas horizontais, cada uma com função específica:
1. **Apresentação**: Interface do usuário.
2. **Negócio**: Regras de negócio, lógica da aplicação.
3. **Persistência**: Acesso aos dados.
4. **Banco de Dados**: Armazenamento.

**Problema**: Divisão por função técnica, não por domínio. Mudanças em uma funcionalidade de negócio se espalham por todas as camadas.

### Camadas Abertas vs. Fechadas

**Fechada**: Requisição deve passar pela camada imediatamente abaixo (não pula). Cria isolamento, menos acoplamento.

**Aberta**: Permite "pular" camadas. Mais flexível, mas aumenta acoplamento e fragilidade.

### Anti-padrão: Sinkhole

Quando as camadas apenas "repassam" requisições sem agregar valor ou lógica.

Exemplo: Controller → Service → Repository → Database, mas Service só chama Repository sem fazer nada.

Indica que a camada intermediária é desnecessária.

---

## Estilo de Arquitetura Pipeline

Inspirado em shells Unix (Bash) e programação funcional (MapReduce).

Divide funcionalidade em partes distintas conectadas sequencialmente.

### Componentes:

**Pipes (Canais)**: Transportam dados de forma unidirecional e ponto-a-ponto.

**Filters (Filtros)**: Processam os dados. Devem ser:
- Autônomos e independentes.
- Geralmente sem estado.
- Realizar apenas uma tarefa (responsabilidade única).

### Tipos de Filtros:

1. **Produtor**: Ponto de partida, cria e emite dados.
2. **Transformador**: Recebe e modifica dados (análogo ao `map`).
3. **Verificador**: Testa critérios e filtra dados (análogo ao `filter` ou `reduce`).
4. **Consumidor**: Ponto final, persiste ou exibe resultado.

**Vantagens**: Simples, testável, fácil adicionar novos filtros.

**Desvantagens**: Difícil compartilhar estado, não ideal para interações complexas.

---

## Estilo de Arquitetura Microkernel (Plug-in)

Ideal para aplicações baseadas em produto (software empacotado) e sistemas que precisam de extensibilidade.

Estrutura monolítica simples, projetada para facilitar extensões.

### Componentes:

**Sistema Central (Core System)**:
- Define funcionalidade mínima para o sistema operar.
- Representa o "caminho feliz" do processamento.
- Localiza e chama os plug-ins apropriados.
- Isola complexidade delegando para plug-ins.
- Gerencia banco de dados compartilhado.

**Componentes de Plug-in**:
- Módulos autônomos e independentes.
- Contêm processamento especializado e features adicionais.
- Isolam código volátil (facilita manutenção e testes).
- Idealmente independentes entre si.
- Gerenciados por um **Registro** que mapeia plug-ins disponíveis.

### Comunicação:

Geralmente ponto-a-ponto (chamadas de método/função).

Implementação: bibliotecas compartilhadas (JARs, DLLs), namespaces, pacotes.

Alternativa: plug-ins como serviços remotos (REST, mensageria) - melhora desacoplamento mas adiciona complexidade distribuída.

**Contratos**: Definem comportamento e dados entre core e plug-ins. Adaptadores integram plug-ins de terceiros.

**Quantum Arquitetural**: Permanece singular (1) - todas requisições passam pelo core.

---

## Estilo de Arquitetura Microsserviços

Estilo arquitetural centrado em **alto desacoplamento**, **domínios independentes** e **unidades pequenas**.

Cada serviço roda em seu próprio processo.

Deriva fortemente do **DDD (Domain-Driven Design)**, especialmente do conceito de **Bounded Context (Contexto Delimitado)**.

Popularizado por Martin Fowler e James Lewis em 2014.

### Contexto Delimitado

Cada serviço representa um domínio ou fluxo de trabalho completo:
- Código próprio.
- Banco de dados próprio.
- Dependências internas.

Reduz acoplamento, mesmo que isso signifique duplicação.

### Princípio: Desacoplamento > Reutilização

Reutilizar código aumenta acoplamento.

Microsserviços preferem **duplicação** para manter **autonomia**.

### Topologia e Distribuição

Cada serviço roda em processo isolado (VM, container, etc.).

**Vantagens**: Isolamento, escalabilidade independente.

**Desvantagens**: Latência de rede, complexidade de comunicação.

### Granularidade

Definir o tamanho correto dos serviços é um desafio.

Considerar:
- **Finalidade**: Cada serviço deve ser coeso.
- **Transações**: Evitar transações distribuídas.
- **Coreografia**: Não exigir comunicação excessiva entre serviços.

Raramente fica correto na primeira tentativa - requer iteração.

### Isolamento de Dados

Cada microsserviço deve ter seu **banco dedicado**.

Não compartilhar esquemas de banco entre serviços.

**Consequências**:
- Não existe "única fonte de verdade" global.
- Pode exigir replicação, cache ou coordenação.
- Permite escolher tecnologias diferentes por serviço.

### Comunicação

**Síncrona**:
- REST
- gRPC
- Menos tolerante a falhas, mais acoplamento.

**Assíncrona**:
- Eventos
- Mensagens
- Maior desacoplamento e resiliência.

### Ecossistema Heterogêneo

Diferentes serviços podem usar linguagens e tecnologias distintas.

**Quando usar**:
- Domínio exige desacoplamento.
- Autonomia de equipes.
- Alta taxa de mudanças.

**Quando evitar**:
- Sistemas simples.
- Sistemas altamente interdependentes.
- Complexidade operacional não justificada.

