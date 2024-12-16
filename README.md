# Desafio o Jogo de Adivinha!

## Descrição:
O jogo de Adivinha consiste em um jogo interativo no qual o sistema sorteia um número aleatório e o usuário tenta adivinhar qual é esse número. O jogo utiliza condicionais que determina a pontuação do usuário com base na proximidade do palpite (de 1 casa para baixo ou para cima) em relação ao número sorteado.


## Funcionamento do jogo:
Para começar a jogar o jogador tem que escolher o nível do jogo (Fácil, Médio ou Difícil). E a cada tentativa é dado um resultado parcial da pontuação, se acertou o número (o jogador faz 10 pontos) ou se foi quase (um número acima ou abaixo do sorteado(o jogador faz 5 pontos)) ou não acertou (O jogador não faz pontos). A cada tentativa é perguntado se deseja continual no jogo ou parar. O jogador ganha quando faz 100 pontos.

## Estrutura do Código:
* **main():** Função responsável pela escolha dos níveis: Fácil, Médio e Difícil.
* **JogoAdivinha():** Onde está toda a lógica do jogo.

## Como Executar o Código

Para executar o código, siga os passos abaixo:

### 1. Clonar o Repositório
Clone o repositório para o seu ambiente local:

```bash
git clone git@github.com:ericamoraesabdao/desafioJogoAdivinha.git
```

### 2. Navegar até o Diretório do Projeto
Entre na pasta do repositório clonado:

```bash
cd desafioJogoAdivinha
```

### 3. Abra sua IDE de preferência e execute o código no botão RUN na IDE.

### Exemplo de Entrada e Saída

#### Entrada:

```
Escolha qual dificuldade você vai querer:
 1.Fácil,
 2.Médio, 
 3.Difícil
```

#### Saída Esperada:

```
Tente acertar meu número, digite o seu: 
```
### Explicação as dificuldades:

```
Fácil: Sorteia números de 1 a 10.
Médio: Sorteia números de 1 a 50.
Difícil: Sorteia números de 1 a 100.
```

## Autora

- **Erica Moraes Abdao**
