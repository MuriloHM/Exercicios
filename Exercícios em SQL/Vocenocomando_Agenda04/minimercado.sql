-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: minimercado
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `cpf_cliente` varchar(11) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`cpf_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('12345678910','Pedro','Rua Sao Jose'),('22222222254','Pera','Rua Sao Paulo'),('44466688899','Clara','Rua Fernando Collor'),('99988877766','Suellen','Avenida Rui Barbosa, número 435, Jardim Aeroporto, São Paulo');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `codigo_compra` int NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `cpf_cliente` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`codigo_compra`),
  KEY `fk_cpf` (`cpf_cliente`),
  CONSTRAINT `fk_cpf` FOREIGN KEY (`cpf_cliente`) REFERENCES `cliente` (`cpf_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,'2020-10-05','22222222254'),(2,'2021-10-05','44466688899'),(3,'2021-11-27','12345678910'),(4,'2021-09-02','99988877766');
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra_produto`
--

DROP TABLE IF EXISTS `compra_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra_produto` (
  `id_compra_produto` int NOT NULL AUTO_INCREMENT,
  `codigo_compra` int NOT NULL,
  `codigo_produto` int NOT NULL,
  `quantidade` double(10,1) NOT NULL DEFAULT '1.0',
  `preco` double(10,2) NOT NULL,
  PRIMARY KEY (`id_compra_produto`),
  KEY `fk_cdg_compra` (`codigo_compra`),
  KEY `fk_cdg_produto` (`codigo_produto`),
  CONSTRAINT `fk_cdg_compra` FOREIGN KEY (`codigo_compra`) REFERENCES `compra` (`codigo_compra`),
  CONSTRAINT `fk_cdg_produto` FOREIGN KEY (`codigo_produto`) REFERENCES `produto` (`codigo_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra_produto`
--

LOCK TABLES `compra_produto` WRITE;
/*!40000 ALTER TABLE `compra_produto` DISABLE KEYS */;
INSERT INTO `compra_produto` VALUES (1,1,3,10.0,9.10),(3,1,1,20.0,19.00),(4,2,2,40.0,20.90),(5,2,2,80.0,20.90),(6,3,5,90.0,5.50),(7,4,6,40.0,25.90);
/*!40000 ALTER TABLE `compra_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `codigo_produto` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  `quantidade_estoque` double(10,1) DEFAULT NULL,
  PRIMARY KEY (`codigo_produto`),
  UNIQUE KEY `uk_codigo` (`codigo_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Manga',150.0),(2,'Maçã',50.0),(3,'Laranja',150.0),(5,'Alface',15.0),(6,'Pera',50.0);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 17:44:28
