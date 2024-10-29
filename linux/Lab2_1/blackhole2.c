#include <fcntl.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

#define BUF_SIZE 4096 // Размер буфера

int main(int argc, char **argv) {
    if (argc < 2) {
        fprintf(stderr, "Too few arguments\nUsage: %s <filename>\n", argv[0]);
        return 1;
    }

    int fd = open(argv[1], O_RDONLY);
    if (fd == -1) {
        fprintf(stderr, "Cannot open file\n");
        return 1;
    }

    char buffer[BUF_SIZE]; // Буфер для хранения считанных данных
    ssize_t bytesRead; // Количество считанных байтов

    // Чтение данных из файла в цикле
    while ((bytesRead = read(fd, buffer, BUF_SIZE)) > 0) {
        for (ssize_t i = 0; i < bytesRead; i++) {
            printf("code: %d\n", buffer[i]); // Выводим код символа
        }
    }

    if (bytesRead == -1) {
        fprintf(stderr, "Error reading file\n");
    }

    close(fd);
    return 0;
}
