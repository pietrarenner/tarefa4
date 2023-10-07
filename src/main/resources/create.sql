DROP TABLE produtos IF EXISTS;

CREATE TABLE produtos(
    codigo INTEGER,
    descricao VARCHAR(200),
    preco DECIMAL(20,3),
    estoque INTEGER,

    PRIMARY KEY(codigo)
);