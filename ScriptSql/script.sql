-- Tabela Gondola
CREATE TABLE Gondola (
    numero INT PRIMARY KEY,
    status VARCHAR(50)
);

-- Tabela Pessoa
CREATE TABLE Pessoa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    idade INT,
    pai_id INT,
    FOREIGN KEY (pai_id) REFERENCES Pessoa(id)
);