-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2018 at 09:57 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mindfact`
--

-- --------------------------------------------------------

--
-- Table structure for table `choices`
--

CREATE TABLE `choices` (
  `question_id` int(11) NOT NULL,
  `letter` varchar(1) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL,
  `answer` varchar(500) NOT NULL,
  `correct` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `choices`
--

INSERT INTO `choices` (`question_id`, `letter`, `difficulty`, `answer`, `correct`) VALUES
(1, 'a', 'easy', 'Planning Commission', 0),
(1, 'b', 'easy', 'Reserve Bank of India', 0),
(1, 'c', 'easy', 'Central statistical organisation', 1),
(1, 'd', 'easy', 'Indian statistical Institute', 0),
(2, 'a', 'easy', 'Barley and rice', 0),
(2, 'b', 'easy', 'Milk and its products', 1),
(2, 'c', 'easy', 'Rice and pulses', 0),
(2, 'd', 'easy', 'Vegetables and fruits', 0),
(3, 'a', 'easy', 'Madhya Pradesh', 0),
(3, 'b', 'easy', 'West Bengal', 0),
(3, 'c', 'easy', 'Rajasthan', 0),
(3, 'd', 'easy', 'Odisha', 1),
(4, 'a', 'easy', 'wrought iron', 1),
(4, 'b', 'easy', 'steel', 0),
(4, 'c', 'easy', 'pig iron', 0),
(4, 'd', 'easy', 'nickel steel', 0),
(5, 'a', 'easy', 'Earthquakes', 0),
(5, 'b', 'easy', 'Rainfall', 0),
(5, 'c', 'easy', 'Ocean depth', 1),
(5, 'd', 'easy', 'Sound intensity', 0),
(23, 'a', 'easy', '2018', 0),
(23, 'b', 'easy', '2019', 1),
(23, 'c', 'easy', '2017', 0),
(23, 'd', 'easy', '2020', 0);

-- --------------------------------------------------------

--
-- Table structure for table `easyquestions`
--

CREATE TABLE `easyquestions` (
  `question_id` int(11) NOT NULL,
  `question` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL,
  `type` enum('multiple choice','enumeration','fill in the blanks','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `easyquestions`
--

INSERT INTO `easyquestions` (`question_id`, `question`, `difficulty`, `type`) VALUES
(1, 'National Income estimates in India are prepared by', 'easy', 'multiple choice'),
(2, 'The staple food of the Vedic Aryan was', 'easy', 'multiple choice'),
(3, '\r\nThe tropic of cancer does not pass through which of these Indian states ?', 'easy', 'multiple choice'),
(4, 'The purest form of iron is ', 'easy', 'multiple choice'),
(5, 'Fathometer is used to measure', 'easy', 'multiple choice'),
(6, 'Enumerate the colors of the philippine flag', 'easy', 'enumeration'),
(7, 'What are the 2 types of clocks', 'easy', 'enumeration'),
(8, 'Who are the 3 protagonist in the cartoon powerpuff girls?', 'easy', 'enumeration'),
(9, 'What are the 4 cardinal directions', 'easy', 'enumeration'),
(10, 'What are the 4 diagonal directions', 'easy', 'enumeration'),
(11, 'I ____ therefore i am\r\n-Rene Descartes', 'easy', 'fill in the blanks'),
(12, 'sugar _____ and everything nice', 'easy', 'fill in the blanks'),
(13, 'twinkle _____ little star', 'easy', 'fill in the blanks'),
(14, 'In the ______ God created the heavens and the earth.', 'easy', 'fill in the blanks'),
(15, 'The unexamined ____ is not worth living\r\n-Socrates', 'easy', 'fill in the blanks'),
(16, 'qweqweq', 'easy', 'enumeration'),
(17, 'Tom and ____', 'easy', 'fill in the blanks'),
(20, 'Winnie the ____', 'easy', 'fill in the blanks'),
(21, 'The 3 Philippines archipelago', 'easy', 'enumeration'),
(22, '1,2,3,4,__', 'easy', 'fill in the blanks'),
(23, 'What is the year next year?', 'easy', 'multiple choice'),
(24, 'The first 5 letters of the alphabets', 'easy', 'enumeration'),
(25, 'A you\'re adorable\r\nB you\'re so beautiful\r\nC you\'re so cute and full of ____', 'easy', 'fill in the blanks'),
(26, 'Number after 9', 'easy', 'enumeration'),
(27, 'Number after 5', 'easy', 'enumeration'),
(28, 'Number before 5', 'easy', 'enumeration'),
(29, 'What comes number comes after 10?', 'easy', 'enumeration'),
(30, 'First letter in the alphabet?', 'easy', 'enumeration');

-- --------------------------------------------------------

--
-- Table structure for table `enumeration`
--

CREATE TABLE `enumeration` (
  `question_id` int(11) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enumeration`
--

INSERT INTO `enumeration` (`question_id`, `answer`, `difficulty`) VALUES
(6, 'red,blue,white,yellow', 'easy'),
(8, 'blossom,bubbles,buttercup', 'easy'),
(7, 'analog,digital', 'easy'),
(9, 'north,south,east,west', 'easy'),
(10, 'northwest,northeast,southwest,southeast', 'easy'),
(21, 'luzon,visayas,mindanao', 'easy'),
(24, 'a,b,c,d,e', 'easy'),
(26, '10', 'easy'),
(27, '6', 'easy'),
(28, '4', 'easy'),
(29, '11', 'easy'),
(30, 'a', 'easy');

-- --------------------------------------------------------

--
-- Table structure for table `fill`
--

CREATE TABLE `fill` (
  `question_id` int(11) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fill`
--

INSERT INTO `fill` (`question_id`, `answer`, `difficulty`) VALUES
(11, 'think', 'easy'),
(12, 'spice', 'easy'),
(13, 'twinkle', 'easy'),
(14, 'beginning', 'easy'),
(15, 'life', 'easy'),
(17, 'Jerry', 'easy'),
(20, 'Pooh', 'easy'),
(22, '5', 'easy'),
(25, 'charm', 'easy');

-- --------------------------------------------------------

--
-- Table structure for table `hardchoices`
--

CREATE TABLE `hardchoices` (
  `question_id` int(11) NOT NULL,
  `letter` varchar(1) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL,
  `answer` varchar(500) NOT NULL,
  `correct` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hardchoices`
--

INSERT INTO `hardchoices` (`question_id`, `letter`, `difficulty`, `answer`, `correct`) VALUES
(1, 'a', 'hard', 'Australia', 1),
(1, 'b', 'hard', 'Europe', 0),
(1, 'c', 'hard', 'Antartica', 0),
(1, 'd', 'hard', 'South America', 0),
(2, 'a', 'hard', 'Africa', 0),
(2, 'b', 'hard', 'Asia', 1),
(2, 'c', 'hard', 'North America', 0),
(2, 'd', 'hard', 'North America', 0),
(3, 'a', 'hard', 'Oslo', 0),
(3, 'b', 'hard', 'Moscow', 0),
(3, 'c', 'hard', 'Bern', 1),
(3, 'd', 'hard', 'Manila', 0),
(4, 'a', 'hard', '7200', 0),
(4, 'b', 'hard', '7002', 0),
(4, 'c', 'hard', '7107', 0),
(4, 'd', 'hard', '7641', 1),
(5, 'a', 'hard', 'White', 0),
(5, 'b', 'hard', 'Orange', 1),
(5, 'c', 'hard', 'Yellow', 0),
(5, 'd', 'hard', 'Red', 0),
(16, 'a', 'hard', '3.15149', 0),
(16, 'b', 'hard', '3.14195', 0),
(16, 'c', 'hard', '3.14159', 1),
(16, 'd', 'hard', '3.13194', 0),
(18, 'a', 'hard', '1869', 1),
(18, 'b', 'hard', '1896', 1),
(18, 'c', 'hard', '1889', 0),
(18, 'd', 'hard', '1866', 0),
(19, 'a', 'hard', '5', 0),
(19, 'b', 'hard', '6', 0),
(19, 'c', 'hard', '7', 0),
(19, 'd', 'hard', '8', 1);

-- --------------------------------------------------------

--
-- Table structure for table `hardenumeration`
--

CREATE TABLE `hardenumeration` (
  `question_id` int(11) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hardenumeration`
--

INSERT INTO `hardenumeration` (`question_id`, `answer`, `difficulty`) VALUES
(6, 'Horizontal,Vertical', 'hard'),
(7, 'Asia,Africa,North America ', 'hard'),
(8, 'Australia,Europe,Antartica', 'hard'),
(9, 'blue,red,white', 'hard'),
(10, 'blue,red,white', 'hard');

-- --------------------------------------------------------

--
-- Table structure for table `hardfill`
--

CREATE TABLE `hardfill` (
  `question_id` int(11) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hardfill`
--

INSERT INTO `hardfill` (`question_id`, `answer`, `difficulty`) VALUES
(11, 'Thrones', 'hard'),
(12, 'Lord', 'hard'),
(13, 'Deadpool', 'hard'),
(14, 'Wallflower', 'hard'),
(15, 'Mr.Bean', 'hard'),
(17, '25', 'hard'),
(20, '32', 'hard'),
(21, '128', 'hard'),
(22, '1', 'hard'),
(23, '4', 'hard'),
(24, '64', 'hard'),
(25, 'am', ''),
(26, 'holidays', 'hard'),
(27, 'Legends', 'hard'),
(28, 'Science', 'hard'),
(29, 'Survival', 'hard');

-- --------------------------------------------------------

--
-- Table structure for table `hardquestions`
--

CREATE TABLE `hardquestions` (
  `question_id` int(11) NOT NULL,
  `question` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL,
  `type` enum('multiple choice','enumeration','fill in the blanks','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `hardquestions`
--

INSERT INTO `hardquestions` (`question_id`, `question`, `difficulty`, `type`) VALUES
(1, 'Smallest continent\r\n', 'hard', 'multiple choice'),
(2, 'Largest continent', 'hard', 'multiple choice'),
(3, 'Capital of Switzerland\r\n', 'hard', 'multiple choice'),
(4, 'Total islands in the Philippines', 'hard', 'multiple choice'),
(5, 'Color for happiness', 'hard', 'multiple choice'),
(6, 'Enumerate 2 basic lines', 'hard', 'enumeration'),
(7, 'Enumerate 3 largest continents', 'hard', 'enumeration'),
(8, 'Enumerate 3 smallest continents', 'hard', 'enumeration'),
(9, 'Enumerate the colors of the American Flag', 'hard', 'enumeration'),
(10, 'Enumerate the colors of the Russian Flag', 'hard', 'enumeration'),
(11, 'Game of _______', 'hard', 'fill in the blanks'),
(12, '_____ of the Rings', 'hard', 'fill in the blanks'),
(13, 'Once upon a ________', 'hard', 'fill in the blanks'),
(14, 'Perks of a _____________', 'hard', 'fill in the blanks'),
(15, '______ Holiday', 'hard', 'fill in the blanks'),
(16, 'What is the value of Pi (?)', 'hard', 'multiple choice'),
(17, '1,4,9,16,__', 'hard', 'fill in the blanks'),
(18, 'What year did our national hero Joze Rizal died? ', 'hard', 'multiple choice'),
(19, 'How much is the alcohol content of Red Horse', 'hard', 'multiple choice'),
(20, '1,2,4,8,16,_,64,128', 'hard', 'fill in the blanks'),
(21, '1,2,4,8,16,32,64,_', 'hard', 'fill in the blanks'),
(22, '_,2,4,8,16,32,64,128', 'hard', 'fill in the blanks'),
(23, '1,2,_,8,16,32,64,128', 'hard', 'fill in the blanks'),
(24, '1,2,4,8,16,32,_,128', 'hard', 'fill in the blanks'),
(25, 'I __ who I am', 'hard', 'fill in the blanks'),
(26, 'Happy _____ to you', 'hard', 'fill in the blanks'),
(27, 'League of ______', 'hard', 'fill in the blanks'),
(28, 'Information ________', 'hard', 'fill in the blanks'),
(29, 'Rules of __________', 'hard', 'fill in the blanks');

-- --------------------------------------------------------

--
-- Table structure for table `mediumchoices`
--

CREATE TABLE `mediumchoices` (
  `question_id` int(11) NOT NULL,
  `letter` varchar(1) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL,
  `answer` varchar(500) NOT NULL,
  `correct` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mediumchoices`
--

INSERT INTO `mediumchoices` (`question_id`, `letter`, `difficulty`, `answer`, `correct`) VALUES
(1, 'a', 'medium', 'Darwin', 0),
(1, 'b', 'medium', 'Aristotle', 1),
(1, 'c', 'medium', 'Lamark', 0),
(1, 'd', 'medium', 'Theophrastus', 0),
(2, 'a', 'medium', 'Neurogonic heart', 0),
(2, 'b', 'medium', 'Myogenic heart', 1),
(2, 'c', 'medium', 'Pulsating heart', 0),
(2, 'd', 'medium', 'Ampullary heart', 0),
(3, 'a', 'medium', 'Seed', 1),
(3, 'b', 'medium', 'Leaf', 0),
(3, 'c', 'medium', 'Fruit', 0),
(3, 'd', 'medium', 'Pollen grain', 0),
(4, 'a', 'medium', 'Frog', 0),
(4, 'b', 'medium', 'Earthworm', 1),
(4, 'c', 'medium', 'Snake', 0),
(4, 'd', 'medium', 'Peacock', 0),
(5, 'a', 'medium', 'Leech', 0),
(5, 'b', 'medium', 'Earthworm', 0),
(5, 'c', 'medium', 'Snail', 0),
(5, 'd', 'medium', 'Cockroach', 1),
(17, 'a', 'medium', '7017', 0),
(17, 'b', 'medium', '7101', 0),
(17, 'c', 'medium', '7071', 0),
(17, 'd', 'medium', '7107', 1),
(18, 'a', 'medium', 'Siomai', 0),
(18, 'b', 'medium', 'Siomai', 0),
(18, 'c', 'medium', 'Tempura', 1),
(18, 'd', 'medium', 'Pancit', 0);

-- --------------------------------------------------------

--
-- Table structure for table `mediumenumeration`
--

CREATE TABLE `mediumenumeration` (
  `question_id` int(11) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mediumenumeration`
--

INSERT INTO `mediumenumeration` (`question_id`, `answer`, `difficulty`) VALUES
(6, 'solid,liquid,gas', 'medium'),
(7, 'evaporation,condensation,precipitation', 'medium'),
(8, 'red,blue,yellow', 'medium'),
(9, 'green,orange,purple', 'medium'),
(10, 'asia,europe,africa,northamerica,southamerica,antartica,australia', 'medium');

-- --------------------------------------------------------

--
-- Table structure for table `mediumfill`
--

CREATE TABLE `mediumfill` (
  `question_id` int(11) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mediumfill`
--

INSERT INTO `mediumfill` (`question_id`, `answer`, `difficulty`) VALUES
(11, 'man', 'medium'),
(12, 'twice', 'medium'),
(13, 'knowledge', 'medium'),
(14, 'discover', 'medium'),
(15, 'truth', 'medium'),
(16, 'Pooh', 'medium'),
(19, 'pigeon', 'medium'),
(20, 'dog', 'medium'),
(21, '32', 'medium'),
(22, 'Mathematics', 'medium'),
(23, 'Discrete', 'medium'),
(24, 'Trigonometry', 'medium'),
(25, 'Plain', 'medium'),
(26, 'Basic', 'medium'),
(27, 'Little', 'medium'),
(28, 'Ghoul', 'medium'),
(29, 'Tokyo', 'medium'),
(30, 'Hunter', 'medium'),
(31, 'Hunter', 'medium');

-- --------------------------------------------------------

--
-- Table structure for table `mediumquestions`
--

CREATE TABLE `mediumquestions` (
  `question_id` int(11) NOT NULL,
  `question` varchar(500) NOT NULL,
  `difficulty` enum('easy','medium','hard','') NOT NULL,
  `type` enum('multiple choice','enumeration','fill in the blanks','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `mediumquestions`
--

INSERT INTO `mediumquestions` (`question_id`, `question`, `difficulty`, `type`) VALUES
(1, 'Who is known as father of Zoology', 'medium', 'multiple choice'),
(2, 'The human heart is', 'medium', 'multiple choice'),
(3, 'Spermology is the study of', 'medium', 'multiple choice'),
(4, 'Animal without red blood cells', 'medium', 'multiple choice'),
(5, 'Chambered heart occurs in', 'medium', 'multiple choice'),
(6, '3 States of matter', 'medium', 'enumeration'),
(7, 'Enumerate the rain cycle', 'medium', 'enumeration'),
(8, 'Enumerate the primary colors', 'medium', 'enumeration'),
(9, 'Enumerate the secondary colors', 'medium', 'enumeration'),
(10, 'Enumerate the 7 continents', 'medium', 'enumeration'),
(11, 'The life of ___ (in a state of nature) is solitary, poor, nasty, brutish, and short\r\n-Thomas Hobbes', 'medium', 'fill in the blanks'),
(12, 'One cannot step _____ in the same river\r\n-Heraclitus', 'medium', 'fill in the blanks'),
(13, 'There is only one good, _______, and one evil, ignorance\r\n-Socrates', 'medium', 'fill in the blanks'),
(14, 'You can _______ more about a person in an hour of play than in a year of conversation\r\n-Plato', 'medium', 'fill in the blanks'),
(15, 'It is one thing to show a man that he is in error, and another to put him in possession of _____\r\n-John Locke', 'medium', 'fill in the blanks'),
(16, 'Winnie the ____', 'easy', 'fill in the blanks'),
(17, 'How many islands does the philippines have?', 'medium', 'multiple choice'),
(18, 'Which of them arent chinese food?', 'medium', 'multiple choice'),
(19, 'Fly awaaayy skyline _____ flyy', 'medium', 'fill in the blanks'),
(20, 'The quick brown fox jumped over the lazy _____', 'medium', 'fill in the blanks'),
(21, '128,64,__,16,8,4,2,1', 'medium', 'fill in the blanks'),
(22, 'Discrete ________', 'medium', 'fill in the blanks'),
(23, '________ Mathematics', 'medium', 'fill in the blanks'),
(24, 'Plain ___________', 'medium', 'fill in the blanks'),
(25, '_______ Trigonometry', 'medium', 'fill in the blanks'),
(26, '_________ Programming', 'medium', 'fill in the blanks'),
(27, 'The ______ Mermaid', 'medium', 'fill in the blanks'),
(28, 'Tokyo _______', 'medium', 'fill in the blanks'),
(29, '______ Ghoul', 'medium', 'fill in the blanks'),
(30, 'Hunter x _______', 'medium', 'fill in the blanks'),
(31, '_____ x Hunter', 'medium', 'fill in the blanks');

-- --------------------------------------------------------

--
-- Table structure for table `userscore`
--

CREATE TABLE `userscore` (
  `user` varchar(500) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userscore`
--

INSERT INTO `userscore` (`user`, `score`) VALUES
(' e', 10),
('tope', 10),
(' jeke', 30),
('leyson', 30),
(' leysooon', 10),
('asd', 20),
(' wew', 20),
(' asd', 20),
(' asd', 20),
(' wew', 0),
(' wew', 0),
(' wee', 0),
(' wew', 0),
(' wew', 0),
(' jeke', 0),
(' wew', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `choices`
--
ALTER TABLE `choices`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `easyquestions`
--
ALTER TABLE `easyquestions`
  ADD PRIMARY KEY (`question_id`);

--
-- Indexes for table `enumeration`
--
ALTER TABLE `enumeration`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `fill`
--
ALTER TABLE `fill`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `hardchoices`
--
ALTER TABLE `hardchoices`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `hardenumeration`
--
ALTER TABLE `hardenumeration`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `hardfill`
--
ALTER TABLE `hardfill`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `hardquestions`
--
ALTER TABLE `hardquestions`
  ADD PRIMARY KEY (`question_id`);

--
-- Indexes for table `mediumchoices`
--
ALTER TABLE `mediumchoices`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `mediumenumeration`
--
ALTER TABLE `mediumenumeration`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `mediumfill`
--
ALTER TABLE `mediumfill`
  ADD KEY `question_id` (`question_id`);

--
-- Indexes for table `mediumquestions`
--
ALTER TABLE `mediumquestions`
  ADD PRIMARY KEY (`question_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `easyquestions`
--
ALTER TABLE `easyquestions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `hardquestions`
--
ALTER TABLE `hardquestions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT for table `mediumquestions`
--
ALTER TABLE `mediumquestions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `choices`
--
ALTER TABLE `choices`
  ADD CONSTRAINT `choices_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `easyquestions` (`question_id`);

--
-- Constraints for table `enumeration`
--
ALTER TABLE `enumeration`
  ADD CONSTRAINT `enumeration_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `easyquestions` (`question_id`);

--
-- Constraints for table `fill`
--
ALTER TABLE `fill`
  ADD CONSTRAINT `fill_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `easyquestions` (`question_id`);

--
-- Constraints for table `hardchoices`
--
ALTER TABLE `hardchoices`
  ADD CONSTRAINT `hardchoices_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `hardquestions` (`question_id`);

--
-- Constraints for table `hardenumeration`
--
ALTER TABLE `hardenumeration`
  ADD CONSTRAINT `hardenumeration_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `hardquestions` (`question_id`);

--
-- Constraints for table `hardfill`
--
ALTER TABLE `hardfill`
  ADD CONSTRAINT `hardfill_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `hardquestions` (`question_id`);

--
-- Constraints for table `mediumchoices`
--
ALTER TABLE `mediumchoices`
  ADD CONSTRAINT `mediumchoices_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `mediumquestions` (`question_id`);

--
-- Constraints for table `mediumenumeration`
--
ALTER TABLE `mediumenumeration`
  ADD CONSTRAINT `mediumenumeration_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `mediumquestions` (`question_id`);

--
-- Constraints for table `mediumfill`
--
ALTER TABLE `mediumfill`
  ADD CONSTRAINT `mediumfill_ibfk_1` FOREIGN KEY (`question_id`) REFERENCES `mediumquestions` (`question_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
