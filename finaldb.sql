-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 19, 2019 at 05:21 PM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `finaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
CREATE TABLE IF NOT EXISTS `user_details` (
  `user_firstname` tinytext NOT NULL,
  `user_lastname` tinytext NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_password` tinytext NOT NULL,
  `user_bdate` date NOT NULL,
  `email` varchar(80) NOT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`user_firstname`, `user_lastname`, `user_name`, `user_password`, `user_bdate`, `email`) VALUES
('Jeet', 'Shah', 'jeet_', 'Jeet@123', '2019-04-02', 'shreyansh.s@ahduni.edu.in'),
('Shreyansh', 'shah', 'shreyansh_', 'shreya', '2019-04-03', 'shreyansh_shah@yahoo.com'),
('Parth', 'PAtel', 'Parth_', 'Parth@123', '2019-04-03', 'shreyansh_shah@outlook.com'),
('shivam', 'lakhtariya', 'shivam', 'Shivam@123', '2019-04-01', 'shivam.l@ahduni.edu.in');

-- --------------------------------------------------------

--
-- Table structure for table `user_messages`
--

DROP TABLE IF EXISTS `user_messages`;
CREATE TABLE IF NOT EXISTS `user_messages` (
  `to_message` varchar(20) NOT NULL,
  `from_message` varchar(20) NOT NULL,
  `message_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `message` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_otp`
--

DROP TABLE IF EXISTS `user_otp`;
CREATE TABLE IF NOT EXISTS `user_otp` (
  `user_name` varchar(20) NOT NULL,
  `OTP` int(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_otp`
--

INSERT INTO `user_otp` (`user_name`, `OTP`) VALUES
('jeet_', 9133),
('shreyansh_', 8949),
('Parth_', 9133),
('shivam', 5151);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
