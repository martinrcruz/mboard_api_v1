-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 01, 2022 at 03:49 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mboard-db`
--

-- --------------------------------------------------------

--
-- Table structure for table `gastos`
--

CREATE TABLE `gastos` (
  `id_gasto` int(11) NOT NULL,
  `detalle` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` varchar(500) COLLATE utf8_spanish2_ci NOT NULL,
  `forma_pago` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `id_cuenta_asociada` int(2) NOT NULL,
  `fecha_pago` datetime DEFAULT NULL,
  `monto` int(30) NOT NULL,
  `created_at` datetime NOT NULL,
  `modified_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  `state` int(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `gastos`
--

INSERT INTO `gastos` (`id_gasto`, `detalle`, `descripcion`, `forma_pago`, `id_cuenta_asociada`, `fecha_pago`, `monto`, `created_at`, `modified_at`, `deleted_at`, `state`) VALUES
(1, 'Detalle', 'descripcion', 'forma pago', 0, NULL, 10000, '2022-09-29 22:39:01', '2022-09-29 22:39:01', '2022-09-29 22:39:01', 1),
(2, 'Detalle 2', 'descripcion 2', 'forma pago 2', 0, '2022-09-29 22:39:01', 20000, '2022-09-29 22:41:29', '2022-09-29 22:41:29', '2022-09-29 22:41:29', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gastos`
--
ALTER TABLE `gastos`
  ADD PRIMARY KEY (`id_gasto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gastos`
--
ALTER TABLE `gastos`
  MODIFY `id_gasto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
