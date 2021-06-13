-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2021 at 09:50 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_sales`
--

-- --------------------------------------------------------

--
-- Table structure for table `torder`
--

CREATE TABLE `torder` (
  `id` int(11) NOT NULL,
  `OrderNo` varchar(10) NOT NULL,
  `orderDesc` int(11) NOT NULL,
  `productId` int(11) NOT NULL DEFAULT '0',
  `QTY` int(11) NOT NULL DEFAULT '0',
  `IsActive` int(11) NOT NULL DEFAULT '0',
  `price` decimal(10,0) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `torder`
--

INSERT INTO `torder` (`id`, `OrderNo`, `orderDesc`, `productId`, `QTY`, `IsActive`, `price`) VALUES
(1, '1', 111111, 1, 2, 0, '60'),
(2, '12', 111, 1, 1, 0, '30');

-- --------------------------------------------------------

--
-- Table structure for table `tproductscategory`
--

CREATE TABLE `tproductscategory` (
  `id` int(11) NOT NULL,
  `CategoryDesc` varchar(50) NOT NULL,
  `IsActive` tinyint(4) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tproductscategory`
--

INSERT INTO `tproductscategory` (`id`, `CategoryDesc`, `IsActive`) VALUES
(1, 'Food', 0),
(2, 'Meat', 0),
(5, 'Test', 0),
(6, 'TEst2', 0),
(7, 'test3', 0),
(8, 'test4', 0),
(9, 'Test 2 Update', 0),
(10, '123123', 0),
(11, 'Test update', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tprouduct`
--

CREATE TABLE `tprouduct` (
  `id` int(11) NOT NULL,
  `productscategoryId` int(11) NOT NULL,
  `productcode` varchar(10) NOT NULL,
  `productdesc` varchar(150) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `unitdesc` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tprouduct`
--

INSERT INTO `tprouduct` (`id`, `productscategoryId`, `productcode`, `productdesc`, `price`, `unitdesc`) VALUES
(1, 1, '1', '2', '30', '40'),
(2, 1, '1', '2', '3', '4');

-- --------------------------------------------------------

--
-- Table structure for table `tusers`
--

CREATE TABLE `tusers` (
  `UserId` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `PhoneNumber` varchar(11) NOT NULL,
  `UserType` int(11) NOT NULL DEFAULT '0',
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tusers`
--

INSERT INTO `tusers` (`UserId`, `FirstName`, `LastName`, `Email`, `PhoneNumber`, `UserType`, `Password`) VALUES
(1, 'Mohammad', 'Mostajab', '112', '+3670742070', 1, '123'),
(2, '1', '2', '4', '5', 1, '333'),
(3, '1', '2', '4', '5', 0, '3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `torder`
--
ALTER TABLE `torder`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tproductscategory`
--
ALTER TABLE `tproductscategory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tprouduct`
--
ALTER TABLE `tprouduct`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tusers`
--
ALTER TABLE `tusers`
  ADD PRIMARY KEY (`UserId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `torder`
--
ALTER TABLE `torder`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tproductscategory`
--
ALTER TABLE `tproductscategory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tprouduct`
--
ALTER TABLE `tprouduct`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tusers`
--
ALTER TABLE `tusers`
  MODIFY `UserId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
