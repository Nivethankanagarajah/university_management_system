-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2018 at 07:48 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `form`
--

-- --------------------------------------------------------

--
-- Table structure for table `degree`
--

CREATE TABLE `degree` (
  `DCode` varchar(10) NOT NULL,
  `DName` varchar(50) NOT NULL,
  `Years` int(5) NOT NULL,
  `Faculty` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `degree`
--

INSERT INTO `degree` (`DCode`, `DName`, `Years`, `Faculty`) VALUES
('d1', 'BSc in Computer Science ', 3, 'School of Computing'),
('d10', 'Postgraduate Diploma in Business Management ', 1, 'School of Business'),
('d11', 'Master of Business Administration ', 2, 'School of Business'),
('d12', 'Postgraduate Diploma in Computer Networks', 1, 'School of Computing'),
('d2', 'BSc in Information System', 3, 'School of Computing'),
('d3', 'BSc(Hons) in Computer Science ', 4, 'School of Computing'),
('d4', 'BSc(Hons) in Information System', 4, 'School of Computing'),
('d5', 'BSc in Business Management', 3, 'School of Business'),
('d6', 'BM in Accounting and Finance', 3, 'School of Business'),
('d7', 'BSc(Hons) in Business Management', 4, 'School of Business'),
('d8', 'BM(Hons)in Accounting and Finance', 4, 'School of Business'),
('d9', 'BSc (Hons) Computer Systems Engineering', 4, 'School of Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `instructors`
--

CREATE TABLE `instructors` (
  `Full_Name` varchar(50) NOT NULL,
  `Instructors_Id` varchar(20) NOT NULL,
  `Faculty` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact_No` int(20) NOT NULL,
  `Birth_Of_Date` date NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Subject` varchar(50) NOT NULL,
  `Subject_Id` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Qualification` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instructors`
--

INSERT INTO `instructors` (`Full_Name`, `Instructors_Id`, `Faculty`, `Email`, `Address`, `Contact_No`, `Birth_Of_Date`, `Gender`, `Subject`, `Subject_Id`, `Type`, `Qualification`) VALUES
('fg', '098', 'School Of Business', 'gfh', 'gfyh', 3554646, '1998-09-08', 'male', 'gdfg', 'geyh', 'under graduate', 'hydh'),
('hghfgf', '8jiy', 'School Of Business', 'kfghkh', 'gjkogko', 696968, '1996-06-08', 'male', 'kmghk', 'y6', 'post graduate', 'bsc com');

-- --------------------------------------------------------

--
-- Table structure for table `lecturers`
--

CREATE TABLE `lecturers` (
  `Full_name` varchar(50) NOT NULL,
  `Lecturers_Id` varchar(40) NOT NULL,
  `Faculty` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `contact_no` int(20) NOT NULL,
  `Birth_of_date` date NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Subject` varchar(100) NOT NULL,
  `Subject_Id` varchar(20) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Qualification` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturers`
--

INSERT INTO `lecturers` (`Full_name`, `Lecturers_Id`, `Faculty`, `email`, `Address`, `contact_no`, `Birth_of_date`, `Gender`, `Subject`, `Subject_Id`, `Type`, `Qualification`) VALUES
('igjfigji', 'njfbfnjb', 'School Of Business', 'bvcnvn', 'bvnvn', 112324, '1998-02-22', 'Male', 'gfgdh', 'dghdfh', 'under graduate', 'jsjgggkngkdf');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `user_id` varchar(40) NOT NULL,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`user_id`, `user_name`, `password`) VALUES
('1', 'nive', '1222'),
('2', 'mythi', '1222');

-- --------------------------------------------------------

--
-- Table structure for table `post_stu_detail`
--

CREATE TABLE `post_stu_detail` (
  `Index_No` varchar(40) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Contact_no` int(12) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Degree` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Faculty` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Date_of_birth` date NOT NULL,
  `Qualification` varchar(50) NOT NULL,
  `Institute` varchar(50) NOT NULL,
  `year` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_detail`
--

CREATE TABLE `student_detail` (
  `Index_No` varchar(10) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Contact No` int(10) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Degree` varchar(100) NOT NULL,
  `Faculty` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Date Of Birth` date NOT NULL,
  `A/L Result` varchar(50) NOT NULL,
  `Rank` int(10) NOT NULL,
  `Semester` int(10) NOT NULL,
  `Gender` varchar(40) NOT NULL,
  `Intake` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_detail`
--

INSERT INTO `student_detail` (`Index_No`, `Name`, `Contact No`, `Email`, `Degree`, `Faculty`, `Address`, `Date Of Birth`, `A/L Result`, `Rank`, `Semester`, `Gender`, `Intake`) VALUES
('2821', 'nidtt', 99858, 'dkjfdjgfjfg', 'BM In Accounting And Finance', 'School Of Business', 'fjgkfkjgjgi', '1996-03-12', 'fhfhh', 22, 1, 'male', 'July'),
('4535', 'ghjgfjj', 34535, 'hgjgmhv', 'BSC in Business Management', 'School Of Business', 'fjvjbvjvck', '1996-08-23', 'bvnvn', 4, 2, 'male', 'July'),
('523524', 'dcdcdcdcdcd', 23424, 'bgfhgfng', 'BSC in Information System', 'School Of Business', 'brghgb', '1996-04-12', 'ghdf', 1, 2, 'female', ''),
('5677', 'hjgk', 6870, 'fglkkl/', 'BSC in Computer Science', 'School of Computing', 'fhjhlkl;k', '1996-07-19', 'kopokfj', 557, 2, 'female', ''),
('56778', 'hjgk', 6870, 'fglkkl/', 'BSC in Computer Science', 'School of Computing', 'fhjhlkl;k', '1996-07-19', 'kopokfj', 557, 2, 'female', ''),
('jhdfy', 'frgveffr', 566, '565gthgfh', 'BSC(Hons) In Networking Engineering', 'School Of Engineering', 'jdbfjdbf', '1998-05-05', 'aaa', 4, 5, 'female', 'July');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `SCode` varchar(20) NOT NULL,
  `SName` varchar(50) NOT NULL,
  `DCode` varchar(10) NOT NULL,
  `Credits` int(5) NOT NULL,
  `Fees` double NOT NULL,
  `Semester` int(10) NOT NULL,
  `NoOfAssignments` int(10) NOT NULL,
  `Percentage` int(100) NOT NULL,
  `Faculty` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`SCode`, `SName`, `DCode`, `Credits`, `Fees`, `Semester`, `NoOfAssignments`, `Percentage`, `Faculty`) VALUES
('1001', 'Laboratory', 'd2', 1, 2500, 1, 3, 0, 'School of Computing'),
('1002', 'Programming', 'd2', 3, 4000, 1, 3, 0, 'School of Computing'),
('1003', 'Mathematics 1', 'd2', 3, 4000, 1, 3, 0, 'School of Computing'),
('1004', 'System Design 1', 'd2', 3, 4000, 1, 4, 0, 'School of Computing'),
('1005', 'Computer Systes', 'd2', 2, 2500, 1, 5, 0, 'School of Computing'),
('1006', 'Database', 'd2', 2, 2500, 1, 3, 0, 'School of Computing'),
('1007', 'Business Analysis', 'd2', 2, 2500, 1, 3, 0, 'School of Computing'),
('1011', 'DSA 1', 'd1', 3, 4000, 1, 4, 0, 'School of Computing'),
('1012', 'Programming 1', 'd1', 3, 4000, 1, 2, 0, 'School of Computing'),
('1013', 'Database 1', 'd1', 3, 4000, 1, 5, 0, 'School of Computing'),
('1014', 'Mathematics 1', 'd1', 2, 2500, 1, 4, 0, 'School of Computing'),
('1015', 'Computer Systems', 'd1', 2, 2500, 1, 3, 0, 'School of Computing'),
('1016', 'Laboratory', 'd1', 1, 2500, 1, 2, 0, 'School of Computing'),
('1017', 'Basics', 'd1', 2, 2500, 1, 4, 0, 'School of Computing'),
('1021', 'DSA 2', 'd1', 3, 4000, 2, 2, 0, 'School of Computing'),
('1022', 'Database 2', 'd1', 3, 4000, 2, 3, 0, 'School of Computing'),
('1023', 'Programming 2', 'd1', 3, 4000, 2, 5, 0, 'School of Computing'),
('1024', 'Statistics', 'd1', 2, 2500, 2, 4, 0, 'School of Computing'),
('1025', 'Discrete Maths', 'd1', 3, 4000, 2, 2, 0, 'School of Computing'),
('1201', 'Programming 2', 'd2', 3, 4000, 2, 3, 0, 'School of Computing'),
('1202', 'Mathematics 2', 'd2', 3, 4000, 2, 5, 0, 'School of Computing'),
('1203', 'System Design 2', 'd2', 3, 4000, 2, 4, 0, 'School of Computing'),
('1204', 'SAD 1', 'd2', 2, 2500, 2, 3, 0, 'School of Computing'),
('1205', 'Statistics', 'd2', 2, 2500, 2, 2, 0, 'School of Computing'),
('1206', 'Laboratory', 'd2', 2, 2500, 2, 2, 0, 'School of Computing'),
('1207', 'PPM', 'd2', 2, 2500, 2, 4, 0, 'School of Computing'),
('2001', 'Programming 3', 'd2', 3, 4000, 3, 3, 0, 'School of Computing'),
('2002', 'Mathematics', 'd2', 3, 2500, 3, 4, 0, 'School of Computing'),
('2003', 'System Design 3', 'd2', 3, 4000, 3, 3, 0, 'School of Computing'),
('2004', 'Enhancement', 'd2', 2, 2500, 3, 2, 0, 'School of Computing'),
('2005', 'Discrete Maths', 'd2', 2, 2500, 3, 3, 0, 'School of Computing'),
('2006', 'SAD 2', 'd2', 2, 2500, 3, 4, 0, 'School of Computing'),
('2007', 'Management', 'd2', 2, 4000, 3, 2, 0, 'School of Computing'),
('2011', 'DSA 3', 'd1', 3, 2500, 3, 3, 0, 'School of Computing'),
('2012', 'Programming 3', 'd1', 3, 4000, 3, 3, 0, 'School of Computing'),
('2013', 'Database 3', 'd1', 3, 4000, 3, 3, 0, 'School of Computing'),
('2014', 'SE', 'd1', 2, 2500, 3, 4, 0, 'School of Computing'),
('2015', 'Networking', 'd1', 2, 4000, 3, 3, 0, 'School of Computing'),
('2016', 'Enhancement', 'd1', 2, 2500, 3, 2, 0, 'School of Computing'),
('2017', 'App Laboratory', 'd1', 2, 4000, 3, 4, 0, 'School of Computing'),
('p1000', 'Accounting for Decision Makers', 'd11', 3, 2500, 1, 3, 0, 'School of Business'),
('p1001', 'Business Economics ', 'd11', 3, 4000, 1, 2, 0, 'School of Business'),
('p1002', ' Enterprise Management', 'd11', 3, 4000, 1, 3, 0, 'School of Business'),
('p1003', 'Quantitative Methods for Management ', 'd11', 3, 4000, 1, 4, 0, 'School of Business'),
('p1004', 'Human Resources Management ', 'd11', 2, 2500, 1, 5, 0, 'School of Business'),
('p1005', 'Marketing Management Module', 'd11', 2, 2500, 1, 3, 0, 'School of Business'),
('p1006', 'Managing Operations in Business', 'd11', 2, 2500, 1, 4, 0, 'School of Business'),
('p1007', ' Strategic Management ', 'd11', 2, 2500, 1, 3, 0, 'School of Business'),
('p1010', ' Accounting for Decision Making', 'd10', 3, 4000, 1, 2, 0, 'School of Business'),
('p1011', ' Managing People', 'd10', 3, 4000, 1, 4, 0, 'School of Business'),
('p1012', 'Organizational Behavior', 'd10', 3, 4000, 1, 3, 0, 'School of Business'),
('p1013', ' Business Communication', 'd10', 3, 2500, 1, 5, 0, 'School of Business'),
('p1014', 'Marketing Management ', 'd10', 2, 2500, 1, 2, 0, 'School of Business'),
('p1015', 'Financial Management ', 'd10', 2, 2500, 1, 3, 0, 'School of Business'),
('p1016', 'Business Statistics', 'd10', 2, 2500, 1, 5, 0, 'School of Business'),
('p1017', 'Management Information Systems ', 'd10', 2, 2500, 1, 3, 0, 'School of Business');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `degree`
--
ALTER TABLE `degree`
  ADD PRIMARY KEY (`DCode`),
  ADD KEY `DCode` (`DCode`),
  ADD KEY `DCode_2` (`DCode`);

--
-- Indexes for table `lecturers`
--
ALTER TABLE `lecturers`
  ADD PRIMARY KEY (`Lecturers_Id`);

--
-- Indexes for table `post_stu_detail`
--
ALTER TABLE `post_stu_detail`
  ADD PRIMARY KEY (`Index_No`);

--
-- Indexes for table `student_detail`
--
ALTER TABLE `student_detail`
  ADD PRIMARY KEY (`Index_No`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`SCode`) USING BTREE,
  ADD KEY `Foriegn` (`DCode`) USING BTREE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
