#include <stdio.h>

int main(void) {
    // Указываем, что stdout (стандартный вывод) будет использовать буфер fixed_buffer
    char fixed_buffer[1024]; // Определяем буфер размером 1024 байта

    // Устанавливаем режим буферизации для stdout
    // _IOFBF означает полную буферизацию (full buffering)
    setvbuf(stdout, fixed_buffer, _IOFBF, sizeof(fixed_buffer));

    // Вывод строки с буферизацией
    printf("I like Linux!\n");

    // Принудительно очищаем буфер и выводим данные на экран
    fflush(stdout);

    return 0;
}
