-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : jeu. 11 mai 2023 à 14:36
-- Version du serveur : 5.7.31
-- Version de PHP : 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `23jeicorp`
--

-- --------------------------------------------------------

--
-- Structure de la table `caserne`
--

DROP TABLE IF EXISTS `caserne`;
CREATE TABLE IF NOT EXISTS `caserne` (
  `Id_caserne` int(10) NOT NULL AUTO_INCREMENT,
  `nom_caserne` varchar(50) NOT NULL,
  `rue_caserne` varchar(50) NOT NULL,
  `ville_caserne` varchar(50) NOT NULL,
  `codePostal_caserne` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_caserne`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `caserne`
--

INSERT INTO `caserne` (`Id_caserne`, `nom_caserne`, `rue_caserne`, `ville_caserne`, `codePostal_caserne`) VALUES
(1, 'Caserne de Caen', '38 rue de Caen', 'Caen', '14000'),
(2, 'Caserne de Bayeux', '12 rue de Bayeux', 'Bayeux', '14047');

-- --------------------------------------------------------

--
-- Structure de la table `engin`
--

DROP TABLE IF EXISTS `engin`;
CREATE TABLE IF NOT EXISTS `engin` (
  `Id_engin` int(10) NOT NULL AUTO_INCREMENT,
  `nom_engin` varchar(50) NOT NULL,
  `Id_typeEngin` int(10) NOT NULL,
  `Id_intervention` int(10) NOT NULL,
  `Id_caserne` int(10) NOT NULL,
  PRIMARY KEY (`Id_engin`),
  KEY `FK_IdTypeEngin` (`Id_typeEngin`),
  KEY `FK_IdIntervention` (`Id_intervention`),
  KEY `FK_IdCaserne_engin` (`Id_caserne`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `engin`
--

INSERT INTO `engin` (`Id_engin`, `nom_engin`, `Id_typeEngin`, `Id_intervention`, `Id_caserne`) VALUES
(1, 'VSAV1', 1, 1, 2),
(2, 'EPA3', 3, 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `intervenir`
--

DROP TABLE IF EXISTS `intervenir`;
CREATE TABLE IF NOT EXISTS `intervenir` (
  `Id_Pompier` int(10) NOT NULL,
  `Id_intervention` int(10) NOT NULL,
  PRIMARY KEY (`Id_intervention`),
  KEY `FK_IdPompier_intervenir` (`Id_Pompier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `intervention`
--

DROP TABLE IF EXISTS `intervention`;
CREATE TABLE IF NOT EXISTS `intervention` (
  `Id_intervention` int(10) NOT NULL AUTO_INCREMENT,
  `date_intervention` date NOT NULL,
  `heureAppel_intervention` time NOT NULL,
  `heureArrive_intervention` time NOT NULL,
  `Id_situation` int(11) NOT NULL,
  PRIMARY KEY (`Id_intervention`),
  KEY `FK_IdSituation` (`Id_situation`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `intervention`
--

INSERT INTO `intervention` (`Id_intervention`, `date_intervention`, `heureAppel_intervention`, `heureArrive_intervention`, `Id_situation`) VALUES
(1, '2023-05-17', '14:31:49', '14:41:49', 1),
(2, '2022-05-17', '12:31:49', '13:01:49', 2);

-- --------------------------------------------------------

--
-- Structure de la table `pompier`
--

DROP TABLE IF EXISTS `pompier`;
CREATE TABLE IF NOT EXISTS `pompier` (
  `Id_pompier` int(11) NOT NULL AUTO_INCREMENT,
  `nom_pompier` varchar(50) NOT NULL,
  `prenom_pompier` varchar(50) NOT NULL,
  `dateNaissance_pompier` varchar(50) NOT NULL,
  `numeroBip_pompier` varchar(50) NOT NULL,
  `mdp_pompier` varchar(50) NOT NULL,
  `tel_pompier` varchar(50) NOT NULL,
  `sexe_pompier` varchar(50) NOT NULL,
  `role_pompier` varchar(1) NOT NULL,
  `Id_caserne` int(10) NOT NULL,
  PRIMARY KEY (`Id_pompier`),
  KEY `FK_IdCaserne` (`Id_caserne`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `pompier`
--

INSERT INTO `pompier` (`Id_pompier`, `nom_pompier`, `prenom_pompier`, `dateNaissance_pompier`, `numeroBip_pompier`, `mdp_pompier`, `tel_pompier`, `sexe_pompier`, `role_pompier`, `Id_caserne`) VALUES
(1, 'Feubreau', 'Antoine', '2004-09-14', '456', 'test1', '0785236415', 'M', 'R', 1),
(2, 'Dilo', 'Gilber', '2002-12-25', '123', 'test2', '0905060403', 'F', 'P', 2),
(3, 'Gepo', 'Armanein', '2001-05-23', '789', 'test3', '0980463021', 'M', 'A', 1);

-- --------------------------------------------------------

--
-- Structure de la table `situation`
--

DROP TABLE IF EXISTS `situation`;
CREATE TABLE IF NOT EXISTS `situation` (
  `Id_situation` int(10) NOT NULL AUTO_INCREMENT,
  `libelle_situation` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_situation`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `situation`
--

INSERT INTO `situation` (`Id_situation`, `libelle_situation`) VALUES
(1, 'Chat dans un arbre'),
(2, 'Incendie domestique');

-- --------------------------------------------------------

--
-- Structure de la table `typeengin`
--

DROP TABLE IF EXISTS `typeengin`;
CREATE TABLE IF NOT EXISTS `typeengin` (
  `Id_typeEngin` int(10) NOT NULL AUTO_INCREMENT,
  `libelle_typeEngin` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_typeEngin`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `typeengin`
--

INSERT INTO `typeengin` (`Id_typeEngin`, `libelle_typeEngin`) VALUES
(1, 'VSAV'),
(2, 'FPT'),
(3, 'EPA');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `engin`
--
ALTER TABLE `engin`
  ADD CONSTRAINT `FK_IdCaserne_engin` FOREIGN KEY (`Id_caserne`) REFERENCES `caserne` (`Id_caserne`),
  ADD CONSTRAINT `FK_IdIntervention` FOREIGN KEY (`Id_intervention`) REFERENCES `intervention` (`Id_intervention`),
  ADD CONSTRAINT `FK_IdTypeEngin` FOREIGN KEY (`Id_typeEngin`) REFERENCES `typeengin` (`Id_typeEngin`);

--
-- Contraintes pour la table `intervenir`
--
ALTER TABLE `intervenir`
  ADD CONSTRAINT `FK_IdIntervention_intervenir` FOREIGN KEY (`Id_intervention`) REFERENCES `intervention` (`Id_intervention`),
  ADD CONSTRAINT `FK_IdPompier_intervenir` FOREIGN KEY (`Id_Pompier`) REFERENCES `pompier` (`Id_pompier`);

--
-- Contraintes pour la table `intervention`
--
ALTER TABLE `intervention`
  ADD CONSTRAINT `FK_IdSituation` FOREIGN KEY (`Id_situation`) REFERENCES `situation` (`Id_situation`);

--
-- Contraintes pour la table `pompier`
--
ALTER TABLE `pompier`
  ADD CONSTRAINT `FK_IdCaserne` FOREIGN KEY (`Id_caserne`) REFERENCES `caserne` (`Id_caserne`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
