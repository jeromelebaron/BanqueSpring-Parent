-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: bdd_banque
-- ------------------------------------------------------
-- Server version	5.7.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO utilisateur VALUES ('client',1,'clien1@mabanque.spring','12345','Client 1','prenom client 1');
INSERT INTO utilisateur VALUES ('client',2,'clien2@mabanque.spring','12345','Client 2','prenom client 2');
INSERT INTO utilisateur VALUES ('client',3,'clien3@mabanque.spring','12345','Client 3','prenom client 3');
INSERT INTO utilisateur VALUES ('client',4,'clien4@mabanque.spring','12345','Client 4','prenom client 4');
INSERT INTO utilisateur VALUES ('conseiller',5,'conseil1@mabanque.spring','12345','conseiller1','conseil');
INSERT INTO utilisateur VALUES ('conseiller',6,'conseil2@mabanque.spring','12345','conseiller2','conseil2');

--
-- Dumping data for table `Client`
--

INSERT INTO Client VALUES (1);
INSERT INTO Client VALUES (2);
INSERT INTO Client VALUES (3);
INSERT INTO Client VALUES (4);

--
-- Dumping data for table `Conseiller`
--

INSERT INTO Conseiller VALUES (5);
INSERT INTO Conseiller VALUES (6);

--
-- Dumping data for table `compte`
--

INSERT INTO compte VALUES (1,'2016-03-28 15:05:34','Courant',1);
INSERT INTO compte VALUES (2,'2016-03-28 15:05:34','Courant',1);
INSERT INTO compte VALUES (3,'2016-03-28 15:05:34','Courant',2);
INSERT INTO compte VALUES (4,'2016-03-28 15:05:34','Courant',2);
INSERT INTO compte VALUES (5,'2016-03-28 15:05:34','Courant',2);
INSERT INTO compte VALUES (6,'2016-03-28 15:05:34','Courant',3);
INSERT INTO compte VALUES (7,'2016-03-28 15:05:34','Courant',4);
INSERT INTO compte VALUES (8,'2016-03-28 15:05:34','Courant',4);
INSERT INTO compte VALUES (9,'2016-03-28 15:05:34','Courant',4);
INSERT INTO compte VALUES (10,'2016-03-28 15:05:34','Courant',4);

--
-- Dumping data for table `operation_compte`
--

INSERT INTO operation_compte VALUES ('debit',1,'2016-03-28 15:05:34',726.8,1);
INSERT INTO operation_compte VALUES ('credit',2,'2016-03-28 15:05:34',1388.7,1);
INSERT INTO operation_compte VALUES ('debit',3,'2016-03-28 15:05:34',36.3,1);
INSERT INTO operation_compte VALUES ('credit',4,'2016-03-28 15:05:34',833.3,1);
INSERT INTO operation_compte VALUES ('debit',5,'2016-03-28 15:05:34',188.3,1);
INSERT INTO operation_compte VALUES ('credit',6,'2016-03-28 15:05:34',1250.1,1);
INSERT INTO operation_compte VALUES ('debit',7,'2016-03-28 15:05:34',984.8,1);
INSERT INTO operation_compte VALUES ('credit',8,'2016-03-28 15:05:34',721.7,1);
INSERT INTO operation_compte VALUES ('debit',9,'2016-03-28 15:05:34',1344.1,1);
INSERT INTO operation_compte VALUES ('credit',10,'2016-03-28 15:05:34',905.3,1);
INSERT INTO operation_compte VALUES ('debit',11,'2016-03-28 15:05:34',1052.6,1);
INSERT INTO operation_compte VALUES ('credit',12,'2016-03-28 15:05:34',164.8,1);
INSERT INTO operation_compte VALUES ('debit',13,'2016-03-28 15:05:34',245.4,1);
INSERT INTO operation_compte VALUES ('credit',14,'2016-03-28 15:05:34',98.2,1);
INSERT INTO operation_compte VALUES ('debit',15,'2016-03-28 15:05:34',1288.9,1);
INSERT INTO operation_compte VALUES ('credit',16,'2016-03-28 15:05:34',1326.7,1);
INSERT INTO operation_compte VALUES ('debit',17,'2016-03-28 15:05:34',676.5,1);
INSERT INTO operation_compte VALUES ('credit',18,'2016-03-28 15:05:34',1470.5,1);
INSERT INTO operation_compte VALUES ('debit',19,'2016-03-28 15:05:34',329.1,1);
INSERT INTO operation_compte VALUES ('credit',20,'2016-03-28 15:05:34',209.1,1);
INSERT INTO operation_compte VALUES ('debit',21,'2016-03-28 15:05:34',476.7,2);
INSERT INTO operation_compte VALUES ('credit',22,'2016-03-28 15:05:34',868.6,2);
INSERT INTO operation_compte VALUES ('debit',23,'2016-03-28 15:05:34',1027.7,2);
INSERT INTO operation_compte VALUES ('credit',24,'2016-03-28 15:05:34',910.6,2);
INSERT INTO operation_compte VALUES ('debit',25,'2016-03-28 15:05:34',93.1,2);
INSERT INTO operation_compte VALUES ('credit',26,'2016-03-28 15:05:34',964.2,2);
INSERT INTO operation_compte VALUES ('debit',27,'2016-03-28 15:05:34',1238.5,2);
INSERT INTO operation_compte VALUES ('credit',28,'2016-03-28 15:05:34',519.8,2);
INSERT INTO operation_compte VALUES ('debit',29,'2016-03-28 15:05:34',89.8,2);
INSERT INTO operation_compte VALUES ('credit',30,'2016-03-28 15:05:34',1320.9,2);
INSERT INTO operation_compte VALUES ('debit',31,'2016-03-28 15:05:34',913.7,2);
INSERT INTO operation_compte VALUES ('credit',32,'2016-03-28 15:05:34',281,2);
INSERT INTO operation_compte VALUES ('debit',33,'2016-03-28 15:05:34',1145.6,2);
INSERT INTO operation_compte VALUES ('credit',34,'2016-03-28 15:05:34',438.7,2);
INSERT INTO operation_compte VALUES ('debit',35,'2016-03-28 15:05:34',1019.3,2);
INSERT INTO operation_compte VALUES ('credit',36,'2016-03-28 15:05:34',528,2);
INSERT INTO operation_compte VALUES ('debit',37,'2016-03-28 15:05:34',1299.5,2);
INSERT INTO operation_compte VALUES ('credit',38,'2016-03-28 15:05:34',996.4,2);
INSERT INTO operation_compte VALUES ('debit',39,'2016-03-28 15:05:34',1269.7,2);
INSERT INTO operation_compte VALUES ('credit',40,'2016-03-28 15:05:34',785.1,2);
INSERT INTO operation_compte VALUES ('debit',41,'2016-03-28 15:05:34',1355.1,3);
INSERT INTO operation_compte VALUES ('credit',42,'2016-03-28 15:05:34',506.9,3);
INSERT INTO operation_compte VALUES ('debit',43,'2016-03-28 15:05:34',354,3);
INSERT INTO operation_compte VALUES ('credit',44,'2016-03-28 15:05:34',385.1,3);
INSERT INTO operation_compte VALUES ('debit',45,'2016-03-28 15:05:34',924.2,3);
INSERT INTO operation_compte VALUES ('credit',46,'2016-03-28 15:05:34',1383.1,3);
INSERT INTO operation_compte VALUES ('debit',47,'2016-03-28 15:05:34',174.9,3);
INSERT INTO operation_compte VALUES ('credit',48,'2016-03-28 15:05:34',452.1,3);
INSERT INTO operation_compte VALUES ('debit',49,'2016-03-28 15:05:34',1085.3,3);
INSERT INTO operation_compte VALUES ('credit',50,'2016-03-28 15:05:34',997,3);
INSERT INTO operation_compte VALUES ('debit',51,'2016-03-28 15:05:34',1135.6,3);
INSERT INTO operation_compte VALUES ('credit',52,'2016-03-28 15:05:34',140.7,3);
INSERT INTO operation_compte VALUES ('debit',53,'2016-03-28 15:05:34',548.4,3);
INSERT INTO operation_compte VALUES ('credit',54,'2016-03-28 15:05:34',1195.7,3);
INSERT INTO operation_compte VALUES ('debit',55,'2016-03-28 15:05:34',1201.1,3);
INSERT INTO operation_compte VALUES ('credit',56,'2016-03-28 15:05:34',614.6,3);
INSERT INTO operation_compte VALUES ('debit',57,'2016-03-28 15:05:34',553.5,3);
INSERT INTO operation_compte VALUES ('credit',58,'2016-03-28 15:05:34',413,3);
INSERT INTO operation_compte VALUES ('debit',59,'2016-03-28 15:05:34',819.9,3);
INSERT INTO operation_compte VALUES ('credit',60,'2016-03-28 15:05:34',1386.9,3);
INSERT INTO operation_compte VALUES ('debit',61,'2016-03-28 15:05:34',990.5,4);
INSERT INTO operation_compte VALUES ('credit',62,'2016-03-28 15:05:34',1493.4,4);
INSERT INTO operation_compte VALUES ('debit',63,'2016-03-28 15:05:34',324.4,4);
INSERT INTO operation_compte VALUES ('credit',64,'2016-03-28 15:05:34',327.2,4);
INSERT INTO operation_compte VALUES ('debit',65,'2016-03-28 15:05:34',909.3,4);
INSERT INTO operation_compte VALUES ('credit',66,'2016-03-28 15:05:34',1110.6,4);
INSERT INTO operation_compte VALUES ('debit',67,'2016-03-28 15:05:34',1135.4,4);
INSERT INTO operation_compte VALUES ('credit',68,'2016-03-28 15:05:34',874.9,4);
INSERT INTO operation_compte VALUES ('debit',69,'2016-03-28 15:05:34',1191.8,4);
INSERT INTO operation_compte VALUES ('credit',70,'2016-03-28 15:05:34',1236.6,4);
INSERT INTO operation_compte VALUES ('debit',71,'2016-03-28 15:05:34',1469.1,4);
INSERT INTO operation_compte VALUES ('credit',72,'2016-03-28 15:05:34',1275.6,4);
INSERT INTO operation_compte VALUES ('debit',73,'2016-03-28 15:05:34',1181.8,4);
INSERT INTO operation_compte VALUES ('credit',74,'2016-03-28 15:05:34',977.6,4);
INSERT INTO operation_compte VALUES ('debit',75,'2016-03-28 15:05:34',1295.9,4);
INSERT INTO operation_compte VALUES ('credit',76,'2016-03-28 15:05:34',483.6,4);
INSERT INTO operation_compte VALUES ('debit',77,'2016-03-28 15:05:34',1016.8,4);
INSERT INTO operation_compte VALUES ('credit',78,'2016-03-28 15:05:34',256.2,4);
INSERT INTO operation_compte VALUES ('debit',79,'2016-03-28 15:05:34',1019.8,4);
INSERT INTO operation_compte VALUES ('credit',80,'2016-03-28 15:05:34',1245,4);
INSERT INTO operation_compte VALUES ('debit',81,'2016-03-28 15:05:34',1273.6,5);
INSERT INTO operation_compte VALUES ('credit',82,'2016-03-28 15:05:34',779.8,5);
INSERT INTO operation_compte VALUES ('debit',83,'2016-03-28 15:05:34',238.4,5);
INSERT INTO operation_compte VALUES ('credit',84,'2016-03-28 15:05:34',1298,5);
INSERT INTO operation_compte VALUES ('debit',85,'2016-03-28 15:05:34',329.5,5);
INSERT INTO operation_compte VALUES ('credit',86,'2016-03-28 15:05:34',1485.5,5);
INSERT INTO operation_compte VALUES ('debit',87,'2016-03-28 15:05:34',509.4,5);
INSERT INTO operation_compte VALUES ('credit',88,'2016-03-28 15:05:34',1090,5);
INSERT INTO operation_compte VALUES ('debit',89,'2016-03-28 15:05:34',555.1,5);
INSERT INTO operation_compte VALUES ('credit',90,'2016-03-28 15:05:34',1210.4,5);
INSERT INTO operation_compte VALUES ('debit',91,'2016-03-28 15:05:34',1282.7,5);
INSERT INTO operation_compte VALUES ('credit',92,'2016-03-28 15:05:34',926.5,5);
INSERT INTO operation_compte VALUES ('debit',93,'2016-03-28 15:05:34',586.9,5);
INSERT INTO operation_compte VALUES ('credit',94,'2016-03-28 15:05:34',179.5,5);
INSERT INTO operation_compte VALUES ('debit',95,'2016-03-28 15:05:34',567.9,5);
INSERT INTO operation_compte VALUES ('credit',96,'2016-03-28 15:05:34',1026.3,5);
INSERT INTO operation_compte VALUES ('debit',97,'2016-03-28 15:05:34',1485.9,5);
INSERT INTO operation_compte VALUES ('credit',98,'2016-03-28 15:05:34',53.7,5);
INSERT INTO operation_compte VALUES ('debit',99,'2016-03-28 15:05:34',983.6,5);
INSERT INTO operation_compte VALUES ('credit',100,'2016-03-28 15:05:34',63.8,5);
INSERT INTO operation_compte VALUES ('debit',101,'2016-03-28 15:05:34',564.6,6);
INSERT INTO operation_compte VALUES ('credit',102,'2016-03-28 15:05:34',720.5,6);
INSERT INTO operation_compte VALUES ('debit',103,'2016-03-28 15:05:34',89.7,6);
INSERT INTO operation_compte VALUES ('credit',104,'2016-03-28 15:05:34',1435,6);
INSERT INTO operation_compte VALUES ('debit',105,'2016-03-28 15:05:34',1066.6,6);
INSERT INTO operation_compte VALUES ('credit',106,'2016-03-28 15:05:34',251.5,6);
INSERT INTO operation_compte VALUES ('debit',107,'2016-03-28 15:05:34',1322.8,6);
INSERT INTO operation_compte VALUES ('credit',108,'2016-03-28 15:05:34',680.2,6);
INSERT INTO operation_compte VALUES ('debit',109,'2016-03-28 15:05:34',703.6,6);
INSERT INTO operation_compte VALUES ('credit',110,'2016-03-28 15:05:34',1485.9,6);
INSERT INTO operation_compte VALUES ('debit',111,'2016-03-28 15:05:34',955.4,6);
INSERT INTO operation_compte VALUES ('credit',112,'2016-03-28 15:05:34',1250.5,6);
INSERT INTO operation_compte VALUES ('debit',113,'2016-03-28 15:05:34',1297.9,6);
INSERT INTO operation_compte VALUES ('credit',114,'2016-03-28 15:05:34',1034.1,6);
INSERT INTO operation_compte VALUES ('debit',115,'2016-03-28 15:05:34',761.5,6);
INSERT INTO operation_compte VALUES ('credit',116,'2016-03-28 15:05:34',1092.8,6);
INSERT INTO operation_compte VALUES ('debit',117,'2016-03-28 15:05:34',945.5,6);
INSERT INTO operation_compte VALUES ('credit',118,'2016-03-28 15:05:34',1125.6,6);
INSERT INTO operation_compte VALUES ('debit',119,'2016-03-28 15:05:34',1014.7,6);
INSERT INTO operation_compte VALUES ('credit',120,'2016-03-28 15:05:34',873.7,6);
INSERT INTO operation_compte VALUES ('debit',121,'2016-03-28 15:05:34',1201.1,7);
INSERT INTO operation_compte VALUES ('credit',122,'2016-03-28 15:05:34',151.5,7);
INSERT INTO operation_compte VALUES ('debit',123,'2016-03-28 15:05:34',1051,7);
INSERT INTO operation_compte VALUES ('credit',124,'2016-03-28 15:05:34',1050.4,7);
INSERT INTO operation_compte VALUES ('debit',125,'2016-03-28 15:05:34',1295,7);
INSERT INTO operation_compte VALUES ('credit',126,'2016-03-28 15:05:34',476.8,7);
INSERT INTO operation_compte VALUES ('debit',127,'2016-03-28 15:05:34',416.7,7);
INSERT INTO operation_compte VALUES ('credit',128,'2016-03-28 15:05:34',428.9,7);
INSERT INTO operation_compte VALUES ('debit',129,'2016-03-28 15:05:34',826.4,7);
INSERT INTO operation_compte VALUES ('credit',130,'2016-03-28 15:05:34',1119.8,7);
INSERT INTO operation_compte VALUES ('debit',131,'2016-03-28 15:05:34',1071.2,7);
INSERT INTO operation_compte VALUES ('credit',132,'2016-03-28 15:05:34',336.4,7);
INSERT INTO operation_compte VALUES ('debit',133,'2016-03-28 15:05:34',1224.9,7);
INSERT INTO operation_compte VALUES ('credit',134,'2016-03-28 15:05:34',212,7);
INSERT INTO operation_compte VALUES ('debit',135,'2016-03-28 15:05:34',244.3,7);
INSERT INTO operation_compte VALUES ('credit',136,'2016-03-28 15:05:34',1058.5,7);
INSERT INTO operation_compte VALUES ('debit',137,'2016-03-28 15:05:34',53,7);
INSERT INTO operation_compte VALUES ('credit',138,'2016-03-28 15:05:34',266.9,7);
INSERT INTO operation_compte VALUES ('debit',139,'2016-03-28 15:05:34',345.3,7);
INSERT INTO operation_compte VALUES ('credit',140,'2016-03-28 15:05:34',272.1,7);
INSERT INTO operation_compte VALUES ('debit',141,'2016-03-28 15:05:34',414.7,8);
INSERT INTO operation_compte VALUES ('credit',142,'2016-03-28 15:05:34',698.8,8);
INSERT INTO operation_compte VALUES ('debit',143,'2016-03-28 15:05:34',1289,8);
INSERT INTO operation_compte VALUES ('credit',144,'2016-03-28 15:05:34',823.8,8);
INSERT INTO operation_compte VALUES ('debit',145,'2016-03-28 15:05:34',856.8,8);
INSERT INTO operation_compte VALUES ('credit',146,'2016-03-28 15:05:34',741.1,8);
INSERT INTO operation_compte VALUES ('debit',147,'2016-03-28 15:05:34',751.2,8);
INSERT INTO operation_compte VALUES ('credit',148,'2016-03-28 15:05:34',1375.6,8);
INSERT INTO operation_compte VALUES ('debit',149,'2016-03-28 15:05:34',687.4,8);
INSERT INTO operation_compte VALUES ('credit',150,'2016-03-28 15:05:34',417.2,8);
INSERT INTO operation_compte VALUES ('debit',151,'2016-03-28 15:05:34',673,8);
INSERT INTO operation_compte VALUES ('credit',152,'2016-03-28 15:05:34',1154.5,8);
INSERT INTO operation_compte VALUES ('debit',153,'2016-03-28 15:05:34',1101.4,8);
INSERT INTO operation_compte VALUES ('credit',154,'2016-03-28 15:05:34',520.8,8);
INSERT INTO operation_compte VALUES ('debit',155,'2016-03-28 15:05:34',1326.1,8);
INSERT INTO operation_compte VALUES ('credit',156,'2016-03-28 15:05:34',1306.5,8);
INSERT INTO operation_compte VALUES ('debit',157,'2016-03-28 15:05:34',384.8,8);
INSERT INTO operation_compte VALUES ('credit',158,'2016-03-28 15:05:34',162.8,8);
INSERT INTO operation_compte VALUES ('debit',159,'2016-03-28 15:05:34',904,8);
INSERT INTO operation_compte VALUES ('credit',160,'2016-03-28 15:05:34',1165.5,8);
INSERT INTO operation_compte VALUES ('debit',161,'2016-03-28 15:05:34',1276.7,9);
INSERT INTO operation_compte VALUES ('credit',162,'2016-03-28 15:05:34',834.2,9);
INSERT INTO operation_compte VALUES ('debit',163,'2016-03-28 15:05:34',935.9,9);
INSERT INTO operation_compte VALUES ('credit',164,'2016-03-28 15:05:34',603.6,9);
INSERT INTO operation_compte VALUES ('debit',165,'2016-03-28 15:05:34',1296.2,9);
INSERT INTO operation_compte VALUES ('credit',166,'2016-03-28 15:05:34',1131.9,9);
INSERT INTO operation_compte VALUES ('debit',167,'2016-03-28 15:05:34',1321.4,9);
INSERT INTO operation_compte VALUES ('credit',168,'2016-03-28 15:05:34',1035.4,9);
INSERT INTO operation_compte VALUES ('debit',169,'2016-03-28 15:05:34',990.5,9);
INSERT INTO operation_compte VALUES ('credit',170,'2016-03-28 15:05:34',779.5,9);
INSERT INTO operation_compte VALUES ('debit',171,'2016-03-28 15:05:34',1456.4,9);
INSERT INTO operation_compte VALUES ('credit',172,'2016-03-28 15:05:34',95.9,9);
INSERT INTO operation_compte VALUES ('debit',173,'2016-03-28 15:05:34',632.4,9);
INSERT INTO operation_compte VALUES ('credit',174,'2016-03-28 15:05:34',366.2,9);
INSERT INTO operation_compte VALUES ('debit',175,'2016-03-28 15:05:34',767.1,9);
INSERT INTO operation_compte VALUES ('credit',176,'2016-03-28 15:05:34',13.8,9);
INSERT INTO operation_compte VALUES ('debit',177,'2016-03-28 15:05:34',1390.2,9);
INSERT INTO operation_compte VALUES ('credit',178,'2016-03-28 15:05:34',1306,9);
INSERT INTO operation_compte VALUES ('debit',179,'2016-03-28 15:05:34',1486.2,9);
INSERT INTO operation_compte VALUES ('credit',180,'2016-03-28 15:05:34',1241.9,9);
INSERT INTO operation_compte VALUES ('debit',181,'2016-03-28 15:05:34',907.2,10);
INSERT INTO operation_compte VALUES ('credit',182,'2016-03-28 15:05:34',904.6,10);
INSERT INTO operation_compte VALUES ('debit',183,'2016-03-28 15:05:34',190.9,10);
INSERT INTO operation_compte VALUES ('credit',184,'2016-03-28 15:05:34',500.8,10);
INSERT INTO operation_compte VALUES ('debit',185,'2016-03-28 15:05:34',65.7,10);
INSERT INTO operation_compte VALUES ('credit',186,'2016-03-28 15:05:34',93.1,10);
INSERT INTO operation_compte VALUES ('debit',187,'2016-03-28 15:05:34',990.4,10);
INSERT INTO operation_compte VALUES ('credit',188,'2016-03-28 15:05:34',29.2,10);
INSERT INTO operation_compte VALUES ('debit',189,'2016-03-28 15:05:34',470,10);
INSERT INTO operation_compte VALUES ('credit',190,'2016-03-28 15:05:34',367.7,10);
INSERT INTO operation_compte VALUES ('debit',191,'2016-03-28 15:05:34',273.9,10);
INSERT INTO operation_compte VALUES ('credit',192,'2016-03-28 15:05:34',18.2,10);
INSERT INTO operation_compte VALUES ('debit',193,'2016-03-28 15:05:34',1364,10);
INSERT INTO operation_compte VALUES ('credit',194,'2016-03-28 15:05:34',1239.9,10);
INSERT INTO operation_compte VALUES ('debit',195,'2016-03-28 15:05:34',144,10);
INSERT INTO operation_compte VALUES ('credit',196,'2016-03-28 15:05:34',1440.5,10);
INSERT INTO operation_compte VALUES ('debit',197,'2016-03-28 15:05:34',1302,10);
INSERT INTO operation_compte VALUES ('credit',198,'2016-03-28 15:05:34',74.3,10);
INSERT INTO operation_compte VALUES ('debit',199,'2016-03-28 15:05:34',29.1,10);
INSERT INTO operation_compte VALUES ('credit',200,'2016-03-28 15:05:34',1264.3,10);



--
-- Dumping events for database 'bdd_banque'
--

--
-- Dumping routines for database 'bdd_banque'
--

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed
