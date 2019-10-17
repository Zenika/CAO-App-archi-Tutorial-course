-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           10.1.32-MariaDB - mariadb.org binary distribution
-- SE du serveur:                Win32
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Listage de la structure de la base pour unicorn_renting
CREATE DATABASE IF NOT EXISTS `unicorn_renting` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `unicorn_renting`;

-- Listage de la structure de la table unicorn_renting. customer
CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` bigint(20) NOT NULL,
  `last_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `first_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `phone_number` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `postal_code` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `has_rented` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table unicorn_renting. integrity_check
CREATE TABLE IF NOT EXISTS `integrity_check` (
  `integrity_check_id` bigint(20) NOT NULL,
  `checking_date` datetime NOT NULL,
  `damage_fees` float NOT NULL,
  `staff_id` bigint(20) NOT NULL,
  PRIMARY KEY (`integrity_check_id`),
  KEY `fk_staff_id` (`staff_id`),
  CONSTRAINT `fk_staff_id` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table unicorn_renting. invoicing
CREATE TABLE IF NOT EXISTS `invoicing` (
  `invoicing_id` bigint(20) NOT NULL,
  `fees` float NOT NULL,
  `payment_date` datetime NOT NULL,
  PRIMARY KEY (`invoicing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table unicorn_renting. product
CREATE TABLE IF NOT EXISTS `product` (
  `product_id` bigint(20) NOT NULL,
  `name_product` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `is_rented` int(11) NOT NULL DEFAULT '0',
  `healthy` int(11) DEFAULT '1',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table unicorn_renting. renting
CREATE TABLE IF NOT EXISTS `renting` (
  `renting_id` bigint(20) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime DEFAULT NULL,
  `customer_id` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `integrity_id` bigint(20) DEFAULT NULL,
  `invoicing_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`renting_id`),
  KEY `fk_customer_id` (`customer_id`),
  KEY `fk_product_id` (`product_id`),
  KEY `fk_integrity_id` (`integrity_id`),
  KEY `fk_invoicing_id` (`invoicing_id`),
  CONSTRAINT `fk_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`),
  CONSTRAINT `fk_integrity_id` FOREIGN KEY (`integrity_id`) REFERENCES `integrity_check` (`integrity_check_id`),
  CONSTRAINT `fk_invoicing_id` FOREIGN KEY (`invoicing_id`) REFERENCES `invoicing` (`invoicing_id`),
  CONSTRAINT `fk_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Les données exportées n'étaient pas sélectionnées.

-- Listage de la structure de la table unicorn_renting. staff
CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` bigint(20) NOT NULL,
  `last_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `first_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `login` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Les données exportées n'étaient pas sélectionnées.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
