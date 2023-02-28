CREATE TABLE IF NOT EXISTS potatoes
(
    id         SERIAL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS potato_sauces
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(255),
    potato_id  INTEGER REFERENCES potatoes (id)
);