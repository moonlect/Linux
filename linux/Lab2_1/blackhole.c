#include <fcntl.h>
#include <unistd.h>
#include <stdio.h>
#include <string.h>

#define HOLE_SIZE 5
#define BUF_SIZE 4096 // Размер буфера

int main(void) {
    // Создание файла
    int fd = creat("myfile", 0640);
    if (fd == -1) {
        fprintf(stderr, "Cannot open file\n");
        return 1;
    }

    // Создание буфера
    char buffer[BUF_SIZE];
    memset(buffer, 0, BUF_SIZE); // Обнуление буфера

    // Запись "AAA" в буфер
    memcpy(buffer, "AAA", 3);
    // Запись содержимого буфера в файл
    write(fd, buffer, BUF_SIZE);

    // Установка позиции записи на HOLE_SIZE байт от конца файла
    if (lseek(fd, HOLE_SIZE, SEEK_END) == -1) {
        fprintf(stderr, "Cannot set I/O position\n");
        close(fd); // Закрытие файла перед выходом
        return 1;
    }

    // Сбросим буфер для следующей записи
    memset(buffer, 0, BUF_SIZE); // Обнуление буфера
    memcpy(buffer, "BBB", 3);
    // Запись содержимого буфера в файл
    write(fd, buffer, BUF_SIZE);

    // Закрытие файла
    close(fd);
    return 0;
}
