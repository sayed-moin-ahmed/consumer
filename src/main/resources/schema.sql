CREATE DATABASE `message` /*!40100 DEFAULT CHARACTER SET latin1 */;
CREATE TABLE `payload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;