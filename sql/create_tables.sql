CREATE TABLE IF NOT EXISTS tag_descs_ab_as_ke (
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

CREATE TABLE IF NOT EXISTS tag_vals_ab_as_ke (
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id INT NOT NULL DEFAULT '0',
    value DOUBLE PRECISION NOT NULL DEFAULT '0',
    valid BOOLEAN NOT NULL DEFAULT '0',
    descs_id INT NOT NULL,
    CONSTRAINT tag_vals_ab_as_ke_descs_id_fkey FOREIGN KEY (descs_id) REFERENCES tag_descs_ab_as_ke(id)
);

ALTER TABLE tag_vals_ab_as_ke ADD CONSTRAINT tag_vals_ab_as_ke_pkey PRIMARY KEY (timestamp, id);

CREATE TABLE IF NOT EXISTS branch (
                        "branch_id" serial PRIMARY KEY,
                        "branch_short_name" varchar(45) NOT NULL,
                        "branch_name" varchar(100) NOT NULL,
                        "description" varchar(200) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS student (
                         "id" serial PRIMARY KEY,
                         "first_name" varchar(45) DEFAULT NULL,
                         "last_name" varchar(45) DEFAULT NULL,
                         "contact_no" varchar(45) DEFAULT NULL,
                         "branch_id" int DEFAULT NULL,
                         CONSTRAINT "branch_id_fk"
                             FOREIGN KEY ("branch_id")
                                 REFERENCES branch ("branch_id")
);

