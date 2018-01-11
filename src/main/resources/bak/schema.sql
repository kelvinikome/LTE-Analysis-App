-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: lte_analysis_db
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `filedata`
--

DROP TABLE IF EXISTS `filedata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filedata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `authentication_request_times` varchar(255) DEFAULT NULL,
  `authentication_request_times_per_subscriber` varchar(255) DEFAULT NULL,
  `authentication_success_times` varchar(255) DEFAULT NULL,
  `average_attached_users` varchar(255) DEFAULT NULL,
  `average_bearer_number` varchar(255) DEFAULT NULL,
  `average_dedicated_bearer_number` varchar(255) DEFAULT NULL,
  `average_pdn_connection_number` varchar(255) DEFAULT NULL,
  `downlink_message_kbytes_sent_interface` varchar(255) DEFAULT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  `intra_based_handover_request_times` varchar(255) DEFAULT NULL,
  `intra_based_handover_success_times` varchar(255) DEFAULT NULL,
  `intramme_combined_tau_success_rate` varchar(255) DEFAULT NULL,
  `intramme_handover_request_times_per_subscriber` varchar(255) DEFAULT NULL,
  `intramme_handover_success_rate` varchar(255) DEFAULT NULL,
  `intramme_tau_success_rate` varchar(255) DEFAULT NULL,
  `ip_packets_received` varchar(255) DEFAULT NULL,
  `maximum_attached_users` varchar(255) DEFAULT NULL,
  `maximum_attached_users_at_ecmconnected_status` varchar(255) DEFAULT NULL,
  `maximum_attached_users_at_ecmidle_status` varchar(255) DEFAULT NULL,
  `maximum_bearer_number` varchar(255) DEFAULT NULL,
  `maximum_pdn_connection_number` varchar(255) DEFAULT NULL,
  `ne_name` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `packet_paging_request_times_per_subscriber` varchar(255) DEFAULT NULL,
  `packet_paging_success_rate` varchar(255) DEFAULT NULL,
  `paging_request_times` varchar(255) DEFAULT NULL,
  `paging_success_times` varchar(255) DEFAULT NULL,
  `period` varchar(255) DEFAULT NULL,
  `period_tau_request_times` varchar(255) DEFAULT NULL,
  `period_tau_success_times` varchar(255) DEFAULT NULL,
  `periodic_tau_request_times_per_subscriber` varchar(255) DEFAULT NULL,
  `real_time_attached_users` varchar(255) DEFAULT NULL,
  `real_time_attached_users_at_ecmconnected_status` varchar(255) DEFAULT NULL,
  `real_time_attached_users_at_ecmidle_status` varchar(255) DEFAULT NULL,
  `real_time_pdn_connection_number` varchar(255) DEFAULT NULL,
  `sae_bearer_setup_request_times` varchar(255) DEFAULT NULL,
  `sae_bearer_setup_success_times` varchar(255) DEFAULT NULL,
  `security_mode_command_request_times` varchar(255) DEFAULT NULL,
  `security_mode_command_success_rate` varchar(255) DEFAULT NULL,
  `security_mode_command_success_times` varchar(255) DEFAULT NULL,
  `service_request_success_times` varchar(255) DEFAULT NULL,
  `service_request_times` varchar(255) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `uplink_message_kbytes_received_interface` varchar(255) DEFAULT NULL,
  `whole_system` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filedata`
--

LOCK TABLES `filedata` WRITE;
/*!40000 ALTER TABLE `filedata` DISABLE KEYS */;
/*!40000 ALTER TABLE `filedata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `files`
--

DROP TABLE IF EXISTS `files`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `files` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `files`
--

LOCK TABLES `files` WRITE;
/*!40000 ALTER TABLE `files` DISABLE KEYS */;
/*!40000 ALTER TABLE `files` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `auth_token` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `login` bit(1) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,NULL,'kay@kay.com','this','lastname',NULL,'please',7777,'kay');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-10 17:57:29

