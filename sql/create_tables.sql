CREATE SCHEMA IF NOT EXISTS eman_postgres_db.eman;

CREATE TABLE IF NOT EXISTS eman.tag_descs_ab_as_ke (
    id SERIAL NOT NULL PRIMARY KEY,
    name varchar(64) NOT NULL DEFAULT 'noname',
    description varchar(256) NOT NULL DEFAULT 'NONE',
    type varchar(32) NOT NULL DEFAULT 'PHYSICAL',
    physicalType varchar(32) NOT NULL DEFAULT 'NUMERIC',
    physicalDecimals int NOT NULL DEFAULT 0,
    physicalUnit varchar(16) NOT NULL DEFAULT 'units',
    physicalMin double precision NOT NULL DEFAULT 0,
    physicalMax double precision NOT NULL DEFAULT 1,
    physicalMinAlarm double precision NOT NULL DEFAULT 0,
    physicalMaxAlarm double precision NOT NULL DEFAULT 1,
    physicalMinWarn double precision NOT NULL DEFAULT 0,
    physicalMaxWarn double precision NOT NULL DEFAULT 1
);

CREATE TABLE IF NOT EXISTS eman.tag_vals_ab_as_ke (
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id INT NOT NULL DEFAULT '0',
    value DOUBLE PRECISION NOT NULL DEFAULT '0',
    valid BOOLEAN NOT NULL DEFAULT '0',
    descs_id INT NOT NULL,
    CONSTRAINT tag_vals_ab_as_ke_descs_id_fkey FOREIGN KEY (descs_id) REFERENCES eman.tag_descs_ab_as_ke(id)
);

ALTER TABLE eman.tag_vals_ab_as_ke ADD CONSTRAINT tag_vals_ab_as_ke_pkey PRIMARY KEY (timestamp, id);
