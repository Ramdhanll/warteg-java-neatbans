-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jul 2020 pada 16.22
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `warteg`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `masakan`
--

CREATE TABLE `masakan` (
  `id_masakan` varchar(255) NOT NULL,
  `nama_masakan` varchar(255) NOT NULL,
  `harga` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `masakan`
--

INSERT INTO `masakan` (`id_masakan`, `nama_masakan`, `harga`) VALUES
('M277', 'Telor dadar', '7000'),
('M646', 'Telor Puyuh angsa', '2500'),
('M698', 'Ayam Goreng', '10000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `order`
--

CREATE TABLE `order` (
  `id_order` varchar(255) NOT NULL,
  `masakan_id` varchar(255) NOT NULL,
  `no_meja` varchar(255) DEFAULT NULL,
  `tanggal` varchar(255) NOT NULL,
  `jumlah` int(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `order`
--

INSERT INTO `order` (`id_order`, `masakan_id`, `no_meja`, `tanggal`, `jumlah`, `status`) VALUES
('USR199', 'M646', '1', '2020-07-04', 1, 'di tempat'),
('USR57', 'M277', '2', '2020-07-04', 2, 'Di Tempat'),
('USR704', 'M646', '2', '2020-07-04', 2, 'Di Tempat'),
('USR104', 'M277', '2', '2020-07-04', 2, 'Di Tempat'),
('WI63', 'M277', '1', '2020-07-04', 2, 'Di Tempat'),
('WI386', 'M277', '2', '2020-07-04', 1, 'Di Tempat'),
('WI685', 'M277', '2', '2020-07-04', 2, 'Di Tempat'),
('WI318', 'M646', '2', '2020-07-04', 2, 'Di Tempat'),
('WI511', 'M646', '0', '2020-07-04', 1, 'Delivery'),
('WI746', 'M277', 'null', '2020-07-04', 1, 'Delivery'),
('WI297', 'M646', 'null', '2020-07-04', 1, 'Delivery'),
('WI297', 'M277', 'null', '2020-07-04', 1, 'Delivery'),
('WI401', 'M646', 'null', '2020-07-04', 4, 'Delivery'),
('WI401', 'M277', 'null', '2020-07-04', 2, 'Delivery'),
('WI784', 'M277', 'null', '2020-07-04', 2, 'Delivery'),
('WI784', 'M646', 'null', '2020-07-04', 3, 'Delivery'),
('WI635', 'M277', '2', '2020-07-04', 1, 'Di Tempat'),
('WI635', 'M646', '2', '2020-07-04', 2, 'Di Tempat'),
('WI635', 'M698', '2', '2020-07-04', 1, 'Di Tempat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(255) NOT NULL,
  `order_id` varchar(255) NOT NULL,
  `total` int(11) NOT NULL,
  `status_transaksi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `order_id`, `total`, `status_transaksi`) VALUES
('1', 'WI401', 9500, 'Lunas'),
('TRS387', 'WI297', 9500, 'Lunas'),
('TRS514', 'WI784', 21500, 'Lunas'),
('TRS555', 'WI635', 22000, 'Lunas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `nama`) VALUES
('USR160', 'vala', 'vala', 'password'),
('USR478', 'r', 'r', 'password'),
('USR65', 'admin', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `masakan`
--
ALTER TABLE `masakan`
  ADD PRIMARY KEY (`id_masakan`);

--
-- Indeks untuk tabel `order`
--
ALTER TABLE `order`
  ADD KEY `masakan_id` (`masakan_id`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `id_order` (`order_id`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `order`
--
ALTER TABLE `order`
  ADD CONSTRAINT `order_ibfk_1` FOREIGN KEY (`masakan_id`) REFERENCES `masakan` (`id_masakan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
