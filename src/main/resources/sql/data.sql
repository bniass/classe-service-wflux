INSERT INTO filiere (code, libelle)
VALUES
('INFO', 'Informatique'),
('GEST', 'Gestion'),
('COMPTA', 'Comptabilité'),
('ELEC', 'Électronique'),
('CIVIL', 'Génie Civil'),
('MECA', 'Mécanique'),
('MARK', 'Marketing');

INSERT INTO classe (code, libelle, frais_inscription, mensualite, autres_frais, filiere_id)
VALUES
-- Informatique
('INFO1', 'Informatique 1ère Année', 50000, 25000, 10000, 1),
('INFO2', 'Informatique 2ème Année', 55000, 27000, 12000, 1),
('INFO3', 'Informatique 3ème Année', 60000, 30000, 15000, 1),

-- Gestion
('GEST1', 'Gestion 1ère Année', 40000, 20000, 8000, 2),
('GEST2', 'Gestion 2ème Année', 45000, 22000, 10000, 2),

-- Comptabilité
('COMPTA1', 'Comptabilité 1ère Année', 48000, 23000, 9000, 3),
('COMPTA2', 'Comptabilité 2ème Année', 50000, 25000, 11000, 3),

-- Électronique
('ELEC1', 'Électronique 1ère Année', 52000, 26000, 12000, 4),
('ELEC2', 'Électronique 2ème Année', 57000, 29000, 13000, 4),

-- Génie Civil
('CIVIL1', 'Génie Civil 1ère Année', 55000, 28000, 14000, 5),
('CIVIL2', 'Génie Civil 2ème Année', 60000, 30000, 15000, 5),

-- Mécanique
('MECA1', 'Mécanique 1ère Année', 52000, 25000, 12000, 6),
('MECA2', 'Mécanique 2ème Année', 58000, 29000, 13000, 6),

-- Marketing
('MARK1', 'Marketing 1ère Année', 45000, 23000, 10000, 7),
('MARK2', 'Marketing 2ème Année', 48000, 25000, 11000, 7);
