# Sistema de Controle de Versão

## Configuração inicial para uso do Git  
Credenciamento no Git é a configuração que permite identificar quais alterações foram feitas por certas credenciais, já alinhando a possível e eventual acréssimo de colaboradores ao projeto, sendo o nome podendo ser um apelido qualquer e o email tendo que ser o cadastrado, neste caso, o mesmo do GitHub.

```bash
git --glogal user.name "nome/apelido"
git --global user.email "e-mail@email"
```

### Configuração de nome de usuário e e-mail no Git
### Criando Personal Access Token (PAT) no GitHub
É uma forma de autenticação por _Token_ para validar a credencial, podendo ter restrições bem refinadas e adequadas para as credenciais, compostas de caracteres alfanuméricos, podendo ter mais de 36 caracteres se torna eficiente, gerenciável, prático e robusto.

#### Passos para criar uma PAT no GitHub
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
## Qual a diferença entre git merge e git rebase?