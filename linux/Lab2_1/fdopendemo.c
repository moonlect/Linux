#include <stdio.h>
#include <fcntl.h>

#define BUFFER_SIZE 4096

int main(int argc, char **argv) {
    if (argc < 2) { 
        fprintf(stderr, "Too few arguments\n"); 
        return 1; 
    }

    FILE *ifile;
    char buffer[BUFFER_SIZE];
    size_t nbytes;
    int fd = open(argv[1], O_RDONLY);
    
    if (fd == -1) { 
        fprintf(stderr, "Cannot open file (%s)\n", argv[1]); 
        return 2; 
    }

    ifile = fdopen(fd, "r");
    if (ifile == NULL) { 
        fprintf(stderr, "Cannot create file pointer\n"); 
        return 3; 
    }

    // Читаем данные из файла с использованием буферизации
    while ((nbytes = fread(buffer, sizeof(char), BUFFER_SIZE, ifile)) > 0) {
        fwrite(buffer, sizeof(char), nbytes, stdout); // Записываем в стандартный вывод
    }

    if (ferror(ifile)) { 
        fprintf(stderr, "Error reading file (%s)\n", argv[1]); 
    }

    fclose(ifile); // Закрытие потока закрывает и дескриптор
    return 0;
}
