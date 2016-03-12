#Criando um Jogo de Guerreiros via linhas de Comando:
Primeiro projeto da disciplina de POO do curso de ADS no qual foi criado um Jogo de Duelo através de linhas de Comando (console Java).

#Descrição do Projeto:
Nesse jogo existiram 2 Guerreiros com um número X de vida e com o comando de "Ataque" (que tem chance de 50% de acertar 1 de dano à vida do seu adversário). De inicio o usuário deve criar seus 2 guerreiros informando um Codigo e um Nome pra cada, após isso os Guerreiros são criados e colocados em postos para lutar (no menu principal deve também ter a opção de editar esses dados), agora o usuário deve escolher uma das formas de Jogo. Independentimente de qual opção ele escolha o jogo se fáz em turnos, dá seguinte forma:

Enquanto (Guerreiro1.Vida != 0 && Guerreiro2.Vida != 0) faz:
 - Turno do Guerreiro1: Ativa o Ataque();
 - Se o ataque retornar possitivo faz: Guerreiro2.DeCrementarVida();	
 - Turno do Guerreiro2: Ativa o Ataque();
 - 2- Se o ataque retornar possitivo faz: Guerreiro1.DeCrementarVida();
fim de Enquanto;

Se Guerreiro1.Vida == 0
	Vencedor = Guerreiro2;
Se Não
	Vencedor = Guerreiro1;
fim de Se;

Após o termino da Luta o resultado com os dados do ganhador são mostrados e novamente é apresentado ao jogador o menu inicial. Agora, para poder recomeçar a luta o Usuário precisa restalrar a vida dos seus Guerrerios e para isso é apresentada a opção "Alimentar um Guerreiro", o jogo se encerra quando o Usuário excolher a opção "Exit" no menu principal;	
