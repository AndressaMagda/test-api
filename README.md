# TestApi

Aplicação desenvolvida para um desafio técnico.

** Aplicação client para teste [test-ui](https://github.com/AndressaMagda/test-ui)

## Recursos usados: 

Spring Boot, Postgresql, Eclipse Jee Oxygen

## Dependencias
Postgresql

## Configurando o projeto:

1. Após efetuar o download ou clonar o projeto baixe as dependencias necessárias.
2. Configure o arquivo `test-api\src\main\resources\application.properties` com os dados do seu datasource. Feito isso, a aplicação se encarregará de criar a esturura necessária da tabela e dar uma carga inicial (Arquivos `data.sql e schema.sql`)
3. O banco será limpo ao reiniciar a aplicação

## Serviços Disponiveis

1. `/words`

Get Service que retorna uma lista com as palavras salvas no banco.

```
Exemplo:

[
    {
        "text":"ana",
        "palindrome":true,
        "firstChar":"n",
        "time":"418"
    },
     {
        "text":"maria",
        "palindrome":false,
        "firstChar":"m",
        "time":"128"
    },
    ...
]
```

2. `/palindrome`
Post Service que recebe uma palavra e retorna se a mesma é um palindromo e o tempo gasto em nanosegundos para a validação da string recebida.

```
Exemplo:

{
  "palindrome": "true",
  "time": "418"
}
```

3. `/firstChar`
Post Service que recebe uma palavra e retorna, se houver, o primeiro caractere não repetido da mesma ou uma mensagem de erro e o tempo gasto em nanosegundos para a validação da string recebida.

** Tempo utilizado em nanosegundos para uma maior precisão

```
Exemplo:

{
  "firstChar": "n",
  "time": "418"
}
```