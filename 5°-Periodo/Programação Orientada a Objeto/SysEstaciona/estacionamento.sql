-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 22-Maio-2019 às 00:46
-- Versão do servidor: 5.7.17-log
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluguel`
--

CREATE TABLE `aluguel` (
  `id_aluguel` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_vaga` int(11) NOT NULL,
  `aluguel` varchar(100) NOT NULL,
  `vencimento` int(11) NOT NULL,
  `tempos` time NOT NULL,
  `data_mes` date NOT NULL,
  `id_preco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `boleto`
--

CREATE TABLE `boleto` (
  `id_boleto` int(11) NOT NULL,
  `id_aluguel` int(11) NOT NULL,
  `mes` date NOT NULL,
  `situacao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `carros`
--

CREATE TABLE `carros` (
  `id_carro` int(11) NOT NULL,
  `placa` varchar(100) NOT NULL,
  `cor` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `carros`
--

INSERT INTO `carros` (`id_carro`, `placa`, `cor`, `nome`) VALUES
(1, '34', 'ggdfg', 'dfgf');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `telefone` int(11) NOT NULL,
  `CPF` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `estacionamento`
--

CREATE TABLE `estacionamento` (
  `id_estacio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `preco`
--

CREATE TABLE `preco` (
  `id_preco` int(11) NOT NULL,
  `ValorHora` float NOT NULL,
  `ValorMensal` float NOT NULL,
  `preco` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vagas`
--

CREATE TABLE `vagas` (
  `id_vaga` int(11) NOT NULL,
  `nº` int(11) NOT NULL,
  `descricao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluguel`
--
ALTER TABLE `aluguel`
  ADD PRIMARY KEY (`id_aluguel`);

--
-- Indexes for table `boleto`
--
ALTER TABLE `boleto`
  ADD PRIMARY KEY (`id_boleto`);

--
-- Indexes for table `carros`
--
ALTER TABLE `carros`
  ADD PRIMARY KEY (`id_carro`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `estacionamento`
--
ALTER TABLE `estacionamento`
  ADD PRIMARY KEY (`id_estacio`);

--
-- Indexes for table `preco`
--
ALTER TABLE `preco`
  ADD PRIMARY KEY (`id_preco`);

--
-- Indexes for table `vagas`
--
ALTER TABLE `vagas`
  ADD PRIMARY KEY (`id_vaga`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aluguel`
--
ALTER TABLE `aluguel`
  MODIFY `id_aluguel` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `boleto`
--
ALTER TABLE `boleto`
  MODIFY `id_boleto` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `carros`
--
ALTER TABLE `carros`
  MODIFY `id_carro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `estacionamento`
--
ALTER TABLE `estacionamento`
  MODIFY `id_estacio` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `preco`
--
ALTER TABLE `preco`
  MODIFY `id_preco` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `vagas`
--
ALTER TABLE `vagas`
  MODIFY `id_vaga` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
