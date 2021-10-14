-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_agend3
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
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `uk_cur_desc` (`descricao`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (2,'Designer Web'),(4,'Redes'),(1,'Sistemas');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso_professor`
--

DROP TABLE IF EXISTS `curso_professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso_professor` (
  `curso_prof_id` int NOT NULL AUTO_INCREMENT,
  `codigo_curso` int NOT NULL,
  `matricula_prof` int NOT NULL,
  PRIMARY KEY (`curso_prof_id`),
  UNIQUE KEY `uk_cp_cur_mat` (`codigo_curso`,`matricula_prof`),
  KEY `fk_cp_mat_prof` (`matricula_prof`),
  CONSTRAINT `fk_cp_cod_curso` FOREIGN KEY (`codigo_curso`) REFERENCES `curso` (`codigo`),
  CONSTRAINT `fk_cp_mat_prof` FOREIGN KEY (`matricula_prof`) REFERENCES `professor` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso_professor`
--

LOCK TABLES `curso_professor` WRITE;
/*!40000 ALTER TABLE `curso_professor` DISABLE KEYS */;
INSERT INTO `curso_professor` VALUES (3,1,1),(4,1,2),(5,1,3),(8,1,5),(1,2,1),(6,2,3),(7,2,4);
/*!40000 ALTER TABLE `curso_professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `matricula` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) NOT NULL,
  `dt_nascimento` date NOT NULL,
  `logradouro` varchar(50) NOT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(40) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `salario` double(10,2) DEFAULT '0.00',
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (1,'José da Silva','1977-10-03','Alameda 5','1000','Centro','Sao Paulo','SP','08150-640',1800.00),(2,'João de Souza','1970-12-12','Travessa Mato Grosso',NULL,'Bom Retiro','São Paulo','SP','01122-010',1530.00),(3,'Ana Maria','1976-06-14','Alameda Dom Pedro I','432','Independência','São Paulo','SP','04470-010',1812.80),(4,'Marilda Dutra','1979-01-23','Rua Adolfo Belini','621','São Francisco','São Paulo','SP','01005-020',1480.00),(5,'Acácio Moura','1985-04-29','Avenida São Bernardo','127','Vila Luzita','Santo Andre','SP','09171-195',1340.00),(6,'Gustavo Camilo','1983-08-25','Avenida Siqueira Campos','2784','Centro','Barueri','SP','06411-210',1630.00);
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor_telefone`
--

DROP TABLE IF EXISTS `professor_telefone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor_telefone` (
  `professor_fone_id` int NOT NULL AUTO_INCREMENT,
  `matricula` int NOT NULL,
  `numero` varchar(15) NOT NULL,
  PRIMARY KEY (`professor_fone_id`),
  UNIQUE KEY `uk_pt_mat_tel` (`matricula`,`numero`),
  CONSTRAINT `fk_pt_matricula` FOREIGN KEY (`matricula`) REFERENCES `professor` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor_telefone`
--

LOCK TABLES `professor_telefone` WRITE;
/*!40000 ALTER TABLE `professor_telefone` DISABLE KEYS */;
INSERT INTO `professor_telefone` VALUES (1,1,'(11) 2324-2325'),(2,2,'(11) 3456-2397'),(3,3,'(11) 2304-4854'),(4,4,'(11) 2348-3984'),(5,5,'(11) 3471-4857'),(6,5,'(11) 9872-3647');
/*!40000 ALTER TABLE `professor_telefone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-14 17:39:09
