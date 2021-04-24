<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Ankieta Coffe</title>
</head>
<body>
<form action = "Ankieta" method="post">
<h1>
    <%= "Анкета" %>
    <p>Пожалуйста, выберите сколько Вам лет:</p>
    <input type="radio" id="age1" name="age" value="30">
    <label for="age1"> от 0 - 30 лет</label><br>
    <input type="radio" id="age2" name="age" value="60">
    <label for="age2"> от 31 - до 60 лет</label><br>
    <input type="radio" id="age3" name="age" value="100">
    <label for="age3"> от 61 - 100 лет</label>
    <br>
    <p>Пожалуйста, выберите какой кофе Вы пьете с утра:</p>
    <input type="radio" id="americano" name="coffe" value="americano">
    <label for="americano">Черный</label><br>
    <input type="radio" id="latte" name="coffe" value="latte">
    <label for="latte">Кофе с молоком</label><br>
    <input type="radio" id="cappucino" name="coffe" value="cappucino">
    <label for="cappucino">Каппучино</label>
    <br>
    <input type="submit" value="Статистика">
</h1>
</form>
</body>
</html>