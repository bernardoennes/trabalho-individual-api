# 📚 Prova API - Serratec
Esse codigo é um modelo simples de API RESTful usando a linguagem java em conjunto com o SpringBoot, o projeto mostrado foi feito durante a Residencia em TIC/Software do Serratec 2025.1

## ▶️ Como executar
Para os interresados em testar o codigo por si mesmos:

1. Clone o repositório:
   ```bash
   git clone https://github.com/bernardoennes/trabalho-individual-api
   
2. Importe o projeto em sua IDE Java de sua preferência.
   
3. Compile e execute a classe desejada dentro dos pacotes de acordo com o exercício.
   
4. Acesse o link:
   ```bash
   http://localhost:8080/h2-console/
E coloque "bernardo" tanto no username quando na senha

5. Caso queira popular as tabelas com o intuito de teste segue um simples comando
   ```bash
   INSERT INTO Funcionario (nome, rua, cidade, estado, cep) VALUES
   ('João Silva', 'Rua A, 123', 'São Paulo', 'SP', '01000-000'),
   ('Maria Oliveira', 'Rua B, 456', 'Rio de Janeiro', 'RJ', '20000-000'),
   ('Carlos Pereira', 'Rua C, 789', 'Belo Horizonte', 'MG', '30000-000'),
   ('Ana Souza', 'Rua D, 101', 'Porto Alegre', 'RS', '90000-000'),
   ('Pedro Santos', 'Rua E, 202', 'Curitiba', 'PR', '80000-000'),
   ('Juliana Costa', 'Rua F, 303', 'Florianópolis', 'SC', '88000-000'),
   ('Rafael Lima', 'Rua G, 404', 'Salvador', 'BA', '40000-000'),
   ('Fernanda Almeida', 'Rua H, 505', 'Fortaleza', 'CE', '60000-000'),
   ('Lucas Rocha', 'Rua I, 606', 'Recife', 'PE', '50000-000'),
   ('Camila Mendes', 'Rua J, 707', 'Manaus', 'AM', '69000-000'),
   ('Gabriel Nunes', 'Rua K, 808', 'Brasília', 'DF', '70000-000'),
   ('Larissa Martins', 'Rua L, 909', 'Goiânia', 'GO', '74000-000'),
   ('Thiago Barbosa', 'Rua M, 111', 'Natal', 'RN', '59000-000'),
   ('Beatriz Ribeiro', 'Rua N, 222', 'João Pessoa', 'PB', '58000-000'),
   ('Renato Carvalho', 'Rua O, 333', 'Maceió', 'AL', '57000-000');
