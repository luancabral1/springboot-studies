# Comandos para subir o repositório springboot-studies

Use este guia para enviar o repositório `springboot-studies` para o GitHub.

Repositório remoto:

```text
https://github.com/luancabral1/springboot-studies
```

---

## 1. Clonar o repositório existente

Abra o terminal na pasta onde você guarda seus projetos.

Exemplo:

```bash
cd Desktop
```

Clone o repositório:

```bash
git clone https://github.com/luancabral1/springboot-studies.git
```

Entre na pasta:

```bash
cd springboot-studies
```

---

## 2. Permitir a pasta local, se o Git bloquear

Se aparecer erro de segurança como `detected dubious ownership in repository`, rode:

```bash
git config --global --add safe.directory "%cd%"
```

Se esse comando não funcionar, use o caminho completo da pasta.

Exemplo no Windows:

```bash
git config --global --add safe.directory "C:/Users/SEU_USUARIO/Desktop/springboot-studies"
```

---

## 3. Copiar os arquivos preparados

Extraia o `.zip` preparado.

Copie o conteúdo da pasta preparada `springboot-studies/` para dentro da pasta clonada:

```text
springboot-studies/
```

A estrutura final deve ficar assim:

```text
springboot-studies/
├── 01-primeira-api/
├── 02-rest-api-usuarios/
├── README.md
├── .gitignore
├── LICENSE
└── COMANDOS_GIT.md
```

Evite deixar uma pasta dentro da outra assim:

```text
springboot-studies/
└── springboot-studies/
```

---

## 4. Conferir os arquivos

Rode:

```bash
git status
```

Não devem aparecer arquivos como:

```text
target/
.idea/
*.class
*.iml
.env
```

Se aparecerem, confira o `.gitignore` antes de continuar.

---

## 5. Adicionar os arquivos

```bash
git add .
```

Confira novamente:

```bash
git status
```

---

## 6. Fazer o commit

```bash
git commit -m "docs: organize spring boot studies repository"
```

---

## 7. Atualizar com o GitHub antes do push

Para evitar o erro de histórico diferente, rode:

```bash
git pull origin main --allow-unrelated-histories
```

Se abrir o Vim pedindo mensagem de merge:

1. Aperte `Esc`
2. Digite `:wq`
3. Aperte `Enter`

Se aparecer conflito, abra os arquivos marcados, resolva, depois rode:

```bash
git add .
git commit -m "chore: resolve initial merge"
```

---

## 8. Enviar para o GitHub

```bash
git push -u origin main
```

Se já estava tudo configurado, também pode funcionar apenas:

```bash
git push
```

---

## Fluxo resumido

```bash
git clone https://github.com/luancabral1/springboot-studies.git
cd springboot-studies
git config --global --add safe.directory "%cd%"
git status
git add .
git commit -m "docs: organize spring boot studies repository"
git pull origin main --allow-unrelated-histories
git push -u origin main
```

---

## Se der erro: remote origin already exists

Esse erro acontece quando você tenta adicionar um remote que já existe.

Veja o remote atual:

```bash
git remote -v
```

Se o link estiver correto, não precisa adicionar de novo. Apenas envie:

```bash
git push -u origin main
```

Se o link estiver errado, corrija:

```bash
git remote set-url origin https://github.com/luancabral1/springboot-studies.git
```

Depois envie:

```bash
git push -u origin main
```

---

## Se você quiser substituir o conteúdo do GitHub pela versão local

Use somente se tiver certeza de que o conteúdo antigo do GitHub não importa:

```bash
git push -u origin main --force-with-lease
```

---

## Checklist antes de enviar

Antes do `git push`, confirme:

```text
README.md existe
.gitignore existe
LICENSE existe
01-primeira-api/ existe
02-rest-api-usuarios/ existe
target/ não aparece
.idea/ não aparece
*.class não aparece
*.iml não aparece
.env não aparece
```
