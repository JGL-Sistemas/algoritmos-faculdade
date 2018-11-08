-- phpMyAdmin SQL Dump
-- version 4.6.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 06-Nov-2018 às 22:05
-- Versão do servidor: 5.7.12-log
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `imobiliaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cargos_imobiliaria`
--

CREATE TABLE `cargos_imobiliaria` (
  `idcargos_imobiliaria` int(11) NOT NULL,
  `nome_cargo` varchar(50) DEFAULT NULL,
  `salario_cargo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cargos_imobiliaria`
--

INSERT INTO `cargos_imobiliaria` (`idcargos_imobiliaria`, `nome_cargo`, `salario_cargo`) VALUES
(3, 'Agente Comercial ', 1200),
(4, 'Vendedor', 957),
(5, 'Telemarketing', 1100),
(6, 'Agente Administrativo', 1123),
(7, 'Recepcionista', 957),
(8, 'Designer Grafico', 800),
(9, 'Programador de Sistemas', 2123);

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria_imovel`
--

CREATE TABLE `categoria_imovel` (
  `idcat_imovel` int(11) NOT NULL,
  `cat_sala_comercial_idcat_sala_comercial` int(11) NOT NULL,
  `cat_terreno_idcat_terreno` int(11) NOT NULL,
  `cat_casa_idcat_casa` int(11) NOT NULL,
  `cat_apartamento_idcat_apartamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `categoria_imovel`
--

INSERT INTO `categoria_imovel` (`idcat_imovel`, `cat_sala_comercial_idcat_sala_comercial`, `cat_terreno_idcat_terreno`, `cat_casa_idcat_casa`, `cat_apartamento_idcat_apartamento`) VALUES
(1, 1, 2, 3, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cat_apartamento`
--

CREATE TABLE `cat_apartamento` (
  `idcat_apartamento` int(11) NOT NULL,
  `qtd_quartos` varchar(5) DEFAULT NULL,
  `qtd_suites` varchar(5) DEFAULT NULL,
  `qtd_sala` varchar(5) DEFAULT NULL,
  `qtd_sala_jantar` varchar(5) DEFAULT NULL,
  `NVG_garagem` varchar(5) DEFAULT NULL,
  `armario` varchar(5) DEFAULT NULL,
  `andar` varchar(5) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `portaria` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cat_apartamento`
--

INSERT INTO `cat_apartamento` (`idcat_apartamento`, `qtd_quartos`, `qtd_suites`, `qtd_sala`, `qtd_sala_jantar`, `NVG_garagem`, `armario`, `andar`, `valor`, `portaria`) VALUES
(1, '4', '1', '2', '1', '3', 'sim', '8', 120000, 'sim'),
(2, '3', '2', '1', '1', '4', 'sim', '10', 90000, 'sim');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cat_casa`
--

CREATE TABLE `cat_casa` (
  `idcat_casa` int(11) NOT NULL,
  `qtd_quartos` varchar(5) DEFAULT NULL,
  `qtd_suites` varchar(5) DEFAULT NULL,
  `qtd_salas` varchar(5) DEFAULT NULL,
  `qtd_salas_jantar` varchar(5) DEFAULT NULL,
  `NVG_garagem` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cat_casa`
--

INSERT INTO `cat_casa` (`idcat_casa`, `qtd_quartos`, `qtd_suites`, `qtd_salas`, `qtd_salas_jantar`, `NVG_garagem`) VALUES
(1, '4', '2', '1', '1', '3'),
(2, '3', '0', '1', '1', '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cat_sala_comercial`
--

CREATE TABLE `cat_sala_comercial` (
  `idcat_sala_comercial` int(11) NOT NULL,
  `area_quadrada` float DEFAULT NULL,
  `qtd_banheiro` int(11) DEFAULT NULL,
  `qtd_comodos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cat_sala_comercial`
--

INSERT INTO `cat_sala_comercial` (`idcat_sala_comercial`, `area_quadrada`, `qtd_banheiro`, `qtd_comodos`) VALUES
(1, 10, 1, 2),
(2, 20, 2, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cat_terreno`
--

CREATE TABLE `cat_terreno` (
  `idcat_terreno` int(11) NOT NULL,
  `area_metros` float DEFAULT NULL,
  `largura` float DEFAULT NULL,
  `comprimento` float DEFAULT NULL,
  `terreno` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cat_terreno`
--

INSERT INTO `cat_terreno` (`idcat_terreno`, `area_metros`, `largura`, `comprimento`, `terreno`) VALUES
(1, 2500, 50, 50, 'aclive'),
(2, 8100, 90, 90, 'declive');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `CPF_cliente` varchar(14) DEFAULT NULL,
  `nome_cliente` varchar(50) DEFAULT NULL,
  `endereço` varchar(50) DEFAULT NULL,
  `telefone_fixo` varchar(15) DEFAULT NULL,
  `celular_cliente` varchar(15) DEFAULT NULL,
  `email_cliente` varchar(50) DEFAULT NULL,
  `sexo_cliente` varchar(15) DEFAULT NULL,
  `estado_civil_cliente` varchar(25) DEFAULT NULL,
  `profissao_cliente` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idcliente`, `CPF_cliente`, `nome_cliente`, `endereço`, `telefone_fixo`, `celular_cliente`, `email_cliente`, `sexo_cliente`, `estado_civil_cliente`, `profissao_cliente`) VALUES
(1, '14299875563', 'Dieisson Martins dos santos', 'Rua Manoel tome', '3335331298', '988653814', 'dieisson@contato.com.br', 'm', 'cansado', 'Programador de Sistemas de Informação '),
(2, '14500182557', 'Jordan Gabriel Lemes Ramos', 'Rua Francisco de Assis Mota', '3335331209', '33988694444', 'jordan@gmail.com', 'Masculino', 'Viuvo', 'Professor'),
(3, '15539186575', 'Kelly Oliveira Neves', 'Rua dos Violões', '3335314024', '33988485577', 'kelly@gmail.com', 'Feminino', 'Casada', 'Programadora'),
(4, '12345678985', 'Fernando Kayro Manoel', 'Rua do meio', '3334313985', '33985741511', 'kayro@gmail.com', 'Masculino', 'Sozinho', 'SGBD'),
(5, '234243437243', 'Danilo Ferraz', 'Rua do lado', '3335323996', '33996874512', 'ferraz@gmail.com', 'Masculino', 'namorando', 'Assistente Administrativo'),
(6, '12455585698', 'Felipe Oliveira', 'Rua da Frente', '3335585956', '33988888888', 'oliveira@gmail.com', 'Masculino', 'namorando', 'programador'),
(7, '12425226525', 'Samuel Lemes', 'Rua dos ladroes', '3335698545', '33988123456', 'lemes@gmail.com', 'Masculino', 'Viuvo', 'SGBD'),
(8, '12457855554', 'Giovanni Camargo', 'Rua Principal', '3335214578', '33999766565', 'camargo@gmail.com', 'Masculino', 'Casado', 'Professor programador'),
(9, '12425685458', 'Keila Lemes', 'Rua Francisco de Assis Mota', '3335689585', '33999989898', 'Keila@gmail.com', 'Feminino', 'solteira', 'Fisioterapeuta'),
(10, '12425685652', 'Tayna Aguiar', 'Rua joaquim Pereira', '3335698555', '33999785265', 'tayna@gmail.com', 'Feminino', 'namorando', 'Recepcionista');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente_imobiliaria`
--

CREATE TABLE `cliente_imobiliaria` (
  `idcliente_propri` int(11) NOT NULL,
  `imobiliaria_idimobiliaria` int(11) NOT NULL,
  `cpf_propri` varchar(14) DEFAULT NULL,
  `nome_propri` varchar(50) DEFAULT NULL,
  `endereco_propri` varchar(50) DEFAULT NULL,
  `telefone_propri` varchar(15) DEFAULT NULL,
  `telefone_contato1_propi` varchar(15) DEFAULT NULL,
  `telefone_contato2_propi` varchar(15) DEFAULT NULL,
  `email_propri` varchar(50) DEFAULT NULL,
  `sexo_propri` varchar(15) DEFAULT NULL,
  `estado_civil_propri` varchar(25) DEFAULT NULL,
  `profissao_propri` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente_imobiliaria`
--

INSERT INTO `cliente_imobiliaria` (`idcliente_propri`, `imobiliaria_idimobiliaria`, `cpf_propri`, `nome_propri`, `endereco_propri`, `telefone_propri`, `telefone_contato1_propi`, `telefone_contato2_propi`, `email_propri`, `sexo_propri`, `estado_civil_propri`, `profissao_propri`) VALUES
(1, 0, '12425458545', 'Ricardo Lemes', 'Rua da banda', '3335254585', '33988888888', '33977777777', 'ricardo@gmail.com', 'M', 'casado', 'T.I'),
(2, 0, '12422523565', 'Anderson', 'Rua do lado', '3335254588', '33988888887', '33977777773', 'ander@gmail.com', 'M', 'Solteiro', 'T.I'),
(3, 0, '12422523567', 'Lucas Pedroza', 'Rua da Frente', '3335254524', '33988888847', '33977777714', 'lucas@gmail.com', 'M', 'Solteiro', 'T.I'),
(4, 0, '12422523514', 'Matheus Moreira', 'Rua da Caixa D\'agua', '3335254547', '339888888456', '33977777717', 'matheus@gmail.com', 'M', 'Solteiro', 'T.I'),
(5, 0, '12425458514', 'Gustavo Fajardo', 'Rua das Graças', '3335254558', '33988888843', '33977777145', 'gustavo@gmail.com', 'M', 'Solteiro', 'T.I'),
(6, 0, '12452252354', 'Bruno ', 'Rua da Casa Branca', '3335254548', '33988888123', '33977777123', 'bruno@gmail.com', 'M', 'Solteiro', 'T.I'),
(7, 0, '12425458457', 'Nathan', 'Rua Amadeu', '3335254568', '33988888356', '33977777124', 'Nathan@gmail.com', 'M', 'Solteiro', 'T.I'),
(8, 0, '12425458784', 'Diego', 'Rua Amarela', '3335254452', '33988888873', '33977777999', 'diego@gmail.com', 'M', 'Solteiro', 'T.I'),
(9, 0, '12425458124', 'Cassio Senna', 'Rua Teo', '33352541248', '33988888686', '33977777788', 'cassio@gmail.com', 'M', 'Solteiro', 'T.I'),
(10, 0, '12425458458', 'João Victor', 'Rua Verde', '3335254784', '33988888125', '33977777125', 'joao@gmail.com', 'M', 'Solteiro', 'T.I');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fiador`
--

CREATE TABLE `fiador` (
  `idfiador` int(11) NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `CPF_fiador` varchar(14) DEFAULT NULL,
  `indicacoes` varchar(30) DEFAULT NULL,
  `endereco_fiador` varchar(50) DEFAULT NULL,
  `telefone_fiador` varchar(15) DEFAULT NULL,
  `nome_fiador` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `fiador`
--

INSERT INTO `fiador` (`idfiador`, `cliente_idcliente`, `CPF_fiador`, `indicacoes`, `endereco_fiador`, `telefone_fiador`, `nome_fiador`) VALUES
(1, 0, '12512412458', 'Fernando', 'Rua Roxa', '3335321245', 'Lucia Helena'),
(2, 0, '12425365878', 'Pedro', 'Rua Azul', '3335985245', 'Lucas Matsueda'),
(3, 0, '14225265689', 'Jordan', 'Rua Principal', '3335321244', 'Giovanni'),
(4, 0, '12425365885', 'Danilo', 'Rua Preta', '3335985278', 'Renato'),
(5, 0, '14225265647', 'Kelly', 'Rua Rosa', '3335321278', 'Helio Vinicius');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `idfuncionario` int(11) NOT NULL,
  `cargos_imobiliaria_idcargos_imobiliaria` int(11) NOT NULL,
  `imobiliaria_idimobiliaria` int(11) NOT NULL,
  `nome_funcio` varchar(50) DEFAULT NULL,
  `telefone_funcio` varchar(15) DEFAULT NULL,
  `CPF_funcio` varchar(14) DEFAULT NULL,
  `celular_funcio` varchar(15) DEFAULT NULL,
  `endereço_funcio` varchar(50) DEFAULT NULL,
  `data_engresso_funcio` date DEFAULT NULL,
  `comissao_funcio` float DEFAULT NULL,
  `login_funcio` varchar(20) DEFAULT NULL,
  `senha_funcio` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`idfuncionario`, `cargos_imobiliaria_idcargos_imobiliaria`, `imobiliaria_idimobiliaria`, `nome_funcio`, `telefone_funcio`, `CPF_funcio`, `celular_funcio`, `endereço_funcio`, `data_engresso_funcio`, `comissao_funcio`, `login_funcio`, `senha_funcio`) VALUES
(1, 0, 0, 'Pedro', '3335625655', '32112452588', '33999999999', 'Rua UNIPAC', '2018-01-03', 10, 'pedro', '123'),
(2, 0, 0, 'Jorge', '3335258548', '12545854525', '33999784512', 'Rua Doctum', '2017-05-09', 10, 'jorge', '1234'),
(3, 0, 0, 'Joao', '3335685655', '32117552588', '33999997999', 'Rua UNIPAC2', '2017-04-03', 10, 'joao', '123'),
(4, 0, 0, 'Jessica', '3335259548', '12545954525', '33999784912', 'Rua pereira', '2015-05-12', 10, 'jessica', '1234'),
(5, 0, 0, 'Julio', '3335725655', '32112472588', '33999799999', 'Rua Federal', '0000-00-00', 10, 'julio', '123'),
(6, 0, 0, 'Rayrah', '3335754548', '12545858525', '33999788512', 'Rua Gomes', '2017-06-20', 10, 'rayrah', '1234'),
(7, 0, 0, 'Alexia', '3335625678', '32112452523', '33999999992', 'Rua Matriz', '2017-11-23', 10, 'alexia', '1234');

-- --------------------------------------------------------

--
-- Estrutura da tabela `historico`
--

CREATE TABLE `historico` (
  `idhistorico` int(11) NOT NULL,
  `relatorio_idrelatorio` int(11) NOT NULL,
  `pagamento_idpagamento` int(11) NOT NULL,
  `imobiliaria_idimobiliaria` int(11) NOT NULL,
  `status_2_idstatus` int(11) NOT NULL,
  `data_transacao` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `imobiliaria`
--

CREATE TABLE `imobiliaria` (
  `idimobiliaria` int(11) NOT NULL,
  `id_valor` int(11) DEFAULT NULL,
  `id_cat_imovel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `imovel`
--

CREATE TABLE `imovel` (
  `idimovel` int(11) NOT NULL,
  `categoria_imovel_idcat_imovel` int(11) NOT NULL,
  `imobiliaria_idimobiliaria` int(11) NOT NULL,
  `status_2_idstatus` int(11) NOT NULL,
  `foto_URL` varchar(30) DEFAULT NULL,
  `data_construcao` date DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `numero` varchar(5) DEFAULT NULL,
  `referencia` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `idpagamento` int(11) NOT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `bandeira` varchar(20) DEFAULT NULL,
  `parcelas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `relatorio`
--

CREATE TABLE `relatorio` (
  `idrelatorio` int(11) NOT NULL,
  `imobiliaria_idimobiliaria` int(11) NOT NULL,
  `status_2_idstatus` int(11) NOT NULL,
  `pagamento_idpagamento` int(11) NOT NULL,
  `data_transacao` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `status_venda_2`
--

CREATE TABLE `status_venda_2` (
  `idstatus` int(11) NOT NULL,
  `venda` varchar(30) DEFAULT NULL,
  `locacao` varchar(30) DEFAULT NULL,
  `data_locado` date DEFAULT NULL,
  `data_alugado_vendido` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `valor`
--

CREATE TABLE `valor` (
  `idvalor` int(11) NOT NULL,
  `imovel_idimovel` int(11) NOT NULL,
  `parcelas` int(11) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `comissao_imobiliaria` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cargos_imobiliaria`
--
ALTER TABLE `cargos_imobiliaria`
  ADD PRIMARY KEY (`idcargos_imobiliaria`);

--
-- Indexes for table `categoria_imovel`
--
ALTER TABLE `categoria_imovel`
  ADD PRIMARY KEY (`idcat_imovel`),
  ADD KEY `categoria_imovel_FKIndex1` (`cat_apartamento_idcat_apartamento`),
  ADD KEY `categoria_imovel_FKIndex2` (`cat_casa_idcat_casa`),
  ADD KEY `categoria_imovel_FKIndex3` (`cat_terreno_idcat_terreno`),
  ADD KEY `categoria_imovel_FKIndex4` (`cat_sala_comercial_idcat_sala_comercial`);

--
-- Indexes for table `cat_apartamento`
--
ALTER TABLE `cat_apartamento`
  ADD PRIMARY KEY (`idcat_apartamento`);

--
-- Indexes for table `cat_casa`
--
ALTER TABLE `cat_casa`
  ADD PRIMARY KEY (`idcat_casa`);

--
-- Indexes for table `cat_sala_comercial`
--
ALTER TABLE `cat_sala_comercial`
  ADD PRIMARY KEY (`idcat_sala_comercial`);

--
-- Indexes for table `cat_terreno`
--
ALTER TABLE `cat_terreno`
  ADD PRIMARY KEY (`idcat_terreno`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indexes for table `cliente_imobiliaria`
--
ALTER TABLE `cliente_imobiliaria`
  ADD PRIMARY KEY (`idcliente_propri`),
  ADD KEY `cliente_imobiliaria_FKIndex1` (`imobiliaria_idimobiliaria`);

--
-- Indexes for table `fiador`
--
ALTER TABLE `fiador`
  ADD PRIMARY KEY (`idfiador`),
  ADD KEY `fiador_FKIndex1` (`cliente_idcliente`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idfuncionario`),
  ADD KEY `funcionario_FKIndex1` (`imobiliaria_idimobiliaria`),
  ADD KEY `funcionario_FKIndex2` (`cargos_imobiliaria_idcargos_imobiliaria`);

--
-- Indexes for table `historico`
--
ALTER TABLE `historico`
  ADD PRIMARY KEY (`idhistorico`),
  ADD KEY `historico_FKIndex1` (`relatorio_idrelatorio`),
  ADD KEY `historico_FKIndex2` (`status_2_idstatus`),
  ADD KEY `historico_FKIndex3` (`imobiliaria_idimobiliaria`),
  ADD KEY `historico_FKIndex4` (`pagamento_idpagamento`);

--
-- Indexes for table `imobiliaria`
--
ALTER TABLE `imobiliaria`
  ADD PRIMARY KEY (`idimobiliaria`);

--
-- Indexes for table `imovel`
--
ALTER TABLE `imovel`
  ADD PRIMARY KEY (`idimovel`),
  ADD KEY `imovel_FKIndex1` (`status_2_idstatus`),
  ADD KEY `imovel_FKIndex2` (`imobiliaria_idimobiliaria`),
  ADD KEY `imovel_FKIndex3` (`categoria_imovel_idcat_imovel`);

--
-- Indexes for table `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`idpagamento`);

--
-- Indexes for table `relatorio`
--
ALTER TABLE `relatorio`
  ADD PRIMARY KEY (`idrelatorio`),
  ADD KEY `relario_FKIndex1` (`pagamento_idpagamento`),
  ADD KEY `relario_FKIndex2` (`status_2_idstatus`),
  ADD KEY `relario_FKIndex3` (`imobiliaria_idimobiliaria`);

--
-- Indexes for table `status_venda_2`
--
ALTER TABLE `status_venda_2`
  ADD PRIMARY KEY (`idstatus`);

--
-- Indexes for table `valor`
--
ALTER TABLE `valor`
  ADD PRIMARY KEY (`idvalor`),
  ADD KEY `valor_FKIndex1` (`imovel_idimovel`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cargos_imobiliaria`
--
ALTER TABLE `cargos_imobiliaria`
  MODIFY `idcargos_imobiliaria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `categoria_imovel`
--
ALTER TABLE `categoria_imovel`
  MODIFY `idcat_imovel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cat_apartamento`
--
ALTER TABLE `cat_apartamento`
  MODIFY `idcat_apartamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cat_casa`
--
ALTER TABLE `cat_casa`
  MODIFY `idcat_casa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cat_sala_comercial`
--
ALTER TABLE `cat_sala_comercial`
  MODIFY `idcat_sala_comercial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cat_terreno`
--
ALTER TABLE `cat_terreno`
  MODIFY `idcat_terreno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `cliente_imobiliaria`
--
ALTER TABLE `cliente_imobiliaria`
  MODIFY `idcliente_propri` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `fiador`
--
ALTER TABLE `fiador`
  MODIFY `idfiador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idfuncionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `historico`
--
ALTER TABLE `historico`
  MODIFY `idhistorico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `imobiliaria`
--
ALTER TABLE `imobiliaria`
  MODIFY `idimobiliaria` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `imovel`
--
ALTER TABLE `imovel`
  MODIFY `idimovel` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pagamento`
--
ALTER TABLE `pagamento`
  MODIFY `idpagamento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `relatorio`
--
ALTER TABLE `relatorio`
  MODIFY `idrelatorio` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `status_venda_2`
--
ALTER TABLE `status_venda_2`
  MODIFY `idstatus` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `valor`
--
ALTER TABLE `valor`
  MODIFY `idvalor` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
