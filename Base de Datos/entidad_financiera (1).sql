-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2024 at 05:29 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `entidad_financiera`
--

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `persona_id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `tipo_identificacion` varchar(20) NOT NULL,
  `numero_identificacion` varchar(20) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `estado_civil` varchar(20) NOT NULL,
  `nivel_educativo` varchar(50) NOT NULL,
  `ingreso_mensual` decimal(15,2) NOT NULL,
  `tp_personaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`persona_id`, `nombre`, `apellido`, `tipo_identificacion`, `numero_identificacion`, `fecha_nacimiento`, `direccion`, `telefono`, `email`, `estado_civil`, `nivel_educativo`, `ingreso_mensual`, `tp_personaID`) VALUES
(7, 'Carlos', 'Pérez', 'DNI', '123456789', '1985-03-15', 'Calle 123, Ciudad', '555-1234', 'carlos.perez@mail.com', 'Soltero', 'Universitario', 3000.00, 1),
(8, 'Ana', 'Martínez', 'DNI', '987654321', '1990-07-22', 'Avenida 45, Ciudad', '555-5678', 'ana.martinez@mail.com', 'Casada', 'Secundaria', 2500.00, 2),
(9, 'Luis', 'Gómez', 'Pasaporte', 'A1234567', '1978-11-30', 'Carrera 7, Ciudad', '555-9101', 'luis.gomez@mail.com', 'Divorciado', 'Primaria', 1800.00, 1);

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `producto_id` int(11) NOT NULL,
  `nombre_producto` varchar(100) NOT NULL,
  `tipo_producto` varchar(50) NOT NULL,
  `tasa_interes` decimal(5,2) NOT NULL,
  `plazo` int(11) NOT NULL,
  `monto_maximo` decimal(15,2) NOT NULL,
  `requisitos_especiales` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`producto_id`, `nombre_producto`, `tipo_producto`, `tasa_interes`, `plazo`, `monto_maximo`, `requisitos_especiales`) VALUES
(1, 'Tarjeta de Crédito Clásica', 'Tarjeta', 25.00, 12, 5000.00, 'Edad mínima de 21 años; Ingreso mínimo de $1000'),
(2, 'Crédito de Consumo', 'Crédito', 18.00, 36, 15000.00, 'Edad mínima de 18 años; Historial crediticio limpio'),
(3, 'Crédito Vehicular', 'Crédito', 12.00, 60, 25000.00, 'Ingreso mínimo de $2000; Vehículo asegurado');

-- --------------------------------------------------------

--
-- Table structure for table `solicitud`
--

CREATE TABLE `solicitud` (
  `solicitud_id` int(11) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  `fecha_solicitud` date NOT NULL,
  `estado` varchar(50) NOT NULL,
  `monto_solicitado` decimal(15,2) NOT NULL,
  `resultado_verificacion` varchar(50) NOT NULL,
  `fecha_aprobacion` date NOT NULL,
  `fecha_rechazo` date NOT NULL,
  `comentarios` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `solicitud`
--

INSERT INTO `solicitud` (`solicitud_id`, `persona_id`, `producto_id`, `fecha_solicitud`, `estado`, `monto_solicitado`, `resultado_verificacion`, `fecha_aprobacion`, `fecha_rechazo`, `comentarios`) VALUES
(13, 8, 1, '2024-11-13', 'Aprobado', 5000.00, 'Ccbhdbsd', '2024-11-14', '2024-11-14', 'egesgsdfv'),
(20, 7, 1, '2024-11-01', 'Aprobada', 3000.00, 'Aprobado', '2024-11-02', '2024-11-02', 'Cliente cumple con los requisitos para la tarjeta de crédito'),
(21, 8, 2, '2024-11-03', 'Rechazada', 10000.00, 'Riesgo alto', '2024-11-04', '2024-11-04', 'Cliente en lista negra en DataCredito'),
(22, 9, 3, '2024-11-05', 'Pendiente', 20000.00, 'Pendiente', '2024-11-06', '2024-11-06', 'Pendiente de verificación de documentos');

-- --------------------------------------------------------

--
-- Table structure for table `tipo_persona`
--

CREATE TABLE `tipo_persona` (
  `id_tp` int(11) NOT NULL,
  `nombre_tp` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tipo_persona`
--

INSERT INTO `tipo_persona` (`id_tp`, `nombre_tp`) VALUES
(1, 'Admin'),
(2, 'Usuario');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`persona_id`),
  ADD UNIQUE KEY `numero_identificacion` (`numero_identificacion`),
  ADD KEY `fk_tp_persona` (`tp_personaID`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`producto_id`);

--
-- Indexes for table `solicitud`
--
ALTER TABLE `solicitud`
  ADD PRIMARY KEY (`solicitud_id`),
  ADD KEY `solicitud_ibfk_1` (`persona_id`),
  ADD KEY `solicitud_ibfk_2` (`producto_id`);

--
-- Indexes for table `tipo_persona`
--
ALTER TABLE `tipo_persona`
  ADD PRIMARY KEY (`id_tp`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `persona_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `producto`
--
ALTER TABLE `producto`
  MODIFY `producto_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `solicitud`
--
ALTER TABLE `solicitud`
  MODIFY `solicitud_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `tipo_persona`
--
ALTER TABLE `tipo_persona`
  MODIFY `id_tp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `fk_tp_persona` FOREIGN KEY (`tp_personaID`) REFERENCES `tipo_persona` (`id_tp`);

--
-- Constraints for table `solicitud`
--
ALTER TABLE `solicitud`
  ADD CONSTRAINT `solicitud_ibfk_1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `solicitud_ibfk_2` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`producto_id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
