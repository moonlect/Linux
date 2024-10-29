#include <stdio.h>
#include <unistd.h>

int main(void) {
    char *dolphin_args[] = {"wps", NULL}; // Аргументы для запуска Dolphin
    execve("/usr/bin/wps", dolphin_args, NULL); // Укажите путь к Dolphin
    fprintf(stderr, "Error\n");
    return 0;
}

