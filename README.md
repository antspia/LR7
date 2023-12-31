# Лабораторна робота №7

## Функціональність програми

**Реалізована спрощена система бек-енду для платформи електронної комерції, використовуючи Java Collections,
зосереджуючись на управлінні запасами, управлінні кошиком користувача та обробці замовлень.**

## Опис роботи

**Product (Товар):**

 - id, name, price, stock: поля, що ідентифікують та описують товар.
 - Методи toString, конструктори та гетери/сетери.

**User (Користувач):**

 - id, username, cart: поля, що визначають користувача та його кошик.
 - Методи для додавання, видалення та модифікації товарів у кошику.

**Order (Замовлення):**

 - id, userId, orderDetails, totalPrice: поля для ідентифікації та відстеження замовлення.
 - Метод для розрахунку загальної вартості замовлення.

**ECommercePlatform (Платформа Електронної Комерції):**

 - users, products, orders: зберігає користувачів, товари та замовлення.
 - Методи для додавання користувачів, товарів, створення замовлень, переліку товарів, користувачів, замовлень та оновлення запасів товарів.
 - Реалізація функцій сортування та фільтрації товарів.
 - Функція для рекомендацій товарів користувачам на основі їхнього кошика чи історії замовлень.

**ECommerceDemo:**

 - Головний клас для демонстрації функціональності.
 - Ініціалізація ECommercePlatform, додавання користувачів та товарів, симуляція взаємодії користувачів із кошиком та замовленнями.
 - Симуляція використовує розширені функції, такі як сортування, фільтрація та рекомендації.

**Покрив тестами функціональності**

## Висновок

**Під час виконання лабораторної роботи покращив навички використання Java Collection.**
