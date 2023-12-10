# -First-project-in-JPA

# Projeto Java com JPA - Operações Básicas de Cadastro

Este é um projeto Java simples que utiliza Java Persistence API (JPA) para realizar operações básicas de cadastro. O objetivo do projeto é demonstrar a implementação das principais operações CRUD (Create, Read, Update, Delete) em um banco de dados relacional.

## Funcionalidades

- **Criação (Create)**: Adiciona novos registros ao banco de dados.
- **Leitura (Read)**: Recupera informações existentes no banco de dados.
- **Atualização (Update)**: Modifica dados de registros existentes.
- **Exclusão (Delete)**: Remove registros do banco de dados.

## Estrutura do Projeto

- `Main.java`: Contém a lógica principal do programa, interagindo com as classes responsáveis pela comunicação com o banco de dados.
- `Entidade.java`: Define a entidade principal que será mapeada para uma tabela no banco de dados.
- `OperacoesJPA.java`: Implementa as operações CRUD utilizando JPA.

## Configuração

Antes de executar o projeto, certifique-se de configurar corretamente as propriedades de conexão com o banco de dados. Ajuste as configurações como URL do banco de dados, usuário e senha conforme necessário.

```xml
<!-- Exemplo de configuração em persistence.xml -->
<persistence-unit name="CadastroPU" transaction-type="RESOURCE_LOCAL">
    <class>br.com.seupacote.Entidade</class>
    <properties>
        <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/seubanco"/>
        <property name="javax.persistence.jdbc.user" value="seuusuario"/>
        <property name="javax.persistence.jdbc.password" value="suasenha"/>
        <!-- Outras propriedades de configuração -->
    </properties>
</persistence-unit>
