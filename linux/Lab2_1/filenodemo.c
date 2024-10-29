#include <stdio.h>
#include <stdlib.h>

#define BUFFER_SIZE 4096

int main(int argc, char **argv) {
    FILE *ifile;
    char buffer[BUFFER_SIZE];
    size_t nbytes;

    if (argc < 2) { 
        fprintf(stderr, "Too few arguments\n"); 
        return 1; 
    }

    ifile = fopen(argv[1], "r");
    if (ifile == NULL) { 
        fprintf(stderr, "Cannot open file (%s)\n", argv[1]); 
        return 1; 
    }

    // Читаем данные из файла, используя буферизацию
    while ((nbytes = fread(buffer, sizeof(char), BUFFER_SIZE, ifile)) > 0) {
        fwrite(buffer, sizeof(char), nbytes, stdout); // Записываем в стандартный вывод
    }

    if (ferror(ifile)) { 
        fprintf(stderr, "Error reading file (%s)\n", argv[1]); 
    }

    fclose(ifile);
    return 0;
}
