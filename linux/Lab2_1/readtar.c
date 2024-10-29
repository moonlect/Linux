#include <sys/uio.h>
#include <fcntl.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

#define ARR_SIZE(array) (sizeof(array)/sizeof(array[0]))

int main(int argc, char **argv) {
    if (argc < 2) { 
        fprintf(stderr, "Too few arguments\n"); 
        return 1; 
    }

    int tfields[] = { 100, /* Name */
                      8,   /* Mode */
                      8,   /* UID */
                      8,   /* GID */
                      12 }; /* Size (octal) */
    
    struct iovec tarhead[ARR_SIZE(tfields)];
    int i;
    
    // Выделение памяти для каждого поля заголовка
    for (i = 0; i < ARR_SIZE(tfields); i++) {
        tarhead[i].iov_base = (char *)malloc(sizeof(char) * tfields[i]);
        if (tarhead[i].iov_base == NULL) { 
            fprintf(stderr, "Cannot allocate memory for tarhead[%d]\n", i); 
            return 1; 
        }
        tarhead[i].iov_len = tfields[i];
    }

    // Открытие файла
    int fd = open(argv[1], O_RDONLY);
    if (fd == -1) { 
        fprintf(stderr, "Cannot open file (%s)\n", argv[1]); 
        return 1; 
    }

    // Чтение данных из файла
    if (readv(fd, tarhead, ARR_SIZE(tarhead)) <= 0) { 
        fprintf(stderr, "Cannot read header\n"); 
        return 1; 
    }

    // Вывод заголовка
    printf("name: %s\n", (char *)tarhead[0].iov_base);
    printf("mode: %s\n", (char *)tarhead[1].iov_base);
    printf("uid: %d\n", (int)strtol((char *)tarhead[2].iov_base, NULL, 8));
    printf("gid: %d\n", (int)strtol((char *)tarhead[3].iov_base, NULL, 8));
    printf("size: %d\n", (int)strtol((char *)tarhead[4].iov_base, NULL, 8));

    // Освобождение выделенной памяти
    for (i = 0; i < ARR_SIZE(tarhead); i++) {
        free(tarhead[i].iov_base);
    }
    
    // Закрытие файла
    close(fd);
    return 0;
}
