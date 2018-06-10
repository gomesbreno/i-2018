-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: meudb
-- ------------------------------------------------------
-- Server version	5.7.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `certidao`
--

DROP TABLE IF EXISTS `certidao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `certidao` (
  `id_individuo` int(11) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `cartorio` varchar(45) DEFAULT NULL,
  `livro` varchar(45) DEFAULT NULL,
  `folha` varchar(45) DEFAULT NULL,
  `termo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certidao`
--

LOCK TABLES `certidao` WRITE;
/*!40000 ALTER TABLE `certidao` DISABLE KEYS */;
/*!40000 ALTER TABLE `certidao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comunicacao`
--

DROP TABLE IF EXISTS `comunicacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comunicacao` (
  `id_individuo` int(11) NOT NULL,
  `meio` varchar(45) DEFAULT NULL,
  `preferencia` varchar(45) DEFAULT NULL,
  `detalhe` varchar(45) DEFAULT NULL,
  `uso` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comunicacao`
--

LOCK TABLES `comunicacao` WRITE;
/*!40000 ALTER TABLE `comunicacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `comunicacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ctps`
--

DROP TABLE IF EXISTS `ctps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ctps` (
  `id_individuo` int(11) NOT NULL,
  `serie` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ctps`
--

LOCK TABLES `ctps` WRITE;
/*!40000 ALTER TABLE `ctps` DISABLE KEYS */;
/*!40000 ALTER TABLE `ctps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dado_demografico`
--

DROP TABLE IF EXISTS `dado_demografico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dado_demografico` (
  `id_usuario` int(11) NOT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `nome_mae` varchar(45) DEFAULT NULL,
  `nome_pai` varchar(45) DEFAULT NULL,
  `situacao_familiar` varchar(45) DEFAULT NULL,
  `cor` varchar(45) DEFAULT NULL,
  `comentario` varchar(45) DEFAULT NULL,
  `fonte_notificacao_obito` int(11) DEFAULT NULL,
  `nascimento_pluralidade` varchar(45) DEFAULT NULL,
  `nascimento_ordem` int(11) DEFAULT NULL,
  `nascimento_seguimento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_demografico`
--

LOCK TABLES `dado_demografico` WRITE;
/*!40000 ALTER TABLE `dado_demografico` DISABLE KEYS */;
/*!40000 ALTER TABLE `dado_demografico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data`
--

DROP TABLE IF EXISTS `data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data` (
  `id_individuo` int(11) NOT NULL,
  `id_dado_demografico` int(11) DEFAULT NULL,
  `data` varchar(45) DEFAULT NULL,
  `acuracia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data`
--

LOCK TABLES `data` WRITE;
/*!40000 ALTER TABLE `data` DISABLE KEYS */;
/*!40000 ALTER TABLE `data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `surrogate_key` int(11) NOT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `distrito` varchar(45) DEFAULT NULL,
  `codigo_municipal` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `cep` varchar(45) DEFAULT NULL,
  `caixa_postal` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`surrogate_key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identificador`
--

DROP TABLE IF EXISTS `identificador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identificador` (
  `surrogate_key` int(11) NOT NULL,
  `designacao` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  `emissor` varchar(45) DEFAULT NULL,
  `data` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`surrogate_key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identificador`
--

LOCK TABLES `identificador` WRITE;
/*!40000 ALTER TABLE `identificador` DISABLE KEYS */;
/*!40000 ALTER TABLE `identificador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `individuo`
--

DROP TABLE IF EXISTS `individuo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `individuo` (
  `surrogate_key` int(11) NOT NULL,
  PRIMARY KEY (`surrogate_key`),
  UNIQUE KEY `surrogate_key_UNIQUE` (`surrogate_key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela de indivíduos ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `individuo`
--

LOCK TABLES `individuo` WRITE;
/*!40000 ALTER TABLE `individuo` DISABLE KEYS */;
INSERT INTO `individuo` VALUES (1);
/*!40000 ALTER TABLE `individuo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linha_de_endereco`
--

DROP TABLE IF EXISTS `linha_de_endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `linha_de_endereco` (
  `id_individuo` int(11) NOT NULL,
  `ordem` varchar(45) DEFAULT NULL,
  `linha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linha_de_endereco`
--

LOCK TABLES `linha_de_endereco` WRITE;
/*!40000 ALTER TABLE `linha_de_endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `linha_de_endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nacionalidade`
--

DROP TABLE IF EXISTS `nacionalidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nacionalidade` (
  `id_individuo` int(11) NOT NULL,
  `municipio` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `data_entrada_pais` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nacionalidade`
--

LOCK TABLES `nacionalidade` WRITE;
/*!40000 ALTER TABLE `nacionalidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `nacionalidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nome`
--

DROP TABLE IF EXISTS `nome`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nome` (
  `surrogate_key` int(11) NOT NULL,
  `titulos` varchar(45) DEFAULT NULL,
  `nomes` varchar(45) DEFAULT NULL,
  `sobrenomes` varchar(45) DEFAULT NULL,
  `sufixos` varchar(45) DEFAULT NULL,
  `preferido` varchar(45) DEFAULT NULL,
  `uso_condicional` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`surrogate_key`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nome`
--

LOCK TABLES `nome` WRITE;
/*!40000 ALTER TABLE `nome` DISABLE KEYS */;
/*!40000 ALTER TABLE `nome` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representacao`
--

DROP TABLE IF EXISTS `representacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `representacao` (
  `id_individuo` int(11) NOT NULL,
  `utilizacao` varchar(45) DEFAULT NULL,
  `alternativa` varchar(45) DEFAULT NULL,
  KEY `fk_id_individuo` (`id_individuo`),
  CONSTRAINT `fk_id_individuo` FOREIGN KEY (`id_individuo`) REFERENCES `individuo` (`surrogate_key`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representacao`
--

LOCK TABLES `representacao` WRITE;
/*!40000 ALTER TABLE `representacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `representacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titulo_eleitoral`
--

DROP TABLE IF EXISTS `titulo_eleitoral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titulo_eleitoral` (
  `idtitulo_eleitoral` int(11) NOT NULL,
  `secao` varchar(45) DEFAULT NULL,
  `zona` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtitulo_eleitoral`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titulo_eleitoral`
--

LOCK TABLES `titulo_eleitoral` WRITE;
/*!40000 ALTER TABLE `titulo_eleitoral` DISABLE KEYS */;
/*!40000 ALTER TABLE `titulo_eleitoral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilizacao`
--

DROP TABLE IF EXISTS `utilizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utilizacao` (
  `id_individuo` int(11) NOT NULL,
  `uso` varchar(45) DEFAULT NULL,
  `data_inicial` varchar(45) DEFAULT NULL,
  `data_final` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilizacao`
--

LOCK TABLES `utilizacao` WRITE;
/*!40000 ALTER TABLE `utilizacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `utilizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vinculo`
--

DROP TABLE IF EXISTS `vinculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vinculo` (
  `id_individuo` int(11) NOT NULL,
  `relacionamento` varchar(45) DEFAULT NULL,
  `data_inicio` varchar(45) DEFAULT NULL,
  `data_fim` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_individuo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vinculo`
--

LOCK TABLES `vinculo` WRITE;
/*!40000 ALTER TABLE `vinculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `vinculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-29 11:19:18
