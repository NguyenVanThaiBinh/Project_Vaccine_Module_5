-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: vaccine_project
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `customer_role`
--

DROP TABLE IF EXISTS `customer_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_id` bigint DEFAULT NULL,
  `customer_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmwml8muyov9xhw4423lp88n2u` (`role_id`),
  KEY `FKrk3268jfmu796ejtnxt5pa4kt` (`customer_id`),
  CONSTRAINT `FKmwml8muyov9xhw4423lp88n2u` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `FKrk3268jfmu796ejtnxt5pa4kt` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=276 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_role`
--

LOCK TABLES `customer_role` WRITE;
/*!40000 ALTER TABLE `customer_role` DISABLE KEYS */;
INSERT INTO `customer_role` VALUES (1,3,1),(2,3,2),(3,3,3),(6,3,4),(7,1,5),(8,2,5),(9,3,5),(10,1,6),(11,2,6),(12,3,6),(13,1,7),(14,2,7),(15,3,7),(16,1,8),(17,2,8),(18,3,8),(19,1,9),(20,2,9),(21,3,9),(25,1,11),(26,2,11),(27,3,11),(28,1,12),(29,2,12),(30,3,12),(31,1,13),(32,2,13),(33,3,13),(34,1,14),(35,2,14),(36,3,14),(37,1,16),(38,2,16),(39,3,16),(40,1,17),(41,2,17),(42,3,17),(43,1,18),(44,2,18),(45,3,18),(46,1,19),(47,2,19),(48,3,19),(49,1,20),(50,2,20),(51,3,20),(52,1,21),(53,2,21),(54,3,21),(55,1,23),(56,2,23),(57,3,23),(58,1,24),(59,2,24),(60,3,24),(61,1,25),(62,2,25),(63,3,25),(64,1,26),(65,2,26),(66,3,26),(67,1,29),(68,2,29),(69,3,29),(70,1,30),(71,2,30),(72,3,30),(73,1,32),(74,2,32),(75,3,32),(76,1,33),(77,2,33),(78,3,33),(79,1,34),(80,2,34),(81,3,34),(82,1,35),(83,2,35),(84,3,35),(85,1,36),(86,2,36),(87,3,36),(88,1,38),(89,2,38),(90,3,38),(91,1,39),(92,2,39),(93,3,39),(94,1,40),(95,2,40),(96,3,40),(97,1,43),(98,2,43),(99,3,43),(100,1,44),(101,2,44),(102,3,44),(103,1,47),(104,2,47),(105,3,47),(106,1,48),(107,2,48),(108,3,48),(109,1,49),(110,2,49),(111,3,49),(112,1,52),(113,2,52),(114,3,52),(115,1,53),(116,2,53),(117,3,53),(118,1,54),(119,2,54),(120,3,54),(121,1,55),(122,2,55),(123,3,55),(124,1,56),(125,2,56),(126,3,56),(127,1,58),(128,2,58),(129,3,58),(130,1,59),(131,2,59),(132,3,59),(133,1,62),(134,2,62),(135,3,62),(136,1,65),(137,2,65),(138,3,65),(139,1,66),(140,2,66),(141,3,66),(142,1,67),(143,2,67),(144,3,67),(145,1,68),(146,2,68),(147,3,68),(148,1,69),(149,2,69),(150,3,69),(151,1,70),(152,2,70),(153,3,70),(154,1,71),(155,2,71),(156,3,71),(157,1,72),(158,2,72),(159,3,72),(160,1,73),(161,2,73),(162,3,73),(163,1,74),(164,2,74),(165,3,74),(166,1,75),(167,2,75),(168,3,75),(169,1,76),(170,2,76),(171,3,76),(172,1,77),(173,2,77),(174,3,77),(175,1,78),(176,2,78),(177,3,78),(178,1,79),(179,2,79),(180,3,79),(181,1,80),(182,2,80),(183,3,80),(184,1,81),(185,2,81),(186,3,81),(187,1,82),(188,2,82),(189,3,82),(190,1,83),(191,2,83),(192,3,83),(193,1,84),(194,2,84),(195,3,84),(196,1,85),(197,2,85),(198,3,85),(199,1,86),(200,2,86),(201,3,86),(202,1,87),(203,2,87),(204,3,87),(205,1,88),(206,2,88),(207,3,88),(208,1,89),(209,2,89),(210,3,89),(211,1,90),(212,2,90),(213,3,90),(214,1,91),(215,2,91),(216,3,91),(217,1,92),(218,2,92),(219,3,92),(220,1,93),(221,2,93),(222,3,93),(223,1,94),(224,2,94),(225,3,94),(226,1,95),(227,2,95),(228,3,95),(229,1,96),(230,2,96),(231,3,96),(232,1,97),(233,2,97),(234,3,97),(235,1,98),(236,2,98),(237,3,98),(238,1,99),(239,2,99),(240,3,99),(241,1,100),(242,2,100),(243,3,100),(244,1,101),(245,2,101),(246,3,101),(261,2,107),(262,3,107),(263,1,109),(264,2,109),(265,3,109),(266,1,110),(267,2,110),(268,3,110),(269,1,111),(270,1,113),(271,3,114),(272,2,114),(273,1,114);
/*!40000 ALTER TABLE `customer_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cmnd` varchar(9) DEFAULT NULL,
  `age` int NOT NULL,
  `commune` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `date_vaccine` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `healthy_info` varchar(255) DEFAULT NULL,
  `healthy_status` int NOT NULL,
  `is_doctor` int DEFAULT '0',
  `is_injection` int DEFAULT '0',
  `password` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `time_vaccine` varchar(255) DEFAULT NULL,
  `verification_code` varchar(64) DEFAULT NULL,
  `id_destination` bigint DEFAULT NULL,
  `id_vaccine` bigint DEFAULT NULL,
  `date_vaccine2` varchar(255) DEFAULT NULL,
  `is_injection2` int DEFAULT '0',
  `time_vaccine2` varchar(255) DEFAULT NULL,
  `id_destination2` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ib885g3xawbavdwdl0j75mu4e` (`cmnd`),
  KEY `FKjxf755yovyvjiliwh4wuchof3` (`id_destination`),
  KEY `FKp06qf94jx0jwyvprc9v7o83rf` (`id_vaccine`),
  KEY `FK1p3bduviavjf908riw2vq07yp` (`id_destination2`),
  CONSTRAINT `FK1p3bduviavjf908riw2vq07yp` FOREIGN KEY (`id_destination2`) REFERENCES `destinations` (`id`),
  CONSTRAINT `FKjxf755yovyvjiliwh4wuchof3` FOREIGN KEY (`id_destination`) REFERENCES `destinations` (`id`),
  CONSTRAINT `FKp06qf94jx0jwyvprc9v7o83rf` FOREIGN KEY (`id_vaccine`) REFERENCES `vaccines` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'1',0,NULL,NULL,NULL,NULL,NULL,_binary '',NULL,NULL,0,1,0,'$2a$10$iOBfciVbrS8KryB0uXuVme0ilbOB11R/HcrXA/E7ntztIvJONc/Xm',NULL,NULL,NULL,1,NULL,NULL,0,NULL,NULL),(2,'2',0,NULL,NULL,NULL,NULL,NULL,_binary '',NULL,NULL,0,1,0,'$2a$10$36vyXNDmpqS9dKSwQnsyWeDZ8Oo19/07An8Vcd280Trq81ueaOs/a',NULL,NULL,NULL,2,NULL,NULL,0,NULL,NULL),(3,'3',0,NULL,NULL,NULL,NULL,NULL,_binary '',NULL,NULL,0,1,0,'$2a$10$FyCVM/wHzigvnxf9zIe6yeWLR7cLHXiFr3AzUC7IAXVcaWnvlfpny',NULL,NULL,NULL,3,NULL,NULL,0,NULL,NULL),(4,'21',53,'Phường xã','Sonya Keith','12-08-2021 ','Huyện Nam Đông','qolyg@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Các bệnh lý về xương khớp',2,0,1,'$2a$10$gJyCUvsFHSR0Il2SsnMxkuH60u7/pyrxhNYUOssHnm/7rvitJO3hW','436','08:00',NULL,1,1,NULL,0,NULL,NULL),(5,'37',41,'Phường xã','Courtney Lambert','12-08-2021 ','Thị xã Hương Trà','farovonetu@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$e9AzEfl9pqdux7UEedeDnuGjTa6pVJz/f/liETUnOpFP9b.uOMC2i','260','08:00',NULL,1,1,NULL,0,NULL,NULL),(6,'61',65,'Phường xã','Charles Martinez','12-08-2021 ','Huyện Phong Điền','wibesuvif@mailinator.com',_binary '','Nam','Tiểu đường hoặc ung thư',2,0,1,'$2a$10$5pjak/poIMWzTy.frHXHQOrbk.pR5tyhCjjyk7mvu/GvjnqNG0NpC','689','08:00',NULL,1,1,NULL,0,NULL,NULL),(7,'36',35,'Phường xã','Kylan Coffey','12-08-2021 ','Thị xã Hương Trà','doho@mailinator.com',_binary '','Nam',NULL,2,0,0,'$2a$10$/LFFBLxt0R7lLCdGiHF6GuaDJn7jwxDnbe8t4HEmtou1zZgohob9y','707','08:00',NULL,1,1,NULL,0,NULL,NULL),(8,'43',35,'Phường xã','Susan Gallegos','12-08-2021 ','Thành phố Huế','dotalupu@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Các bệnh lý về xương khớp',2,0,1,'$2a$10$P/tbh6AYvYKvzV5fLEOCDeXfbzOkZfnYMlkQZNWqhAJkWMpZB.7Eq','259','08:00',NULL,1,1,NULL,0,NULL,NULL),(9,'35',37,'Phường xã','Keaton Moreno','12-08-2021 ','Huyện Nam Đông','jilyvypub@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,0,'$2a$10$0N38csiAUFajyfvpz6jQZ.SVcdo9/rzmYjY1MB0eaGs2Q5j8Zzmqy','783','10:00',NULL,1,2,NULL,0,NULL,NULL),(10,'71',0,'Phường xã','Amaya Hoover','12-08-2021 ','Thị xã Hương Trà','vyqavan@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Các bệnh lý về xương khớp',2,0,1,'$2a$10$7Uf3jeguw8uv/YL1ZycMs.PGS7urOcteFETTOzgMhiMllxZaKIqKu','966','10:00',NULL,1,2,NULL,0,NULL,NULL),(11,'24',34,'Phường xã','Phoebe Wise','12-08-2021 ','Huyện Phú Vang','locixafu@mailinator.com',_binary '','Nam','Bệnh về tim mạch',2,0,1,'$2a$10$9WeCfsQmKSv1nRMHtROWZ.fykNTeVIEqJMmR/33KOn/gVUSQmGcBq','564','10:00',NULL,1,2,NULL,0,NULL,NULL),(12,'60',0,'Phường xã','Victoria Randolph','12-08-2021 ','Huyện Phong Điền','gynuza@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$xw49bN1fIE.5arJbGE93ZOZiJMOa8qGH/D0BSvTuTKhc1swwMa3bW','986','10:00',NULL,1,2,NULL,0,NULL,NULL),(13,'88',33,'Phường xã','Lee Sutton','12-08-2021 ','Huyện Phong Điền','jidyqu@mailinator.com',_binary '','Nam','Tiểu đường hoặc ung thư',2,0,1,'$2a$10$zCls46mpOnjqYNtj/Avsd.x5iCbikLK4R65SzcSsVKtgHD.J0NViK','191','10:00',NULL,1,2,NULL,0,NULL,NULL),(14,'31',66,'Phường xã','Shannon Romero','12-08-2021 ','Huyện Quảng Điền','gabilic@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp',2,0,1,'$2a$10$OCULAYFJx06OyDr6BQD6JOl3hXn1UIdSaU2Zt71w0UIg6.SVQtKk.','410','14:00',NULL,1,3,NULL,0,NULL,NULL),(16,'29',36,'Phường xã','Blossom Buchanan','12-08-2021 ','Huyện Nam Đông','fyjagofi@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh',2,0,1,'$2a$10$9cKtlikBrCFgelzMg5vG9ODR4MsIQMNlTwvmGNsUaEvZD76kzQPQi','491','14:00',NULL,1,3,NULL,0,NULL,NULL),(17,'80',34,'Phường xã','Tamekah Richards','12-08-2021 ','Huyện Quảng Điền','baxilyzocy@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$HlzFuhA8banzBfYUG841f.NzXYAZszJcCt3akIkiYQNrTnu7iQaK6','808','14:00',NULL,1,3,NULL,0,NULL,NULL),(18,'86',0,'Phường xã','Doris Black','12-08-2021 ','Thị xã Hương Trà','lixazoxiso@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$P.eeC4FL45o1lP5Uzns1UeQUOkXG3MSuO9tRpJ3WzJMIXs26iPjrS','30','14:00',NULL,1,3,NULL,0,NULL,NULL),(19,'30',36,'Phường xã','Armando Harrington','12-08-2021 ','Huyện Nam Đông','caxix@mailinator.com',_binary '','Nam',NULL,2,0,1,'$2a$10$YRb3FXi6Y7D.eQiNJTx9renTpWjH4.4gMlCTQU4uYb6huFmvvxpqu','451','14:00',NULL,1,3,NULL,0,NULL,NULL),(20,'5',65,'Phường xã','Reed Boyd','14-08-2021 ','Huyện Phú Lộc','xetomuzyk@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,0,'$2a$10$AxgF6YHfS.RpF54ibMcjUO9zvlaK7ZAQuOIOSdoWY/hfjOLRVJJwm','270','08:00',NULL,2,1,NULL,0,NULL,NULL),(21,'14',33,'Phường xã','Dante Bird','14-08-2021 ','Thành phố Huế','lotepo@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Các bệnh lý về xương khớp',2,0,1,'$2a$10$yKQZsFDrprdqSzug2PJwkeSBdFfyMK8fajS74tX089VnYRmn3q8ve','130','08:00',NULL,2,1,NULL,0,NULL,NULL),(23,'99',0,'Phường xã','Seth Rosario','14-08-2021 ','Huyện A Lưới','tidy@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$hR0wx08hfnLgtgpVVAFKr.uwFkmK7cHDdxenHexGYDN05TvIjakK.','904','08:00',NULL,2,1,NULL,0,NULL,NULL),(24,'34',34,'Phường xã','Whitney Mclean','14-08-2021 ','Huyện Nam Đông','nebutiqu@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$xoezDNqouj8B611SgdczCuFNDGssbhlnM.i4uWk1SCaI/qdMHoXUi','274','10:00',NULL,2,1,NULL,0,NULL,NULL),(25,'76',33,'Phường xã','Ayanna Underwood','14-08-2021 ','Huyện Phú Lộc','foxezole@mailinator.com',_binary '','Nam',NULL,2,0,1,'$2a$10$Ose2jEmMFOebZyg6b3cy8ObkhJ2waXNrmxviSY/R.7r./m/R2Eyfa','953','10:00',NULL,2,1,NULL,0,NULL,NULL),(26,'69',36,'Phường xã','Rachel Bates','14-08-2021 ','Thị xã Hương Thủy','fadexe@mailinator.com',_binary '','Nam',NULL,2,0,1,'$2a$10$vBNIKVHlozUB59UmMPizO.RKr89ius4kRBDALfQUxAwRFVO0CpRSq','373','10:00',NULL,2,2,NULL,0,NULL,NULL),(29,'7',34,'Phường xã','Galena Morgan','14-08-2021 ','Huyện Phú Vang','rucuja@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$MQiaJO4BsiX8vxPbnRtede0kw.W7wUxmUErdxy960.WMZYf7mcsBO','995','14:00',NULL,2,2,NULL,0,NULL,NULL),(30,'83',35,'Phường xã','Kirsten Bird','14-08-2021 ','Thị xã Hương Thủy','gudol@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$JfRJdxKU0X4Gnfsmh4zXGOedPSUEWA9V2WjpIayExI2O3b2bUJVuq','106','14:00',NULL,2,2,NULL,0,NULL,NULL),(32,'98',36,'','Brody Mack','14-08-2021 ','Quận huyện','xuhydixew@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$8RpgzLfv2jU4aOQMzJ0LZ.5VtXrzEHIVRfF45BaS5m7PrLgpibKtC','952','14:00',NULL,2,3,NULL,0,NULL,NULL),(33,'73',35,'Phường xã','Brent Walter','14-08-2021 ','Huyện A Lưới','tesilasow@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$mvnK5swH662muqwUKcCkdeh4CyPApBNMxUgarJHiudVn46KQBPyu6','529','16:00',NULL,2,3,NULL,0,NULL,NULL),(34,'22',0,'Phường xã','Colin Doyle','14-08-2021 ','Thành phố Huế','perixyqyhy@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$VFr23M41lrXref6OVpQn9.yFehgOk7O/RR68zdgxw9EsiuxRkchZy','35','16:00',NULL,2,2,NULL,0,NULL,NULL),(35,'54',0,'Phường xã','Zorita Willis','14-08-2021 ','Huyện Quảng Điền','defeli@mailinator.com',_binary '','Nam','Bệnh về thần kinh',2,0,1,'$2a$10$VL5wypAqJG0.I3ASNF3rqukGcKt0S81QosaDBS/GGa/bGmH1aBzli','105','16:00',NULL,2,2,NULL,0,NULL,NULL),(36,'55',0,'Phường xã','Angela Pollard','15-08-2021 ','Thị xã Hương Trà','purab@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh',2,0,1,'$2a$10$uptvJ17WWMFS/PnyDPCY3eeuvRsYYRv8Ip85gklebxIvUmVxDMjGW','675','08:00',NULL,2,3,NULL,0,NULL,NULL),(38,'75',34,'Phường xã','Davis Mills','15-08-2021 ','Thành phố Huế','kixylebuc@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$bVXByCewpaIh.ATX/JVAJuySi4yNhUooztTNGRFYnzf5fLepzQZBO','827','08:00',NULL,2,3,NULL,0,NULL,NULL),(39,'85',35,'Phường xã','Mark Le','15-08-2021 ','Thành phố Huế','nyzodid@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$E.0fvaP1l18jpnXnjrhRVev3N.So94m5vdUMdYLr3MDdtcy0jDQaS','713','08:00',NULL,2,3,NULL,0,NULL,NULL),(40,'84',0,'','Jerome Haley','15-08-2021 ','Quận huyện','bitiqufi@mailinator.com',_binary '','Nam','Tiểu đường hoặc ung thư',2,0,1,'$2a$10$Lvfy.Eur8QYxv4HkIwoEmuUTrFNPaAwEKCfXo30sGhv8HaWLN0oNy','613','08:00',NULL,3,1,NULL,0,NULL,NULL),(43,'12',33,'Phường xã','Myra Hartman','15-08-2021 ','Thị xã Hương Thủy','pewyrypyn@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$YOeFG1l9HYrazColVIsC9ODFlaxdlYZXbz3bBcPQoxXHw6ue/UbyS','97','08:00',NULL,3,1,NULL,0,NULL,NULL),(44,'67',34,'Phường xã','Ebony Oconnor','15-08-2021 ','Thị xã Hương Thủy','loxezabaci@mailinator.com',_binary '','Nam','Các bệnh lý về xương khớp',2,0,1,'$2a$10$IM2tTYKfoXvvOHSdTVLrS.DFgFo/M349/YZK35KXffsDAdFRyOWJ6','113','08:00',NULL,3,1,NULL,0,NULL,NULL),(47,'50',34,'Phường xã','Anika Harper','15-08-2021 ','Huyện Phú Lộc','gewux@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Các bệnh lý về xương khớp',2,0,1,'$2a$10$y1CtN24uoqlWLR7WERawMu9HSGgxwl1TqrLh1yrsqA43OR64xFpsi','666','08:00',NULL,3,2,NULL,0,NULL,NULL),(48,'51',36,'Phường xã','Harrison Silva','15-08-2021 ','Thị xã Hương Thủy','pykesyv@mailinator.com',_binary '','Nam','Các bệnh lý về xương khớp',2,0,1,'$2a$10$yHa.eoBImflLTkG4APMIBu6PXOhQcb07T8CmusI0kZi5EAsdsotUm','642','08:00',NULL,3,3,NULL,0,NULL,NULL),(49,'23',64,'Phường xã','Mercedes Cooley','15-08-2021 ','Huyện Phú Lộc','zecom@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$H3MYJNI/NnrRD980uZL2AuosCPE/h.l6uiPUvaBM0q4GB6FW0xfqO','757','08:00',NULL,3,3,NULL,0,NULL,NULL),(52,'40',64,'Phường xã','Dorothy Copeland','15-08-2021 ','Huyện Phong Điền','dujulonas@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$25EhPyK5LZQjDZyCgUfXUe5dNspoiPil9ji.mQyijeu6lBuXgikpS','980','10:00',NULL,3,2,NULL,0,NULL,NULL),(53,'15',38,'Phường xã','Kareem Stanley','15-08-2021 ','Huyện Phú Lộc','kaqa@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$uVIIVeKSDEtC9P9pFz5kTeVytOrNn2uBCUT20m4ykDubLMWHj7/wO','472','10:00',NULL,3,3,NULL,0,NULL,NULL),(54,'17',36,'Phường xã','Leonard Bowen','15-08-2021 ','Huyện Quảng Điền','luzevudu@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$AqXCNxj5HxvOtCMhjDhICeStgrIFRnOFmPV6/yr3CCLvdfUPaZvSe','54','10:00',NULL,3,2,NULL,0,NULL,NULL),(55,'28',34,'Phường xã','Calvin Harmon','15-08-2021 ','Huyện Nam Đông','zytac@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$2h7AA6MHrG5.dHCeHv/uq.tH0CDBDeDKnhk9IFALyLRDwDMrwzAnK','743','10:00',NULL,3,2,NULL,0,NULL,NULL),(56,'100',0,'Phường xã','Sylvia Buckner','15-08-2021 ','Huyện A Lưới','nijewuwylo@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về thần kinh',2,0,1,'$2a$10$Ia6h../gXdVYN0O1cozdH.ljAUoH9Rf70Tq8ERrNvSchJGXWtovDK','395','10:00',NULL,3,2,NULL,0,NULL,NULL),(58,'93',36,'Phường xã','Rinah Powell','15-08-2021 ','Huyện Phú Lộc','ninyqa@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$LS8UfPsgfpXdvFMBHd0B1uk23/ux7UiFJej8KD1PAU1SnCVFv7hYe','726','10:00',NULL,3,2,NULL,0,NULL,NULL),(59,'90',38,'','Aretha Foreman','15-08-2021 ','Quận huyện','jypa@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh',2,0,1,'$2a$10$7m2ebivGIyU9EFCMgw13cux/CPAHr9ho8Kri9i7eT6sXkF4YdF7UO','683','14:00',NULL,3,2,NULL,0,NULL,NULL),(62,'1000',35,'Phường xã','Myles Ochoa','15-08-2021 ','Huyện Phú Vang','zysyb@mailinator.com',_binary '','Nam','Bệnh về hô hấp',2,0,0,'$2a$10$bIjfj40hQdjhJERuiCgFPemMdGKioeylZd/4I8tyLVRBQnj1wmddu','990','14:00',NULL,3,1,NULL,0,NULL,NULL),(65,'23123',0,'Phường xã','Calvin Preston','12-08-2021 ','Huyện Quảng Điền','filadaf@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$exrX7LMoya1GFdeEzfsq0eOjVlwLBVR2awSdKooZ7rM03yn1Bufhq','912','16:00',NULL,1,1,NULL,0,NULL,NULL),(66,'123123',0,'Phường xã','Wynne Gill','12-08-2021 ','Thị xã Hương Thủy','dydegoby@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$cm3hEV1pSk06wGscwe1gZO8kbgYoWqqFNTciSBYztC76ALmd47oNe','617','16:00',NULL,1,1,NULL,0,NULL,NULL),(67,'345',0,'Phường xã','Oscar Baker','12-08-2021 ','Huyện A Lưới','divesohaj@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$bCkiN49R1OrartyC5LvQwOHCaAGSoCGfNxu74tBz6WhvB17hj7/1.','77','16:00',NULL,1,2,NULL,0,NULL,NULL),(68,'35345',0,'Phường xã','Idola Farrell','13-08-2021 ','Huyện Nam Đông','saqizyso@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,0,'$2a$10$T7ZDWhYpJ9Pfaq0VgUS64e9NUEWNvyWFCL1/69Vp9MfNCyR1lqjZ2','698','08:00',NULL,1,1,NULL,0,NULL,NULL),(69,'3452435',0,'Phường xã','Lance Hansen','13-08-2021 ','Huyện Nam Đông','suheraxoco@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,0,'$2a$10$Z/buzLEsJpQczMM8NW9g4.UeGqgLV8YWGTS6yTyrUyf2qx5HB0LWa','214','08:00',NULL,1,1,NULL,0,NULL,NULL),(70,'234535',0,'Phường xã','Eric Mendoza','13-08-2021 ','Huyện A Lưới','pyregemur@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh',2,0,1,'$2a$10$LuAK9mdGoRDbhe4gpygAWuGJVGGIB7ZOrKwg2G5Mo.umMSx/Pxy22','378','08:00',NULL,1,1,NULL,0,NULL,NULL),(71,'213213',0,'Phường xã','Veda Delgado','13-08-2021 ','Thị xã Hương Thủy','lymemob@mailinator.com',_binary '','Nam','Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$DU8UhMyNatxVnbhAvoBuKO7wf5s90k58w.UYjbQrG92kDePboF.OW','898','08:00',NULL,1,1,NULL,0,NULL,NULL),(72,'12312312',0,'Phường xã','Shelly Cross','13-08-2021 ','Thành phố Huế','hiwav@mailinator.com',_binary '','Nam','Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$GN1H8sJYZFlpIoPMZGQ/fOjb7fUMahDZnl7aD9cuhr7qvg6Q4oC0e','538','08:00',NULL,1,1,NULL,0,NULL,NULL),(73,'45646',0,'Phường xã','Gloria Nielsen','13-08-2021 ','Huyện Phong Điền','zecyvyky@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$8ibHUCaAw2ioVChpKXhKhO7Au.M4kxn5EUrCpAEqpW7/TZ.q6y/Di','694','10:00',NULL,1,1,NULL,0,NULL,NULL),(74,'64564',0,'Phường xã','Zenia Holt','13-08-2021 ','Huyện Phú Vang','dividyfoto@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$RHy3YYiwc0A1I/owy8XeMu23d4T6urJD1WM1JKI6H4VKoxd3//Pty','585','10:00',NULL,1,1,NULL,0,NULL,NULL),(75,'11',0,'Phường xã','Chelsea Pollard','13-08-2021 ','Huyện Phú Lộc','besivorej@mailinator.com',_binary '','Nam','Bệnh về tim mạch',2,0,1,'$2a$10$iZC9g7y0LkAkPLRHPDcJ6OwFIi/r1AMhpoMTVjF03fCPcsmQld0VS','344','10:00',NULL,1,1,NULL,0,NULL,NULL),(76,'62',0,'Phường xã','Rhea Cervantes','13-08-2021 ','Thị xã Hương Thủy','hanu@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp',2,0,1,'$2a$10$mlYfmu5LA.hYZoxpQmDPzej7AbNCgj4ayAf3yJUrIpVJgEjV8g3SC','437','10:00',NULL,1,1,NULL,0,NULL,NULL),(77,'34563456',0,'Phường xã','Charissa Santana','13-08-2021 ','Huyện Phú Lộc','jalijos@mailinator.com',_binary '','Nam',NULL,2,0,1,'$2a$10$V8QPfeXvGC2aW5FtVr1ZqOXPGRc2OAIZh0A3eKJfUietEdqwe/U0m','494','10:00',NULL,1,1,NULL,0,NULL,NULL),(78,'33',0,'Phường xã','Zeus Jefferson','13-08-2021 ','Thị xã Hương Trà','qufylyxy@mailinator.com',_binary '','Nam','Tiểu đường hoặc ung thư',2,0,1,'$2a$10$F8sPebKvsUYzOBr1Yj0t4e4k21L3pSqZ.ml3FUt2I4DzqWJqYhAsC','776','14:00',NULL,1,1,NULL,0,NULL,NULL),(79,'34654656',0,'Phường xã','Dahlia Donovan','13-08-2021 ','Thị xã Hương Trà','govopowoc@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$JkgpYVaOvHbcy0sx6y0ntOnmv8jFoZAzOwVoVGBfYILLQHRtEtQny','756','14:00',NULL,1,1,NULL,0,NULL,NULL),(80,'303434',47,'Phường xã','Callie Paul','13-08-2021 ','Thị xã Hương Thủy','holifeqe@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$EAYw35aNRtmIZe4dDTQ/5e8ABP/pniBpH05W8StK7LSWsTLKELvdO','664','14:00',NULL,1,2,NULL,0,NULL,NULL),(81,'45',16,'Phường xã','Mechelle Perkins','15-08-2021 ','Huyện A Lưới','zagakytob@mailinator.com',_binary '','Nữ','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$awLseEbPYnZSnZukVKZtF.fZwYUA3YeAbo8.UvhupJBJkgU/94X5W','10','10:00',NULL,2,2,NULL,0,NULL,NULL),(82,'678568',0,'','Lacota Hood','15-08-2021 ','Quận huyện','bokylux@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$m3SzLd3cK38BjnzPkmIcYuoCqN.qun9GIIBaygoOT7GEtVzzZNF7u','907','10:00',NULL,2,1,NULL,0,NULL,NULL),(83,'8678',0,'Phường xã','Allegra Camacho','15-08-2021 ','Huyện Phú Vang','fozetybo@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$wyxDF61Wh2.S8zMvlqkTV.0oBYLvbYp.QBG/uwSMC306ewTmcacMS','437','10:00',NULL,2,1,NULL,0,NULL,NULL),(84,'9378',0,'Phường xã','Raja Farrell','15-08-2021 ','Huyện Phú Lộc','vuzokesupu@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$sa.ql.r95RjvGznrS1vtt.k/kz9IDc9Y.ErYKPI9haFtho4ql1PbG','265','14:00',NULL,2,2,NULL,0,NULL,NULL),(85,'5645',0,'Phường xã','Ursa Russo','15-08-2021 ','Thị xã Hương Trà','kunofeha@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$HIpGieEePvuMZy78mRqIEeca6tc73dB02sC/wQ5FG/EPoQJ6k/5Fq','841','14:00',NULL,2,2,NULL,0,NULL,NULL),(86,'64645',0,'Phường xã','Jermaine Woodard','15-08-2021 ','Huyện Phú Lộc','cohul@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$QIJCmQy0lGoMsq2RoBgquOImy1JD72l5x5ZnjvEsjkrtPBTuGRO9e','498','14:00',NULL,2,2,NULL,0,NULL,NULL),(87,'867857',0,'Phường xã','Jakeem Kemp','15-08-2021 ','Thành phố Huế','lusokohud@mailinator.com',_binary '','Nam','Bệnh về thần kinh,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,0,'$2a$10$t70Mrq4UAO1z9Vr8igWkcOwMEnJ8tByIYAcKuGZCWT5Ui15pHumc2','307','16:00',NULL,2,2,NULL,0,NULL,NULL),(88,'7567',0,'Phường xã','Richard White','15-08-2021 ','Huyện Nam Đông','xanyqa@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,0,'$2a$10$FNQp0acs8ihColv0cE5PluspDgkcuOtebjvtdCmjruWkWHwkzR5NO','224','16:00',NULL,2,2,NULL,0,NULL,NULL),(89,'16546',47,'Phường xã','Veda Hernandez','15-08-2021 ','Huyện Phong Điền','xekibok@mailinator.com',_binary '','Nữ','Bệnh về hô hấp',2,0,0,'$2a$10$IFv2PlE6pVbZSs8cO702Ue.G2NiyZFjtiRDK0.2KVVaUpnhcTjzAS','172','16:00',NULL,2,2,NULL,0,NULL,NULL),(90,'46456',0,'Phường xã','Axel Browning','16-08-2021 ','Thị xã Hương Trà','rofad@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$hnDr13B9A6lSeYFi3cUYx.aLEDk.ybfDlypgpG2KgSkQ4./ijo3N6','226','08:00',NULL,2,2,NULL,0,NULL,NULL),(91,'485656',0,'Phường xã','Flavia Massey','16-08-2021 ','Huyện Nam Đông','pyceviv@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$2wmNAb/UdgxMco7KxlHSGOulIACr5CLBx2ql.EQzJWl18B0FoRbMO','461','08:00',NULL,2,2,NULL,0,NULL,NULL),(92,'31656',0,'Phường xã','Nell Brennan','16-08-2021 ','Huyện A Lưới','geheqadu@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,1,'$2a$10$vJIFh.hr/WYMm243t.kWl.VmVHO4zBIQffHt1q9R8je/dFvbrt712','442','08:00',NULL,2,2,NULL,0,NULL,NULL),(93,'636767',0,'Phường xã','Basia Stuart','16-08-2021 ','Huyện Quảng Điền','xifa@mailinator.com',_binary '','Nam','Bệnh về tim mạch',2,0,1,'$2a$10$ED1C6bitJnJkfBiyBc13c.BzgIQTHgheZF2g3EMkIzG5ix1OK.GHG','585','10:00',NULL,2,2,NULL,0,NULL,NULL),(94,'45767',0,'','Ronan Simpson','16-08-2021 ','Quận huyện','bajevuti@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp',2,0,1,'$2a$10$ffo6TE6dR4eGEWf86n95IuQ8ahK8CR.2WUM3T/x/WdVyw5tousKai','415','10:00',NULL,2,2,NULL,0,NULL,NULL),(95,'83654364',0,'Phường xã','Signe Faulkner','16-08-2021 ','Huyện Quảng Điền','fujyfekigy@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$sAcuHfQBVQtI8ulyVmKAnuKdTDMQX5mqeT/3vHkhN4Fi8ldbWL4aq','309','10:00',NULL,2,2,NULL,0,NULL,NULL),(96,'20145',0,'Phường xã','Phillip Cox','16-08-2021 ','Thành phố Huế','pujafo@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$LqBwGvbIN44rwMh7bcb13uIp3mlWan71NneppMVxuWjWe1lFaFPVS','779','14:00',NULL,2,2,NULL,0,NULL,NULL),(97,'646767',0,'Phường xã','Jelani Knowles','16-08-2021 ','Huyện Phú Lộc','kyvagu@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$m2uw53tyv72vtPl/Hgtjy.yNNliCgFj/OSPi0Qt4ko9iQoIEHkqwm','461','14:00',NULL,2,2,NULL,0,NULL,NULL),(98,'743423',0,'Phường xã','Raymond Wong','16-08-2021 ','Huyện Quảng Điền','rozanim@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$ehYuoMe3uQFGGh5dBPaWY.Yg4JrnUAUWmGGUWQLYuuY0NquM7gNs2','194','14:00',NULL,2,1,NULL,0,NULL,NULL),(99,'786757',0,'Phường xã','Nicole Reed','16-08-2021 ','Huyện A Lưới','sefyly@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Các bệnh lý về xương khớp',2,0,0,'$2a$10$/JbGlJJen6n2iBNS.9SMqeFx3jvodp9fyYlcH2qZWnH4FPypqpWii','66','16:00',NULL,2,2,NULL,0,NULL,NULL),(100,'70654',0,'Phường xã','Dorian Beasley','16-08-2021 ','Huyện Phú Vang','jysugoz@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,0,'$2a$10$MfdJtvXK51vr6Ya9gPzEieBbR0LLpk4pfQKkMAqYRJswqU5gJKWFe','40','16:00',NULL,2,3,NULL,0,NULL,NULL),(101,'686767',0,'Phường xã','Marah Boyle','16-08-2021 ','Thị xã Hương Thủy','buxiruje@mailinator.com',_binary '','Nam','Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,0,'$2a$10$97O6lURDNnAuapRX85CLROoUNnPhVztBmDf.M.UXz/o5pL/JmTuu2','9','16:00',NULL,2,2,NULL,0,NULL,NULL),(107,'41',0,'Phường xã','Iris Gentry','16-08-2021 ','Thành phố Huế','nytedes@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Các bệnh lý về xương khớp',2,0,1,'$2a$10$RhGrB0MuEMC77MC7L4et.uw5c/Zd/B1VsdO5Qln9hFPvKQy78tpxG','762','08:00',NULL,4,4,NULL,0,NULL,NULL),(109,'7010',0,'','Freya Stanley','16-08-2021 ','Quận huyện','werykuhu@mailinator.com',_binary '','Nam','Bệnh về tim mạch',2,0,1,'$2a$10$c/nzezf2UThpHchqTH6.8encr1ni4I5yOep7lDb2gRM0YAHfDF2yq','195','08:00',NULL,4,4,NULL,0,NULL,NULL),(110,'9999',0,'Phường xã','John Avery','16-08-2021 ','Thị xã Hương Trà','nypinix@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Tiểu đường hoặc ung thư,Các bệnh lý về xương khớp',2,0,1,'$2a$10$/BKraG85TgxlsKdoSQev.eh0O6.JLbco9G/UDU5RsHnvmJR6GF37C','262','10:00',NULL,4,4,NULL,0,NULL,NULL),(111,'115',24,'Phường xã','Bình Hụ','16-08-2021 ','Huyện Nam Đông','nguyenvanthaibinh2210@gmail.com',_binary '','Nam','Bệnh về tim mạch',2,0,1,'$2a$10$ALz1tZ3cIPoM7HTEmGacKOOrj0qBDn98H5tvqU3nrHMH9Kmsa5x1y','140','10:00',NULL,4,4,NULL,0,NULL,NULL),(113,'5455',0,'Phường xã','Marshall Cain','16-08-2021 ','Huyện Phong Điền','xixydozyw@mailinator.com',_binary '','Nam','Bệnh về tim mạch,Bệnh về hô hấp,Bệnh về thần kinh,Tiểu đường hoặc ung thư',2,0,1,'$2a$10$99ZwaZa9Q0LX6H.10fb7.uc6EZQyHlOTwwpgMD1HsbMgV2yw3gDkC','411','14:00',NULL,4,3,NULL,0,NULL,NULL),(114,'10',0,NULL,NULL,NULL,NULL,NULL,_binary '',NULL,NULL,0,2,0,'$2a$10$.MSnYamWnnGqzgu0sQ3Fk.IhjQSRKkq14HQdpbaLfuNEjDQ0EIoHC',NULL,NULL,NULL,1,NULL,NULL,0,NULL,NULL);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `destinations`
--

DROP TABLE IF EXISTS `destinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destinations` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `amount_off` int DEFAULT '0',
  `date_end` varchar(255) DEFAULT NULL,
  `date_start` varchar(255) DEFAULT NULL,
  `destination_name` varchar(255) DEFAULT NULL,
  `is_delete` int DEFAULT '0',
  `is_open` int DEFAULT '0',
  `people_per_hour` int NOT NULL,
  `id_warehouse_vaccine` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmqvgy8ce5cdh6wgwy8hughf8s` (`id_warehouse_vaccine`),
  CONSTRAINT `FKmqvgy8ce5cdh6wgwy8hughf8s` FOREIGN KEY (`id_warehouse_vaccine`) REFERENCES `warehouse_vaccine` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinations`
--

LOCK TABLES `destinations` WRITE;
/*!40000 ALTER TABLE `destinations` DISABLE KEYS */;
INSERT INTO `destinations` VALUES (1,0,'31-08-2021 ','12-08-2021 ','Chùa Linh Mụ',0,0,5,1),(2,0,'31-08-2021 ','14-08-2021 ','Ga Huế',0,0,3,1),(3,0,'25-08-2021 ','15-08-2021 ','Sân Vận Động Tự Do',0,0,6,1),(4,0,'31-08-2021 ','16-08-2021 ','Bệnh Viện Dã Chiến',1,1,2,1);
/*!40000 ALTER TABLE `destinations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register_days`
--

DROP TABLE IF EXISTS `register_days`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register_days` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `amount_register` int NOT NULL,
  `count_submit` int DEFAULT '0',
  `date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register_days`
--

LOCK TABLES `register_days` WRITE;
/*!40000 ALTER TABLE `register_days` DISABLE KEYS */;
/*!40000 ALTER TABLE `register_days` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` bigint NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `APP_ROLE_UK` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (2,'ROLE_ADMIN'),(3,'ROLE_DOCTOR'),(1,'ROLE_USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaccines`
--

DROP TABLE IF EXISTS `vaccines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaccines` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `register_amount` int NOT NULL,
  `vaccine_amount` int NOT NULL,
  `vaccine_name` varchar(255) DEFAULT NULL,
  `id_warehouse` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK71vwlk6bxyficcb7fv5tcu435` (`id_warehouse`),
  CONSTRAINT `FK71vwlk6bxyficcb7fv5tcu435` FOREIGN KEY (`id_warehouse`) REFERENCES `warehouse_vaccine` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccines`
--

LOCK TABLES `vaccines` WRITE;
/*!40000 ALTER TABLE `vaccines` DISABLE KEYS */;
INSERT INTO `vaccines` VALUES (1,90,92,'Vaccine 1',1),(2,84,86,'Vaccine 2',1),(3,93,93,'Vaccine 3',1),(4,96,96,' AstraZeneca',1);
/*!40000 ALTER TABLE `vaccines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse_vaccine`
--

DROP TABLE IF EXISTS `warehouse_vaccine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `warehouse_vaccine` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `warehouse_name` varchar(255) DEFAULT NULL,
  `warehouse_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse_vaccine`
--

LOCK TABLES `warehouse_vaccine` WRITE;
/*!40000 ALTER TABLE `warehouse_vaccine` DISABLE KEYS */;
INSERT INTO `warehouse_vaccine` VALUES (1,'Kho Phú Bài','299 Nguyễn Văn An');
/*!40000 ALTER TABLE `warehouse_vaccine` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-16 11:56:59
