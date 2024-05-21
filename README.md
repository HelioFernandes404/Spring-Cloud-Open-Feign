Descrição da API de Consulta de CEP

Visão Geral

Esta API foi desenvolvida utilizando Spring Boot e Spring Cloud OpenFeign para facilitar a consulta de Código de Endereçamento Postal (CEP) no Brasil. A API integra-se ao serviço ViaCEP para obter informações detalhadas sobre um CEP fornecido.

Funcionalidades

- Consulta de CEP: Permite consultar um CEP brasileiro e retornar informações detalhadas sobre o endereço associado, como logradouro, bairro, localidade, unidade federativa, entre outros.
- Validação de CEP: Verifica se o CEP fornecido está no formato correto (8 dígitos numéricos) antes de realizar a consulta na API do ViaCEP.

Endpoints

GET /clientviacep/cep/{cep}

Consulta informações sobre um endereço baseado no CEP fornecido.

- Parâmetros:
  - cep (path): O CEP a ser consultado. Deve conter 8 dígitos numéricos.

- Retorno:
  - 200 OK: Retorna os detalhes do endereço no formato JSON.
  - 400 Bad Request: Retorna um erro caso o CEP esteja em formato inválido.
  - 404 Not Found: Retorna um erro caso o CEP não seja encontrado na base de dados do ViaCEP.

```
- Exemplo de Chamada:
  GET /clientviacep/cep/01001000
```

```
- Exemplo de Resposta:
  {
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "complemento": "lado ímpar",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP",
    "ibge": "3550308",
    "gia": "1004",
    "ddd": "11",
    "siafi": "7107"
  }
```

Arquitetura

FeignClient
O cliente Feign é configurado para se comunicar com a API do ViaCEP, permitindo realizar consultas HTTP de forma simples e declarativa.
