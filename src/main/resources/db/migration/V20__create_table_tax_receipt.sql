CREATE TABLE tax_receipt
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    id_sale INT NOT NULL UNIQUE ,
    qr_code VARCHAR(49) NOT NULL UNIQUE,
    FOREIGN KEY (id_sale) REFERENCES sale(id) ON DELETE RESTRICT ON UPDATE CASCADE
);