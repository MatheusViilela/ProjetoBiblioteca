-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15-Jun-2022 às 22:50
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrador`
--

CREATE TABLE `administrador` (
  `idAdmin` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `administrador`
--

INSERT INTO `administrador` (`idAdmin`, `nome`, `email`, `senha`) VALUES
(6, 'root', 'root', 'root'),
(7, 'Matheus', 'aa', '123'),
(8, 'Matheus123', 'aa', '123'),
(9, 'Matheus123', 'aa', '123'),
(10, 'Matheus2', 'aa', '123'),
(11, 'Matheus3', 'aa', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(100) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `CPF` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `Cidade` varchar(100) NOT NULL,
  `Rua` varchar(100) NOT NULL,
  `Telefone` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `CEP` varchar(100) NOT NULL,
  `N` varchar(100) NOT NULL,
  `UF` varchar(2) NOT NULL,
  `Bairro` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `Nome`, `CPF`, `email`, `Cidade`, `Rua`, `Telefone`, `senha`, `CEP`, `N`, `UF`, `Bairro`) VALUES
(11, 'bbb', 324124, 'teste@', '', '', '', '123456', '', '', '', '0'),
(15, 'Pedro Oliveira', 47123432, 'pedro@gmail.com', 'Cruzeiro', 'Pedro', '1294328', '123456', '12754320', '318', 'SP', 'Regina'),
(16, 'Pedro Bessa', 412312, 'pedro@gmail.com', '', '', '', '1234567', '', '', '', '');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `administrador`
--
ALTER TABLE `administrador`
  MODIFY `idAdmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
