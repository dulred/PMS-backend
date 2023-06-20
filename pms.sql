-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: pms
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ausertable`
--

DROP TABLE IF EXISTS `ausertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ausertable` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `upwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ausertable`
--

LOCK TABLES `ausertable` WRITE;
/*!40000 ALTER TABLE `ausertable` DISABLE KEYS */;
INSERT INTO `ausertable` VALUES (1,'dulred','417919');
/*!40000 ALTER TABLE `ausertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) DEFAULT NULL,
  `dtype` varchar(50) DEFAULT NULL,
  `dtel` varchar(50) DEFAULT NULL,
  `dmail` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `supdepartment` int DEFAULT NULL,
  `establishmentdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'浜у搧','鏍稿績涓氬姟閮ㄩ棬','18877101640','11090060@qq.com','鏍稿績鐨勪骇鍝侀儴闂?,1,'2023-06-13'),(2,'鎶€鏈?,'鏍稿績涓氬姟閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(3,'甯傚満','鏍稿績涓氬姟閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(4,'琛屾斂','鏀寔鑱岃兘閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(5,'鍟嗗姟','鏀寔鑱岃兘閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(6,'鎴樼暐瑙勫垝閮?,'鎴樼暐瑙勫垝閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(7,'娉曞姟','鏀寔鑱岃兘閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(8,'鐮旂┒闄?,'鎴樼暐瑙勫垝閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(9,'椤圭洰缁?,'涓撻」浠诲姟閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(10,'璐㈠姟','绠＄悊鑱岃兘閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(11,'瀹¤','绠＄悊鑱岃兘閮ㄩ棬','18877101640','11090060@qq.com','宸存媺宸存媺宸存媺',6,'2023-06-13'),(12,'姝﹀綋','涓撻」浠诲姟閮ㄩ棬','13245678789',NULL,'浣犳槸璋佸憿锛屾垜涓嶅お璁よ瘑浣?,6,'2023-06-13'),(13,'灏戞灄','涓撻」浠诲姟閮ㄩ棬','12332123',NULL,'鎴戞潵鍟﹀暒鍟﹀暒',12,'2023-06-13'),(14,'鏄庢暀','鏀寔鑱岃兘閮ㄩ棬','45456465',NULL,'鍙戞拻鍙戞拻娉?,12,'2023-06-13');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `post` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(50) DEFAULT NULL,
  `ptype` varchar(50) DEFAULT NULL,
  `organization` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,'绯荤粺鏋舵瀯甯?,'鎶€鏈矖',2),(2,'鎴樼暐瑙勫垝缁忕悊','绠＄悊宀?,3),(4,'鎴樼暐鎵ц缁忕悊','绠＄悊宀?,3),(5,'甯傚満鍒嗘瀽甯?,'绠＄悊宀?,3),(6,'绔炰簤鎯呮姤鍒嗘瀽甯?,'绠＄悊宀?,3),(7,'琛屾斂涓荤','琛屾斂宀?,3),(8,'鍓嶅彴鎺ュ緟','琛屾斂宀?,3),(9,'琛屾斂鍔╃悊','琛屾斂宀?,3),(10,'鍚庡嫟绠＄悊','琛屾斂宀?,3),(11,'鍓嶇宸ョ▼甯?,'鎶€鏈矖',3),(12,'鍚庣宸ョ▼甯?,'鎶€鏈矖',3),(13,'娴嬭瘯宸ョ▼甯?,'鎶€鏈矖',3),(14,'杩愮淮宸ョ▼甯?,'鎶€鏈矖',3),(15,'浜у搧缁忕悊','浜у搧宀?,3),(16,'浜у搧璁捐甯?,'浜у搧宀?,3),(17,'浜у搧杩愯惀涓撳憳','浜у搧宀?,3),(18,'甯傚満鎬荤洃','甯傚満宀?,3),(19,'鍝佺墝缁忕悊','甯傚満宀?,3),(20,'甯傚満绛栧垝甯?,'甯傚満宀?,3),(21,'娲诲姩绛栧垝甯?,'甯傚満宀?,3),(22,'鍏叧涓撳憳','甯傚満宀?,3),(23,'璐㈠姟鎬荤洃','璐㈠姟宀?,3),(24,'浼氳','璐㈠姟宀?,3),(25,'鍑虹撼','璐㈠姟宀?,3),(26,'璐㈠姟鍒嗘瀽甯?,'璐㈠姟宀?,3),(27,'鍟嗗姟缁忕悊','鍟嗗姟宀?,3),(28,'涓氬姟鎷撳睍涓撳憳','鍟嗗姟宀?,3),(29,'瀹㈡埛缁忕悊','鍟嗗姟宀?,3),(30,'瀹¤涓荤','瀹¤宀?,3),(31,'瀹¤甯?,'瀹¤宀?,3),(32,'鍐呴儴鎺у埗涓撳憳','瀹¤宀?,3),(33,'鐮旂┒闄㈡€荤洃','鐮斿彂宀?,3),(34,'鐮旂┒鍛?,'鐮斿彂宀?,3),(35,'宸ョ▼甯?,'鐮斿彂宀?,3),(36,'瀹為獙鎶€鏈憳','鐮斿彂宀?,3),(37,'娉曞姟鎬荤洃','娉曞姟宀?,3),(38,'寰嬪笀','娉曞姟宀?,3),(39,'鍚堣涓撳憳','娉曞姟宀?,3),(40,'椤圭洰缁忕悊','椤圭洰宀?,3),(41,'椤圭洰鍔╃悊','椤圭洰宀?,3),(42,'椤圭洰鎵ц涓撳憳','椤圭洰宀?,3),(43,'澶栧寘','椤圭洰宀?,3),(44,'澶╅緳','椤圭洰宀?,3),(45,'姝﹀綋','琛屾斂宀?,3),(46,'t鍑洪敊','绠＄悊宀?,3),(47,'鍝﹀摝','绠＄悊宀?,3);
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quit`
--

DROP TABLE IF EXISTS `quit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quit` (
  `id` int NOT NULL AUTO_INCREMENT,
  `staff_id` int DEFAULT NULL,
  `sname` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `qtype` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `qdate` date DEFAULT NULL,
  `opdate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `qsid` (`staff_id`),
  CONSTRAINT `qsid` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quit`
--

LOCK TABLES `quit` WRITE;
/*!40000 ALTER TABLE `quit` DISABLE KEYS */;
INSERT INTO `quit` VALUES (1,1,'涔濋槾鐪熺粡','閫€浼?,'2023-06-01','2023-06-20'),(2,6,'寮犱笁4','杈為€€','2023-06-10','2023-06-20'),(3,6,'寮犱笁4','杈為€€','2023-07-08','2023-06-20'),(4,8,'寮犱笁5','寮€闄?,'2023-06-23','2023-06-20'),(5,9,'寮犱笁8','涓嶅綍鐢?,'2023-07-07','2023-06-20'),(6,11,'寮犱笁10','閫€浼?,'2023-06-23','2023-06-20'),(7,3,'寮犱笁','杈炶亴','2023-06-07','2023-06-20'),(8,3,'寮犱笁','閫€浼?,'2023-06-29','2023-06-21');
/*!40000 ALTER TABLE `quit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sname` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  `sid` varchar(50) NOT NULL,
  `depart_id` int NOT NULL,
  `post_id` int NOT NULL,
  `entrydate` date NOT NULL,
  `joinworkdate` date NOT NULL,
  `workform` varchar(50) NOT NULL,
  `staffsource` varchar(50) NOT NULL,
  `politicalstatus` varchar(50) DEFAULT NULL,
  `nation` varchar(50) DEFAULT NULL,
  `nativeplace` varchar(50) DEFAULT NULL,
  `stel` varchar(50) DEFAULT NULL,
  `semail` varchar(50) DEFAULT NULL,
  `sheight` decimal(12,2) DEFAULT NULL,
  `bloodtype` varchar(50) DEFAULT NULL,
  `maritalstatus` varchar(50) DEFAULT NULL,
  `registeredresidence` varchar(100) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `degree` varchar(50) DEFAULT NULL,
  `university` varchar(50) DEFAULT NULL,
  `major` varchar(50) DEFAULT NULL,
  `graduationdate` date DEFAULT NULL,
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `peroidopdate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `did` (`depart_id`),
  KEY `pid` (`post_id`),
  CONSTRAINT `did` FOREIGN KEY (`depart_id`) REFERENCES `department` (`id`),
  CONSTRAINT `pid` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'涔濋槾鐪熺粡','鐢?,'2023-05-30','654564564456',2,2,'2023-05-29','2023-05-30','姝ｅ紡','鍐涜浆',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'寮犱笁','鐢?,'2023-06-12','6565465',3,6,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08',NULL,'2023-06-18'),(4,'寮犱笁2','鐢?,'2023-06-12','6565465',3,5,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(5,'寮犱笁3','鐢?,'2023-06-12','6565465',1,16,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(6,'寮犱笁4','鐢?,'2023-06-12','6565465',1,8,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(7,'寮犱笁4','鐢?,'2023-06-12','6565465',1,17,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(8,'寮犱笁5','鐢?,'2023-06-12','6565465',1,5,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(9,'寮犱笁8','鐢?,'2023-06-12','6565465',2,2,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(10,'寮犱笁9','鐢?,'2023-06-12','6565465',2,14,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(11,'寮犱笁10','鐢?,'2023-06-12','6565465',2,13,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(12,'寮犱笁11','鐢?,'2023-06-12','6565465',2,1,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(13,'寮犱笁12','鐢?,'2023-06-12','6565465',3,15,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(14,'寮犱笁14','鐢?,'2023-06-12','6565465',4,22,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(15,'寮犱笁15','濂?,'2023-06-12','6565465',11,25,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(16,'鏉庡洓1','濂?,'2023-06-12','6565465',9,41,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(17,'鏉庡洓2','濂?,'2023-06-12','6565465',9,41,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(18,'鏉庡洓3','濂?,'2023-06-12','6565465',9,40,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(19,'鏉庡洓4','濂?,'2023-06-12','6565465',9,42,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL),(20,'鏉庡洓6','濂?,'2023-06-12','6565465',9,42,'2023-06-06','2023-05-29','涓存椂','鍐涜浆','鍥㈠憳','缁村惥灏旀棌','椋炴磼鍙戠敓','86456456','6546546@qq.com',177.30,'0 鍨?,'宸插','涓婃捣瀹濆北','鏈','瀛﹀＋','涓婃捣绉戞妧澶у','璁＄畻鏈轰笌绉戝','2023-06-04','2023-06-09','2023-07-08','姝ｅ父',NULL);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transfer`
--

DROP TABLE IF EXISTS `transfer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transfer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `staff_id` int DEFAULT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `beforepost_id` int DEFAULT NULL,
  `afterpost_id` int DEFAULT NULL,
  `ttype` varchar(10) DEFAULT NULL,
  `tdate` date DEFAULT NULL,
  `opdate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ssid` (`staff_id`),
  KEY `ppid` (`afterpost_id`),
  KEY `bpid` (`beforepost_id`),
  CONSTRAINT `bpid` FOREIGN KEY (`beforepost_id`) REFERENCES `post` (`id`),
  CONSTRAINT `ppid` FOREIGN KEY (`afterpost_id`) REFERENCES `post` (`id`),
  CONSTRAINT `ssid` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfer`
--

LOCK TABLES `transfer` WRITE;
/*!40000 ALTER TABLE `transfer` DISABLE KEYS */;
INSERT INTO `transfer` VALUES (1,1,'涔濋槾鐪熺粡',1,2,'闄嶈亴','2023-06-15','2023-06-19'),(2,4,'寮犱笁2',2,5,'闄嶈亴','2023-06-30','2023-06-19'),(3,6,'寮犱笁4',17,8,'闄嶈亴','2023-07-08','2023-06-19'),(4,8,'寮犱笁5',18,5,'闄嶈亴','2023-07-08','2023-06-19'),(5,9,'寮犱笁8',11,2,'鍗囪亴','2023-07-08','2023-06-19'),(6,10,'寮犱笁9',12,14,'闄嶈亴','2023-07-07','2023-06-19'),(7,12,'寮犱笁11',14,1,'鍗囪亴','2023-07-03','2023-06-19'),(8,13,'寮犱笁12',18,15,'鍗囪亴','2023-06-29','2023-06-19');
/*!40000 ALTER TABLE `transfer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-21  0:41:19
