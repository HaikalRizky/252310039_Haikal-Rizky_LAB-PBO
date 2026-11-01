-- DDL DATABASE POSTGRESQL & ORDBMS - KOPDES KMP

CREATE TYPE dimensi_produk AS (
    panjang NUMERIC(5,2),
    lebar   NUMERIC(5,2),
    tinggi  NUMERIC(5,2)
);

CREATE TABLE kategori (
    id_kategori SERIAL PRIMARY KEY,
    nama_kategori VARCHAR(50) NOT NULL
);

INSERT INTO kategori (nama_kategori) VALUES 
('Beras'), ('Minyak & Lemak'), ('Gula'), ('Telor'), ('Tepung');

CREATE TABLE produk (
    sku VARCHAR(20) PRIMARY KEY,
    nama_produk VARCHAR(100) NOT NULL,
    id_kategori INT REFERENCES kategori(id_kategori),
    deskripsi TEXT,
    harga NUMERIC(12,2) NOT NULL,
    stok INT NOT NULL,
    satuan VARCHAR(20) NOT NULL,
    ukuran dimensi_produk
);

CREATE TABLE riwayat_stok (
    id_riwayat SERIAL PRIMARY KEY,
    sku VARCHAR(20) REFERENCES produk(sku) ON DELETE CASCADE,
    jenis_perubahan VARCHAR(10),
    jumlah INT NOT NULL,
    waktu TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO produk (sku, nama_produk, id_kategori, deskripsi, harga, stok, satuan) 
VALUES ('PRD-001', 'Beras Organik 5kg', 1, 'Beras kualitas super', 65000, 45, 'kg');
