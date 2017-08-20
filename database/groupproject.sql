-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 20, 2017 at 09:10 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `groupproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `applicant_details`
--

CREATE TABLE `applicant_details` (
  `idapplicant_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `gender` char(1) NOT NULL DEFAULT 'M',
  `address` text NOT NULL,
  `mobile_no` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `registered_date` date DEFAULT NULL,
  `property_id` int(11) NOT NULL,
  `property_property_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `assesment`
--

CREATE TABLE `assesment` (
  `assesment_id` int(11) NOT NULL,
  `reason` text,
  `relationship_owner` varchar(45) DEFAULT NULL,
  `quotation_id` varchar(45) DEFAULT NULL,
  `quotation_id1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `division`
--

CREATE TABLE `division` (
  `no` int(11) NOT NULL,
  `name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `login_detail`
--

CREATE TABLE `login_detail` (
  `login_id` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `permission_level` int(11) DEFAULT NULL,
  `officers_details_user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `login_has_progress`
--

CREATE TABLE `login_has_progress` (
  `login_login_id` int(11) NOT NULL,
  `progress_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `officers_details`
--

CREATE TABLE `officers_details` (
  `user_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `designation` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `progress`
--

CREATE TABLE `progress` (
  `level_no` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `id` int(11) NOT NULL,
  `property_property_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `property`
--

CREATE TABLE `property` (
  `property_id` int(11) NOT NULL,
  `applicant_id` int(11) NOT NULL,
  `assenment_no` int(11) DEFAULT NULL,
  `road_name` varchar(45) DEFAULT NULL,
  `surveyor_no` int(11) DEFAULT NULL,
  `lot_no` varchar(45) DEFAULT NULL,
  `assesment_assesment_id` int(11) NOT NULL,
  `division_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `quotation`
--

CREATE TABLE `quotation` (
  `id` int(11) NOT NULL,
  `duration` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applicant_details`
--
ALTER TABLE `applicant_details`
  ADD PRIMARY KEY (`idapplicant_id`),
  ADD KEY `fk_applicant_details_property_idx` (`property_property_id`);

--
-- Indexes for table `assesment`
--
ALTER TABLE `assesment`
  ADD PRIMARY KEY (`assesment_id`),
  ADD KEY `fk_assesment_quotation1_idx` (`quotation_id1`);

--
-- Indexes for table `division`
--
ALTER TABLE `division`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `login_detail`
--
ALTER TABLE `login_detail`
  ADD PRIMARY KEY (`login_id`,`officers_details_user_id`),
  ADD KEY `fk_login_detail_officers_details1_idx` (`officers_details_user_id`);

--
-- Indexes for table `login_has_progress`
--
ALTER TABLE `login_has_progress`
  ADD PRIMARY KEY (`login_login_id`,`progress_id`),
  ADD KEY `fk_login_has_progress_progress1_idx` (`progress_id`),
  ADD KEY `fk_login_has_progress_login1_idx` (`login_login_id`);

--
-- Indexes for table `officers_details`
--
ALTER TABLE `officers_details`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `progress`
--
ALTER TABLE `progress`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_progress_property1_idx` (`property_property_id`);

--
-- Indexes for table `property`
--
ALTER TABLE `property`
  ADD PRIMARY KEY (`property_id`),
  ADD KEY `fk_property_assesment1_idx` (`assesment_assesment_id`),
  ADD KEY `fk_property_division1_idx` (`division_no`);

--
-- Indexes for table `quotation`
--
ALTER TABLE `quotation`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `applicant_details`
--
ALTER TABLE `applicant_details`
  MODIFY `idapplicant_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `property`
--
ALTER TABLE `property`
  MODIFY `property_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `applicant_details`
--
ALTER TABLE `applicant_details`
  ADD CONSTRAINT `fk_applicant_details_property` FOREIGN KEY (`property_property_id`) REFERENCES `property` (`property_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `assesment`
--
ALTER TABLE `assesment`
  ADD CONSTRAINT `fk_assesment_quotation1` FOREIGN KEY (`quotation_id1`) REFERENCES `mydb`.`quotation` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `login_detail`
--
ALTER TABLE `login_detail`
  ADD CONSTRAINT `fk_login_detail_officers_details1` FOREIGN KEY (`officers_details_user_id`) REFERENCES `officers_details` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `login_has_progress`
--
ALTER TABLE `login_has_progress`
  ADD CONSTRAINT `fk_login_has_progress_login1` FOREIGN KEY (`login_login_id`) REFERENCES `login_detail` (`login_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_login_has_progress_progress1` FOREIGN KEY (`progress_id`) REFERENCES `progress` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `progress`
--
ALTER TABLE `progress`
  ADD CONSTRAINT `fk_progress_property1` FOREIGN KEY (`property_property_id`) REFERENCES `property` (`property_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `property`
--
ALTER TABLE `property`
  ADD CONSTRAINT `fk_property_assesment1` FOREIGN KEY (`assesment_assesment_id`) REFERENCES `assesment` (`assesment_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_property_division1` FOREIGN KEY (`division_no`) REFERENCES `division` (`no`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
