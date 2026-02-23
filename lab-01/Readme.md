# Sistema de Controle de Versão

## Configuração inicial para uso do Git  
Credenciamento no Git é a configuração que permite identificar quais alterações foram feitas por certas credenciais, já alinhando a possível e eventual acréssimo de colaboradores ao projeto, sendo o nome podendo ser um apelido qualquer e o email tendo que ser o cadastrado, neste caso, o mesmo do GitHub.

```bash
git --glogal user.name "nome/apelido"
git --global user.email "e-mail@email"
```

### Configuração de nome de usuário e e-mail no Git
### Criando Personal Access Token (PAT) no GitHub<sup>&reg;</sup>
É uma forma de autenticação por _Token_ para validar a credencial, podendo ter restrições bem refinadas e adequadas para as credenciais, compostas de caracteres alfanuméricos, podendo ter mais de 36 caracteres se torna eficiente, gerenciável, prático e robusto.

#### Passos para criar uma PAT no GitHub<sup>&reg;</sup>
1. Acesse as Configurações: No canto superior direito do GitHub, clique na sua foto de perfil e selecione Settings.  
2. Developer Settings: No menu lateral esquerdo, role até o final e clique em Developer settings.  
3. Tokens (classic): Clique em Personal access tokens e depois em Tokens (classic).  
4. Gerar Novo: Clique no botão Generate new token (e escolha a opção Generate new token (classic)).  
5. Identificação (Note): No campo "Note", dê um nome para o token (ex: "Acesso via VS Code").  
6. Expiração: Escolha por quanto tempo o token será válido (ex: 30, 90 dias ou nunca expira).  
7. Escopos (Permissões): Marque as caixas do que o token pode fazer. Para uso comum no terminal, marque a caixa repo (ela engloba controle de código e commits).  
8. Finalizar: Role até o fim da página e clique em Generate token.  
9. Copiar e Salvar: O código (ex: ghp_...) aparecerá na tela. Copie-o agora, pois após sair dessa página você nunca mais conseguirá vê-lo.

### Salvar em cache as credenciais na PAT
É necessário para que a atividade de versionamento e atualização da prudução do código seja rápida, sem entraves de busca de chaves para "subir" o código para o GitHub<sup>&reg;</sup>, assim trazendo conveniência, segurança e automação. O exemplo a seguir seria para manter as credenciais em _cache_ por 1 hora (3600s).
```bash
git config --global credential.helper 'cache --timeout=3600'
```
Somente no próximo _git pull_ ou _push_ será requisitado o nome do usuário e o PAT, ficarão estes na cache pelo tempo solicitado. Após o tempo findar será necessário voltar à usar o PAT para as ações de do _git pull_ ou _push_.

## Qual a diferença entre git merge e git rebase?
De uma maneira simplificada pode-se dizer que o _git merge_ mantém ramificações (_branches_) no versionamento do código, uma utilidade para isso é tendo um código já em funcionamento, porém há uma necessidade de otimização em trechos, mantém-se o que já foi feito em uma versão paralela se edita os códigos de interesse. Na opção _git rebase_ não há versão paralela, o ramo (_branch_) é substituído e a descontinuidade também.

![Git merg vs Git rebase](Imagens/GitMergeVsGitRebase.png "Título opcional")
*Figura 1: Representação visual do merge e rebase da branch Feature na Main.*

O uso do git _merge_, em uma dinâmica coperativa, trás benefícios de fundir os vercionamentos,criar ramos para testes de novos trechos, criar ramos de otimização do código e correção de erros, enquanto o _rebase_ define a linha única e principal da versão, útil para definir um novo ponto de "partida". 