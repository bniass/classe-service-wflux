DROP SCHEMA IF EXISTS r2dbc_classe_service CASCADE;

DROP TABLE IF EXISTS filiere CASCADE;

CREATE TABLE filiere(
    id serial PRIMARY KEY,
    code VARCHAR(10),
    libelle VARCHAR(100)
);

DROP TABLE IF EXISTS classe CASCADE;

CREATE TABLE classe(
    id serial PRIMARY KEY,
    code VARCHAR(10),
    libelle VARCHAR(100),
    frais_inscription INTEGER,
    mensualite INTEGER,
    autres_frais INTEGER,
    filiere_id INTEGER,
    CONSTRAINT fk_filiere FOREIGN KEY (filiere_id) REFERENCES filiere (id) ON DELETE CASCADE
);