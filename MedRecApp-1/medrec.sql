# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.5.27
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2013-12-20 00:44:01
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for medrec
CREATE DATABASE IF NOT EXISTS `medrec` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `medrec`;


# Dumping structure for table medrec.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `no_dokter` varchar(7) NOT NULL DEFAULT '',
  `nm_dokter` varchar(45) NOT NULL,
  `id_spesialis` varchar(10) NOT NULL DEFAULT '',
  `tgl_kerja_dok` date DEFAULT '0000-00-00',
  `alamat_dok` text,
  PRIMARY KEY (`no_dokter`),
  KEY `fk_spesialis` (`id_spesialis`),
  CONSTRAINT `fk_spesialis` FOREIGN KEY (`id_spesialis`) REFERENCES `spesialis` (`id_spesialis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.dokter: ~4 rows (approximately)
/*!40000 ALTER TABLE `dokter` DISABLE KEYS */;
INSERT INTO `dokter` (`no_dokter`, `nm_dokter`, `id_spesialis`, `tgl_kerja_dok`, `alamat_dok`) VALUES
	('DOK.001', 'dr. BENNO BERNARD', 'Sp.B', '2008-10-19', 'Jl. Dedengkot Lama No. 77 Jakarta Timur'),
	('DOK.002', 'dr. YUDI HARUN', 'Sp.PD', '2009-05-25', 'Jl. Surapati No. 83 Bandung'),
	('DOK.003', 'dr. SANTOSO', 'Sp.PD', '2010-12-13', 'Jl. Cisitu Lama No. 87'),
	('DOK.004', 'dr. YONGKY KURNIAWAN', 'Sp.J', '2007-06-01', 'Jl. Kalibata No. 78 Jakarta Timur');
/*!40000 ALTER TABLE `dokter` ENABLE KEYS */;


# Dumping structure for table medrec.jaminan
CREATE TABLE IF NOT EXISTS `jaminan` (
  `id_jaminan` varchar(20) NOT NULL DEFAULT '',
  `nm_jaminan` varchar(45) NOT NULL DEFAULT '',
  `ket_jaminan` text,
  PRIMARY KEY (`id_jaminan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.jaminan: ~2 rows (approximately)
/*!40000 ALTER TABLE `jaminan` DISABLE KEYS */;
INSERT INTO `jaminan` (`id_jaminan`, `nm_jaminan`, `ket_jaminan`) VALUES
	('ASKES', 'Asuransi Kesehatan', 'Asuransi kesehatan milik pemerintah'),
	('KJS', 'Kartu Jakarta Sehat', 'Potongan harga khusus warga Jakarta yang kurang mampu');
/*!40000 ALTER TABLE `jaminan` ENABLE KEYS */;


# Dumping structure for table medrec.obat
CREATE TABLE IF NOT EXISTS `obat` (
  `id_obat` varchar(45) NOT NULL,
  `ket_obat` text,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.obat: ~2 rows (approximately)
/*!40000 ALTER TABLE `obat` DISABLE KEYS */;
INSERT INTO `obat` (`id_obat`, `ket_obat`) VALUES
	('AMOXILYN 200mg', 'Obat anti-biotik dosis sedang'),
	('OMEPRAZOL 15mg', 'Obat maag dosis tinggi');
/*!40000 ALTER TABLE `obat` ENABLE KEYS */;


# Dumping structure for table medrec.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `no_rm` varchar(6) NOT NULL DEFAULT '',
  `nm_pas` varchar(45) NOT NULL,
  `jk_pas` enum('L','P') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `agama` varchar(10) NOT NULL DEFAULT '',
  `alamat_pas` text,
  PRIMARY KEY (`no_rm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.pasien: ~4 rows (approximately)
/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
INSERT INTO `pasien` (`no_rm`, `nm_pas`, `jk_pas`, `tgl_lahir`, `agama`, `alamat_pas`) VALUES
	('000001', 'Susanto Wardana', 'L', '1991-05-19', 'Islam', 'Jl. Mayor Dasuki Gg. Jaya No. 15 Jakarta Utara'),
	('000002', 'Susi Similikiti', 'P', '1991-10-19', 'Islam', 'Jl. Cemara Sehat No. 78A Surabaya'),
	('000003', 'Yanti Sulistiawati', 'P', '1994-11-19', 'Islam', 'Jl. Kumang No. 77 Malang'),
	('000004', 'Joko Yanto', 'L', '1992-09-08', 'Hindu', 'Jl. Surya Kencana No. 98 Magelang');
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;


# Dumping structure for table medrec.perawat
CREATE TABLE IF NOT EXISTS `perawat` (
  `no_perawat` varchar(7) NOT NULL DEFAULT '',
  `nm_perawat` varchar(45) NOT NULL,
  `tgl_kerja_per` date DEFAULT '0000-00-00',
  `id_unit_rs` varchar(25) NOT NULL DEFAULT '',
  PRIMARY KEY (`no_perawat`),
  KEY `fk_unit_rs` (`id_unit_rs`),
  CONSTRAINT `fk_unit_rs` FOREIGN KEY (`id_unit_rs`) REFERENCES `unit_rs` (`id_unit_rs`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.perawat: ~2 rows (approximately)
/*!40000 ALTER TABLE `perawat` DISABLE KEYS */;
INSERT INTO `perawat` (`no_perawat`, `nm_perawat`, `tgl_kerja_per`, `id_unit_rs`) VALUES
	('PER.001', 'Lia Debora Mnihuruk', '0000-00-00', 'POLI BEDAH'),
	('PER.002', 'Kiki Fatmala', '0000-00-00', 'POLI DALAM');
/*!40000 ALTER TABLE `perawat` ENABLE KEYS */;


# Dumping structure for table medrec.rekam_medis
CREATE TABLE IF NOT EXISTS `rekam_medis` (
  `no_daftar` varchar(12) NOT NULL,
  `no_rm` varchar(6) NOT NULL,
  `no_staf` varchar(7) NOT NULL,
  `id_unit_rs` varchar(25) NOT NULL,
  `id_jaminan` varchar(20) NOT NULL,
  `no_dokter` varchar(7) NOT NULL,
  `no_perawat` varchar(7) DEFAULT NULL,
  `nadi` int(10) DEFAULT NULL,
  `temperatur` int(10) DEFAULT NULL,
  `pernapasan` int(10) DEFAULT NULL,
  `kesadaran` varchar(20) DEFAULT NULL,
  `anamnesa` text,
  `tinggi_bdn` float DEFAULT NULL,
  `berat_bdn` float DEFAULT NULL,
  `tensi_darah` varchar(7) DEFAULT NULL,
  `diagnosis` text,
  `terapi` text,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`no_daftar`),
  KEY `fk_pasien_rm` (`no_rm`),
  KEY `fk_staf_rm` (`no_staf`),
  KEY `fk_unit_rs_rm` (`id_unit_rs`),
  KEY `fk_jaminan_rm` (`id_jaminan`),
  KEY `fk_dokter_rm` (`no_dokter`),
  KEY `fk_perawat_rm` (`no_perawat`),
  CONSTRAINT `fk_pasien_rm` FOREIGN KEY (`no_rm`) REFERENCES `pasien` (`no_rm`),
  CONSTRAINT `fk_staf_rm` FOREIGN KEY (`no_staf`) REFERENCES `staf` (`no_staf`),
  CONSTRAINT `fk_unit_rs_rm` FOREIGN KEY (`id_unit_rs`) REFERENCES `unit_rs` (`id_unit_rs`),
  CONSTRAINT `fk_jaminan_rm` FOREIGN KEY (`id_jaminan`) REFERENCES `jaminan` (`id_jaminan`),
  CONSTRAINT `fk_dokter_rm` FOREIGN KEY (`no_dokter`) REFERENCES `dokter` (`no_dokter`),
  CONSTRAINT `fk_perawat_rm` FOREIGN KEY (`no_perawat`) REFERENCES `perawat` (`no_perawat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.rekam_medis: ~0 rows (approximately)
/*!40000 ALTER TABLE `rekam_medis` DISABLE KEYS */;
/*!40000 ALTER TABLE `rekam_medis` ENABLE KEYS */;


# Dumping structure for table medrec.resep
CREATE TABLE IF NOT EXISTS `resep` (
  `no_resep` varchar(9) NOT NULL,
  `no_daftar` varchar(12) NOT NULL,
  `tgl_resep` date NOT NULL,
  PRIMARY KEY (`no_resep`),
  KEY `fk_rekam_medis` (`no_daftar`),
  CONSTRAINT `fk_rekam_medis` FOREIGN KEY (`no_daftar`) REFERENCES `rekam_medis` (`no_daftar`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.resep: ~0 rows (approximately)
/*!40000 ALTER TABLE `resep` DISABLE KEYS */;
/*!40000 ALTER TABLE `resep` ENABLE KEYS */;


# Dumping structure for table medrec.resep_dt
CREATE TABLE IF NOT EXISTS `resep_dt` (
  `no_resep` varchar(9) NOT NULL,
  `id_obat` varchar(45) NOT NULL,
  `satuan_kons` varchar(25) NOT NULL,
  `dosis_kons` varchar(20) NOT NULL,
  `jumlah` int(2) NOT NULL,
  KEY `fk_resep` (`no_resep`),
  KEY `fk_obat` (`id_obat`),
  CONSTRAINT `fk_resep` FOREIGN KEY (`no_resep`) REFERENCES `resep` (`no_resep`),
  CONSTRAINT `fk_obat` FOREIGN KEY (`id_obat`) REFERENCES `obat` (`id_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.resep_dt: ~0 rows (approximately)
/*!40000 ALTER TABLE `resep_dt` DISABLE KEYS */;
/*!40000 ALTER TABLE `resep_dt` ENABLE KEYS */;


# Dumping structure for table medrec.spesialis
CREATE TABLE IF NOT EXISTS `spesialis` (
  `id_spesialis` varchar(10) NOT NULL,
  `nm_spesialis` varchar(45) NOT NULL,
  `tarif_konsul` int(6) unsigned NOT NULL,
  PRIMARY KEY (`id_spesialis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.spesialis: ~3 rows (approximately)
/*!40000 ALTER TABLE `spesialis` DISABLE KEYS */;
INSERT INTO `spesialis` (`id_spesialis`, `nm_spesialis`, `tarif_konsul`) VALUES
	('Sp.B', 'Spesialis Bedah', 70000),
	('Sp.J', 'Spesialis Jantung', 75000),
	('Sp.PD', 'Spesialis Penyakit Dalam (Internis)', 70000);
/*!40000 ALTER TABLE `spesialis` ENABLE KEYS */;


# Dumping structure for table medrec.staf
CREATE TABLE IF NOT EXISTS `staf` (
  `no_staf` varchar(7) NOT NULL DEFAULT '',
  `nm_staf` varchar(45) NOT NULL DEFAULT '',
  `alamat_staf` text,
  PRIMARY KEY (`no_staf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.staf: ~2 rows (approximately)
/*!40000 ALTER TABLE `staf` DISABLE KEYS */;
INSERT INTO `staf` (`no_staf`, `nm_staf`, `alamat_staf`) VALUES
	('STF.001', 'Yusuf', 'Jl. Surya Hilang No. 56 Pamalang'),
	('STF.002', 'Fitriya', 'Jl. Dasuyan No. 73 Banten');
/*!40000 ALTER TABLE `staf` ENABLE KEYS */;


# Dumping structure for table medrec.unit_rs
CREATE TABLE IF NOT EXISTS `unit_rs` (
  `id_unit_rs` varchar(25) NOT NULL DEFAULT '',
  `ket_unit_rs` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_unit_rs`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table medrec.unit_rs: ~2 rows (approximately)
/*!40000 ALTER TABLE `unit_rs` DISABLE KEYS */;
INSERT INTO `unit_rs` (`id_unit_rs`, `ket_unit_rs`) VALUES
	('POLI BEDAH', 'Poliklinik Spesialis Bedah'),
	('POLI DALAM', 'Poliklinik Spesialis Penyakit Dalam (Internis');
/*!40000 ALTER TABLE `unit_rs` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
