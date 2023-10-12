
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE DATABASE demo_db;


-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE TABLE IF NOT EXISTS Products
( id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  quota VARCHAR(128) NOT NULL,
  price VARCHAR(56) NOT NULL,
  PRIMARY KEY (id)
);

-- Приклади запитів
--Вставка (INSERT) продукта:
INSERT INTO products (name, quota, price) VALUES ('Название продукта', 'Количество', 'Цена');

--Вибірка (SELECT) всіх продуктів:
SELECT * FROM products;

--Вибірка (SELECT) продукта по ID:
SELECT * FROM products WHERE id = 1;

--Оновлення (UPDATE) продукта по ID:
UPDATE products SET name = 'Новое имя', quota = 'Новое количество', price = 'Новая цена' WHERE id = 1;

--Видалення (DELETE) продукта по ID:
DELETE FROM products WHERE id = 1;