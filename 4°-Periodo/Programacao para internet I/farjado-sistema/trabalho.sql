-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 12-Nov-2018 às 10:48
-- Versão do servidor: 5.7.21
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trabalho`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrar`
--

DROP TABLE IF EXISTS `administrar`;
CREATE TABLE IF NOT EXISTS `administrar` (
  `cod_admin` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `login` varchar(20) NOT NULL,
  `senha` varchar(40) NOT NULL,
  `status` enum('0','1') NOT NULL DEFAULT '1'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE IF NOT EXISTS `aluno` (
  `nome` varchar(56) NOT NULL,
  `cod_aluno` int(4) NOT NULL AUTO_INCREMENT,
  `matricula` varchar(34) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  PRIMARY KEY (`cod_aluno`)
) ENGINE=MyISAM AUTO_INCREMENT=54 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`nome`, `cod_aluno`, `matricula`, `telefone`) VALUES
('sdfdsf', 1, 'sdfdf', 'sdfdsf'),
('cadastra', 52, '123', '234'),
('dieisson', 33, '12343', '3365443'),
('dieisson', 34, '12343', '3365443'),
('dieisson', 46, '1223', '33434'),
('dieisson martins', 38, '121', '3232'),
('dieisson martins', 39, '121', '3232'),
('12', 40, 'dff', 'dsfdsf'),
('dieisson', 41, '12', '334'),
('12', 42, 'dff', 'dsfdsf'),
('12', 43, 'dff', 'dsfdsf'),
('12', 44, 'sdfdsf', 'dsfdsf'),
('dieisson', 53, 'sdfdsf', 'ddf');

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno_turma`
--

DROP TABLE IF EXISTS `aluno_turma`;
CREATE TABLE IF NOT EXISTS `aluno_turma` (
  `cod_aluno` int(11) NOT NULL,
  `cod_turma` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

DROP TABLE IF EXISTS `curso`;
CREATE TABLE IF NOT EXISTS `curso` (
  `cod_curso` int(12) NOT NULL AUTO_INCREMENT,
  `nome` varchar(43) NOT NULL,
  `sigla` varchar(34) NOT NULL,
  PRIMARY KEY (`cod_curso`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`cod_curso`, `nome`, `sigla`) VALUES
(1, 'sistemas', 'SI'),
(3, 'sistemas', 'SI'),
(4, 'direito', 'DI');

-- --------------------------------------------------------

--
-- Estrutura da tabela `turma`
--

DROP TABLE IF EXISTS `turma`;
CREATE TABLE IF NOT EXISTS `turma` (
  `cod_turma` int(11) NOT NULL AUTO_INCREMENT,
  `letra` varchar(12) NOT NULL,
  `periodo` varchar(12) NOT NULL,
  `cod_curso` int(12) NOT NULL,
  `ano` varchar(12) NOT NULL,
  `semestre` int(11) NOT NULL,
  PRIMARY KEY (`cod_turma`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `turma`
--

INSERT INTO `turma` (`cod_turma`, `letra`, `periodo`, `cod_curso`, `ano`, `semestre`) VALUES
(4, 'B', '3', 1, '2132', 1),
(3, 'B', '3', 1, '2132', 1),
(5, '', '', 1, '', 1),
(6, '', '', 1, '', 1),
(7, '', '', 1, '', 1),
(8, '', '', 1, '', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
