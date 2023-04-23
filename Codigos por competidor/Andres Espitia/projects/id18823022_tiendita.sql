-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 14-06-2022 a las 18:15:42
-- Versión del servidor: 10.5.12-MariaDB
-- Versión de PHP: 7.3.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `id18823022_tiendita`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compradores`
--

CREATE TABLE `compradores` (
  `idcomprador` int(11) NOT NULL,
  `nombres` varchar(40) DEFAULT NULL,
  `apellidos` varchar(40) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `compradores`
--

INSERT INTO `compradores` (`idcomprador`, `nombres`, `apellidos`, `email`) VALUES
(1, 'angel', 'esteban', 'anesteb123@gmail.com'),
(2, 'bebe', 'Nara', 'beberashika.com'),
(3, 'joker', 'Sanin', 'jokeraninpervert@gmail.com'),
(4, 'andres', 'Uzumaki', 'andresseptimocontactos@gmail.com'),
(5, 'juan', 'Uchiha', 'juanemovengador@gmail.com'),
(7, 'Agua', 'deowo', 'gggg'),
(9, 'Andres', 'Espitia', 'aespitiar'),
(10, 'pollo', 'uwu', 'pato'),
(14, 'Baboni', 'beibe', 'yeyeyeye'),
(12345, 'eladio', 'pa', 'uwu'),
(627172, 'Camiloxd', 'Uribe', 'jcamiloup@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `id_login` int(11) NOT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `contrasena` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`id_login`, `usuario`, `contrasena`) VALUES
(1, 'Andres', 'Espitia'),
(2, 'Hernan', 'Dario'),
(3, 'David', 'Gonzalez'),
(4, 'Camilo', 'Uribe'),
(5, 'Juan', 'Juan'),
(6, 'Anfeespi', 'Felipe102005'),
(7, 'Mariaxd', 'oli');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `idpedido` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `idcomprador` int(11) NOT NULL,
  `estadopedido` varchar(40) DEFAULT NULL,
  `fechapedido` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `valor` varchar(40) DEFAULT NULL,
  `calidad` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idproducto`, `nombre`, `valor`, `calidad`) VALUES
(1, 'hoja', '1.00', '10'),
(2, 'Bandana', '1.063', '15'),
(3, 'Zandalias', '2.000', '20'),
(4, 'beb', '2.500', '25'),
(5, 'Anillo', '3.000', '30'),
(6, 'celular', '3.500', '35'),
(7, 'gafas', '4.000', '40'),
(8, 'Kunai', '4.500', '45'),
(9, 'Papel', '5.000', '50'),
(10, 'ALAS DE ANGEL', '5.500', '55');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compradores`
--
ALTER TABLE `compradores`
  ADD PRIMARY KEY (`idcomprador`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`idpedido`),
  ADD KEY `idcomprador` (`idcomprador`),
  ADD KEY `idproducto` (`idproducto`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idproducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `id_login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`idcomprador`) REFERENCES `compradores` (`idcomprador`),
  ADD CONSTRAINT `pedidos_ibfk_2` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
