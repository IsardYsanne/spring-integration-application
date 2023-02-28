INSERT INTO potatoes (id)
VALUES (1);

INSERT INTO potato_sauces (id, name, potato_id)
VALUES (1, 'сырный', (SELECT id FROM potatoes WHERE id = 1));