# Como subir este repositório para o GitHub

Repositório destino:

```text
https://github.com/luancabral1/springboot-studies
```

## Opção recomendada

Clone o repositório existente:

```bash
git clone https://github.com/luancabral1/springboot-studies.git
cd springboot-studies
```

Copie o conteúdo da pasta preparada `springboot-studies/` para dentro da pasta clonada.

Depois rode:

```bash
git status
git add .
git commit -m "docs: organize spring boot studies repository"
git push
```

## Confira antes do commit

O `git status` não deve mostrar:

```text
.idea/
target/
*.class
*.iml
```

Esses arquivos já estão protegidos pelo `.gitignore`.


---

## Atualização incluída nesta versão

Esta versão também inclui o estudo:

```text
02-rest-api-usuarios/
```

Ele foi organizado como um exercício de API REST com Spring Boot, contendo controller, entidade `User`, endpoints básicos e README próprio.

Antes de subir, confira se estes arquivos não aparecem no `git status`:

```text
target/
.idea/
*.class
*.iml
```
