package learning.topic16.homework;

public class EmailParser {

    void email(String addresses) {
        // Обрабатываем адреса по очереди
        int start = 0;
        while (addresses.indexOf("@", start) != -1) { // Обрабатываем по одному адресу, пока после start находится @
            int atIndex = (addresses.indexOf("@", start)); //как только нашли, то присваиваем индекс "@"
            int dotIndex = (addresses.indexOf(".", atIndex)); //тут уже ищем точку после "@"
            IO.println(addresses.substring(atIndex + 1, dotIndex)); //тут вывели стрингу между двух найденных индексов
            int semicolonIndex = (addresses.indexOf(";", dotIndex)); //тут нашли где ";" и присвоили индекс
            start = semicolonIndex + 1; //тут присваиваем индекс 'start' после найденного ";". И выходим и заканчиваем первый проход. Чтоб начать проход с данного индекса
        }
    }
    void main() {
        String email = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(email);
    }
}


