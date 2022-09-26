# TCL (transaction control language)
- É um conjunto de declarações SQL como uma única operação
# Propriedades (ACID)
- <b>Atomicidade</b> – cada transação é tratada como uma única unidade, que é totalmente bem-sucedida ou que falha completamente. Por exemplo, uma transação que envolve o débito de fundos de uma conta e o crédito do mesmo valor em outra conta deve concluir ambas as ações. Se uma das ações não puder ser concluída, a outra ação deverá falhar.
- <b>Consistência</b> – as transações só podem conduzir os dados do banco de dados de um estado válido para outro estado válido. Para continuar com o exemplo de débito e crédito acima, o estado concluído da transação deve refletir na transferência de fundos de uma conta para outra.
- <b>Isolamento</b> – as transações simultâneas não podem interferir entre si e devem resultar em um estado consistente do banco de dados. Por exemplo, enquanto a transação para transferir fundos de uma conta para outra está em processo, outra transação que verifica o saldo dessas contas deve retornar resultados consistentes – a transação de verificação de saldo não pode recuperar um valor para uma conta que reflita o saldo antes da transferência e um valor para a outra conta que reflita o saldo após a transferência.
- <b>Durabilidade</b> – quando uma transação tiver sido confirmada, ela permanecerá confirmada. Depois que a transação de transferência entre contas for concluída, os saldos de conta revisados serão persistidos para que, mesmo que o sistema do banco de dados seja desligado, a transação confirmada seja refletida quando ele for ligado novamente.
# Controle de Transações no SGBD
- START TRANSACTION (Iniciar uma transação)- <b>início</b>
- COMMIT (Usamos para salvar transações no banco de dados) - <b>fim</b>
- ROLLBACK (Usamos para desfazer alterações no banco de dados) - <b>fim</b>
- SAVEPOINT (Usamos para criar um ponto de restauração para, se necessário, utilizar o rollback no banco de dados)
- Vídeo aula sobre transações https://www.youtube.com/watch?v=jfvnHWVJz-E