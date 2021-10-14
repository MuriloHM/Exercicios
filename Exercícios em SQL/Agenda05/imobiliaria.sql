-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: imobiliaria
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
-- Table structure for table `apartamento`
--

DROP TABLE IF EXISTS `apartamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apartamento` (
  `numero_apt` varchar(5) NOT NULL,
  `codigo_condomin` varchar(5) DEFAULT NULL,
  `tipo_apartamento` varchar(20) DEFAULT NULL,
  `valor` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`numero_apt`),
  KEY `fk_cdg_condomin_idx` (`codigo_condomin`),
  KEY `fk_tp_apt_idx` (`tipo_apartamento`),
  CONSTRAINT `fk_cdg_condomin` FOREIGN KEY (`codigo_condomin`) REFERENCES `condominio` (`codigo_condomin`),
  CONSTRAINT `fk_tp_apt` FOREIGN KEY (`tipo_apartamento`) REFERENCES `tipo_apartamento` (`tipo_apartamentoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apartamento`
--

LOCK TABLES `apartamento` WRITE;
/*!40000 ALTER TABLE `apartamento` DISABLE KEYS */;
INSERT INTO `apartamento` VALUES ('1','00001','Cobertura',100000.00),('10','00002','Cobertura',250000.00),('11','00002','Padrão',125000.00),('12','00002','Padrão',100000.00),('13','00002','Padrão',135000.00),('14','00001','Padrão',125000.00),('15','00001','Padrão',100000.00),('16','00001','Padrão',135000.00),('2','00001','Cobertura',115000.00),('3','00001','Cobertura',125000.00),('4','00001','Cobertura',135000.00),('5','00001','Cobertura',150000.00),('6','00002','Cobertura',200000.00),('7','00002','Cobertura',215000.00),('8','00002','Cobertura',225000.00),('9','00002','Cobertura',235000.00);
/*!40000 ALTER TABLE `apartamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `condominio`
--

DROP TABLE IF EXISTS `condominio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `condominio` (
  `codigo_condomin` varchar(5) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  `matricula_sindico` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`codigo_condomin`),
  KEY `fk_matricula_idx` (`matricula_sindico`),
  CONSTRAINT `fk_matricula` FOREIGN KEY (`matricula_sindico`) REFERENCES `sindico` (`matricula_sindico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `condominio`
--

LOCK TABLES `condominio` WRITE;
/*!40000 ALTER TABLE `condominio` DISABLE KEYS */;
INSERT INTO `condominio` VALUES ('00001','Condomonío Floresbela','Rua José Bonifácio, 45, Centro, 09030-550','001'),('00002','Condomonío Jardim','Rua Estados Unidos, 1002, Centro, 09030-550','002');
/*!40000 ALTER TABLE `condominio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `garagem`
--

DROP TABLE IF EXISTS `garagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `garagem` (
  `numero_grg` int NOT NULL AUTO_INCREMENT,
  `numero_apt` varchar(5) DEFAULT NULL,
  `tipo_garagem` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`numero_grg`),
  KEY `fk_nr_apt_idx` (`numero_apt`),
  KEY `fk_tipo_grg_idx` (`tipo_garagem`),
  CONSTRAINT `fk_nr_apt` FOREIGN KEY (`numero_apt`) REFERENCES `apartamento` (`numero_apt`),
  CONSTRAINT `fk_tipo_grg` FOREIGN KEY (`tipo_garagem`) REFERENCES `tipo_garagem` (`tipo_garagemid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `garagem`
--

LOCK TABLES `garagem` WRITE;
/*!40000 ALTER TABLE `garagem` DISABLE KEYS */;
INSERT INTO `garagem` VALUES (1,'1','Coberta'),(2,'3','Coberta'),(3,'4','Coberta'),(4,'3','Coberta'),(5,'5','Coberta'),(6,'6','Coberta'),(7,'7','Coberta'),(8,'8','Coberta'),(9,'9','Coberta'),(10,'10','Coberta'),(15,'14','Padrão'),(16,'15','Padrão'),(17,'16','Padrão'),(18,'11','Padrão'),(19,'12','Padrão'),(20,'13','Padrão');
/*!40000 ALTER TABLE `garagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proprietario`
--

DROP TABLE IF EXISTS `proprietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proprietario` (
  `rg_prop` varchar(15) NOT NULL,
  `nome` varchar(80) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rg_prop`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proprietario`
--

LOCK TABLES `proprietario` WRITE;
/*!40000 ALTER TABLE `proprietario` DISABLE KEYS */;
INSERT INTO `proprietario` VALUES ('123053547','Felipe Braga','11990788730','felipebrg@gmail.com'),('128212445','Ana Clara da Silva','11963507549','clarinha@gmail.com'),('159769759','Sonia Maria','11905787176','soniamaria@gmail.com'),('185994143','Joana Buarque','11994732684','joana@gmail.com'),('205880022','Vanessa Pereira','11943620090','vanper0505@gmail.com'),('266574737','Claudia Silva','11976927690','claudia@gmail.com'),('282674846','José Buarque','11960028864','jose@gmail.com'),('450886979','Maria Eduarda Souza','11906643816','madu1323@gmail.com'),('459603206','Karlos Camargo','11946904607','kkarlos@gmail.com'),('499008984','João Pedro Gomes','11931969478','joao@gmail.com');
/*!40000 ALTER TABLE `proprietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proprietario_apartamento`
--

DROP TABLE IF EXISTS `proprietario_apartamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proprietario_apartamento` (
  `proprietario_apartamentoid` int NOT NULL AUTO_INCREMENT,
  `numero_apt` varchar(5) DEFAULT NULL,
  `rg_prop` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`proprietario_apartamentoid`),
  KEY `fk_nr_apt_idx` (`numero_apt`),
  KEY `fk_rg_prop_idx` (`rg_prop`),
  CONSTRAINT `fk_nr_aptmt` FOREIGN KEY (`numero_apt`) REFERENCES `apartamento` (`numero_apt`),
  CONSTRAINT `fk_rg_prop` FOREIGN KEY (`rg_prop`) REFERENCES `proprietario` (`rg_prop`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proprietario_apartamento`
--

LOCK TABLES `proprietario_apartamento` WRITE;
/*!40000 ALTER TABLE `proprietario_apartamento` DISABLE KEYS */;
INSERT INTO `proprietario_apartamento` VALUES (13,'1','159769759'),(14,'2','266574737'),(15,'3','123053547'),(16,'6','185994143'),(17,'7','205880022'),(19,'12','459603206'),(21,'14','450886979'),(22,'15','499008984'),(23,'4','159769759'),(24,'8','185994143'),(25,'4','159769759'),(26,'15','450886979');
/*!40000 ALTER TABLE `proprietario_apartamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sindico`
--

DROP TABLE IF EXISTS `sindico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sindico` (
  `nome` varchar(50) DEFAULT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `matricula_sindico` varchar(3) NOT NULL,
  PRIMARY KEY (`matricula_sindico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sindico`
--

LOCK TABLES `sindico` WRITE;
/*!40000 ALTER TABLE `sindico` DISABLE KEYS */;
INSERT INTO `sindico` VALUES ('Cláudio','Rua José Bonifácio, 45, Centro, 09030-550','111111119','001'),('Laura','Rua das Figueiras, 23, Bairro Jardim, 18132-490','42151712','002');
/*!40000 ALTER TABLE `sindico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_apartamento`
--

DROP TABLE IF EXISTS `tipo_apartamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_apartamento` (
  `tipo_apartamentoid` varchar(20) NOT NULL,
  PRIMARY KEY (`tipo_apartamentoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_apartamento`
--

LOCK TABLES `tipo_apartamento` WRITE;
/*!40000 ALTER TABLE `tipo_apartamento` DISABLE KEYS */;
INSERT INTO `tipo_apartamento` VALUES ('Cobertura'),('Padrão');
/*!40000 ALTER TABLE `tipo_apartamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_garagem`
--

DROP TABLE IF EXISTS `tipo_garagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_garagem` (
  `tipo_garagemid` varchar(20) NOT NULL,
  PRIMARY KEY (`tipo_garagemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_garagem`
--

LOCK TABLES `tipo_garagem` WRITE;
/*!40000 ALTER TABLE `tipo_garagem` DISABLE KEYS */;
INSERT INTO `tipo_garagem` VALUES ('Coberta'),('Padrão');
/*!40000 ALTER TABLE `tipo_garagem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 17:45:10
